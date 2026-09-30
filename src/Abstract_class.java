abstract class Programming{
	public abstract void Developer();
	public abstract void Rank();
}

abstract class HTML extends Programming 
{
	@Override
	public void Developer()
	{
		System.out.println("Tim Berners lee");
	}
}

class Java extends HTML
{
	@Override
	public void Rank()
	{
		System.out.println("2nd");
	}
}

public class Abstract_class{
	public static void main(String[] args) {
		Programming n = new Java();
		n.Developer();
		n.Rank();
	}
}
