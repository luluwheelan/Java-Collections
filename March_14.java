package march7_collection;
import java.util.*;
public class March_14 {
	
	public static void Example1() {
		int[] numbers = {1,2,3,4,5};
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int number : numbers) {
			a1.add(number);
		}
		Iterator<Integer> it = a1.iterator();
		ListIterator<Integer> lit = a1.listIterator(a1.size());
		//is the index of the first element to be returned from the list iterator when calling iterator.next () 
		/*
		 * Iterator this lit variable backwards output its value on a new line
		 */
		while (lit.hasPrevious()) {
		    System.out.println(lit.previous());//reverse the list
		}
	}
	public static void Example2() {
		ArrayList<Double> dubs = new ArrayList<Double>();
		dubs.add(12d);
		dubs.add(42d);
		dubs.add(22d);
		dubs.add(32d);//Need to explicitly declare it as a double value
		
		Object[] arrDub = dubs.toArray();//List to a array
		Double[] dubs1 = {12.2, 34.56, 45.67};
		Collections.addAll(dubs, dubs1);//append dubs to arrDub
		
		for(double number : dubs) {
			System.out.println(number);
		}
	}
	public static void Example3() {
		/*
		 * Create a list of car brands
		 * Create a list of clothing brands
		 * Merge the clothing brand with the car brand
		 * Determine how many times the car brand "Chevy" exits in merge list
		 */
		LinkedList<String> carBrands1 = new LinkedList<String>();
		LinkedList<String> clothBrands1 = new LinkedList<String>();
		carBrands1.add("WM");
		carBrands1.add("Toyota");
		carBrands1.add("BMW");
		carBrands1.add("Ford");
		carBrands1.add("Chevy");
		
		clothBrands1.add("Forever21");
		clothBrands1.add("HM");
		clothBrands1.add("Gap");
		clothBrands1.add("Only");
		clothBrands1.add("Zara");

		//Collections.addAll(carBrands1, clothBrands1); this not work for linkedlist
		carBrands1.addAll(clothBrands1);
		int occurances = Collections.frequency(carBrands1, "Chevy");
		System.out.println("Occurances: " + occurances);
		//Occurances: 1
		
		Collections.reverse(carBrands1);
		System.out.println("After Reverse: " + carBrands1);
		//After Reverse: [Zara, Only, Gap, HM, Forever21, Chevy, Ford, BMW, Toyota, WM]
		
		Collections.shuffle(carBrands1);
		System.out.println("After Shuffle: " + carBrands1);
		//After Shuffle: [Ford, Chevy, Zara, Gap, WM, Only, Toyota, Forever21, HM, BMW]
		
		Collections.sort(carBrands1);
		System.out.println("After Sort: " + carBrands1);
		//After Sort: [BMW, Chevy, Ford, Forever21, Gap, HM, Only, Toyota, WM, Zara]
		
		for(String car : carBrands1) {
			System.out.println(car);
		}// shallow copy
		
		ArrayList<String> brands3 = new ArrayList<String>(carBrands1.size());
		Collections.copy(carBrands1, brands3); //copy brand3 to carBrands1
		System.out.println("Brands3: " + brands3);
		
	}
	public static void Example4() {
		PriorityQueue<Byte> pq = new PriorityQueue<Byte>();
		pq.add((byte)123);
		pq.add((byte)34);
		pq.add((byte)-5);
		pq.add((byte)-50);
		for(byte b: pq) {
			System.out.println(b);//number sorted: -50 -5 34 123
		}
		
		while(pq.size() > 0) {
			System.out.println("Poll: " + pq.poll());
			//remove the highest-priority element of the priority queue
		}
		System.out.println("After poll: " + pq.size()); //After poll: 0
	}
	public static void Example5() {
		/*
		 * Ask user for 5 input, create a HashSet variable storing the 5 input
		 * Create a TreeSet variable storing the 5 input
		 * Using an Iterator,
		 * Display the content (and therefore order)
		 * of the HashSet and TreeSet
		 */
		//set is only for unique values
		Set<String> hSet = new HashSet<>(5); //5 hashset
		Set<String> tSet = new TreeSet<>(); //TreeSet is a sorted set
		Scanner sc = new Scanner(System.in);
		String content;
		
		int count = 5;
		for(int i = 1; i <= count; i++) {
			System.out.printf("%nPlease enter item  %d out of %d", i, count);
			content = sc.nextLine();
			System.out.println();
			hSet.add(content);
			tSet.add(content);
		}
		// not guaranty of the order, no repeated items
		System.out.println("HashSet results: ");
		for(String item : hSet) {
			System.out.println(item);
		}
		//TreeSet order in alphabetical case ignored order, no repeated items 
		System.out.println("TreeSet results: ");
		for(String item : tSet) {
			System.out.println(item);
		}
		
		
	}
	public static void Example6() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		for(int i=0; i <= 30; i++) {
			ts.add(i);
		}
		
		ts1.add(100);
		ts1.add(40);
		ts1.add(650);
		ts1.add(30);
		ts1.add(34);
		ts1.add(23);
		
		System.out.println("\nTS output: \n");
		for(int i : ts) {
			System.out.println(i);
		}
		
		System.out.println("\nTS1 output: \n");
		for(int i : ts1) {
			System.out.println(i);
		}
		
		SortedSet<Integer> headSet1 = ts1.headSet(40);// less than 40
		System.out.println("\nheadSet1 output: \n");
		for(int i : headSet1) {
			System.out.println(i);
		}
		
		SortedSet<Integer> tailSet1 = ts1.tailSet(40); //greater or equal to 40
		System.out.println("\ntailSet1 output: \n");
		for(int i : tailSet1) {
			System.out.println(i);
		}
		
		
	}
	public static void Example7() {
		HashMap<String, Double> hm1 = new HashMap<String, Double>();
		hm1.put("first", 1D);//use put to add value
		hm1.put("1", 11D); // can have repeated values 
		System.out.println(hm1.get("first"));
		System.out.println(hm1.get("1"));
		
		Set<String> hm1Set = hm1.keySet();
		for(String currentKey : hm1Set) {
			System.out.printf("The key %s has a value of %.2f%n", currentKey, hm1.get(currentKey));
		}
	}
	public static void Example8() {
		/*
		 * Create TreeMap of String-string combo
		 * Ask the user 5 times for a name-value pair suggestion, split input by 1 space character 
		 * Add to the TreeMap the Map Key and value 
		 * Using an iterator, output the key-value pairs to screen
		 */
		TreeMap<String, String> tm = new TreeMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String content;
		
		int count = 5;
		for(int i = 1; i <= count; i++) {
			System.out.printf("%nPlease enter two items saperate by space: ");
			content = sc.nextLine();
			String[] splited = content.split(" ");
			tm.put(splited[0], splited[1]);
			System.out.println();
			

		}
		Set<String> tm1Set = tm.keySet();
		
		for(String currentKey : tm1Set) {
			System.out.printf("The key %s has a value of %s%n", currentKey, tm.get(currentKey));
		}
	}

	public static void main(String[] args) {
		//Example1();
		//Example2();
		//Example3();
		//Example4();
		//Example5();
		//Example6();
		Example7();
		//Example8();

	}

}
