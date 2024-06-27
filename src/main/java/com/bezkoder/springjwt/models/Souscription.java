package com.bezkoder.springjwt.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SOUSCRIPTION")
public class Souscription {
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long code_souscription;
		private String code_API;
		private String code_application;
	    private String code_type_autorisation;
	    private String code_autorisation;
	    private Date date_creation;
	    private Date date_expiration;
	    private String cle;
	    private int active;
	    public Souscription() {
			// TODO Auto-generated constructor stub
		}
		public Date getDate_creation() {
			return date_creation;
		}
		public void setDate_creation(Date date_creation) {
			this.date_creation = date_creation;
		}
		public Date getDate_expiration() {
			return date_expiration;
		}
		public void setDate_expiration(Date date_expiration) {
			this.date_expiration = date_expiration;
		}
		public String getCle() {
			return cle;
		}
		public void setCle(String cle) {
			this.cle = cle;
		}
		public long getCode_souscription() {
			return code_souscription;
		}
		public void setCode_souscription(long code_souscription) {
			this.code_souscription = code_souscription;
		}
		public String getCode_API() {
			return code_API;
		}
		public void setCode_API(String code_API) {
			this.code_API = code_API;
		}
		public String getCode_application() {
			return code_application;
		}
		public void setCode_application(String code_application) {
			this.code_application = code_application;
		}
		public String getCode_type_autorisation() {
			return code_type_autorisation;
		}
		public void setCode_type_autorisation(String code_type_autorisation) {
			this.code_type_autorisation = code_type_autorisation;
		}
		public String getCode_autorisation() {
			return code_autorisation;
		}
		public void setCode_autorisation(String code_autorisation) {
			this.code_autorisation = code_autorisation;
		}
		
		public int getActive() {
			return active;
		}
		public void setActive(int active) {
			this.active = active;
		}
		@Override
		public String toString() {
			return "Souscription [code_souscription=" + code_souscription + ", code_API=" + code_API
					+ ", code_application=" + code_application + ", code_type_autorisation=" + code_type_autorisation
					+ ", code_autorisation=" + code_autorisation + ", date_creation=" + date_creation
					+ ", date_expiration=" + date_expiration + ", cle=" + cle + ", active=" + active + "]";
		}
}