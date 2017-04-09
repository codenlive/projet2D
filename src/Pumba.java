
public class Pumba extends Predator {
	public Pumba(int i, int j) {
		alive = true;
		age_reproductif = 20;
		reserve_eau = 20;
		reserve_food = 20;
		age = 1;
		id = 35;
		endurance = 3;
		this.posi = i;
		this.posj = j;
		perimeterVisionOriental = 4;
		perimeterVisionDiagonal = 1;
		SpriteDemo.myWorld[posi][posj] = this.id;
		pumbas.add(this);
	}

	/*public void moveDefault() {
		int orient = (int) (Math.random() * 8);
		// int deplacement=(int)( Math.random()*endurance);
		// int i;

		switch (orient) {
		case 0: // nord
			if (SpriteDemo.myWorld[posi][posj - 1] == 2 || SpriteDemo.myWorld[posi][posj - 1] == 78) {
			
					SpriteDemo.newmyWorld[posi][posj - 1] = 35;

				if (SpriteDemo.myWorld[posi][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 1: // est
			if (SpriteDemo.myWorld[posi + 1][posj] == 2 || SpriteDemo.myWorld[posi + 1][posj] == 78) {
			
					SpriteDemo.newmyWorld[posi + 1][posj] = 35;
				if (SpriteDemo.myWorld[posi + 1][posj] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 2: // sud
			if (SpriteDemo.myWorld[posi][posj + 1] == 2 || SpriteDemo.myWorld[posi][posj + 1] == 78) {
				
					SpriteDemo.newmyWorld[posi][posj + 1] = 35;

				if (SpriteDemo.myWorld[posi][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 3: // ouest
			if (SpriteDemo.myWorld[posi - 1][posj] == 2 || SpriteDemo.myWorld[posi - 1][posj] == 78) {
				
					SpriteDemo.newmyWorld[posi - 1][posj] = 35;

				if (SpriteDemo.myWorld[posi - 1][posj] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 4: // nord-est
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 || SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
				
					SpriteDemo.newmyWorld[posi + 1][posj - 1] = 35;

				if (SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 5: // nord-ouest
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 || SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
			
					SpriteDemo.newmyWorld[posi - 1][posj - 1] = 35;

				if (SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 6: // sud-est

			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 || SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
				
					SpriteDemo.newmyWorld[posi + 1][posj + 1] = 35;

				if (SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 7: // sud-ouest
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 || SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {

				SpriteDemo.newmyWorld[posi - 1][posj + 1] = 35;

				if (SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}

			}
			break;
		}
	}
	*/

	/*public void eat() {
		int compteur_mange = 0;// compteur pour qu'il ne mange qu'un seul agent
		for (Insecte i : insectes) {
			if (posTypeAgentNorthEast()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

			if (posTypeAgentNorth()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

			if (posTypeAgentEast()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

			if (posTypeAgentSouthEast()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

			if (posTypeAgentSouth()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

			if (posTypeAgentSouthWest()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

			if (posTypeAgentWest()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

			if (posTypeAgentNorthWest()[2] == i.id && compteur_mange < 1) {
				compteur_mange++;
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				if (i.getInfecte() == true)
					this.infecte = true;
			}

		}
	}
	*/
	public void parasite(){
		if(this.getInfecte()){
			//chasse() chasse son predateur
		}
	}
	
	public void contamine(){
		if(this.getContamine())
			age+=10;// si contamine par virus age augmente plus rapidement
		
	}

}