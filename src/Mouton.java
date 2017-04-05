public class Mouton extends Prey {

	public Mouton(int posi, int posj) {
		alive = true;
		age_reproductif = 20;
		reserve_eau = 20;
		reserve_food = 20;
		age = 1;
		id = 38;
		endurance = 3;
		this.posi = posi;
		this.posj = posj;
		perimeterVisionOriental = 4;
		perimeterVisionDiagonal = 1;
		SpriteDemo.myWorld[posi][posj] = this.id;
		moutons.add(this);
	}

	/*public void moveDefault() {
		int orient = (int) (Math.random() * 8);
		// int deplacement=(int)( Math.random()*endurance);
		// int i;
		switch (orient) {
		case 0: // nord
			if (SpriteDemo.myWorld[posi][posj - 1] == 2 || SpriteDemo.myWorld[posi][posj - 1] == 78) {
				SpriteDemo.newmyWorld[posi][posj - 1] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;
				// posj-=1;
			}

			break;

		case 1: // est
			if (SpriteDemo.myWorld[posi + 1][posj] == 2 || SpriteDemo.myWorld[posi + 1][posj] == 78) {
				SpriteDemo.newmyWorld[posi + 1][posj] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;

				// posi+=1;
			}

			break;

		case 2: // sud
			if (SpriteDemo.myWorld[posi][posj + 1] == 2 || SpriteDemo.myWorld[posi][posj + 1] == 78) {
				SpriteDemo.newmyWorld[posi][posj + 1] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;

				// posj+=1;
			}

			break;

		case 3: // ouest
			if (SpriteDemo.myWorld[posi - 1][posj] == 2 || SpriteDemo.myWorld[posi - 1][posj] == 78) {
				SpriteDemo.newmyWorld[posi - 1][posj] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;

				// posi-=1;
			}

			break;

		case 4: // nord-est
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 || SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
				SpriteDemo.newmyWorld[posi + 1][posj - 1] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;

				// posi+=1;posj-=1;
			}

			break;

		case 5: // nord-ouest
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 || SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
				SpriteDemo.newmyWorld[posi - 1][posj - 1] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;

				// posi-=1;
				// posj-=1;
			}

			break;

		case 6: // sud-est

			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 || SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
				SpriteDemo.newmyWorld[posi + 1][posj + 1] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;

				// posi+=1;posj+=1;
			}

			break;

		case 7: // sud-ouest
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 || SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {
				SpriteDemo.newmyWorld[posi - 1][posj + 1] = 38;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				SpriteDemo.pas[posi][posj]=id;

				// posi-=1;posj+=1;
			}
			break;
		}

	}*/
	
	/*public void moveDefault() {
	int orient = (int) (Math.random() * 8);
	// int deplacement=(int)( Math.random()*endurance);
	// int i;
	switch (orient) {
	case 0: // nord
		if (SpriteDemo.myWorld[posi][posj - 1] == 2 || SpriteDemo.myWorld[posi][posj - 1] == 78) {
			SpriteDemo.newmyWorld[posi][posj - 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;
			// posj-=1;
		}

		break;

	case 1: // est
		if (SpriteDemo.myWorld[posi + 1][posj] == 2 || SpriteDemo.myWorld[posi + 1][posj] == 78) {
			SpriteDemo.newmyWorld[posi + 1][posj] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			// posi+=1;
		}

		break;

	case 2: // sud
		if (SpriteDemo.myWorld[posi][posj + 1] == 2 || SpriteDemo.myWorld[posi][posj + 1] == 78) {
			SpriteDemo.newmyWorld[posi][posj + 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			// posj+=1;
		}

		break;

	case 3: // ouest
		if (SpriteDemo.myWorld[posi - 1][posj] == 2 || SpriteDemo.myWorld[posi - 1][posj] == 78) {
			SpriteDemo.newmyWorld[posi - 1][posj] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			// posi-=1;
		}

		break;

	case 4: // nord-est
		if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 || SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
			SpriteDemo.newmyWorld[posi + 1][posj - 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			// posi+=1;posj-=1;
		}

		break;

	case 5: // nord-ouest
		if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 || SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
			SpriteDemo.newmyWorld[posi - 1][posj - 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			// posi-=1;
			// posj-=1;
		}

		break;

	case 6: // sud-est

		if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 || SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
			SpriteDemo.newmyWorld[posi + 1][posj + 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			// posi+=1;posj+=1;
		}

		break;

	case 7: // sud-ouest
		if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 || SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {
			SpriteDemo.newmyWorld[posi - 1][posj + 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			// posi-=1;posj+=1;
		}
		break;
	}

}*/
	
	public void moveDefault() {
	int orient = (int) (Math.random() * 8);
	// int deplacement=(int)( Math.random()*endurance);
	// int i;
	SpriteDemo.pas[posi][posj]=id;

	switch (orient) {
	case 0: // nord
		if (SpriteDemo.myWorld[posi][posj - 1] == 2 || SpriteDemo.myWorld[posi][posj - 1] == 78) {
			posj-=1;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;
			// posj-=1;
		}

		break;

	case 1: // est
		if (SpriteDemo.myWorld[posi + 1][posj] == 2 || SpriteDemo.myWorld[posi + 1][posj] == 78) {
			//SpriteDemo.newmyWorld[posi + 1][posj] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			 posi+=1;
		}

		break;

	case 2: // sud
		if (SpriteDemo.myWorld[posi][posj + 1] == 2 || SpriteDemo.myWorld[posi][posj + 1] == 78) {
			//SpriteDemo.newmyWorld[posi][posj + 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			 posj+=1;
		}

		break;

	case 3: // ouest
		if (SpriteDemo.myWorld[posi - 1][posj] == 2 || SpriteDemo.myWorld[posi - 1][posj] == 78) {
			//SpriteDemo.newmyWorld[posi - 1][posj] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			 posi-=1;
		}

		break;

	case 4: // nord-est
		if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 || SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
			//SpriteDemo.newmyWorld[posi + 1][posj - 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			 posi+=1;posj-=1;
		}

		break;

	case 5: // nord-ouest
		if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 || SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
			//SpriteDemo.newmyWorld[posi - 1][posj - 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			 posi-=1;
			 posj-=1;
		}

		break;

	case 6: // sud-est

		if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 || SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
			//SpriteDemo.newmyWorld[posi + 1][posj + 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			 posi+=1;posj+=1;
		}

		break;

	case 7: // sud-ouest
		if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 || SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {
			//SpriteDemo.newmyWorld[posi - 1][posj + 1] = 38;
			SpriteDemo.newmyWorld[posi][posj] = 2;
			SpriteDemo.pas[posi][posj]=id;

			 posi-=1;posj+=1;
		}
		break;
	}
	

	
}

	public void ancien_affichage(){
		SpriteDemo.newmyWorld[this.posi][this.posj]=2;
	}

	public void nouvel_affichage(){
		SpriteDemo.newmyWorld[this.posi][this.posj]=this.id;
	}
}