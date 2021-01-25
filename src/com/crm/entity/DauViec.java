package com.crm.entity;

import java.time.LocalDate;
import java.util.Date;

public class DauViec {

	private int maDauViec;
	private String tenDauViec;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	
	private TrangThai trangThai;
	
	private NguoiDung nguoiDung;
	
	private CongViec congViec;
	
	
	public DauViec() {
		// TODO Auto-generated constructor stub
	}


	public DauViec(String tenDauViec, Date ngayBatDau, Date ngayKetThuc) {
		super();
		this.tenDauViec = tenDauViec;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}


	public int getMaDauViec() {
		return maDauViec;
	}


	public void setMaDauViec(int maDauViec) {
		this.maDauViec = maDauViec;
	}


	public String getTenDauViec() {
		return tenDauViec;
	}


	public void setTenDauViec(String tenDauViec) {
		this.tenDauViec = tenDauViec;
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


	public TrangThai getTrangThai() {
		return trangThai;
	}


	public void setTrangThai(TrangThai trangThai) {
		this.trangThai = trangThai;
	}


	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}


	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}


	public CongViec getCongViec() {
		return congViec;
	}


	public void setCongViec(CongViec congViec) {
		this.congViec = congViec;
	}


	@Override
	public String toString() {
		return "DauViec [maDauViec=" + maDauViec + ", tenDauViec=" + tenDauViec + ", ngayBatDau=" + ngayBatDau
				+ ", ngayKetThuc=" + ngayKetThuc + ", trangThai=" + trangThai + ", nguoiDung=" + nguoiDung
				+ ", congViec=" + congViec + "]";
	}
	
	
}
