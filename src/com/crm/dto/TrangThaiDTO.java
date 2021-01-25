package com.crm.dto;

public class TrangThaiDTO {

	private int maTrangThai;
	private String tenTrangThai;
	
	public TrangThaiDTO() {
		// TODO Auto-generated constructor stub
	}

	public TrangThaiDTO(String tenTrangThai) {
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
		return "TrangThaiDTO [maTrangThai=" + maTrangThai + ", tenTrangThai=" + tenTrangThai + "]";
	}
}
