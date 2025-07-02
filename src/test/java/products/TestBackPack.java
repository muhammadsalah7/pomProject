package products;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class TestBackPack extends BaseTest {
    @Test
    public void testAddBackPack()
    {
        ProductsPage productsPage= loginPage.loginWith("standard_user","secret_sauce");
        productsPage.addBackPack();
        Assert.assertEquals(productsPage.getButtonName(),"Remove");
    }
}
