
public class EmpWageWhileUC6 {
	public static final int parttime = 1;
	public static final int fulltime = 2;
	public static final int rateperhour =20;
	public static final int noworkingdays = 2;
	public static final int maxhoursinmonth =10;

	public static void main(String[] args) {
		int emphours = 0;
		int emptotalwd = 0;
		int Temphours = 0;
		while (Temphours <= maxhoursinmonth && emptotalwd < noworkingdays) {
			emptotalwd++;
			int empcheck = (int)Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case parttime:
				emphours = 4;
				break;
				case fulltime:
					emphours = 8;
					break;
				default:
					emphours = 0;
					
			}
			Temphours += emphours;
					System.out.println("day: " + emptotalwd + "emphour" + emphours);
		}
		int emptotalwage = Temphours*rateperhour;
		
		System.out.println("Tempwage :" +Temphours );
		

	}
	

		

	}


