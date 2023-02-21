package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		//ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
		
		ApplicationContext cont = new AnnotationConfigApplicationContext(Config.class);
		Doctor d =  cont.getBean(Doctor.class);
		d.work();
		
		Doctor x = cont.getBean(Doctor.class);
		x.setField("AIIMS");
		x.work();
		
		System.out.println("Now check both objects......");
		d.work();
		
		Nurse p=  cont.getBean(Nurse.class);
		p.her();
		
		
		Nurse q=  cont.getBean(Nurse.class);
		q.setStatus("Not working...");
		q.her();
		
		
		Patient o = cont.getBean(Patient.class);
		o.info();
	}
}
