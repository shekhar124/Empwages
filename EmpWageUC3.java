
public class EmpWageUC3 {

	public static void main(String[] args) {
		int parttime = 1;
		int fulltime = 2;
		int emprateperhour = 20;
		int emphour = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == parttime)
			emphour = 4;
		else if(empcheck == fulltime)
			emphour = 8;
		else
			emphour = 0;
		empwage = emphour * emprateperhour;
		System.out.println("empwgee : "+ empwage);
		
		

	}

}
