import java.io.PrintStream;

import java.util.ArrayList; // import the ArrayList class

public class Lop {

	private	ArrayList<Person> list;

	public Lop()	{
		list = new ArrayList<Person>();
	}

	public void	add(Person person) { 
		list.add(person); 
	}

	public void remove(Person person) {
		int	i, index = -1;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i) == person) {
				index = i;
				break;
			}
		}
		list.remove(index);
	}

	public Person find(String personName) {
		int	i, index = -1;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getName() == personName) {
				index = i;
				break;
			}
		}
		if(index != -1)
			return list.get(i);
		else
			return null;
				
    }

	public void	print(PrintStream ps)	{
		for (int j = 0; j < list.size(); j++)	{
			ps.print(String.format("name: %s", list.get(j).getName()));
			ps.print(String.format("   date of birth: %02d/%02d/%4d", list.get(j).getDob().getDay(), 
	                   list.get(j).getDob().getMonth(), list.get(j).getDob().getYear()));
			ps.println();
		}
	}
	

}

	
	

