package com.crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.crm.connection.DbConnection;
import com.crm.dao.QuyenDAO;
import com.crm.entity.CongViec;
import com.crm.entity.Quyen;

public class QuyenRepository implements QuyenDAO{

	@Override
	public List<Quyen> findAll() {
		Connection connection = DbConnection.getConnection();
		List<Quyen> list = null;
		try {
			String query = "Select * from Quyen";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Quyen entity = new Quyen();
				entity.setMaQuyen(resultSet.getInt("maQuyen"));
				entity.setTenQuyen(resultSet.getString("tenQuyen"));
				list.add(entity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Quyen findQuyenbyId(int id) {
		Connection connection = DbConnection.getConnection();
		Quyen entity = new Quyen();
		try {
			String query = "Select * from Quyen where maQuyen=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				entity.setMaQuyen(resultSet.getInt("maQuyen"));
				entity.setTenQuyen(resultSet.getString("tenQuyen"));
				break;
				
			}
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
