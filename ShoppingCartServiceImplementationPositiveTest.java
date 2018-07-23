package com.bootcamp.shopCartImp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.bootcamp.product.Product;
import com.bootcamp.shopCartImp.ShoppingCartServiceImplementation;
import com.bootcamp.shoppingCartAPI.ShoppingCartService;

public class ShoppingCartServiceImplementationPositiveTest {

	ShoppingCartService shopCart;
	Product p;

	@BeforeClass
	public void createTestInstances() {

		shopCart = new ShoppingCartServiceImplementation();
		p = new Product("arroz", 1122220003445000, 13.80);

	}

	@Test
	public void testAddProductToCart() {

		boolean result = shopCart.addProductToCart(p, 7);
		boolean expected = true;
		assertEquals(expected, result);

	}

	@Test
	public void testRemoveProductFromCart() {

		boolean result = shopCart.removeProductFromCart(p.getProductCode(), 5);
		boolean expected = true;
		assertEquals(expected, result);

	}

	@Test
	public void testCalculateTotalPriceBeforeBuying() {

		float totalPriceTest = shopCart.calculateTotalPriceBeforeBuying();
		asserEquals(27.60f, totalPriceTest);

	}

	@AfterClass
	public void disposeTestInstances() {

		shopCart.dispose();
		p.dispose();

	}

}
