package com.iset.entities;

import jakarta.persistence.*;

@Entity
public class Offre {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long code;
	String intitule;
	String specialite;
	String societe;
	Integer nbpostes;
	String pays;

	public Offre(String intitule, String specialite, String societe, Integer nbposts, String pays) {
		this.code = code;
		this.intitule = intitule;
		this.specialite = specialite;
		this.societe = societe;
		this.nbpostes = nbposts;
		this.pays = pays;
	}
	public Offre(){
		super();
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public Integer getNbpostes() {
		return nbpostes;
	}

	public void setNbpostes(Integer nbpostes) {
		this.nbpostes = nbpostes;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
}

