package level2_Programe;

public class Con6sub {
	public void start() {
		Combination6 c=new Combination6();
		c.school();
		System.out.println("students came");
		work();	
	}
	public void work() {
		System.out.println("Studing");
	}
	public static void end() {
		System.out.println("school completed");
	}

	public static void main(String[] args) {
		Con6sub c=new Con6sub();
		c.start();
		end();
	}
	

}
