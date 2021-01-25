package com.crm.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.crm.connection.DbConnection;
import com.crm.dao.CongViecDAO;
import com.crm.entity.CongViec;

public class CongViecRepository implements CongViecDAO{

	@Override
	public List<CongViec> findAll() {
		Connection connection = DbConnection.getConnection();
		List<CongViec> list = null;
		try {
			String query = "Select * from CongViec";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				CongViec entity = new CongViec();
				entity.setMaCongViec(resultSet.getInt("maCongViec"));
				entity.setTenCongViec(resultSet.getString("tenCongViec"));
				entity.setNgayBatDau(resultSet.getDate("ngayBatDau"));	
				entity.setNgayKetThuc(resultSet.getDate("ngayKetThuc"));
				list.add(entity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean addCongViec(CongViec congViec) {
		Connection connection = DbConnection.getConnection();
		
		try {
			String query = "insert into CongViec(tenCongViec, ngayBatDau, ngayKetThuc) values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, congViec.getTenCongViec());
			statement.setDate(2, (Date) congViec.getNgayBatDau());
			statement.setDate(3, (Date) congViec.getNgayKetThuc());
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean editCongViec(int id, CongViec congViec) {
		Connection connection = DbConnection.getConnection();
		CongViec congViecOld = findCongViecbyId(id);
		if (congViecOld == null) {
			return false;
		}
		
		try {
			String query = "update CongViec set tenCongViec=?, ngayBatDau=?, ngayKetThuc=? where maCongViec=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, congViec.getTenCongViec());
			statement.setDate(2, (Date) congViec.getNgayBatDau());
			statement.setDate(3, (Date) congViec.getNgayKetThuc());
			statement.setInt(4, id);
			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCongViec(int id) {
		Connection connection = DbConnection.getConnection();
		try {
			String query = "delete from CongViec where maCongViec=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public CongViec findCongViecbyId(int id) {
		Connection connection = DbConnection.getConnection();
		CongViec entity = new CongViec();
		try {
			String query = "Select * from CongViec where maCongViec=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				entity.setMaCongViec(resultSet.getInt("maCongViec"));
				entity.setTenCongViec(resultSet.getString("tenCongViec"));
				entity.setNgayBatDau(resultSet.getDate("ngayBatDau"));	
				entity.setNgayKetThuc(resultSet.getDate("ngayKetThuc"));		
				break;
				
			}
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
