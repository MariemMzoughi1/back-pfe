package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPE_AUTORISATION", schema="SYS")
public class TypeAutorisation {

		@Id
	    private String codetypeautorisation;
	    private String libtypeautorisation;
		public String getCodetypeautorisation() {
			return codetypeautorisation;
		}
		public void setCodetypeautorisation(String codetypeautorisation) {
			this.codetypeautorisation = codetypeautorisation;
		}
		public String getLibtypeautorisation() {
			return libtypeautorisation;
		}
		public void setLibtypeautorisation(String libtypeautorisation) {
			this.libtypeautorisation = libtypeautorisation;
		}
		@Override
		public String toString() {
			return "TypeAutorisation [codetypeautorisation=" + codetypeautorisation + ", libtypeautorisation="
					+ libtypeautorisation + "]";
		}
	}
