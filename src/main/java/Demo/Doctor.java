package Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton")
public class Doctor {

	 private String field;

	    public String getField() {
		return field;
	}
	    public void setField( String field ) {
			this.field = field;
		}


		public Doctor(@Value(" NeuroScience ") String value) {
	        this.field = value;
	    }
	    
	
	public void work(){
		System.out.println("Doctor is working in "+field );
	}
}
