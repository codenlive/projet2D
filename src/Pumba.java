
public class Pumba extends Predator {

	public Pumba(int posi, int posj) {
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
		pumbas.add(this);
	}
	
	
	public void eat(){
		int compteur_mange=0;//compteur pour qu'il ne mange qu'un seul agent
		for (Insect i:insectes){
			if(posTypeAgentNorthEast()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;
			}
		
			if(posTypeAgentNorth()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;
			}
		
			if(posTypeAgentEast()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;
			}
		
			if(posTypeAgentSouthEast()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;
			}
		
			if(posTypeAgentSouth()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;
			}
			
			if(posTypeAgentSouthWest()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;
			}
			
			if(posTypeAgentWest()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;	
			}
			
			if(posTypeAgentNorthWest()[2]==i.id &&compteur_mange<1){
				compteur_mange++;
				i.meurt();
				this.reserve_food+=15;
				this.reserve_eau+=5;
				if(i.getInfecte()==true)
					this.infecte=true;
			}
			
			
				
			}
		}
	}
