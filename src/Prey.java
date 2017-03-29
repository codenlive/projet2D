
public abstract class Prey extends Agent {

	protected int[][] myWorld;
	protected int max_children = 5;


	public void flight() {
		// TODO Auto-generated method stub
		for (Predator p : predateurs) {
			// le predateur est a : nordest
			if ((myWorld[posi + 1][posj - 1] == p.id)
					&& ((myWorld[posi - 1][posj + 1] == 2) || (myWorld[posi - 1][posj + 1] == 78))) {
				myWorld[posi - 1][posj + 1] = this.id;
				myWorld[posi][posj] = 2;
			}
			// nordouest
			if ((myWorld[posi - 1][posj - 1] == p.id)
					&& ((myWorld[posi + 1][posj + 1] == 2) || (myWorld[posi + 1][posj + 1] == 78))) {
				myWorld[posi + 1][posj + 1] = this.id;
				myWorld[posi][posj] = 2;
			}
			// nord
			if ((myWorld[posi][posj - 1] == p.id)
					&& ((myWorld[posi][posj + 1] == 2) || (myWorld[posi][posj + 1] == 78))) {
				myWorld[posi][posj + 1] = this.id;
				myWorld[posi][posj] = 2;
			}
			// sud
			if ((myWorld[posi][posj + 1] == p.id)
					&& ((myWorld[posi][posj - 1] == 2) || (myWorld[posi][posj - 1] == 78))) {
				myWorld[posi][posj - 1] = this.id;
				myWorld[posi][posj] = 2;
			}
			// sudest
			if ((myWorld[posi + 1][posj + 1] == p.id)
					&& ((myWorld[posi - 1][posj + 1] == 2) || (myWorld[posi - 1][posj + 1] == 78))) {
				myWorld[posi - 1][posj + 1] = this.id;
				myWorld[posi][posj] = 2;
			}
			// sudouest
			if ((myWorld[posi - 1][posj + 1] == p.id)
					&& ((myWorld[posi + 1][posj - 1] == 2) || (myWorld[posi + 1][posj - 1] == 78))) {
				myWorld[posi + 1][posj - 1] = this.id;
				myWorld[posi][posj] = 2;
			}
			// ouest
			if ((myWorld[posi - 1][posj] == p.id)
					&& ((myWorld[posi + 1][posj] == 2) || (myWorld[posi + 1][posj] == 78))) {
				myWorld[posi + 1][posj] = this.id;
				myWorld[posi][posj] = 2;
			}
			// est
			if ((myWorld[posi + 1][posj] == p.id)
					&& ((myWorld[posi - 1][posj] == 2) || (myWorld[posi - 1][posj] == 78))) {
				myWorld[posi - 1][posj] = this.id;
				myWorld[posi][posj] = 2;
			}

		}
	}
}
