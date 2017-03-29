
public class Insect extends Prey {
	private boolean infecte = false;

	public Insect(int x, int y) {
		alive = true;
		age_reproductif = 25;
		age = 1;
		id = 27;
		endurance = 1;
		this.posi = x;
		this.posj = y;
		perimeterVisionOriental = 1;
		perimeterVisionDiagonal = 1;
		insectes.add(this);
		max_children = 0;// max 2 enfant
		SpriteDemo.myWorld[posi][posj]=this.id;

		if (Math.random() < 0.2)
			infecte = true;

	}

	
	public void meurt() {
		this.alive = false;
		SpriteDemo.newmyWorld[this.posi][this.posj] = 44;// image d'un cadavre
		insectes.remove(this);
	}

	public void vieillis() {
		this.age++;
		if (this.age > 200)
			this.meurt();
	}

	public boolean getInfecte() {
		return infecte;
	}

	@Override
	public void flight() {
		// TODO Auto-generated method stub
			posi += 1;

	}

}
