import java.time.LocalDate;

public class Employee {
	int maasArtisi = 0;
	int bonus = 0;
	int vergi = 0;

	private String name;
	private int salary;
	private int workHours;
	private int hireYear;
	int newSalary = salary;

	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void tax() {
		if (salary < 1000) {
			vergi = 0;
		} else {
			vergi = ((salary * 3) / 100);
		}
		newSalary = (salary - vergi);
	}

	public void bonus() {
		if (workHours > 40) {
			bonus = (workHours - 40) * 30;
			newSalary = newSalary + bonus;
		}
	}

	public void raiseSalary() {
		LocalDate now = LocalDate.now();
		int calismaZamani = (now.withYear(2021).getYear() - hireYear);
		if (calismaZamani < 10) {
			maasArtisi = 5;
			newSalary = ((newSalary * 5) / 100) + newSalary;
		} else if (calismaZamani > 9 && calismaZamani < 20) {
			maasArtisi = 10;
			newSalary = ((newSalary * 10) / 100) + newSalary;
		} else {
			maasArtisi = 15;
			newSalary = ((newSalary * 15) / 100) + newSalary;
		}
	}

	public String showInfo() {

		System.out.println("Calisanin ismi : " + getName());
		System.out.println("Calisanin maasi : " + getSalary());
		System.out.println("Calisanin calisma saati : " + getWorkHours());
		System.out.println("Calisanin baslangic yili : " + getHireYear());
		System.out.println("Calisanin vergi miktari : " + vergi + " tl dir.");
		System.out.println("Calisanin hakkettigi bonus miktari : " + bonus + " tl dir.");
		System.out.println("Calisanin maas artisi yuzde " + maasArtisi + " dur.");
		System.out.println("Calisanin vergi ve bonuslarla birlikte maasi : " + newSalary + " tl dir. ");
		System.out.println("Calisanin toplam maasi : " + (salary + bonus) + " tl dir .");
		return "";

	}

	@Override
	public String toString() {
		return showInfo();
	}

}
