package Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Medicine {

	private String name ;
	private String benefits;
	public String getName() {
		return name;
	}
	@Value("Dolo")
	public void setName(String name) {
		this.name = name;
	}
	public String getBenefits() {
		return benefits;
	}
	@Value("Elimination of Cold")
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	
}
