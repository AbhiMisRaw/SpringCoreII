package Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Nurse {
	
	private String status ;

	public String getStatus() {
		return status;
	}

	@Value("Serving a patient")
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public void her() {
		System.out.println(status);
	}
	

}
