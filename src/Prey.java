public abstract class Prey extends Agent {

	// protected int [][] myWorld;
	protected int max_children = 5;

	// public abstract void flight();

	public void moveDefault() {
		int orient = (int) (Math.random() * 8);
		// int deplacement=(int)( Math.random()*endurance);
		// int i;
		switch (orient) {
		case 0: // nord
			if (SpriteDemo.myWorld[posi][posj - 1] == 2
					|| SpriteDemo.myWorld[posi][posj - 1] == 78
					|| SpriteDemo.myWorld[posi][posj - 1] == 80) {
				SpriteDemo.newmyWorld[posi][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posj-=1;
			}

			break;

		case 1: // est
			if (SpriteDemo.myWorld[posi + 1][posj] == 2
					|| SpriteDemo.myWorld[posi + 1][posj] == 78
					|| SpriteDemo.myWorld[posi + 1][posj] == 80) {
				SpriteDemo.newmyWorld[posi + 1][posj] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posi+=1;
			}

			break;

		case 2: // sud
			if (SpriteDemo.myWorld[posi][posj + 1] == 2
					|| SpriteDemo.myWorld[posi][posj + 1] == 78
					|| SpriteDemo.myWorld[posi][posj + 1] == 80) {
				SpriteDemo.newmyWorld[posi][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posj+=1;
			}

			break;

		case 3: // ouest
			if (SpriteDemo.myWorld[posi - 1][posj] == 2
					|| SpriteDemo.myWorld[posi - 1][posj] == 78
					|| SpriteDemo.myWorld[posi - 1][posj] == 80) {
				SpriteDemo.newmyWorld[posi - 1][posj] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posi-=1;
			}

			break;

		case 4: // nord-est
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2
					|| SpriteDemo.myWorld[posi + 1][posj - 1] == 78
					|| SpriteDemo.myWorld[posi + 1][posj - 1] == 80) {
				SpriteDemo.newmyWorld[posi + 1][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posi+=1;posj-=1;
			}

			break;

		case 5: // nord-ouest
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2
					|| SpriteDemo.myWorld[posi - 1][posj - 1] == 78
					|| SpriteDemo.myWorld[posi - 1][posj - 1] == 80) {
				SpriteDemo.newmyWorld[posi - 1][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posi-=1;
				// posj-=1;
			}

			break;

		case 6: // sud-est

			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2
					|| SpriteDemo.myWorld[posi + 1][posj + 1] == 78
					|| SpriteDemo.myWorld[posi + 1][posj + 1] == 80) {
				SpriteDemo.newmyWorld[posi + 1][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posi+=1;posj+=1;
			}

			break;

		case 7: // sud-ouest
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2
					|| SpriteDemo.myWorld[posi - 1][posj + 1] == 78
					|| SpriteDemo.myWorld[posi - 1][posj + 1] == 80) {
				SpriteDemo.newmyWorld[posi - 1][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 80;
				// posi-=1;posj+=1;
			}
			break;
		}

	}

	public void eat() {
		int cpt2 = 0;

		if (reserve_food < 30) {
			if (SpriteDemo.myWorld[posi][posj - 1] == 78 && cpt2 == 0) {
				SpriteDemo.newmyWorld[posi][posj - 1] = 2;
				reserve_food += 5;

				cpt2++;
			}

			// est
			if (SpriteDemo.myWorld[posi + 1][posj] == 78 && cpt2 == 0) {

				SpriteDemo.newmyWorld[posi + 1][posj] = 2;
				reserve_food += 5;
				cpt2++;
			}

			// sud
			if (SpriteDemo.myWorld[posi][posj + 1] == 78 && cpt2 == 0) {

				SpriteDemo.newmyWorld[posi][posj + 1] = 2;
				reserve_food += 5;

				cpt2++;
			}

			// ouest
			if (SpriteDemo.myWorld[posi - 1][posj] == 78 && cpt2 == 0) {

				SpriteDemo.newmyWorld[posi - 1][posj] = 2;
				reserve_food += 5;

				cpt2++;
			}

			// nord-est
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 78 && cpt2 == 0) {

				SpriteDemo.newmyWorld[posi + 1][posj - 1] = 2;
				reserve_food += 5;

				cpt2++;
			}

			// nord-ouest
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 78 && cpt2 == 0) {

				SpriteDemo.newmyWorld[posi - 1][posj - 1] = 2;
				reserve_food += 5;

				cpt2++;
			}

			// sud-est

			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 78 && cpt2 == 0) {

				SpriteDemo.newmyWorld[posi + 1][posj + 1] = 2;
				reserve_food += 5;

				cpt2++;
			}

			// sud-ouest
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 78 && cpt2 == 0) {

				SpriteDemo.newmyWorld[posi - 1][posj + 1] = 2;
				reserve_food += 5;

				cpt2++;
			}

			cpt2 = 0;
		}
	}
}
