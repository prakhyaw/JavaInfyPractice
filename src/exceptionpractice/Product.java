package exceptionpractice;

class Product {
    private String productName;
    private int productId;
    private int stock;
 
    public Product(int pId, String pName, int stock) {
        this.productId = pId;
        this.productName = pName;
        this.stock = stock;
    }
    
    public static void orderProduct(Product product) {
        product.stock--;
    }
    // Getters and Setters

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}