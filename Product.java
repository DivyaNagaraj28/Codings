package com;

public class Product {
	
	private int ProductId;
	private String ProductName;
	private String ProductDescription;
	private int ProductPrice;


	public Product()
    {
	
    }
	public Product(int productId, String productName, String productDescription, int productPrice) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductDescription = productDescription;
		ProductPrice = productPrice;
	}
	
    @Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductDescription=" + ProductDescription + ", ProductPrice=" + ProductPrice + "]";
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}


}
