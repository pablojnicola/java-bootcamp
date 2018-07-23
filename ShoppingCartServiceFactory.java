package com.bootcamp.factory;

import com.bootcamp.shoppingCartAPI.ShoppingCartService;
import com.bootcamp.shopCartImp.*;
import com.bootcamp.communication.*;

/**
 * Class to help clients to use our service.
 * 
 * @author Pablo Javier Nicola.
 */

public class ShoppingCartServiceFactory {

	private ShoppingCartServiceFactory() {
	}

	/**
	 * Method to get an instance of ShoppingCartServiceImplementation.
	 * 
	 * @return a ShoppingCartServiceImplementation object.
	 */
	public static ShoppingCartService getLocalShoppingCartService() {

		return new ShoppingCartServiceImplementation();

	}

	/**
	 * Method to get an instance of ShoppingCartServiceProxy with Jms call.
	 * 
	 * @return a ShoppingCartServiceProxy object.
	 */
	public static ShoppingCartService getRemoteSCSUsingJms() {

		return new ShoppingCartServiceProxy(new ShoppingCartServiceJmsClient());

	}

	/**
	 * Method to get an instance of ShoppingCartServiceProxy with client call.
	 * 
	 * @return a ShoppingCartServiceProxy object.
	 */
	public static ShoppingCartService getRemoteSCSUsingClient() {

		return new ShoppingCartServiceProxy(new ShoppingCartServiceClient());

	}

}
