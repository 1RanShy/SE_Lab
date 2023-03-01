public class Date {
    private int day;
    private int month;
    private int year;

    public	Date(int day, int month, int year)	
    {
        this.day = day;
        this.month = month;
        this.year = year;
	}

    public	void print(PrintStream ps)	{
		ps.print(String.format("%s: born on %02d/%02d/%4d", name, birth_date.get_dob_day(), birth_date.get_dob_month(), birth_date.get_dob_year()));
		if (type == 1)	{
			ps.print(" bosses: ");
			for (int i = 0; i < nworkers; i++)
				ps.print(worker[i].name+" ");
		}
		else
			ps.print(" is bossed by "+boss.name);
	}

    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    public int diffInYears(Date date)
    {
        int x = this.year  - date.getYear();
        return x;
    }
}
