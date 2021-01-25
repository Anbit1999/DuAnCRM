package com.crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.crm.connection.DbConnection;
import com.crm.dao.TrangThaiDAO;
import com.crm.entity.CongViec;
import com.crm.entity.TrangThai;

public class TrangThaiRepository implements TrangThaiDAO{

	@Override
	public List<TrangThai> findAll() {
		Connection connection = DbConnection.getConnection();
		List<TrangThai> list = null;
		try {
			String query = "Select * from TrangThai";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				TrangThai entity = new TrangThai();
				entity.setMaTrangThai(resultSet.getInt("maTrangThai"));
				entity.setTenTrangThai(resultSet.getString("tenTrangThai"));
				list.add(entity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public TrangThai findTrangThaibyId(int id) {
		Connection connection = DbConnection.getConnection();
		TrangThai entity = new TrangThai();
		try {
			String query = "Select * from TrangThai where maTrangThai=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				entity.setMaTrangThai(resultSet.getInt("maTrangThai"));
				entity.setTenTrangThai(resultSet.getString("tenTrangThai"));	
				break;
				
			}
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
