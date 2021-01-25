package com.crm.dto;

import java.time.LocalDate;

public class CongViecDTO {

	private int maCongViec;
	private String tenCongViec;
	private LocalDate ngayBatDau;
	private LocalDate ngayKetThuc;
	
	public CongViecDTO() {
		// TODO Auto-generated constructor stub
	}

	public CongViecDTO(String tenCongViec, LocalDate ngayBatDau, LocalDate ngayKetThuc) {
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

	public LocalDate getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(LocalDate ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	@Override
	public String toString() {
		return "CongViecDTO [maCongViec=" + maCongViec + ", tenCongViec=" + tenCongViec + ", ngayBatDau=" + ngayBatDau
				+ ", ngayKetThuc=" + ngayKetThuc + "]";
	}
}
