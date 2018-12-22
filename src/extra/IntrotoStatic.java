package extra;

public class IntrotoStatic {
	public static class Athlete {

	     static int nextBibNumber;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	Athlete (String name, int speed){
	     this.name = name;
	     this.speed = speed;
	}

	public static void main(String[] args) {
	 Athlete Bolt = new Athlete("Usain Bolt", 4);
	 Athlete Jesse = new Athlete("Jesse Owens", 3);
		//create two athletes      //print their names, bibNumbers, and the location of their race.
		}
	}
	}