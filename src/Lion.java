
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

	// lion6,water0,sable1,grass2,arbre3,montagne4,volcano5,boutvolcan7,lave8,brule9,lac12

	/*
	 * public int[] getNearestAgent(){ int orient=0; int tab_localisation[]=new
	 * int[3];
	 * 
	 * orient=0; //a modifier car prend pas en compte lorsque plusieurs animaux
	 * sont a cote while(orient<perimeterVisionDiagonal){//bas droite for (Agent
	 * a:agents){ if(myWorld[posi+orient][posj+orient]==a.id){
	 * tab_localisation[0]=posi+orient; tab_localisation[1]=posj+orient;
	 * tab_localisation[2]=a.id; } else orient++; } }
	 * 
	 * orient=0; while(orient<perimeterVisionDiagonal){//bas gauche for (Agent
	 * a:agents){ if(myWorld[posi+orient][posj-orient]==a.id){
	 * tab_localisation[0]=posi+orient; tab_localisation[1]=posj-orient;
	 * tab_localisation[2]=a.id; } else orient++; } }
	 * 
	 * 
	 * 
	 * 
	 * orient=perimeterVisionDiagonal;
	 * while(orient<perimeterVisionDiagonal){//haut gauche for (Agent a:agents){
	 * if(myWorld[posi-orient][posj-orient]==a.id){
	 * tab_localisation[0]=posi-orient; tab_localisation[1]=posj-orient;
	 * tab_localisation[2]=a.id;
	 * 
	 * } else orient--;
	 * 
	 * } } orient=0; while(orient<perimeterVisionDiagonal){//haut droite for
	 * (Agent a:agents){ if(myWorld[posi-orient][posj+orient]==a.id){
	 * tab_localisation[0]=posi-orient; tab_localisation[1]=posj+orient;
	 * tab_localisation[2]=a.id;
	 * 
	 * } else orient++;
	 * 
	 * } }
	 * 
	 * 
	 * orient=0; while(orient<perimeterVisionOriental){//droite for (Agent
	 * a:agents){ if(myWorld[posi][posj+orient]==a.id){
	 * tab_localisation[0]=posi; tab_localisation[1]=posj+orient;
	 * tab_localisation[2]=a.id;
	 * 
	 * } else orient++;
	 * 
	 * } } orient=0; while(orient<perimeterVisionOriental){//gauche for (Agent
	 * a:agents){ if(myWorld[posi][posj-orient]==a.id){
	 * tab_localisation[0]=posi; tab_localisation[1]=posj-orient;
	 * tab_localisation[2]=a.id;
	 * 
	 * } else orient++;
	 * 
	 * } } orient=0; while(orient<perimeterVisionOriental){//haut for (Agent
	 * a:agents){ if(myWorld[posi-orient][posj]==a.id){
	 * tab_localisation[0]=posi-orient; tab_localisation[1]=posj;
	 * tab_localisation[2]=a.id;
	 * 
	 * } else orient++;
	 * 
	 * } } orient=0; while(orient<perimeterVisionOriental){//bas for (Agent
	 * a:agents){ if(myWorld[posi+orient][posj]==a.id){
	 * tab_localisation[0]=posi+orient; tab_localisation[1]=posj;
	 * tab_localisation[2]=a.id;
	 * 
	 * } else orient++;
	 * 
	 * } }
	 * 
	 * return tab_localisation;
	 * 
	 * }
	 * 
	 * public void getTarget(){ for (Prey p:proies){ if
	 * (getNearestAgent()[2]==p.id){ //a changer pour mettre id de l'animal
	 * qu'il peut manger this.target=p; } } } public int [] posTypeAgentNorth(){
	 * int [] tab_pos=new int [3]; //test nord
	 * tab_pos[0]=posi-1;tab_pos[1]=posj;tab_pos[2]=myWorld[posi-1][posj];
	 * return tab_pos; }
	 * 
	 * public int [] posTypeAgentNorthEast(){ int [] tab_pos=new int [3]; //test
	 * nord est
	 * tab_pos[0]=posi-1;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi-1][posj];
	 * return tab_pos; } public int [] posTypeAgentEast(){ int [] tab_pos=new
	 * int [3]; //test est
	 * tab_pos[0]=posi;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi][posj+1];
	 * return tab_pos; }
	 * 
	 * public int [] posTypeAgentSouthEast(){ int [] tab_pos=new int [3]; //test
	 * sud est
	 * tab_pos[0]=posi+1;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi+1][posj+1];
	 * return tab_pos; } public int [] posTypeAgentSouth(){ int [] tab_pos=new
	 * int [3]; //test sud
	 * tab_pos[0]=posi+1;tab_pos[1]=posj;tab_pos[2]=myWorld[posi+1][posj];
	 * return tab_pos; } public int [] posTypeAgentSouthWest(){ int []
	 * tab_pos=new int [3]; //test sud ouest
	 * tab_pos[0]=posi+1;tab_pos[1]=posj-1;tab_pos[2]=myWorld[posi+1][posj-1];
	 * return tab_pos; } public int [] posTypeAgentWest(){ int [] tab_pos=new
	 * int [3]; //test ouest
	 * tab_pos[0]=posi;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi][posj+1];
	 * return tab_pos; } public int [] posTypeAgentNorthWest(){ int []
	 * tab_pos=new int [3]; //test nord ouest
	 * tab_pos[0]=posi-1;tab_pos[1]=posj-1;tab_pos[2]=myWorld[posi-1][posj-1];
	 * return tab_pos; }
	 * 
	 * 
	 * public void hunt(){
	 * 
	 * 
	 * } public int [] posCaseVideAutour(int i,int j){ int espace_vide[]=new
	 * int[2]; //cherche espace vide if(posTypeAgentNorthEast()[2]==2)
	 * espace_vide[0]=posTypeAgentNorthEast()[0];espace_vide[1]=
	 * posTypeAgentNorthEast()[1];
	 * 
	 * if(posTypeAgentNorth()[2]==2)
	 * espace_vide[0]=posTypeAgentNorth()[0];espace_vide[1]=posTypeAgentNorth()[
	 * 1];
	 * 
	 * if(posTypeAgentEast()[2]==2)
	 * espace_vide[0]=posTypeAgentEast()[0];espace_vide[1]=posTypeAgentEast()[1]
	 * ;
	 * 
	 * if(posTypeAgentSouthEast()[2]==2)
	 * espace_vide[0]=posTypeAgentSouthEast()[0];espace_vide[1]=
	 * posTypeAgentSouthEast()[1];
	 * 
	 * if(posTypeAgentSouth()[2]==2)
	 * espace_vide[0]=posTypeAgentSouth()[0];espace_vide[1]=posTypeAgentSouth()[
	 * 1];
	 * 
	 * if(posTypeAgentSouthWest()[2]==2)
	 * espace_vide[0]=posTypeAgentSouthWest()[0];espace_vide[1]=
	 * posTypeAgentSouthWest()[1];
	 * 
	 * if(posTypeAgentWest()[2]==2)
	 * espace_vide[0]=posTypeAgentWest()[0];espace_vide[1]=posTypeAgentWest()[1]
	 * ;
	 * 
	 * if(posTypeAgentNorthWest()[2]==2)
	 * espace_vide[0]=posTypeAgentNorthWest()[0];espace_vide[1]=
	 * posTypeAgentNorthWest()[1];
	 * 
	 * return espace_vide; }
	 */

	public void eat() {
		int compteur_mange = 0;// compteur pour qu'il ne mange qu'un seul agent
		for (Mouton i : moutons) {//a modifier pour rajouter espece que le lion peut manger
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

	/*public void reproduce() {

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
	}*/

}
