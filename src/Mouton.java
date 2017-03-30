public class Mouton extends Prey{
	
	public Mouton(int posi ,int posj){
		alive=true;
		age_reproductif=20;
		reserve_eau=20;
		reserve_food=20;
		age=1;
		id=38;
		endurance=3;
		this.posi=posi;
		this.posj=posj;
		perimeterVisionOriental=4;
		perimeterVisionDiagonal=1;
		SpriteDemo.myWorld[posi][posj]=this.id;
	}
	
}