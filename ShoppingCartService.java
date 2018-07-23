package com.bootcamp.shoppingCartAPI;

/**
 * Interface to design the service.
 * 
 * @author Pablo Javier Nicola.
 */

public interface ShoppingCartService {

	/**
	 * Method to add a product to the ArrayList object.
	 * 
	 * @param p Product to add.
	 * @param units int to set.
	 * @return Boolean condition as the case.
	 */
	public boolean addProductToCart(Product p, int units);

	/**
	 * Method to remove a product or units from a product from the ArrayList
	 * object.
	 * 
	 * @param productCode long to localize object.
	 * @param units int to supress.
	 * @return Boolean condition as the case.
	 */
	public boolean removeProductFromCart(long productCode, int units);

	/**
	 * Method to calculate the total price between products before the buying
	 * transaction.
	 * 
	 * @return the total price.
	 */
	public float calculateTotalPriceBeforeBuying();

}
