package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTORISATION", schema="SYS")
public class Autorisation {
		@Id
	    private String code_autorisation;
	    private String code_souscription;
	    private String code_etablissement;
	    private String code_direction;
	    private String code_sous_direction;
	    private int active;
		public String getCode_autorisation() {
			return code_autorisation;
		}
		public void setCode_autorisation(String code_autorisation) {
			this.code_autorisation = code_autorisation;
		}
		public String getCode_souscription() {
			return code_souscription;
		}
		public void setCode_souscription(String code_souscription) {
			this.code_souscription = code_souscription;
		}
		public String getCode_etablissement() {
			return code_etablissement;
		}
		public void setCode_etablissement(String code_etablissement) {
			this.code_etablissement = code_etablissement;
		}
		public String getCode_direction() {
			return code_direction;
		}
		public void setCode_direction(String code_direction) {
			this.code_direction = code_direction;
		}
		public String getCode_sous_direction() {
			return code_sous_direction;
		}
		public void setCode_sous_direction(String code_sous_direction) {
			this.code_sous_direction = code_sous_direction;
		}
		public int getActive() {
			return active;
		}
		public void setActive(int active) {
			this.active = active;
		}
		@Override
		public String toString() {
			return "Autorisation [code_autorisation=" + code_autorisation + ", code_souscription=" + code_souscription
					+ ", code_etablissement=" + code_etablissement + ", code_direction=" + code_direction
					+ ", code_sous_direction=" + code_sous_direction + ", active=" + active + "]";
		}
	}

