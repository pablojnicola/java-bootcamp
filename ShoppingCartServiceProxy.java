package com.bootcamp.shopCartImp;

import com.bootcamp.shoppingCartAPI;

/**
 * Class to hide the actual implementation of the ShoppingCartService.
 * 
 * @author Pablo Javier Nicola.
 */

public class ShoppingCartServiceProxy implements ShoppingCartService {

	ShoppingCartService shoppingCartImp;

	protected ShoppingCartServiceProxy(ShoppingCartService shoppingCartImp) {

		this.shoppingCartImp = shoppingCartImp;

	}

	public boolean addProductToCart(Product p, int units) {

		return shoppingCartImp.addProductToCart(p, units);

	}

	public boolean removeProductFromCart(long productCode, int units) {

		return shoppingCartImp.removeProductFromCart(productCode, units);

	}

	public float calculateTotalPriceBeforeBuying() {

		return shoppingCartImp.calculateTotalPriceBeforeBuying();

	}

}
