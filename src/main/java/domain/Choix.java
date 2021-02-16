package domain;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Choix {
	
	
	@Id
	@GeneratedValue
	long id;
	
	
	Timestamp datedebutpossible;
	Timestamp datefinPossible;
	
	@ManyToOne
	Sondage s;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Timestamp getDatedebutpossible() {
		return datedebutpossible;
	}
	public void setDatedebutpossible(Timestamp datedebutpossible) {
		this.datedebutpossible = datedebutpossible;
	}
	public Timestamp getDatefinPossible() {
		return datefinPossible;
	}
	public void setDatefinPossible(Timestamp datefinPossible) {
		this.datefinPossible = datefinPossible;
	}

}
