import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <Integer> intList=new ArrayList<Integer>(4);
        Integer i1=new Integer(40);
        Integer i2=new Integer(10);
        Integer i3=new Integer(40);
        Integer i4=new Integer(30);
        //String str4=new String("Apurva");
        
        intList.add(i1);
        intList.add(i2);
        intList.add(i3);
        intList.add(i4);
      //  intList.add(str4);
        
        Iterator<Integer> it=intList.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}
