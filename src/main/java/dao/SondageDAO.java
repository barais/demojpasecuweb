package dao;

import java.util.List;

import domain.Sondage;
import jpa.EntityManagerHelper;

public class SondageDAO extends GenericDaoJpaImpl<Sondage, Long>{
	
	
	List<Sondage> rechercheSondageByTitre(String titrevar){
		// EntityManagerHelper.getEntityManager().createNativeQuery("select * from ");
		
		String query = "select s from Sondage s where s.titre = :titre";
		return EntityManagerHelper.getEntityManager().
				createQuery(query).setParameter("titre", titrevar).getResultList();
	}

}
