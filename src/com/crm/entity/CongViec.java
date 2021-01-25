package com.crm.entity;

import java.time.LocalDate;
import java.util.Date;

public class CongViec {

	private int maCongViec;
	private String tenCongViec;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	
	public CongViec() {
		// TODO Auto-generated constructor stub
	}

	public CongViec(String tenCongViec, Date ngayBatDau, Date ngayKetThuc) {
		super();
		this.tenCongViec = tenCongViec;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}

	public int getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(int maCongViec) {
		this.maCongViec = maCongViec;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	@Override
	public String toString() {
		return "CongViec [maCongViec=" + maCongViec + ", tenCongViec=" + tenCongViec + ", ngayBatDau=" + ngayBatDau
				+ ", ngayKetThuc=" + ngayKetThuc + "]";
	}
	
	
}
