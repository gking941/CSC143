//complete!!
import java.util.ArrayList;

//CSC143 HW3 Exercise 06


public class Ex06MinToFront {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		nums.add(3);
		nums.add(8);
		nums.add(92);
		nums.add(4);
		nums.add(2);
		nums.add(17);
		nums.add(9);

		minToFront(nums);  

	}

	private static void minToFront(ArrayList<Integer> nums) {

		int low = nums.size();
		for (int i = 0; i < nums.size(); i++) { 
			if (nums.get(i) < low) { 
				low = nums.get(i);
			}	
		}
		nums.remove(nums.indexOf(low));
		nums.add(0, low);
		System.out.println(nums.toString());
		
	}
}
