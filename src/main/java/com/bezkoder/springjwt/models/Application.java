package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPLICATION")
public class Application {
		@Id
	    private String code_application;
	    private String libelle_application;
	    private String proprietaire;
	    private String admin;
	    private String code_type_app;
	    public Application() {
			// TODO Auto-generated constructor stub
		}
		public String getCode_application() {
			return code_application;
		}
		public void setCode_application(String code_application) {
			this.code_application = code_application;
		}
		public String getLibelle_application() {
			return libelle_application;
		}
		public void setLibelle_application(String libelle_application) {
			this.libelle_application = libelle_application;
		}
		public String getProprietaire() {
			return proprietaire;
		}
		public void setProprietaire(String proprietaire) {
			this.proprietaire = proprietaire;
		}
		public String getAdmin() {
			return admin;
		}
		public void setAdmin(String admin) {
			this.admin = admin;
		}
		public String getCode_type_app() {
			return code_type_app;
		}
		public void setCode_type_app(String code_type_app) {
			this.code_type_app = code_type_app;
		}
		@Override
		public String toString() {
			return "Application [code_application=" + code_application + ", libelle_application=" + libelle_application
					+ ", proprietaire=" + proprietaire + ", admin=" + admin + ", code_type_app=" + code_type_app + "]";
		}
	}
