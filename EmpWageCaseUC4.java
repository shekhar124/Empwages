
public class EmpWageCaseUC4 {
	public static final int parttime = 1;
	public static final int fulltime = 2;
	public static final int rateperhour =20;
	public static void main(String [] args) {
		int emphours = 0;
		int empwage = 0;
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
		empwage = emphours * rateperhour;
		System.out.println("empwage: "+ empwage);
	}
	
	
}
