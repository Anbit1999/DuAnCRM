package com.crm.dao;

import java.util.List;

import com.crm.entity.CongViec;

public interface CongViecDAO {
	
	List<CongViec> findAll();
	
	boolean addCongViec(CongViec congViec);
	
	boolean editCongViec(int id, CongViec congViec);
	
	boolean deleteCongViec(int id);
	
	CongViec findCongViecbyId(int id);
}
