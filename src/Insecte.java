public class Insecte extends Prey {
	private int children = 0;

	public Insecte(int x, int y) {
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
		max_children = 4;// max 4 enfant
		SpriteDemo.myWorld[posi][posj] = this.id;
		insectes.add(this);
		if (Math.random() < 0.5)
			infecte = true;

	}

	public void meurt() {
		this.alive = false;
		SpriteDemo.newmyWorld[this.posi][this.posj] = 44;// image d'un cadavre
		insectes.add(this);
	}

	public void vieillis() {
		this.age++;
		if (this.age > 20)
			this.meurt();
	}

	public void autoReproduce() {
		int cpt = 0;
		
			if (children < max_children) {
				// new
				// Insecte(posCaseVideAutour(this.posi,this.posj)[0],posCaseVideAutour(this.posi,this.posj)[1]);

				// nord

				if (SpriteDemo.myWorld[posi][posj - 1] == 2 && cpt == 0) {

					new Insecte(posi, posj - 1);

					cpt++;
				}

				// est
				if (SpriteDemo.myWorld[posi + 1][posj] == 2 && cpt == 0) {

					new Insecte(posi + 1, posj);

					cpt++;
				}

				// sud
				if (SpriteDemo.myWorld[posi][posj + 1] == 2 && cpt == 0) {

					new Insecte(posi, posj + 1);

					cpt++;
				}

				// ouest

				if (SpriteDemo.myWorld[posi - 1][posj] == 2 && cpt == 0) {

					new Insecte(posi - 1, posj);

					cpt++;
				}

				// nord-est
				if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 && cpt == 0) {

					new Insecte(posi + 1, posj - 1);

					cpt++;
				}
				// nord-ouest
				if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 && cpt == 0) {

					new Insecte(posi - 1, posj - 1);

					cpt++;
				}

				// sud-est

				if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 && cpt == 0) {

					new Insecte(posi + 1, posj + 1);

					cpt++;
				}

				// sud-ouest
				if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 && cpt == 0) {

					new Insecte(posi - 1, posj + 1);

					cpt++;
				}
				children++;
			
		}
	}

	public boolean getInfecte() {
		return infecte;
	}

}
