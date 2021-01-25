package com.crm.dao;

import java.util.List;

import com.crm.entity.TrangThai;

public interface TrangThaiDAO {

	List<TrangThai> findAll();
	
	TrangThai findTrangThaibyId(int id);
}
