package Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Patient {

	
	private String name;
	private String problem ;
	
	
	public String getName() {
		return name;
	}
	@Value("Sachin")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProblem() {
		return problem;
	}
	
	@Value("Piles")
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(name +" daignoesd with "+ problem);
		
	}
	
	
}
