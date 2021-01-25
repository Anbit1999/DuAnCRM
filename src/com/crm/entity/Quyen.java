package com.crm.entity;

public class Quyen {

	private int maQuyen;
	private String tenQuyen;
	private String mota;
	
	public Quyen() {
		// TODO Auto-generated constructor stub
	}

	

	public Quyen(String tenQuyen, String mota) {
		super();
		this.tenQuyen = tenQuyen;
		this.mota = mota;
	}



	public int getMaQuyen() {
		return maQuyen;
	}

	public void setMaQuyen(int maQuyen) {
		this.maQuyen = maQuyen;
	}

	public String getTenQuyen() {
		return tenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}

	
	
	public String getMota() {
		return mota;
	}



	public void setMota(String mota) {
		this.mota = mota;
	}

	@Override
	public String toString() {
		return "Quyen [maQuyen=" + maQuyen + ", tenQuyen=" + tenQuyen + ", mota=" + mota + "]";
	}


	
	
}
