package seit_1;
import java.io.PrintStream;

public class Person {
	public	Person(String n, int d, int m, int y)	{
		name = n;
		dob_d = d;
		dob_m = m;
		dob_y = y;
	
		boss = null;
		worker = null;
		nworkers = 0;
	}

	public	void print(PrintStream ps)	{
		ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob_d, dob_m, dob_y));
		if (type == 1)	{
			ps.print(" bosses: ");
			for (int i = 0; i < nworkers; i++)
				ps.print(worker[i].name+" ");
		}
		else
			ps.print(" is bossed by "+boss.name);
	}
	
	public void setType(int person_type) {
		this.type = person_type;
	}
	
	public void initWorker() {
		this.worker = new Person[max_nworkers];
	}
	
	public void setBoss(Person person_boss) {
		this.boss = person_boss;
	}
	
	public void addWorker(Person person_worker) {
		this.worker[nworkers++] = person_worker;
	}

	private	String	name;
	private	int	dob_d, dob_m, dob_y;	// date of birth
	private	int	type;	// 1 = Boss, 2 = Worker
	private	Person	boss;
	private	Person[] worker;
	private	int	nworkers;
	
	private static int max_nworkers = 10;
}
