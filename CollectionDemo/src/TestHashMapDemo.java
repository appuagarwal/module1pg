import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class TestHashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<Long,String> directory=new HashMap<Long,String>();
		directory.put(46837658005L,"vdygfyug");
		directory.put(99976376444L,"aaaaaaaaa");
		directory.put(59735985686L,"qqqqqqqqe");
		directory.put(66787887797L,"ddygfyug");
		directory.put(46837658005L,"vdygfyug");
		System.out.println(directory);
		System.out.println("Print Enteries********");
		Set<Map.Entry<Long,String>> mapSet=directory.entrySet();
		Iterator<Map.Entry<Long,String>> it=mapSet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Long,String> entry=it.next();
			System.out.println("Key: "+entry.getKey()+" Name:"+entry.getValue());
		}
		
		System.out.println("*****Print Keys********");
		Set<Long> kSet=directory.keySet();
		Iterator<Long> itK=kSet.iterator();
		while(itK.hasNext())
		{
			Long key=itK.next();
			System.out.print(" : "+key);
		}
		
		System.out.println("*****Print values********");
		Collection<String> k=directory.values();
		Iterator<String> itv=k.iterator();
		while(itv.hasNext())
		{
			String name=itv.next();
			System.out.print(" : "+name);
		}
	}

}
