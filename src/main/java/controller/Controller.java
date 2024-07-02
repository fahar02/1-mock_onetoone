package controller;

import dao.Persondao;
import dao.Voterdao;
import hibernate_mock_one_to_one.dto.Person;
import hibernate_mock_one_to_one.dto.Voter;

public class Controller {
	/* one to one is undirection and eager
	 * where person is having relation with voter card
	 * 
	 */
public static void main(String args[])
{
	/*
	Person person=new Person();
	person.setPersonId(10);
	person.setPersonName("fahar");
	person.setPersonAddress("benglore");
	Persondao persondao=new Persondao();
	persondao.savePerson(person);
	Voter voter=new Voter();
	voter.setVoterId(100);
	voter.setVoterName("fahar jamadar");
	voter.setAge(25);
	Voterdao voterdao=new Voterdao();
	voterdao.saveVoter(10, voter);
	Voter voter=new Voter();
	voter.setVoterName("ravi kind");
	voter.setAge(55);
	Voterdao voterdao=new Voterdao();
	voterdao.updateVoter(100, voter);
	Person person=new Person();
	person.setPersonName("azim khan");
	person.setPersonAddress("sangli");
	Persondao persondao=new Persondao();
	persondao.deletePerson(10);*/
	Voterdao voterdao=new Voterdao();
	voterdao.deleteVoter(100);
	
	
}

}
