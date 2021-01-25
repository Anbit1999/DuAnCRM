package com.crm.dao;

import java.util.List;

import com.crm.entity.NguoiDung;

public interface NguoiDungDAO {

	List<NguoiDung> findAll();

	boolean addNguoiDung(NguoiDung nguoiDung);

	boolean editNguoiDung(int id, NguoiDung nguoiDung);

	boolean deleteNguoiDung(int id);

	NguoiDung findNguoiDungbyId(int id);

}
