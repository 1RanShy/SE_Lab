package seit_1;

public class Main1 {

	public static void main(String[] args)	{
		Person	w1 = new Person("aaa", new dob(1, 2, 1991)); w1.setType(2);
		Person	w2 = new Person("bbb", new dob(3, 4, 1993)); w2.setType(2);
		Person	w3 = new Person("ccc", new dob(5, 6, 1995)); w3.setType(2);
	
		Person	b1 = new Person("ddd", new dob(7, 8, 1997)); b1.setType(1);
		b1.initWorker();
		
		Person	b2 = new Person("eee", new dob(9,10, 1999)); b2.setType(1);
		b2.initWorker();
	
		w1.setBoss(b1); b1.addWorker(w1);
		w2.setBoss(b1); b1.addWorker(w2);
		w3.setBoss(b1); b1.addWorker(w3);
	
		b1.print(System.err); System.err.print("\n");
		b2.print(System.err); System.err.print("\n");
		w1.print(System.err); System.err.print("\n");
		w2.print(System.err); System.err.print("\n");
		w3.print(System.err); System.err.print("\n");
	}
	
}
