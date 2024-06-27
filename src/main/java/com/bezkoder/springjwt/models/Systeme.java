package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SYSTEME", schema="SYS")
public class Systeme {
		@Id
	    private String codesysteme;
	    private String libsysteme;
	    private String nature;
		public String getNature() {
			return nature;
		}
		public void setNature(String nature) {
			this.nature = nature;
		}
		public String getCodesysteme() {
			return codesysteme;
		}
		public void setCodesysteme(String codesysteme) {
			this.codesysteme = codesysteme;
		}
		public String getLibsysteme() {
			return libsysteme;
		}
		public void setLibsysteme(String libsysteme) {
			this.libsysteme = libsysteme;
		}
		@Override
		public String toString() {
			return "Systeme [codesysteme=" + codesysteme + ", libsysteme=" + libsysteme + ", nature=" + nature + "]";
		}
		
		
	}