package com.crm.entity;

public class TrangThai {
	
	private int maTrangThai;
	private String tenTrangThai;
	
	public TrangThai() {
		// TODO Auto-generated constructor stub
	}

	public TrangThai(String tenTrangThai) {
		super();
		this.tenTrangThai = tenTrangThai;
	}

	public int getMaTrangThai() {
		return maTrangThai;
	}

	public void setMaTrangThai(int maTrangThai) {
		this.maTrangThai = maTrangThai;
	}

	public String getTenTrangThai() {
		return tenTrangThai;
	}

	public void setTenTrangThai(String tenTrangThai) {
		this.tenTrangThai = tenTrangThai;
	}

	@Override
	public String toString() {
		return "TrangThai [maTrangThai=" + maTrangThai + ", tenTrangThai=" + tenTrangThai + "]";
	}
	
	
}
