package com.bezkoder.springjwt.payload.request;

import java.util.Set;

import javax.validation.constraints.*;
 
public class SignupRequest {
    
    private String username;
 
    private String matricule;
    private String email;
    
    private Set<String> role;
    
 
    private String password;
  public SignupRequest() {
	// TODO Auto-generated constructor stub
}
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }
    

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	@Override
	public String toString() {
		return "SignupRequest [username=" + username + ", matricule=" + matricule + ", email=" + email + ", role="
				+ role + ", password=" + password + "]";
	}

	
    
}
