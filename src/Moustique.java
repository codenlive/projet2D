
public class Moustique extends Predator {
	public Moustique(int i, int j) {
		alive = true;
		// age_reproductif = 20;
		// reserve_eau = 20;Moustique n'a pas besoin de ce nourrir et ne se
		// reproduit
		// reserve_food = 20;
		age = 1;
		id = 28;
		endurance = 3;
		this.posi = i;
		this.posj = j;
		perimeterVisionOriental = 4;
		perimeterVisionDiagonal = 1;
		SpriteDemo.myWorld[posi][posj] = this.id;

	}

	public void moveDefault() {
		int orient = (int) (Math.random() * 8);
		// int deplacement=(int)( Math.random()*endurance);
		// int i;

		switch (orient) {
		case 0: // nord
			if (SpriteDemo.myWorld[posi][posj - 1] == 2 || SpriteDemo.myWorld[posi][posj - 1] == 78
					|| SpriteDemo.myWorld[posi][posj - 1] == 3) {

				SpriteDemo.newmyWorld[posi][posj - 1] = 28;

				if (SpriteDemo.myWorld[posi][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi][posj - 1] == 2) {

					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
				if (SpriteDemo.myWorld[posi][posj - 1] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 3;
				}

			}

			break;

		case 1: // est
			if (SpriteDemo.myWorld[posi + 1][posj] == 2 || SpriteDemo.myWorld[posi + 1][posj] == 78
					|| SpriteDemo.myWorld[posi + 1][posj] == 3) {

				SpriteDemo.newmyWorld[posi + 1][posj] = 28;
				if (SpriteDemo.myWorld[posi + 1][posj] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi + 1][posj] == 2) {

					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
				if (SpriteDemo.myWorld[posi + 1][posj] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 3;

				}

			}

			break;

		case 2: // sud
			if (SpriteDemo.myWorld[posi][posj + 1] == 2 || SpriteDemo.myWorld[posi][posj + 1] == 78
					|| SpriteDemo.myWorld[posi][posj + 1] == 3) {

				SpriteDemo.newmyWorld[posi][posj + 1] = 28;

				if (SpriteDemo.myWorld[posi][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi][posj + 1] == 2) {

					SpriteDemo.newmyWorld[posi][posj] = 2;
				}

				if (SpriteDemo.myWorld[posi][posj + 1] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 3;
				}
			}

			break;

		case 3: // ouest
			if (SpriteDemo.myWorld[posi - 1][posj] == 2 || SpriteDemo.myWorld[posi - 1][posj] == 78
					|| SpriteDemo.myWorld[posi - 1][posj] == 78) {

				SpriteDemo.newmyWorld[posi - 1][posj] = 28;

				if (SpriteDemo.myWorld[posi - 1][posj] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi - 1][posj] == 2) {

					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
				if (SpriteDemo.myWorld[posi - 1][posj] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 3;
				}
			}

			break;

		case 4: // nord-est
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 || SpriteDemo.myWorld[posi + 1][posj - 1] == 78
					|| SpriteDemo.myWorld[posi + 1][posj - 1] == 3) {

				SpriteDemo.newmyWorld[posi + 1][posj - 1] = 28;

				if (SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2) {

					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
				if (SpriteDemo.myWorld[posi + 1][posj - 1] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 3;
				}
			}

			break;

		case 5: // nord-ouest
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 || SpriteDemo.myWorld[posi - 1][posj - 1] == 78
					|| SpriteDemo.myWorld[posi - 1][posj - 1] == 3) {

				SpriteDemo.newmyWorld[posi - 1][posj - 1] = 28;

				if (SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2) {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
				if (SpriteDemo.myWorld[posi - 1][posj - 1] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 3;
				}
			}

			break;

		case 6: // sud-est

			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 || SpriteDemo.myWorld[posi + 1][posj + 1] == 78
					|| SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {

				SpriteDemo.newmyWorld[posi + 1][posj + 1] = 28;

				if (SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2) {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
				if (SpriteDemo.myWorld[posi + 1][posj + 1] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 7: // sud-ouest
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 || SpriteDemo.myWorld[posi - 1][posj + 1] == 78
					|| SpriteDemo.myWorld[posi - 1][posj + 1] == 3) {

				SpriteDemo.newmyWorld[posi - 1][posj + 1] = 28;

				if (SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				}
				if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2) {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
				if (SpriteDemo.myWorld[posi - 1][posj + 1] == 3) {
					SpriteDemo.newmyWorld[posi][posj] = 3;
				}

			}
			break;
		}
	}

	public void va_contaminer() {
		int compteur_pique = 0;// compteur pour qu'il ne mange qu'un seul agent
		for (Agent i : agents) {
			if (posTypeAgentNorthEast()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

			if (posTypeAgentNorth()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

			if (posTypeAgentEast()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

			if (posTypeAgentSouthEast()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

			if (posTypeAgentSouth()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

			if (posTypeAgentSouthWest()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

			if (posTypeAgentWest()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

			if (posTypeAgentNorthWest()[2] == i.id && compteur_pique < 1) {
				compteur_pique++;
				i.setContamine(true);
			}

		}
	}
}