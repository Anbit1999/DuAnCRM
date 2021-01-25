package com.crm.dao;

import java.util.List;

import com.crm.entity.Quyen;

public interface QuyenDAO {
	
	List<Quyen> findAll();
	
	Quyen findQuyenbyId(int id);
}
