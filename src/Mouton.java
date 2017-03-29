public class Mouton extends Prey {

	public Mouton(int x, int y) {
		alive = true;
		age_reproductif = 15;
		age = 1;
		id = 38;
		endurance = 1;
		this.posi = x;
		this.posj = y;
		perimeterVisionOriental = 2;
		perimeterVisionDiagonal = 1;
		max_children = 0;// max 6 enfant
		SpriteDemo.myWorld[posi][posj]=this.id;

	}

	
	public void meurt() {
		this.alive = false;
		SpriteDemo.newmyWorld[this.posi][this.posj] = 44;// image d'un cadavre
		moutons.remove(this);
	}

	public void vieillis() {
		this.age++;
		if (this.age > 200)
			this.meurt();
	}

}
