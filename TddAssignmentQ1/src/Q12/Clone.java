package Q12;

public class Clone implements Cloneable {
	int id;
	String name;
	public Clone(int id, String name) {
	    super();
	    this.id = id;
	    this.name = name;
	}
	public Object clone ()throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static boolean checkClone(Clone s1,Clone s2)
	{
	    if (s1.id==s2.id &&s1.name==s2.name) {
	        return true;
	    } else 
	    return false;


	}

	}
