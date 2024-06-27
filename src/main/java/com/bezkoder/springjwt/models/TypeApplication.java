package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPE_APPLICATION", schema="SYS")

public class TypeApplication {
		@Id
	    private String codetypeapp;
	    private String libtypeapp;
		public String getCodetypeapp() {
			return codetypeapp;
		}
		public void setCodetypeapp(String codetypeapp) {
			this.codetypeapp = codetypeapp;
		}
		public String getLibtypeapp() {
			return libtypeapp;
		}
		public void setLibtypeapp(String libtypeapp) {
			this.libtypeapp = libtypeapp;
		}
		@Override
		public String toString() {
			return "TypeApplication [codetypeapp=" + codetypeapp + ", libtypeapp=" + libtypeapp + "]";
		}
	}
