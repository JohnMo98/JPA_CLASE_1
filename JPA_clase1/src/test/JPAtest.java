package test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clases.Departamento;

public class JPAtest {
	private EntityManager manager;

	
	public JPAtest(EntityManager manager){
		this.manager = manager;
	}
	
	public static void main(String[] args) {
		//patron factory para obtener el EntityManager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_clase1");
		//creo el EntityManager
		EntityManager em = factory.createEntityManager();
		//Inyecto DI
		JPAtest test = new JPAtest(em);
		//defino mi transaccion
		EntityTransaction tx = em.getTransaction();
		//degino ambito de transaccion
		tx.begin();
		//insert, update y delete
		test.crearEmpleados();
		
		tx.commit();
	}
	
	private void crearEmpleados() {
		
		Departamento lima = new Departamento("Lima");
		manager.persist(lima);
		
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
	
}
