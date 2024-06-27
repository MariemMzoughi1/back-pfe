package com.bezkoder.springjwt.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="API")
	
public class API implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
	    private String code_API;
	    private String libelle_API;
	    private String description;
	    private String contrat;
	    private Date date_creation;
	    private String url_demo;
	    private String url_prod;
	    private String codesysteme;
	    public API() {
			// TODO Auto-generated constructor stub
		}
		public String getCode_API() {
			return code_API;
		}
		public void setCode_API(String code_API) {
			this.code_API = code_API;
		}
		public String getLibelle_API() {
			return libelle_API;
		}
		public void setLibelle_API(String libelle_API) {
			this.libelle_API = libelle_API;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getContrat() {
			return contrat;
		}
		public void setContrat(String contrat) {
			this.contrat = contrat;
		}
		public Date getDate_creation() {
			return date_creation;
		}
		public void setDate_création(Date date_creation) {
			this.date_creation = date_creation;
		}
		public String getUrl_demo() {
			return url_demo;
		}
		public void setUrl_demo(String url_demo) {
			this.url_demo = url_demo;
		}
		public String getUrl_prod() {
			return url_prod;
		}
		public void setUrl_prod(String url_prod) {
			this.url_prod = url_prod;
		}
	
		public String getCodesysteme() {
			return codesysteme;
		}
		public void setCodesysteme(String code_systeme) {
			this.codesysteme = code_systeme;
		}
		@Override
		public String toString() {
			return "API [code_API=" + code_API + ", libelle_API=" + libelle_API + ", description=" + description
					+ ", contrat=" + contrat + ", date_création=" + date_creation + ", url_demo=" + url_demo + ", url_prod="
					+ url_prod + ", code_systeme=" + codesysteme + "]";
		}
		}

