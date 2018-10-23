import java.util.*;

public class TestHashSetDemo {

	public static void main(String[] args) {

		        HashSet <Integer> intSet=new HashSet <Integer>();
		        Integer i1=new Integer(40);
		        Integer i2=new Integer(10);
		        Integer i3=new Integer(40);
		        Integer i4=new Integer(30);
		        Integer i5=new Integer(50);
		        System.out.println("Size:"+intSet.size());
		        intSet.add(i1);
		        intSet.add(i2);
		        intSet.add(i3);
		        intSet.add(i4);
		        intSet.add(i5);
		        System.out.println("Size:"+intSet.size());
		        
		        Iterator<Integer> it=intSet.iterator();
		        while(it.hasNext())
		        {
		        	System.out.println(it.next());
		        }
			}

}


