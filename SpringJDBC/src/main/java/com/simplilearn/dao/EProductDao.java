package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.simplilearn.entity.EProductEntity;

@Repository
public class EProductDao {


	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<EProductEntity> getAllProducts(){
		
		return jdbcTemplate.query("select * from eproduct",new RowMapper<EProductEntity>() {
			
			public EProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				EProductEntity obj= new EProductEntity();
				obj.setProID(rs.getLong(1));
				obj.setProNAME(rs.getString(2));
				obj.setProcost(rs.getBigDecimal(3));
				
				return obj;
			}
			
			
		});
		
		
	}
	
	
}

