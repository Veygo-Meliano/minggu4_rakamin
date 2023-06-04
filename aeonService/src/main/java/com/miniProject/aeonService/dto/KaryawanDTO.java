package com.miniProject.aeonService.dto;

import java.util.Date;

import com.miniProject.aeonService.model.Karyawan;

public class KaryawanDTO {
	
	private long id;
	private String alamat;
	private String jk;
	private String nama;
	private String status;
	private Date date;
	
	public KaryawanDTO() {
		
	}
	
	public KaryawanDTO(Karyawan karyawan) {
		this.id = karyawan.getId();
		this.alamat = karyawan.getAlamat();
		this.jk = karyawan.getJk();
		this.nama = karyawan.getNama();
		this.status = karyawan.getStatus();
		this.date = karyawan.getDate();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
