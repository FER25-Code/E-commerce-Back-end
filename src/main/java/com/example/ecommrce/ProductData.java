package com.example.ecommrce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductData {



    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<ProductModel> GetAllProduct() {
        return jdbcTemplate.query
                ("select* from product", new UserRowMapper());
    }
    static class UserRowMapper implements RowMapper<ProductModel> {
        @Override
        public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException {
            ProductModel product = new ProductModel(
                    resultSet.getInt("id"),
                    resultSet.getString("titer"),
                    resultSet.getString("price"),
                    resultSet.getString("path_image"));
            return product;
        }
    }


}
