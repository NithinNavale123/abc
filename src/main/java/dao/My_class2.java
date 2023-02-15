package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.My_class1;

public class My_class2 {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void Add_details(int id, String name, String branch, String usn, String college) {
		My_class1 d = new My_class1();

		d.setId(id);
		d.setName(name);
		d.setBranch(branch);
		d.setUsn(usn);
		d.setCollege(college);

		et.begin();
		em.persist(d);
		et.commit();
	}

	public void fetch(int id) {

		My_class1 d = em.find(My_class1.class, id);

		if(d!=null)
		{
			System.out.println(d);
		}
		else
		{
			System.out.println("Data not found");
		}

	}

	public void update(int id, String branch) {

		My_class1 d = em.find(My_class1.class, id);

		if(d!=null)
		{
			et.begin();
			d.setBranch(branch);
			em.merge(d);
			et.commit();
		}
		else
		{
			System.out.println("Data not found");
		}
	}

	public void remove(int id) {

		My_class1 d = em.find(My_class1.class, id);

		if(d!=null)
		{
			et.begin();
			em.remove(d);
			et.commit();
		}
		else
		{
			System.out.println("Data not found");
		}
	}

	public void fetchAll() {
		Query d = em.createQuery("select a from My_class1 a");

		List<My_class1> g = d.getResultList();

		for (My_class1 f : g)
			System.out.println(f);
	}

	public void deleteAll() {
		Query d = em.createQuery("delete from My_class1");

		et.begin();
		d.executeUpdate();
		et.commit();
	}
}
