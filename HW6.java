import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// 116 lines of data in school data csv
public class HW6 {

	static String[] nameArray = new String[117];
	static String[] phoneArray = new String[116];
	public static void main (String[] args) throws FileNotFoundException { 

//		phones(); //SLLLOOOOWWWWW!!!!
//		names(); //NPE
//		doubleArray(); //works
	}
	
	private static void phones() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		phoneReader(); //works
		System.out.println("Before: ");
		System.out.println();;
		for (int i = 0; i < phoneArray.length; i++) { 
			System.out.print(phoneArray[i]);
		
		}
		cocktailShaker(phoneArray); //Margarita Time!!! 
		
		System.out.println("After: ");
		System.out.println();;
		for (int i = 0; i < phoneArray.length; i++) { 
			System.out.print(phoneArray[i]);
		}
		
	}

	private static void names() throws FileNotFoundException {
		// TODO Auto-generated method stub
		nameReader();
		System.out.println("Before: ");
		System.out.println();;
		for (int i = 0; i < nameArray.length; i++) { 
			System.out.print(nameArray[i]);
		}
		cocktailShaker(phoneArray); //Margarita Time!!! 
		
		System.out.println("After: ");
		System.out.println();;
		for (int i = 0; i < phoneArray.length; i++) { 
			System.out.print(phoneArray[i]);
		}
		
	}

	private static void phoneReader() throws FileNotFoundException {
		//will need to copy this method for namelist. Names are in items[11]
		
		// TODO Auto-generated method stub
		String filename = new String("PublicSchoolData.csv");	
		File infile = new File(filename);
		Scanner input = new Scanner(infile);
		ArrayList<String> phoneList = new ArrayList<String>();
		
		
		//phonelist
		while (input.hasNextLine()) { //phones
			String nextline = new String(input.nextLine());
			String[] items = nextline.split(",");
			phoneList.add(items[9]);
			
		}
		phoneList.toArray(phoneArray);

	}
	
	private static void nameReader() throws FileNotFoundException {
		//will need to copy this method for namelist. Names are in items[11]
		
		// TODO Auto-generated method stub
		String filename = new String("PublicSchoolData.csv");	
		File infile = new File(filename);
		Scanner input = new Scanner(infile);
		ArrayList<String> phoneList = new ArrayList<String>();
		
		
		//phonelist
		while (input.hasNextLine()) { //phones
			String nextline = new String(input.nextLine());
			String[] items = nextline.split(",");
			phoneList.add(items[11]);
			
		}
		phoneList.toArray(nameArray);

	}

	public static void doubleArray() { 
		
		Random r = new Random();
		
		int count = 0;
		double[] dubarray = new double[10000];
		for (int i = 0; i < dubarray.length; i++) { 
			dubarray[i] = r.nextDouble();
		}
		cocktailShaker(dubarray);
		
		for (int i = 0; i < dubarray.length; i++) { 
			System.out.println(dubarray[i]);

		}
	}
	
	public static void cocktailShaker(String[] myArray) {
		// TODO Auto-generated method stub
		boolean swapped;
		do { 
			swapped = false;
			for (int i = 0; i <= myArray.length-2; i ++) { 
				if (myArray[i].compareToIgnoreCase(myArray[i+1]) > 0 ) { 
					//test whether two colocated elements are in the wrong order
					String temp  = myArray[i]; ///next few lines just shuffle vars around
					myArray[i] = myArray[i+1];
					myArray[i+1] = temp;
					swapped = true;
					System.out.println(temp + ", ");
				}
			}
			if (!swapped) { 
				//we can exit the outer loop if no swaps occurred.
				break;
			}
			swapped = false;
			for (int i = myArray.length - 2; i >= 0; i--) { //working backwards
				if ( myArray[i].compareToIgnoreCase(myArray[i+1])  < 0) { 
					String temp = myArray[i]; //shuffle again
					myArray[i] = myArray[i+1];
					myArray[i + 1] = temp;
					swapped = true;
					System.out.println(temp + ", ");
				}
			}
			//if no elements have been swapped, then the list is sorted
		}while (swapped);
	}
	
	public static void cocktailShaker(double[] myArray) {
		// TODO Auto-generated method stub
		boolean swapped;
		do { 
			swapped = false;
			for (int i = 0; i <= myArray.length-2; i ++) { 
				if (myArray[i] > myArray[i+1]) { 
					//test whether two colocated elements are in the wrong order
					double temp  = myArray[i]; ///next few lines just shuffle vars around
					myArray[i] = myArray[i+1];
					myArray[i+1] = temp;
					swapped = true;
				System.out.println("Swapped = " + temp);
				}
			}
			if (!swapped) { 
				//we can exit the outer loop if no swaps occurred.
				break;
			}
			swapped = false;
			for (int i = myArray.length - 2; i >= 0; i--) { //working backwards
				if ( myArray[i] > myArray[i+1]) { 
					double temp = myArray[i]; //shuffle again
					myArray[i] = myArray[i+1];
					myArray[i + 1] = temp;
					swapped = true;
					System.out.println("Unswapped = " + temp);
				}
			}
			//if no elements have been swapped, then the list is sorted
		}while (swapped);
	}
}
