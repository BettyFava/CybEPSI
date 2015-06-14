package com.epsi.cybepsi.core.entite;

import java.util.Date;

public class Commande {

	private Integer id;

	private Date date;

	private String etat;

	private String email_client;

	private String login_anonyme;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getEmail_client() {
		return email_client;
	}

	public void setEmail_client(String email_client) {
		this.email_client = email_client;
	}

	public String getLogin_anonyme() {
		return login_anonyme;
	}

	public void setLogin_anonyme(String login_anonyme) {
		this.login_anonyme = login_anonyme;
	}

}
