import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamAPIDemo 
{
	public static void main(String[] args)
	{
		List<Integer> intList=Arrays.asList(45,8,10,3,89,456,10);
		Stream<Integer> intListStream=intList.stream();
		intListStream.filter((num)->num>10).
		forEach(num->System.out.println(num));
		System.out.println("******print distinct******");
		intList.stream().
		distinct().forEach(num->System.out.print(":"+num));
		
		intList.stream().
		distinct().forEach(System.out::println);
		System.out.println("******************");
		
		List<String> cityList=Arrays.asList("Pune","","Mumbai","Delhi","Noida","");
		cityList.stream().map(str->str.length()).
		forEach(System.out::println);
		System.out.println("******************");
		long countOfEmptyStr=cityList.stream().filter(str->str.isEmpty()).count();
		System.out.println("How many empty streams?"+countOfEmptyStr);
	}

}
