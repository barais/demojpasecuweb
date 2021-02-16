package jpa;

import java.util.List;

import javax.persistence.EntityTransaction;

import domain.Sondage;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		JpaTest t = new JpaTest();
		t.rentrerNouvelleDonnées();
		EntityManagerHelper.getEntityManager().close();
	}
	
	

	void rentrerNouvelleDonnées(){
		EntityTransaction tx = EntityManagerHelper.getEntityManager().getTransaction();
		tx.begin();
		try {
			Sondage s = new Sondage();
			s.setTitre("cours secuWeb");
			s.setLieu("zoom");
			EntityManagerHelper.getEntityManager().persist(s);
			
			//	
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
	}
	
	List<Sondage> rechercheSondageByTitre(String titrevar){
		// EntityManagerHelper.getEntityManager().createNativeQuery("select * from ");
		
		String query = "select s from Sondage s where s.titre = :titre";
		return EntityManagerHelper.getEntityManager().
				createQuery(query).setParameter("titre", titrevar).getResultList();
	}
}
