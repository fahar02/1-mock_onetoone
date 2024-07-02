package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.boot.model.naming.ImplicitNameSource;

import hibernate_mock_one_to_one.dto.Person;

public class Persondao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("mock").createEntityManager();
	}
public void savePerson(Person person)
{
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(person);
	entityTransaction.commit();
	
}
public void updatePerson(int personId,Person person)
{
	EntityManager entityManager=getEntityManager();
	Person persondb=entityManager.find(Person.class,personId);
	if(persondb!=null)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		person.setPersonId(personId);
		person.setVoter(persondb.getVoter());
		entityManager.merge(person);
		entityTransaction.commit();
	}
	else
	{
		System.out.println("invalid person Id");
	}
}
public void deletePerson(int personId)
{
	EntityManager entityManager=getEntityManager();
	Person persondb=entityManager.find(Person.class,personId);
	if(persondb!=null)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(persondb);
		entityTransaction.commit();
	}
	else {
		System.out.println("invalid perosn Id");
	}
	
}
public void findPerson(int personId)
{
	EntityManager entityManager=getEntityManager();
	Person person=entityManager.find(Person.class,personId);
	if(person!=null)
	{
		System.out.println(person);
	}
	else {
		System.out.println("invalid perosn Id");
	}
	
}
}
