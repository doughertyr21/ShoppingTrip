// 0 is false/inactive and 1 is true/active
// if open = 1, door is open
public class Door {

	int open = 0;
	int doorknob = 0;
	int locked = 0;
	int stopper = 0;
	
	public Door(int height) {}
	
	void changeOpen(int openClosed) {
		open = openClosed;
	}
	void changeDoorknob(int turnStatus) {
		doorknob = turnStatus;
	}
	void changeLocked(int lockStatus) {
		locked = lockStatus;
	}
	void applyStopper(int newStopper) {
		stopper = newStopper;
		// thing that keeps the door in place
	}
}
