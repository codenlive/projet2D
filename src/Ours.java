
public class Ours extends Predator{

	public Ours (int posi, int posj) {
		alive = true;
		age_reproductif = 20;
		reserve_eau = 20;
		reserve_food = 20;
		age = 1;
		id = 30;
		endurance = 3;
		this.posi = posi;
		this.posj = posj;
		perimeterVisionOriental = 4;
		perimeterVisionDiagonal = 1;
		SpriteDemo.myWorld[posi][posj] = this.id;
		ours.add(this);
	}

	
}


