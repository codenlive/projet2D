import java.util.*;

public abstract class Agent {

	boolean alive;
	boolean infecte;
	boolean contamine;
	protected int age_reproductif;
	protected int reserve_eau;
	protected int reserve_food;
	protected int age;
	protected int id;
	protected int endurance;
	protected int sommeil;
	// protected int hibernation;
	protected int posi;
	protected int posj;
	protected int perimeterVisionOriental;
	protected int perimeterVisionDiagonal;
	public static ArrayList<Agent> agents = new ArrayList<Agent>();
	public static ArrayList<Prey> proies = new ArrayList<Prey>();
	public static ArrayList<Predator> predateurs = new ArrayList<Predator>();
	public static ArrayList<Lion> lions = new ArrayList<Lion>();
	public static ArrayList<Ours> ours = new ArrayList<Ours>();
	public static ArrayList<Insect> insectes = new ArrayList<Insect>();
	public static ArrayList<Mouton> moutons = new ArrayList<Mouton>();
	public static ArrayList<Pumba> pumbas = new ArrayList<Pumba>();
	// public int [][] myWorld=SpriteDemo.getMyWorld();
	// public int [][] newmyWorld=SpriteDemo.getnewmyWorld();

	public Agent() {

	}

	public void moveDefault() {
		int orient = (int) (Math.random() * 8);
		int deplacement = (int) (Math.random() * endurance);
		int i;
		switch (orient) {
		case 0: // nord
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi][posj - 1] == 2 || SpriteDemo.myWorld[posi][posj - 1] == 78
					&& SpriteDemo.myWorld[posi][posj - 1] != 0 && SpriteDemo.myWorld[posi][posj - 1] != 1) {
				SpriteDemo.newmyWorld[posi - 1][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posj-=1;
			}
			// i++;
			// }
			break;

		case 1: // est
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi + 1][posj] == 2 || SpriteDemo.myWorld[posi + 1][posj] == 78
					&& SpriteDemo.myWorld[posi + 1][posj] != 0 && SpriteDemo.myWorld[posi + 1][posj] != 1) {
				SpriteDemo.newmyWorld[posi + 1][posj] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posi+=1;
			}
			// i++;
			// }
			break;

		case 2: // sud
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi][posj + 1] == 2 || SpriteDemo.myWorld[posi][posj + 1] == 78
					&& SpriteDemo.myWorld[posi][posj + 1] != 0 && SpriteDemo.myWorld[posi][posj - 1] != 1) {
				SpriteDemo.newmyWorld[posi][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posj+=1;
			}
			// i++;
			// }
			break;

		case 3: // ouest
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi - 1][posj] == 2 || SpriteDemo.myWorld[posi - 1][posj] == 78
					&& SpriteDemo.myWorld[posi - 1][posj] != 0 && SpriteDemo.myWorld[posi - 1][posj] != 1) {
				SpriteDemo.newmyWorld[posi - 1][posj] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posi-=1;
			}
			// i++;
			// }
			break;

		case 4: // nord-est
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi + 1][posj - 1] == 2 || SpriteDemo.myWorld[posi + 1][posj - 1] == 78
					&& SpriteDemo.myWorld[posi + 1][posj - 1] != 0 && SpriteDemo.myWorld[posi + 1][posj - 1] != 1) {
				SpriteDemo.newmyWorld[posi + 1][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posi+=1;posj-=1;
			}
			// i++;
			// }
			break;

		case 5: // nord-ouest
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi - 1][posj - 1] == 2 || SpriteDemo.myWorld[posi - 1][posj - 1] == 78
					&& SpriteDemo.myWorld[posi - 1][posj - 1] != 0 && SpriteDemo.myWorld[posi - 1][posj - 1] != 1) {
				SpriteDemo.newmyWorld[posi - 1][posj - 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posi-=1;
				// posj-=1;
			}
			// i++;
			// }
			break;

		case 6: // sud-est
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi + 1][posj + 1] == 2 || SpriteDemo.myWorld[posi + 1][posj + 1] == 78
					&& SpriteDemo.myWorld[posi + 1][posj + 1] != 0 && SpriteDemo.myWorld[posi + 1][posj + 1] != 1) {
				SpriteDemo.newmyWorld[posi + 1][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posi+=1;posj+=1;
			}
			// i++;
			// }
			break;

		case 7: // sud-ouest
			i = 0;
			// while (i < deplacement) {
			if (SpriteDemo.myWorld[posi - 1][posj + 1] == 2 || SpriteDemo.myWorld[posi - 1][posj + 1] == 78
					&& SpriteDemo.myWorld[posi - 1][posj + 1] != 0 && SpriteDemo.myWorld[posi - 1][posj + 1] != 1) {
				SpriteDemo.newmyWorld[posi - 1][posj + 1] = id;
				SpriteDemo.newmyWorld[posi][posj] = 2;
				// posi-=1;posj+=1;
			}
			// i++;
			// }
			break;
		}

	}
	// }

	// abstract public int [] getNearestAgent();
	// abstract public Agent getTarget();
	// abstract public void eat();
	// abstract public int setPerimeterVision();
	// abstract public int getPerimeterVision();
	// abstract public void moveDefault();//bouge par default si pas de cible
	// abstract public Agent reproduce();
	// abstract public void sleep();
	public int[] posTypeAgentNorth() {
		int[] tab_pos = new int[3];
		// test nord
		tab_pos[0] = posi - 1;
		tab_pos[1] = posj;
		tab_pos[2] = SpriteDemo.myWorld[posi - 1][posj];
		return tab_pos;
	}

	public int[] posTypeAgentNorthEast() {
		int[] tab_pos = new int[3];
		// test nord est
		tab_pos[0] = posi + 1;
		tab_pos[1] = posj - 1;
		tab_pos[2] = SpriteDemo.myWorld[posi + 1][posj - 1];
		return tab_pos;
	}

	public int[] posTypeAgentEast() {
		int[] tab_pos = new int[3];
		// test est
		tab_pos[0] = posi + 1;
		tab_pos[1] = posj;
		tab_pos[2] = SpriteDemo.myWorld[posi + 1][posj];
		return tab_pos;
	}

	public int[] posTypeAgentSouthEast() {
		int[] tab_pos = new int[3];
		// test sud est
		tab_pos[0] = posi + 1;
		tab_pos[1] = posj + 1;
		tab_pos[2] = SpriteDemo.myWorld[posi + 1][posj + 1];
		return tab_pos;
	}

	public int[] posTypeAgentSouth() {
		int[] tab_pos = new int[3];
		// test sud
		tab_pos[0] = posi;
		tab_pos[1] = posj + 1;
		tab_pos[2] = SpriteDemo.myWorld[posi][posj + 1];
		return tab_pos;
	}

	public int[] posTypeAgentSouthWest() {
		int[] tab_pos = new int[3];
		// test sud ouest
		tab_pos[0] = posi - 1;
		tab_pos[1] = posj + 1;
		tab_pos[2] = SpriteDemo.myWorld[posi - 1][posj + 1];
		return tab_pos;
	}

	public int[] posTypeAgentWest() {
		int[] tab_pos = new int[3];
		// test ouest
		tab_pos[0] = posi - 1;
		tab_pos[1] = posj;
		tab_pos[2] = SpriteDemo.myWorld[posi - 1][posj];
		return tab_pos;
	}

	public int[] posTypeAgentNorthWest() {
		int[] tab_pos = new int[3];
		// test nord ouest
		tab_pos[0] = posi - 1;
		tab_pos[1] = posj + 1;
		tab_pos[2] = SpriteDemo.myWorld[posi - 1][posj + 1];
		return tab_pos;
	}

	public int[] posCaseVideAutour(int i, int j) {
		int espace_vide[] = new int[2]; // cherche espace vide
										// if(posTypeAgentNorthEast()[2]==2)
		espace_vide[0] = posTypeAgentNorthEast()[0];
		espace_vide[1] = posTypeAgentNorthEast()[1];

		if (posTypeAgentNorth()[2] == 2)
			espace_vide[0] = posTypeAgentNorth()[0];
		espace_vide[1] = posTypeAgentNorth()[1];

		if (posTypeAgentEast()[2] == 2)
			espace_vide[0] = posTypeAgentEast()[0];
		espace_vide[1] = posTypeAgentEast()[1];

		if (posTypeAgentSouthEast()[2] == 2)
			espace_vide[0] = posTypeAgentSouthEast()[0];
		espace_vide[1] = posTypeAgentSouthEast()[1];

		if (posTypeAgentSouth()[2] == 2)
			espace_vide[0] = posTypeAgentSouth()[0];
		espace_vide[1] = posTypeAgentSouth()[1];

		if (posTypeAgentSouthWest()[2] == 2)
			espace_vide[0] = posTypeAgentSouthWest()[0];
		espace_vide[1] = posTypeAgentSouthWest()[1];

		if (posTypeAgentWest()[2] == 2)
			espace_vide[0] = posTypeAgentWest()[0];
		espace_vide[1] = posTypeAgentWest()[1];

		if (posTypeAgentNorthWest()[2] == 2)
			espace_vide[0] = posTypeAgentNorthWest()[0];
		espace_vide[1] = posTypeAgentNorthWest()[1];

		return espace_vide;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getAge_reproductif() {
		return age_reproductif;
	}

	public void setAge_reproductif(int age_reproductif) {
		this.age_reproductif = age_reproductif;
	}

	public int getReserve_eau() {
		return reserve_eau;
	}

	public void setReserve_eau(int reserve_eau) {
		this.reserve_eau = reserve_eau;
	}

	public int getReserve_food() {
		return reserve_food;
	}

	public void setReserve_food(int reserve_food) {
		this.reserve_food = reserve_food;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public int getSommeil() {
		return sommeil;
	}

	public void setSommeil(int sommeil) {
		this.sommeil = sommeil;
	}

	public int getPosi() {
		return posi;
	}

	public void setPosi(int posi) {
		this.posi = posi;
	}

	public int getPosj() {
		return posj;
	}

	public void setPosj(int posj) {
		this.posj = posj;
	}

	public int getPerimeterVisionOrientale() {
		return perimeterVisionOriental;
	}

	public void setPerimeterVisionOrientale(int perimeterVisionOrientale) {
		this.perimeterVisionOriental = perimeterVisionOrientale;
	}

	public int getPerimeterVisionDiagonal() {
		return perimeterVisionDiagonal;
	}

	public void setPerimeterVisionDiagonal(int perimeterVisionDiagonal) {
		this.perimeterVisionDiagonal = perimeterVisionDiagonal;
	}

}