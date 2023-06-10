package com.emp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpTable")
public class Employee {
		@Id 
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		private int eId;
		private String firstName, lastName;

		public int geteId() {
			return eId;
		}
		public void seteId(int eId) {
			this.eId = eId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
//		Here We overiding toString Method for Emp object
		@Override
		public String toString() {
			return "Emp [eId=" + eId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
	

}
