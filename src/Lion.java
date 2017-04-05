
public class Lion extends Predator {

	public Lion(int posi, int posj) {
		alive = true;
		age_reproductif = 20;
		reserve_eau = 20;
		reserve_food = 20;
		age = 1;
		id = 6;
		endurance = 3;
		this.posi = posi;
		this.posj = posj;
		perimeterVisionOriental = 4;
		perimeterVisionDiagonal = 1;
		SpriteDemo.myWorld[posi][posj] = this.id;
		lions.add(this);
	}

	// }

	// }

	// -------------------fin de deplacement
	
	public void hunt (){
		 int height=SpriteDemo.myWorld[1].length;
        int width=SpriteDemo.myWorld.length;

		// nord
		if (SpriteDemo.pas[posi ][(posj - 1+height)%height] == 38 ) {
			posj--;
			SpriteDemo.pas[posi][(posj - 1+height)%height]=0;

			//SpriteDemo.newmyWorld[posi][posj - 1] = 6;

			
		}

		

	 // est
		if (SpriteDemo.pas[(posi + 1+width)%width][posj ] == 38 ) {
			posi++;	
			SpriteDemo.pas[(posi + 1+width)%width][posj ]=0;

			//SpriteDemo.newmyWorld[posi + 1][posj] = 6;
			
		}
		

	 // sud
		if (SpriteDemo.pas[posi][(posj + 1+height)%height] == 38 ) {
			posj++;	
			SpriteDemo.pas[posi][(posj + 1+height)%height]=0;

			//SpriteDemo.newmyWorld[posi][posj + 1] = 6;

			
		}
		

	 // ouest
		if (SpriteDemo.pas[(posi - 1+width)%width][posj] == 38 ) {
			posi--;	
			SpriteDemo.pas[(posi - 1+width)%width][posj]=0;

			//SpriteDemo.newmyWorld[posi - 1][posj] = 6;

			
		}

	

	 // nord-est
		if (SpriteDemo.pas[(posi + 1+width)%width][(posj - 1+height)%height] == 38 ) {
				posi++;posj--;
				SpriteDemo.pas[(posi + 1+width)%width][(posj - 1+height)%height]=0;
			//SpriteDemo.newmyWorld[posi + 1][posj - 1] = 6;

		
		}

	

	 // nord-ouest
		if(SpriteDemo.pas[(posi - 1+width)%width][(posj - 1+height)%height] == 38 ) {
			posj--;posi--;	
			SpriteDemo.pas[(posi - 1+width)%width][(posj - 1+height)%height]=0;
			//SpriteDemo.newmyWorld[posi - 1][posj - 1] = 6;

		}

		

	 // sud-est

		if(SpriteDemo.pas[(posi + 1+width)%width][(posj + 1+height)%height] == 38 ) {
			posi++;posj++;	
			SpriteDemo.pas[(posi + 1+width)%width][(posj + 1+height)%height]=0;

			//SpriteDemo.newmyWorld[posi + 1][posj + 1] = 6;

		}

		

	 // sud-ouest
		if (SpriteDemo.pas[(posi - 1+width)%width][(posj + 1+height)%height] == 38 ) {
				posi--;posj++;
				SpriteDemo.pas[(posi - 1+width)%width][(posj + 1+height)%height]=0;

			//SpriteDemo.newmyWorld[posi - 1][posj + 1] = 6;

			
		}
		
	}
		
	
	
	
	
	
	
	public void chasse() {
		double[] tab = new double[8]; // tableau pour recuperer la plus petite
										// distance parmis la distance de chaque
										// voisins
		int t = 0;// variable pour sortir de la boucle
		int posx = 0, posy = 0;// recupere les coordonees du mouton
		int d = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0;// les
																			// distances
																			// des
																			// 8
																			// voisins
																			// jusqu
																			// au
																			// mouton

		for (int i = 0; i < 120; i++) {
			for (int j = 0; j < 64; j++) { // recherche de mouton dans la map
				if (SpriteDemo.myWorld[i][j] == 38) {
					posx = i;
					posy = j; // si on trouve un mouton on stocke sa position
				}

				// on calcule la distance entre les 8 voisins du lion et la
				// position i,j du mouton
				d = (int) (Math.sqrt(((posx - posi) * (posx - posi)) + ((posy - posj + 1) * (posy - posj + 1))));
				d1 = (int) (Math
						.sqrt(((posx - posi - 1) * (posx - posi - 1)) + ((posy - posj + 1) * (posy - posj + 1))));
				d2 = (int) (Math.sqrt(((posx - posi - 1) * (posx - posi - 1)) + ((posy - posj) * (posy - posj))));
				d3 = (int) (Math
						.sqrt(((posx - posi - 1) * (posx - posi - 1)) + ((posy - posj - 1) * (posy - posj - 1))));
				d4 = (int) (Math.sqrt(((posx - posi) * (posx - posi)) + ((posy - posj - 1) * (posy - posj - 1))));
				d5 = (int) (Math
						.sqrt(((posx - posi + 1) * (posx - posi + 1)) + ((posy - posj - 1) * (posy - posj - 1))));
				d6 = (int) (Math.sqrt(((posx - posi + 1) * (posx - posi + 1)) + ((posy - posj) * (posy - posj))));
				d7 = (int) (Math
						.sqrt(((posx - posi + 1) * (posx - posi + 1)) + ((posy - posj + 1) * (posy - posj + 1))));

				// si un des voisins du lion est un obstacle on prend pas en
				// consideration sa distance
				if (SpriteDemo.myWorld[i][j + 1] != 2) {
					d = 0;
				}
				if (SpriteDemo.myWorld[i - 1 + 120 % 64][j + 1] != 2) {
					d1 = 0;
				}
				if (SpriteDemo.myWorld[i - 1 + 120 % 64][j] != 2) {
					d2 = 0;
				}
				if (SpriteDemo.myWorld[i - 1 + 120 % 64][j - 1 + 120 % 64] != 2) {
					d3 = 0;
				}
				if (SpriteDemo.myWorld[i][j - 1 + 120 % 64] != 2) {
					d4 = 0;
				}
				if (SpriteDemo.myWorld[i + 1][j - 1 + 120 % 64] != 2) {
					d5 = 0;
				}
				if (SpriteDemo.myWorld[i + 1][j] != 2) {
					d6 = 0;
				}
				if (SpriteDemo.myWorld[i + 1][j + 1] != 2) {
					d7 = 0;
				}

				// on stocke toute les distances des voisins dans un tableau et
				// on en recherche le
				// minimum pour avoir le chemin le plus cour
				tab[0] = d;
				tab[1] = d1;
				tab[2] = d2;
				tab[3] = d3;
				tab[4] = d4;
				tab[5] = d5;
				tab[6] = d6;
				tab[7] = d7;
				double min = tab[0];
				for (int k = 0; k < tab.length; k++) {
					if (tab[k] < tab[k + 1]) {
						min = tab[k];
					} else {
						min = tab[k + 1];
					}
				}

				// si le minimum correspond a un certain voisin et que ce voisin
				// n a pas d obstacle
				// alors le lion va sur la case de ce voisin
				if (min == d && SpriteDemo.myWorld[i][j + 1] == 2) {
					SpriteDemo.myWorld[i][j + 1] = 6;
					SpriteDemo.myWorld[i][j] = 2;// ou herbe
				}
				if (min == d1 && SpriteDemo.myWorld[i - 1 + 120 % 64][j + 1] == 2) {
					SpriteDemo.myWorld[i - 1 + 120 % 64][j + 1] = 6;
					SpriteDemo.myWorld[i][j] = 2;
				}
				if (min == d2 && SpriteDemo.myWorld[i - 1 + 120 % 64][j] == 2) {
					SpriteDemo.myWorld[i - 1 + 120 % 64][j] = 6;
					SpriteDemo.myWorld[i][j] = 2;
				}
				if (min == d3 && SpriteDemo.myWorld[i - 1 + 120 % 64][j - 1 + 120 % 64] == 2) {
					SpriteDemo.myWorld[i - 1 + 120 % 64][j - 1 + 120 % 64] = 6;
					SpriteDemo.myWorld[i][j] = 2;
				}
				if (min == d4 && SpriteDemo.myWorld[i][j - 1 + 120 % 64] == 2) {
					SpriteDemo.myWorld[i][j - 1 + 120 % 64] = 6;
					SpriteDemo.myWorld[i][j] = 2;
				}
				if (min == d5 && SpriteDemo.myWorld[i][j + 1] == 2) {
					SpriteDemo.myWorld[i][j + 1] = 6;
					SpriteDemo.myWorld[i][j] = 2;
				}
				if (min == d6 && SpriteDemo.myWorld[i][j + 1] == 2) {
					SpriteDemo.myWorld[i][j + 1] = 6;
					SpriteDemo.myWorld[i][j] = 2;
				}
				if (min == d7 && SpriteDemo.myWorld[i][j + 1] == 2) {
					SpriteDemo.myWorld[i][j + 1] = 6;
					SpriteDemo.myWorld[i][j] = 2;
				}

				// si la distance restante equivaut a une case pour atteindre le
				// mouton le lion le bouffe

				if (d == 1 || d1 == 1 || d2 == 1 || d3 == 1 || d4 == 1 || d5 == 1 || d6 == 1 || d7 == 1) {
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i][j + 1] == 38) {
						SpriteDemo.myWorld[i][j + 1] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i - 1][j + 1] == 38) {
						SpriteDemo.myWorld[i - 1][j + 1] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i + 1][j + 1] == 38) {
						SpriteDemo.myWorld[i + 1][j + 1] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i - 1][j] == 38) {
						SpriteDemo.myWorld[i - 1][j] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i + 1][j] == 38) {
						SpriteDemo.myWorld[i + 1][j] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i - 1][j - 1] == 38) {
						SpriteDemo.myWorld[i - 1][j - 1] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i][j - 1] == 38) {
						SpriteDemo.myWorld[i][j - 1] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}
					if (SpriteDemo.myWorld[i][j] == 6 && SpriteDemo.myWorld[i + 1][j - 1] == 38) {
						SpriteDemo.myWorld[i + 1][j - 1] = 6;
						SpriteDemo.myWorld[i][j] = 2;
					}

					// ET ON SORT DU WHILE
				} else { // sinon on reinitiaise les distances a 0 pour
							// reboucler
					d = 0;
					d1 = 0;
					d2 = 0;
					d3 = 0;
					d4 = 0;
					d5 = 0;
					d6 = 0;
					d7 = 0;
				}
			}
		}
	}

	public void eat() {
		int compteur_mange = 0;// compteur pour qu'il ne mange qu'un seul agent
		for (Mouton i : Agent.moutons ) {// a modifier pour rajouter espece que
										// le lion peut manger
			if (posTypeAgentNorthEast()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				compteur_mange++;
			}

			if (posTypeAgentNorth()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				compteur_mange++;
			}

			if (posTypeAgentEast()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				compteur_mange++;
			}

			if (posTypeAgentSouthEast()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;

			}

			if (posTypeAgentSouth()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				compteur_mange++;
			}

			if (posTypeAgentSouthWest()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				compteur_mange++;
			}

			if (posTypeAgentWest()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				compteur_mange++;
			}

			if (posTypeAgentNorthWest()[2] == i.id && compteur_mange < 1) {
				i.meurt();
				this.reserve_food += 15;
				this.reserve_eau += 5;
				compteur_mange++;
			}
		}

	}

	public void moveDefault() {
		int orient = (int) (Math.random() * 8);
		// int deplacement=(int)( Math.random()*endurance);
		// int i;

		switch (orient) {
		case 0: // nord
			if (SpriteDemo.myWorld[posi][posj - 1] == 2 || SpriteDemo.myWorld[posi][posj - 1] == 78) {
				//if (id == 6)
					//SpriteDemo.newmyWorld[posi][posj - 1] = 6;
				posj--;
				if (SpriteDemo.myWorld[posi][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 1: // est
			if (SpriteDemo.myWorld[posi + 1][posj] == 2 || SpriteDemo.myWorld[posi + 1][posj] == 78) {
				if (id == 6)
					//SpriteDemo.newmyWorld[posi + 1][posj] = 6;
					posi++;
				if (SpriteDemo.myWorld[posi + 1][posj] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 2: // sud
			if (SpriteDemo.myWorld[posi][posj + 1] == 2 || SpriteDemo.myWorld[posi][posj + 1] == 78) {
				if (id == 6)
					//SpriteDemo.newmyWorld[posi][posj + 1] = 6;
					posj+=1;

				if (SpriteDemo.myWorld[posi][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 3: // ouest
			if (SpriteDemo.myWorld[posi - 1][posj] == 2 || SpriteDemo.myWorld[posi - 1][posj] == 78) {
				if (id == 6)
					//SpriteDemo.newmyWorld[posi - 1][posj] = 6;
					posi-=1;

				if (SpriteDemo.myWorld[posi - 1][posj] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 4: // nord-est
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 || SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
				if (id == 6)
					//SpriteDemo.newmyWorld[posi + 1][posj - 1] = 6;
					posi+=1;posj-=1;
				if (SpriteDemo.myWorld[posi + 1][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 5: // nord-ouest
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 || SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
				if (id == 6)
					//SpriteDemo.newmyWorld[posi - 1][posj - 1] = 6;
					posi-=1;posj-=1;

				if (SpriteDemo.myWorld[posi - 1][posj - 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 6: // sud-est

			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 || SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
				if (id == 6)
					//SpriteDemo.newmyWorld[posi + 1][posj + 1] = 6;
					posi+=1;posj+=1;

				if (SpriteDemo.myWorld[posi + 1][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}
			}

			break;

		case 7: // sud-ouest
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 || SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {
				if (id == 6)
					//SpriteDemo.newmyWorld[posi - 1][posj + 1] = 6;
					posi-=1;posj+=1;

				if (SpriteDemo.myWorld[posi - 1][posj + 1] == 78) {
					SpriteDemo.newmyWorld[posi][posj] = 78;
				} else {
					SpriteDemo.newmyWorld[posi][posj] = 2;
				}

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

	public void reproduce() {

		// cherche espace vide pour nouveau lion

		// cherche si deux lions sont a cote
		int cpt = 0;

		for (Lion l : lions) {
			if (posTypeAgentNorth()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif && cpt < 1) {

				lions.add(new Lion(posTypeAgentNorth()[0], posTypeAgentNorth()[1]));

				if (posTypeAgentNorthEast()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif)
					lions.add(new Lion(posTypeAgentNorthEast()[0], posTypeAgentNorthEast()[1]));
				if (posTypeAgentEast()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif)
					lions.add(new Lion(posTypeAgentEast()[0], posTypeAgentEast()[1]));
				if (posTypeAgentSouthEast()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif)
					lions.add(new Lion(posTypeAgentSouthEast()[0], posTypeAgentSouthEast()[1]));
				if (posTypeAgentSouth()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif)
					lions.add(new Lion(posTypeAgentSouth()[0], posTypeAgentSouth()[1]));
				if (posTypeAgentSouthWest()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif)
					lions.add(new Lion(posTypeAgentSouthWest()[0], posTypeAgentSouthWest()[1]));
				if (posTypeAgentWest()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif)
					lions.add(new Lion(posTypeAgentWest()[0], posTypeAgentNorthEast()[1]));
				if (posTypeAgentNorthWest()[2] == l.id && l.id != this.id && this.age >= this.age_reproductif)
					lions.add(new Lion(posTypeAgentNorthWest()[0], posTypeAgentNorthWest()[1]));

			}
		}

	}
}