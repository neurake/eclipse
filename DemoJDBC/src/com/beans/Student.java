package com.beans;

public class Student {
		private int studId;
		private String studname;
		private String studAddress;
		public Student(int studId, String studname, String studAddress) {
			super();
			this.studId = studId;
			this.studname = studname;
			this.studAddress = studAddress;
		}
		
		public int getStudId() {
			return studId;
		}
		public void setStudId(int studId) {
			this.studId = studId;
		}
		public String getStudname() {
			return studname;
		}
		public void setStudname(String studname) {
			this.studname = studname;
		}
		public String getStudAddress() {
			return studAddress;  
		}
		public void setStudAddress(String studAddress) {
			this.studAddress = studAddress;
		}
		
}
