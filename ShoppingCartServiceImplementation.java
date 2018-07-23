package com.bootcamp.shopCartImp;

import com.bootcamp.shoppingCartAPI.ShoppingCartService;
import.com.bootcamp.product.Product;
import java.util.ArrayList;

/**
 * Class to implement the ShoppingCartService interface.
 * @author Pablo Javier Nicola.
 * */
public class ShoppingCartServiceImplementation implements ShoppingCartService {

	/**
	 * Attribute used to keep a collection of the products added to the Shopping Cart as well as
	 * keeping an update when a product is removed.
	 * */
	private ArrayList<Product> productsAddedtoCart;

	protected ShoppingCartServiceImplementation() {

		productsAddestoCart = new ArrayList<Product>();

	}
	
	@Override
	public boolean addProductToCart(Product p, int units) {
		if (units > 0 && p!=null) {

			p.setUnitsSelected(units);
			productsAddedToCart.add(p);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeProductFromCart(long productCode, int units) {

		for (Product p : productsAddedToCart) {

			int unitsSelected = p.getUnitsSelected;

			if (p.getProductCode() == productCode) {

				if (units > 0 && units <= unitsSelected) {

					if (units > 0 && units < unitsSelected) {

						p.setUnitsSelected(unitsSelected - units);
						return true;

					} else if (units == unitsSelected) {

						productsAddedToCart.remove(p);

					}

				} else {
					System.out.println("Product could no be removed due to invalid number of units value.");
					return false;
				}
			}
		}

		System.out.println("The requested product was not found.");
		return false;
	}

	@Override
	public float calculateTotalPriceBeforeBuying() {

		float totalPrice = 0.0f;

		for (Product p : productsAddedToCart) {

			totalPrice += p.getPrice();

		}
		return totalPrice;
	}

}
