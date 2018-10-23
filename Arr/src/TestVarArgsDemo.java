
public class TestVarArgsDemo {
	public int add(int ...nums)
	{
		int sum=0;
		for(int tempNum:nums)
		{
			sum=sum+tempNum;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestVarArgsDemo obj1=new TestVarArgsDemo();
		System.out.println("Addition of Number:"+ obj1.add(2,4,6));
        
	}

}
