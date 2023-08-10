package demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="singleton")
public class Doctor implements Staff,BeanNameAware{
	
	private String qualification;
	
	public void assist() {
		System.out.println("Doctor is assisting");
	}

/*	public Doctor(String qualification) {
		this.qualification = qualification;
	}*/
	public String toString() {
		return "Doctor{" + "qualification='" +  qualification + '\'' + '}';
	}

    public String getQualification() {
		return qualification;	
    }

	public void setQualification(String qualification) {
		this.qualification = qualification;
		}

	public void setBeanName(String name) {
		System.out.println("Set Bean Name method is called");
	} 
	
/*	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct Method is called");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destroy Method is called");
	}*/
}

