
public class Student {
	public int IDnum;
	public int credithours;
	public int points;
	
 //constructor 
	public Student(int sIDnum, int scredithours, int spoints) {
        this.IDnum = sIDnum;
        this.credithours = scredithours;
        this.points = spoints;
    }
	
	public int getnum() {
		return IDnum;
	}
	public int getch() {
		return credithours;
	}
	public int getpts() {
		return points;
	}
	public void setnum(int a)
	{
		IDnum = a;
	}
	public void setch(int b)
	{
		credithours = b;
	}
	public void setpts(int c)
	{
		points = c;
	}
}

