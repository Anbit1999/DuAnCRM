package com.crm.entity;

public class NguoiDung {

	private int id;
	private String email;
	private String matkhau;
	private String hoten;
	private String avatar;
	
	private Quyen quyen;
	
	public NguoiDung() {
		// TODO Auto-generated constructor stub
	}

	

	public NguoiDung(String email, String matkhau, String hoten, String avatar) {
		super();
		this.email = email;
		this.matkhau = matkhau;
		this.hoten = hoten;
		this.avatar = avatar;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Quyen getQuyen() {
		return quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}

	@Override
	public String toString() {
		return "NguoiDung [id=" + id + ", email=" + email + ", matkhau=" + matkhau + ", hoten=" + hoten + ", avatar="
				+ avatar + ", quyen=" + quyen + "]";
	}
	
	
}
