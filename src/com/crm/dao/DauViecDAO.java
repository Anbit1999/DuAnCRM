package com.crm.dao;

import java.util.List;

import com.crm.entity.DauViec;

public interface DauViecDAO {

	List<DauViec> findAll();

	boolean addDauViec(DauViec dauViec);

	boolean editDauViec(int id, DauViec dauViec);

	boolean deleteDauViec(int id);

	DauViec findDauViecbyId(int id);
}
