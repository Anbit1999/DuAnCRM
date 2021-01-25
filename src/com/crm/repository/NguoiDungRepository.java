package com.crm.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.crm.connection.DbConnection;
import com.crm.dao.NguoiDungDAO;
import com.crm.entity.CongViec;
import com.crm.entity.NguoiDung;
import com.crm.entity.Quyen;

public class NguoiDungRepository implements NguoiDungDAO{
	
	private QuyenRepository quyenRepository;
	
	public NguoiDungRepository() {
		quyenRepository = new QuyenRepository();
	}

	@Override
	public List<NguoiDung> findAll() {
		Connection connection = DbConnection.getConnection();
		List<NguoiDung> list = null;
		try {
			String query = "Select * from NguoiDung";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				NguoiDung entity = new NguoiDung();
				entity.setId(resultSet.getInt("id"));
				entity.setEmail(resultSet.getString("email"));
				entity.setMatkhau(resultSet.getString("matkhau"));	
				entity.setHoten(resultSet.getString("hoten"));
				entity.setQuyen(null);
				list.add(entity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean addNguoiDung(NguoiDung nguoiDung) {
Connection connection = DbConnection.getConnection();
		
		try {
			String query = "insert into CongViec(email, matkhau, hoten, avatar, maQuyen) values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, nguoiDung.getEmail());
			statement.setString(2, nguoiDung.getMatkhau());
			statement.setString(3, nguoiDung.getHoten());
			statement.setString(4, nguoiDung.getAvatar());
			statement.setInt(5, nguoiDung.getQuyen().getMaQuyen());
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean editNguoiDung(int id, NguoiDung nguoiDung) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteNguoiDung(int id) {
		Connection connection = DbConnection.getConnection();
		try {
			String query = "delete from NguoiDung where id=?";
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
	public NguoiDung findNguoiDungbyId(int id) {
		Connection connection = DbConnection.getConnection();
		NguoiDung entity = new NguoiDung();
		try {
			String query = "Select * from NguoiDung where id=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				entity.setId(resultSet.getInt("id"));
				entity.setEmail(resultSet.getString("email"));
				entity.setMatkhau(resultSet.getString("matkhau"));
				entity.setHoten(resultSet.getString("hoten"));
				entity.setAvatar(resultSet.getString("avatar"));
				Quyen quyen = quyenRepository.findQuyenbyId(resultSet.getInt("maQuyen"));
				entity.setQuyen(quyen);
				break;
				
			}
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
