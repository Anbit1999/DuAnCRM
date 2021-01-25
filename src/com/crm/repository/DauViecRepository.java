package com.crm.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.crm.connection.DbConnection;
import com.crm.dao.DauViecDAO;
import com.crm.entity.CongViec;
import com.crm.entity.DauViec;
import com.crm.entity.NguoiDung;
import com.crm.entity.TrangThai;

public class DauViecRepository implements DauViecDAO{
	
	private CongViecRepository congViecRepository;
	
	private NguoiDungRepository nguoiDungRepository;
	
	private TrangThaiRepository trangThaiRepository;
	
	public DauViecRepository() {
		congViecRepository = new CongViecRepository();
		nguoiDungRepository = new NguoiDungRepository();
		trangThaiRepository = new TrangThaiRepository();
	}

	@Override
	public List<DauViec> findAll() {
		Connection connection = DbConnection.getConnection();
		List<DauViec> list = null;
		try {
			String query = "Select * from DauViec";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				DauViec entity = new DauViec();
				entity.setMaDauViec(resultSet.getInt("maDauViec"));
				entity.setTenDauViec(resultSet.getString("tenDauViec"));
				entity.setNgayBatDau(resultSet.getDate("ngayBatDau"));	
				entity.setNgayKetThuc(resultSet.getDate("ngayKetThuc"));
				
				CongViec congViec = congViecRepository.findCongViecbyId(resultSet.getInt("maCongViec"));
				NguoiDung nguoiDung = nguoiDungRepository.findNguoiDungbyId(resultSet.getInt("maNguoiDung"));
				TrangThai trangThai = trangThaiRepository.findTrangThaibyId(resultSet.getInt("maTrangThai"));
				
				entity.setCongViec(congViec);
				entity.setTrangThai(trangThai);
				entity.setNguoiDung(nguoiDung);
				list.add(entity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean addDauViec(DauViec dauViec) {
Connection connection = DbConnection.getConnection();
		
		try {
			String query = "insert into DauViec(tenDauViec, ngayBatDau, ngayKetThuc, maTrangThai, maNguoiDung, maCongViec) "
					+ "values(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, dauViec.getTenDauViec());
			statement.setDate(2, (Date) dauViec.getNgayBatDau());
			statement.setDate(3, (Date) dauViec.getNgayKetThuc());
			statement.setInt(4, dauViec.getTrangThai().getMaTrangThai());
			statement.setInt(5, dauViec.getNguoiDung().getId());
			statement.setInt(6, dauViec.getCongViec().getMaCongViec());
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean editDauViec(int id, DauViec dauViec) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDauViec(int id) {
		Connection connection = DbConnection.getConnection();
		try {
			String query = "delete from DauViec where maDauViec=?";
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
	public DauViec findDauViecbyId(int id) {
		Connection connection = DbConnection.getConnection();
		DauViec entity = new DauViec();
		try {
			String query = "Select * from DauViec where maDauViec=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				entity.setMaDauViec(resultSet.getInt("maDauViec"));
				entity.setTenDauViec(resultSet.getString("tenDauViec"));
				entity.setNgayBatDau(resultSet.getDate("ngayBatDau"));	
				entity.setNgayKetThuc(resultSet.getDate("ngayKetThuc"));
				
				CongViec congViec = congViecRepository.findCongViecbyId(resultSet.getInt("maCongViec"));
				NguoiDung nguoiDung = nguoiDungRepository.findNguoiDungbyId(resultSet.getInt("maNguoiDung"));
				TrangThai trangThai = trangThaiRepository.findTrangThaibyId(resultSet.getInt("maTrangThai"));
				
				entity.setCongViec(congViec);
				entity.setTrangThai(trangThai);
				entity.setNguoiDung(nguoiDung);	
				break;
				
			}
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
