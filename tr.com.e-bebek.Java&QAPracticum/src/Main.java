public class Main {

	public static void main(String[] args)  {
		
		
		Employee isci = new Employee("Berkan Ozturk", 2000, 50, 2010);
		
		isci.tax();
		isci.bonus();
		isci.raiseSalary();
		isci.toString();
		//System.out.println(isci); bu da to string demek.
		
		
		
	}

}
