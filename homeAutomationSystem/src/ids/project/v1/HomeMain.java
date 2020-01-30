package ids.project.v1;
import java.util.Random;




public class HomeMain {
	private final static String provGIT="oal";
	public static void main(String[] args) {
		
		//CategoryActuator a = new CategoryActuator("fuoco", "123");
		//System.out.println(a.getNameCategory());
		//System.out.println(a.getGenericInfo());
		//Actuator x = new Actuator("i1", "ciaociaoci", 3);
		//x.setCategory(a);
		//System.out.println(x.getName());
		//Random rd = new Random();
		//System.out.println(rd.nextBoolean());
		Maintainer m = new Maintainer();
		m.login();
		
	}
}
