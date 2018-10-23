public class TestMaxDemo
{
	public static void main(String[] args)
	{
		MaxFinder mf=(a,b)->(a>b)?a:b;      //Lambda Expression
		System.out.println("Greatest number Is:"+mf.max(56, 67));
	}

}
