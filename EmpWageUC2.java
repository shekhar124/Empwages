
public class EmpWageUC2 {
		public static void main(String[] args) {
			int fulltime = 1;
			int emprateperhour = 20;
			int emphours = 0;
			int empwage = 0;
			double empcheck = Math.floor(Math.random() * 10) % 2;
			if (empcheck == fulltime)
				emphours = 8;
			else
				emphours = 0;
			empwage = emphours * emprateperhour;
			System.out.println("empwgee : "+ empwage);
			
		}

}
