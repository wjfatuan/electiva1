package edu.uan.fis.jeesample.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.uan.fis.jeesample.dao.ProductDao;
import edu.uan.fis.jeesample.dto.Product;

/**
 * Product DAO implementation using JDBC
 */
public class ProductJdbcDao extends BaseJdbcDao implements ProductDao {

	public Product create(Product product) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement("INSERT INTO products VALUES(?,?)");
			stmt.setInt(1, product.getProductId());
			stmt.setString(2, product.getName());
			stmt.executeUpdate();
		} catch (Exception e) {
			Logger.getLogger(ProductJdbcDao.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			close(stmt);
			close(conn);
		}
		return product;
	}

	public Product update(Product product) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void delete(Product product) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Product findById(Integer productId) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public List<Product> findAll() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Product> products = new ArrayList<Product>();
		try {
			conn = getConnection();
			stmt = conn.prepareStatement("SELECT * FROM products");
			rs = stmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setProductId(rs.getInt("product_id"));
				p.setName(rs.getString("name"));
				products.add(p);
			}
		} catch (Exception e) {
			Logger.getLogger(ProductJdbcDao.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			close(stmt);
			close(conn);
		}
		return products;
	}
}
