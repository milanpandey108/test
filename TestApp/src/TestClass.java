import java.util.ArrayList;
import java.util.List;


public class TestClass {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0; i< 30; i++){
			intList.add(i);
			//System.out.println("Size at index: " + i + " -" + intList.size());
		}
		intList.remove(9);
		System.out.println(intList.size());
	}

}
