package com.epsi.cybepsi.core.entite;

public class Produit {

		private Integer id;
		private String nom;
		private float prix;
		private String description;
		private String dimensions;
		private String poids;
		private Integer stock;


		public String toString() {
			return "Produit[ nomProduit = " + nom + ", idProduit = " + id + ", prixUnitaireProduit = " + prix
					+ ", descriptionProduit = " + description + " ]";
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer idProduit) {
			this.id = idProduit;
		}

		public String getDimensions() {
			return dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public String getPoids() {
			return poids;
		}

		public void setPoids(String poids) {
			this.poids = poids;
		}

		public Integer getStock() {
			return stock;
		}

		public void setStock(Integer stock) {
			this.stock = stock;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nomProduit) {
			this.nom = nomProduit;
		}

		public double getPrix() {
			return prix;
		}

		public void setPrix(float prixUnitaireProduit) {
			this.prix = prixUnitaireProduit;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String descriptionProduit) {
			this.description = descriptionProduit;
		}




}
