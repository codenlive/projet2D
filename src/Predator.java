import java.util.ArrayList;


public abstract class  Predator extends Agent{
	//protected int myWorld[][];
	
	protected int max_children=2;
	//abstract public int hunt();
	protected Agent target;

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
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posj-=1;
			}

			break;

		case 1: // est
			if (SpriteDemo.myWorld[posi + 1][posj] == 2
					|| SpriteDemo.myWorld[posi + 1][posj] == 78
					|| SpriteDemo.myWorld[posi + 1][posj] == 80) {
				SpriteDemo.newmyWorld[posi + 1][posj] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posi+=1;
			}

			break;

		case 2: // sud
			if (SpriteDemo.myWorld[posi][posj + 1] == 2
					|| SpriteDemo.myWorld[posi][posj + 1] == 78
					|| SpriteDemo.myWorld[posi][posj + 1] == 80) {
				SpriteDemo.newmyWorld[posi][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posj+=1;
			}

			break;

		case 3: // ouest
			if (SpriteDemo.myWorld[posi - 1][posj] == 2
					|| SpriteDemo.myWorld[posi - 1][posj] == 78
					|| SpriteDemo.myWorld[posi - 1][posj] == 80) {
				SpriteDemo.newmyWorld[posi - 1][posj] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posi-=1;
			}

			break;

		case 4: // nord-est
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2
					|| SpriteDemo.myWorld[posi + 1][posj - 1] == 78
					|| SpriteDemo.myWorld[posi + 1][posj - 1] == 80) {
				SpriteDemo.newmyWorld[posi + 1][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posi+=1;posj-=1;
			}

			break;

		case 5: // nord-ouest
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2
					|| SpriteDemo.myWorld[posi - 1][posj - 1] == 78
					|| SpriteDemo.myWorld[posi - 1][posj - 1] == 80) {
				SpriteDemo.newmyWorld[posi - 1][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posi-=1;
				// posj-=1;
			}

			break;

		case 6: // sud-est

			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2
					|| SpriteDemo.myWorld[posi + 1][posj + 1] == 78
					|| SpriteDemo.myWorld[posi + 1][posj + 1] == 80) {
				SpriteDemo.newmyWorld[posi + 1][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posi+=1;posj+=1;
			}

			break;

		case 7: // sud-ouest
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2
					|| SpriteDemo.myWorld[posi - 1][posj + 1] == 78
					|| SpriteDemo.myWorld[posi - 1][posj + 1] == 80) {
				SpriteDemo.newmyWorld[posi - 1][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;

				// posi-=1;posj+=1;
			}
			break;
		}

	}

}

