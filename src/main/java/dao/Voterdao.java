package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_mock_one_to_one.dto.Voter;
import hibernate_mock_one_to_one.dto.Person;

public class Voterdao {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("mock").createEntityManager();
	}
	public void saveVoter(int personId,Voter voter)
	{
		EntityManager entityManager=getEntityManager();
		Person person=entityManager.find(Person.class,personId);
		if(person!=null)
		{
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			person.setVoter(voter);
			entityManager.persist(voter);
			entityTransaction.commit();
		}
		else {
			System.out.println("invalid perosn id");
		}
	}
	public void updateVoter(int voterId,Voter voter)
	{
		EntityManager entityManager=getEntityManager();
		Voter voterdb=entityManager.find(Voter.class,voterId);
		if(voterdb!=null)
		{
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			voter.setVoterId(voterId);
			entityManager.merge(voter);
			entityTransaction.commit();
		}
		else {
			System.out.println("invalid aadhar Id");
		}
	}
	public void deleteVoter(int voterId)
	{
		EntityManager entityManager=getEntityManager();
		Voter voter=entityManager.find(Voter.class,voterId);
		if(voter!=null)
		{
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(voter);
			entityTransaction.commit();
		}
		else {
			System.out.println("invalid aadhar Id");
		}
	}
	public void findVoter(int voterId)
	{
		EntityManager entityManager=getEntityManager();
		Voter voter=entityManager.find(Voter.class,voterId);
		if(voter!=null)
		{
			System.out.println(voter);
		}
		else {
			System.out.println("invalid aadhar Id");
		}
	}

}
