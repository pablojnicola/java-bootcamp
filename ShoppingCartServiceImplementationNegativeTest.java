package com.bootcamp.shopCartImp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.bootcamp.product.Product;
import com.bootcamp.shopCartImp.ShoppingCartServiceImplementation;
import com.bootcamp.shoppingCartAPI.ShoppingCartService;

public class ShoppingCartServiceImplementationNegativeTest {

	ShoppingCartService shopCart;
	Product p;

	@BeforeClass
	public void createTestInstances() {

		shopCart = new ShoppingCartServiceImplementation();
		p = null;

	}

	@Test
	public void testAddProductToCart() {

		boolean result = shopCart.addProductToCart(p, 1);
		boolean expected = false;
		assertEquals(expected, result);

	}

	@Test
	public void testRemoveProductFromCart() {

		boolean result = shopCart.removeProductFromCart(p.getProductCode(), 8);
		boolean expected = false;
		assertEquals(expected, result);

	}

	@Test
	public void testCalculateTotalPriceBeforeBuying() {

		float totalPriceTest = shopCart.calculateTotalPriceBeforeBuying();
		asserEquals(0.0f, totalPriceTest);

	}

	@AfterClass
	public void disposeTestInstances() {

		shopCart.dispose();
		p.dispose();

	}

}
