package com.xworkz.xworkzapp.matrimony;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.xworkzapp.num.Gender;

public class DaoImpli implements MatriDAO {
	String url = "jdbc:mysql://localhost:3306/customer";
	String user = "root";
	String password = "root";

	MatriDTO dto = new MatriDTO();

	@Override
	public void save(MatriDTO dto) throws SQLException {
		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO matrimonytable VALUES (?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(5, dto.getMName());
			statement.setString(2, dto.getMGender().toString());
			statement.setString(3, dto.getMQualities());
			statement.setString(4, dto.getMQualification());

			boolean execute = statement.execute();
			System.out.println("execute" + false);

		} finally {
			connection.close();
			System.out.println("connection closed");
		}

	}

	@Override
	public MatriDTO fetchByName(String name) throws SQLException {
		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, user, password);
			String sql = "select * from matrimonytable where M_NAME=? ";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);

			boolean execute = statement.execute();
			if (execute) {
				System.out.println("resultset found");
				ResultSet rset = statement.getResultSet();
				rset.next();
				int rid = rset.getInt(1);
				String gender = rset.getNString(2).toString();
				String qualities = rset.getString(3);
				String qualification = rset.getString(4);
				String name1 = rset.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(rid);
				dto.setMName(name1);
				dto.setMQualities(qualities);
				dto.setMQualification(qualification);
				if (gender.equals("F"))
					dto.setMGender(Gender.F);
				if (gender.equals("M"))
					dto.setMGender(Gender.M);
				if (gender.equals("O"))
					dto.setMGender(Gender.O);

				System.out.println("fetched by name:" + dto);
				return dto;

			}
		} finally {
			connection.close();
		}
		return dto;
	}

	@Override
	public MatriDTO fetchById(int id) throws SQLException {
		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, user, password);
			String sql = "select * from matrimonytable where M_id=? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);

			boolean execute = statement.execute();
			if (execute) {
				System.out.println("resultset found");
				ResultSet rset = statement.getResultSet();
				rset.next();
				int regid = rset.getInt(1);
				String gender = rset.getString(2).toString();
				String qualities = rset.getString(3);
				String qualification = rset.getString(4);
				String name1 = rset.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(regid);
				dto.setMName(name1);
				dto.setMQualification(qualification);
				dto.setMQualities(qualities);
				if (gender.equals("F"))
					dto.setMGender(Gender.F);
				if (gender.equals("M"))
					dto.setMGender(Gender.M);
				if (gender.equals("O"))
					dto.setMGender(Gender.O);
				System.out.println("fetched by id:" + dto);
				return dto;

			}
		} finally {
			connection.close();
		}
		return dto;

	}

	@Override
	public void updatequalitiesByName(String qualities, String name) throws SQLException {
		Connection connection = null;
		try {
			System.out.println("inside update");
			connection = DriverManager.getConnection(url, user, password);
			String sql = "update customer.matrimonytable set M_QUALITIES=?  where  M_NAME=?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, qualities);
			statement.setString(2, name);
			boolean exe = statement.execute();
			if (exe) {

				ResultSet rs = statement.getResultSet();
				rs.next();
				int id = rs.getInt(1);
				String gender = rs.getString(2).toString();
				String rqualities = rs.getString(3);
				String qualification = rs.getString(4);
				String rname = rs.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(id);
				dto.setMName(rname);
				dto.setMQualification(qualification);
				dto.setMQualities(rqualities);
				if (gender.equals("F"))
					dto.setMGender(Gender.F);
				if (gender.equals("M"))
					dto.setMGender(Gender.M);
				if (gender.equals("O"))
					dto.setMGender(Gender.O);
				System.out.println("updated qualities by name" + dto);

			}

		} finally {
			connection.close();
		}
	}

	@Override
	public MatriDTO fetchByNameAndQualification(String name, String qualification) throws SQLException {
		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, user, password);
			String sql = "select * from customer.matrimonytable where M_QUALIFICATION=? and M_NAME=? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, qualification);
			statement.setString(2, name);

			boolean execute = statement.execute();
			if (execute) {
				System.out.println("resultset found");
				ResultSet rset = statement.getResultSet();
				rset.next();
				int id = rset.getInt(1);
				String gender = rset.getString(2).toString();
				String qualities = rset.getString(3);
				String rqualification = rset.getString(4);
				String name1 = rset.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(id);
				dto.setMName(name1);
				dto.setMQualities(qualities);
				dto.setMQualification(rqualification);
				if (gender.equals("F"))
					dto.setMGender(Gender.F);
				if (gender.equals("M"))
					dto.setMGender(Gender.M);
				if (gender.equals("O"))
					dto.setMGender(Gender.O);

				System.out.println("fetched by name and qualification:" + dto);
				return dto;

			}
		} finally {
			connection.close();
		}

		return dto;

	}

	@Override
	public MatriDTO fetchByIdAndGender(int id, Gender gender) throws SQLException {
		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, user, password);
			String sql = "select * from customer.matrimonytable where M_ID=? and M_GENDER=? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setObject(2, gender);

			boolean execute = statement.execute();
			if (execute) {
				System.out.println("resultset found");
				ResultSet rset = statement.getResultSet();
				rset.next();
				int rid = rset.getInt(1);
				String rgender = rset.getString(2).toString();
				String qualities = rset.getString(3);
				String qualification = rset.getString(4);
				String name1 = rset.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(rid);
				dto.setMName(name1);
				dto.setMQualities(qualities);
				dto.setMQualification(qualification);
				if (rgender.equals("F"))
					dto.setMGender(Gender.F);
				if (rgender.equals("M"))
					dto.setMGender(Gender.M);
				if (rgender.equals("O"))
					dto.setMGender(Gender.O);

				System.out.println("fetched by id and gender:" + dto);
				return dto;

			}
		} finally {
			connection.close();
		}
		return dto;
	}

	@Override
	public void deleteByNamegenderAndQualification(String name, Gender gender, String qualification)
			throws SQLException {
		Connection connection = null;
		try {
			System.out.println("inside update");
			connection = DriverManager.getConnection(url, user, password);
			String sql = "delete from  customer.matrimonytable where M_NAME=? and M_GENDER=? and M_QUALIFICATION=?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setObject(2, gender);
			;
			statement.setString(3, qualification);

			boolean exe = statement.execute();
			if (exe) {

				ResultSet rs = statement.getResultSet();
				rs.next();
				int id = rs.getInt(1);
				String rgender = rs.getString(2).toString();
				String rqualities = rs.getString(3);
				String rqualification = rs.getString(4);
				String rname = rs.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(id);
				dto.setMName(rname);
				dto.setMQualification(rqualification);
				dto.setMQualities(rqualities);
				if (gender.equals("F"))
					dto.setMGender(Gender.F);
				if (gender.equals("M"))
					dto.setMGender(Gender.M);
				if (gender.equals("O"))
					dto.setMGender(Gender.O);

				System.out.println("deleted sucessfully");

			}
			System.out.println("deleted sucessfully");

		} finally {
			connection.close();
		}
	}

	@Override
	public MatriDTO fetchByGenderAndName(String name, Gender gender) throws SQLException {
		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, user, password);
			String sql = "select * from matrimonytable where M_NAME=? and M_GENDER=? ";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setObject(2, gender);

			boolean execute = statement.execute();
			if (execute) {
				System.out.println("resultset found");
				ResultSet rset = statement.getResultSet();
				rset.next();
				int id = rset.getInt(1);
				String tgender = rset.getString(2).toString();
				String qualities = rset.getString(3);
				String qualification = rset.getString(4);
				String name1 = rset.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(id);
				dto.setMName(name1);
				dto.setMQualities(qualities);
				dto.setMQualification(qualification);
				if (gender.equals("F"))
					dto.setMGender(Gender.F);
				if (gender.equals("M"))
					dto.setMGender(Gender.M);
				if (gender.equals("O"))
					dto.setMGender(Gender.O);

				System.out.println("fetched by name and gender:" + dto);
				return dto;

			}
		} finally {
			connection.close();
		}
		return dto;
	}

	@Override
	public void updateQualificationByNameAndDeletById(int id, String qualification, String name) throws SQLException {
		Connection connection = null;
		try {
			System.out.println("inside update");
			connection = DriverManager.getConnection(url, user, password);
			String sql = "update customer.matrimonytable set M_QUALITIES=?  where  M_NAME=?";
			PreparedStatement statement = connection.prepareStatement(sql);

			boolean exe = statement.execute();
			if (exe) {

				ResultSet rs = statement.getResultSet();
				rs.next();
				int rid = rs.getInt(1);
				String gender = rs.getString(2).toString();
				String rqualities = rs.getString(3);
				String rqualification = rs.getString(4);
				String rname = rs.getString(5);

				MatriDTO dto = new MatriDTO();
				dto.setId(rid);
				dto.setMName(rname);
				dto.setMQualification(rqualification);
				dto.setMQualities(rqualities);
				if (gender.equals("F"))
					dto.setMGender(Gender.F);
				if (gender.equals("M"))
					dto.setMGender(Gender.M);
				if (gender.equals("O"))
					dto.setMGender(Gender.O);
				System.out.println("updated qualities by name" + dto);

			}

		} finally {
			connection.close();
		}
	}

}
