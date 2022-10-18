package salary;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYears;

	public Employee(String name, double salary, int workHours, int hireYears) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYears = hireYears;
	}

	double bonus() {
		double bonus = 0;
		if (this.workHours > 40) {
			bonus = (this.workHours - 40) * 30; 
			return bonus;
		}
		return 0;
	}

	public double tax() {
		if (this.salary > 1000) {
			double tax = this.salary * 3 / 100;
			return tax;
		}
		return 0;
	}

	public double raiseSalary() {
		
		double raise = 0;
		
		if (0 <= 2021 - hireYears && 2021 - hireYears < 10) {
			raise = (this.salary) * 5 / 100;
			return raise;
		} else if (10<= 2021 - hireYears && 2021 - hireYears < 20) {
			raise = (this.salary) * 10 / 100;
			return raise;
		} else if (20 <= 2021 - hireYears ){
			raise = (this.salary) * 15 / 100;
			return raise;
		} else		
			return 0;
		
	}

	public String toString() {

		System.out.println("Çalışanın adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Haftalık Çalışma Saati: " + this.workHours);
		System.out.println("Başlangıç Yılı: " + this.hireYears);
		System.out.println("Vergi: " + String.format("%.1f", this.tax()));
		System.out.println("Bonus: " + String.format("%.1f", this.bonus()));
		System.out.println("Maaş artışı: " + String.format("%.1f", this.raiseSalary()));
		System.out.println("Vergi ve bonuslarla birlikte maaşı: "+ String.format("%.1f", (this.salary + this.bonus() - this.tax())));
		System.out.println("Toplam maaş değeri: " +  String.format("%.1f" , this.salary + this.bonus() - this.tax() + this.raiseSalary()));
		
		System.out.println("\n\n**********************************************************************\n\n");
		return null;

	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Fatma",3000,45,2018);
		Employee e2 = new Employee("Yavuz",5000,55,2008);
		Employee e3 = new Employee("Kemal",2000,45,1985);
		
		e1.toString();
		e2.toString();
		e3.toString();

	}
}


