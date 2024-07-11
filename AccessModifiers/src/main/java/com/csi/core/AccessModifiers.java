package com.csi.core;

class Product {
	private int productId = 101;
	String productName = "APPLE PHONE";
	double productPrice = 989898.22;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
}

public class AccessModifiers {

	public static void main(String[] args) {

		Product product = new Product();

		System.out.println(product.getProductId() + "" + product.productName + "" + product.productPrice);

	}
}
