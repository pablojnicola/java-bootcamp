package com.bootcamp.communication;

import com.bootcamp.shoppingCartAPI.ShoppingCartService;
import com.bootcamp.shopCartImp.ShoppingCartServiceImplementation;

/**
 * Class to support a remote client call.
 * 
 * @author Pablo Javier Nicola.
 */

public class ShoppingCartServiceClient implements ShoppingCartService {

	ShoppingCartService shoppingCartService;

	public ShoppingCartService() {
		
		shoppingCartService=new ShoppingCartServiceImplementation;
		
	}

	@Override
	public boolean addProductToCart(Product p, int units) {

		return shoppingCartService.addProductToCart(p, units);

	}

	@Override
	public boolean removeProductFromCart(long productCode, int units) {

		return shoppingCartService.removeProductFromCart(productCode, units);

	}

	@Override
	public float calculateTotalPriceBeforeBuying() {

		return shoppingCartService.calculateTotalPriceBeforeBuying();

	}

}
