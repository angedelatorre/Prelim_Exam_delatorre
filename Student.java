
public class Student {
	private int IDnum;
	private int credithours;
	private int points;
	private double a;
	
	public Student() {
    }
	
 //constructor 
	public Student(int IDnum, int credithours, int points) {
        this.IDnum = IDnum;
        this.credithours = credithours;
        this.points = points;
        calculateGradePoint();
    }
	
	public int getIDnum() {
		return IDnum;
	}
	public void setIDnum(int IDnum) {
        this.IDnum = IDnum;
    }
	public int getCredithours() {
		return credithours;
	}
	 public void setCredithours(int credithours) {
	        this.credithours = credithours;
	    }
	public int getPoints() {
		return points;
	}
	  public void setPoints(int points) {
	        this.points = points;
	    }
	  @Override
	   public String toString() {
	       return "\nID number: " + IDnum + "\nPoints Earned:  " + points + "\nCredit hours:  " +  credithours + "\nGrade point average : "
	               + a;
	   }

	   public void calculateGradePoint() {
	       a = points / (double) credithours;
	   }
}

