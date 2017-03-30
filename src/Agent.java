import java.util.ArrayList;
public abstract class Agent {

	boolean alive;
	protected int age_reproductif;
	protected int reserve_eau;
	protected int reserve_food;
	protected int age;
	protected int id;
	protected int endurance;
	protected int sommeil;
	//protected int hibernation;
	protected int posi;
	protected int posj;
	protected int perimeterVisionOriental;
	protected int perimeterVisionDiagonal;
	public static ArrayList <Agent> agents=new ArrayList <Agent>();
	public static ArrayList <Prey> proies=new ArrayList <Prey>();
	public static ArrayList <Predator> predateurs=new ArrayList <Predator>();
	public static ArrayList <Lion> lions=new ArrayList <Lion>();
	public static ArrayList <Lion> Mouton=new ArrayList <Lion>();

	
	public Agent(){
	
}
	
	
	

	//abstract public int [] getNearestAgent();
	//abstract public Agent getTarget();
	//abstract public void eat();
	//abstract public int setPerimeterVision();
	//abstract public int getPerimeterVision();
	//abstract public void moveDefault();//bouge par default si pas de cible
	//abstract public Agent reproduce();
	//abstract public void sleep(); 

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

	public void vieillis() {
		this.age++;
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
