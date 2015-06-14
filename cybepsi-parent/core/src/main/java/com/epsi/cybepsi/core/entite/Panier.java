package com.epsi.cybepsi.core.entite;


public class Panier {
	
	private int idCommande;
	private int idProduit;
	private Integer quantiteProduit;
	private Integer remiseProduit;
	private float prixVenteUnitaire;
	
	@Override
	public String toString() {
		return "Panier [idCommande=" + idCommande + ", idProduit=" + idProduit
				+ ", quantiteProduit=" + quantiteProduit + ", remiseProduit="
				+ remiseProduit + ", prixVenteUnitaire=" + prixVenteUnitaire
				+ "]";
	}
	
	public int getIdCommande() {
		return idCommande;
	}
	
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	
	public int getIdProduit() {
		return idProduit;
	}
	
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	

	public Integer getQuantiteProduit() {
		return quantiteProduit;
	}
	
	public void setQuantiteProduit(Integer quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
	
	public Integer getRemiseProduit() {
		return remiseProduit;
	}
	
	public void setRemiseProduit(Integer remiseProduit) {
		this.remiseProduit = remiseProduit;
	}
	
	public float getPrixVenteUnitaire() {
		return prixVenteUnitaire;
	}
	
	public void setPrixVenteUnitaire(float prixVenteUnitaire) {
		this.prixVenteUnitaire = prixVenteUnitaire;
	}


}
