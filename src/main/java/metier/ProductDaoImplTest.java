package metier;

import dao.IDao;
import entities.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

public class ProductDaoImplTest {

    private IDao<Product> productDao;

    @Before
    public void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        productDao = context.getBean(ProductDaoImpl.class);
    }

    @Test
    public void testCreateAndFind() {
        Product p = new Product("Test Produit", 50.0);
        productDao.create(p);

        Product fetched = productDao.findById(p.getId());
        Assert.assertNotNull(fetched);
        Assert.assertEquals("Test Produit", fetched.getName());
    }
}