package edu.uan.fis.jeesample.dao.impl;

import java.util.List;

import edu.uan.fis.jeesample.dto.Product;
import junit.framework.TestCase;

public class ProductDaoJdbcTest extends TestCase {
    
    public ProductDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreate() {
        System.out.println("create");
        Product product = new Product();
        product.setProductId(1);
        product.setName("Bruce Springsteen - Born to Run");
        ProductJdbcDao instance = new ProductJdbcDao();
        Product expResult = product;
        Product result = instance.create(product);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
//        Product product = null;
//        ProductJdbcDao instance = new ProductJdbcDao();
//        Product expResult = null;
//        Product result = instance.update(product);
//        assertEquals(expResult, result);
    }

    public void testDelete() {
        System.out.println("delete");
//        Product product = null;
//        ProductJdbcDao instance = new ProductJdbcDao();
//        instance.delete(product);
    }

    public void testFindById() {
        System.out.println("findById");
//        Integer productId = null;
//        ProductJdbcDao instance = new ProductJdbcDao();
//        Product expResult = null;
//        Product result = instance.findById(productId);
//        assertEquals(expResult, result);
    }

    public void testFindAll() {
        System.out.println("findAll");
        ProductJdbcDao instance = new ProductJdbcDao();
        List<?> result = instance.findAll();
        assertNotNull(result);
    }
}
