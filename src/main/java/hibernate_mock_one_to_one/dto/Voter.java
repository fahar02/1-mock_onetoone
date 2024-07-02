package hibernate_mock_one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Voter 
{
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", voterName=" + voterName + ", age=" + age + "]";
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Id
	private int voterId;
	private String voterName;
	private int age;
	
	
	
	
	
	
	

}
