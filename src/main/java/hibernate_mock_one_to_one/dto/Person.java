package hibernate_mock_one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	private int personId;
	private String personName;
	private String personAddress;
	@OneToOne
	private Voter voter;
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ ", voter=" + voter + "]";
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	
	
	
	

	

}
