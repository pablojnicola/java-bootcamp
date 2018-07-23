package com.bootcamp.communication;

import com.bootcamp.shoppingCartAPI.ShoppingCartService;
import com.bootcamp.shopCartImp.ShoppingCartServiceImplementation;

/**
 * Class to support a JMS call.
 */

public class ShoppingCartServiceJmsClient implements ShoppingCartService {

	ShoppingCartService jmsShoppingCartService;

	public ShoppingCartService() {
		
		jmsShoppingCartService=new ShoppingCartServiceImplementation;
		
	}

	@Override
	public boolean addProductToCart(Product p, int units) {

		return jmsShoppingCartService.addProductToCart(p, units);

	}

	@Override
	public boolean removeProductFromCart(long productCode, int units) {

		return jmsShoppingCartService.removeProductFromCart(productCode, units);

	}

	@Override
	public float calculateTotalPriceBeforeBuying() {

		return jmsShoppingCartService.calculateTotalPriceBeforeBuying();

	}

}
