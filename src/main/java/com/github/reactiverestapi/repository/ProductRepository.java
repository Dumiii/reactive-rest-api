package com.github.reactiverestapi.repository;

import com.github.reactiverestapi.model.Product;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final JdbcClient jdbcClient;

    public ProductRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Product getProduct(long id) {
        String sql = "SELECT * FROM products WHERE id = ?";

        return jdbcClient.sql(sql)
                .param(id)
                .query(Product.class)
                .single();
    }
}
