package com.bootcamp.product;

/**
 * Class to model common characteristics of a product.
 * 
 * @author Pablo Javier Nicola.
 */

public class Product {

	/**
	 * Common attributes of a product.
	 */
	private String productName;
	private long productCode;
	private int unitsSelected;
	private float price;

	/**
	 * This constructor method aims to inicially build the object with the
	 * values needed.
	 * 
	 * @param productName
	 *            String to assign
	 * @param productCode
	 *            long to assign
	 * @param price
	 *            float to assign
	 */
	public Product(String productName, long productCode, float price) {

		this.productName = productName;
		this.productCode = productCode;
		this.price = price;

	}

	public String getProductName() {

		return productName;

	}

	public long getProductCode() {

		return productCode;

	}

	public int getUnitsSelected() {

		return unitsSelected;

	}

	/**
	 * Method to set a number of units when the product is selected for future
	 * buying.
	 */
	public void setUnitsSelected(int unitsSelected) {

		this.unitsSelected = unitsSelected;

	}

	public float getPrice() {

		return price;

	}
}
