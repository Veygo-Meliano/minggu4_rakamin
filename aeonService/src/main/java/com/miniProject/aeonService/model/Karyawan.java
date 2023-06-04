package com.miniProject.aeonService.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="PT_XYZ")
public class Karyawan {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;	 
	 private String alamat,jk,nama,status;
	 private Date date;
	 
//	 public karyawan() {
//		 super();
//	 }
	 
//	 public karyawan(String alamat, String jk, String nama, String status, Date date) {
//		super();
//		this.alamat = alamat;
//		this.jk = jk;
//		this.nama = nama;
//		this.status = status;
//		this.date = date;
//	 }
	 
	 public long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String getAlamat() {
			return alamat;
	 }
	 public void setAlamat(String alamat) {
			this.alamat = alamat;
	 }
	 
	 public String getJk() {
		 	return jk;
	 }
	 public void setJk(String jk) {
		 	this.jk = jk;
	 }
	 
	 public String getNama() {
		 	return nama;
	 }
	 public void setNama(String nama) {
		 	this.nama = nama;
	 }
	 
	 public String getStatus() {
		 	return status;
	 }
	 public void setStatus(String status) {
		 	this.status = status;
	 }
	 
	 public Date getDate() {
		 	return date;
	 }
	 public void setDate(Date date) {
		 	this.date = date;
	 }	 
	 	 
}
