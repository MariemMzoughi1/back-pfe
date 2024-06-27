package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLE", schema="SYS")
public class Roles {

		@Id
	    private String id_role;
	    private String libelle_role;
	    private String id_privilege;
		public String getId_role() {
			return id_role;
		}
		public void setId_role(String id_role) {
			this.id_role = id_role;
		}
		public String getLibelle_role() {
			return libelle_role;
		}
		public void setLibelle_role(String libelle_role) {
			this.libelle_role = libelle_role;
		}
		public String getId_privilege() {
			return id_privilege;
		}
		public void setId_privilege(String id_privilege) {
			this.id_privilege = id_privilege;
		}
		@Override
		public String toString() {
			return "Role [id_role=" + id_role + ", libelle_role=" + libelle_role + ", id_privilege=" + id_privilege + "]";
		}
	}

