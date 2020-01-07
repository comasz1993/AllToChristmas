package shopobj;

public class WarehouseEstetyczny {

    private class FindProductResult {
        public boolean isProductExist;
        public int indexOfProduct;
    }

    private Product[] products;

    public void addProduct(Product product, int noProducts) {
        if(products == null) {
            addFirstProducts(product, noProducts);
            return;
        }

        FindProductResult findResult = findProduct(product);
        if(findResult.isProductExist) {
            addProductsOnTheMiddle(product, noProducts, findResult.indexOfProduct);
            return;
        }
        addProductsOnTheEnd(product, noProducts);
    }

    private void addFirstProducts(Product product, int noProducts) {
        products = new Product[noProducts];
        for (int i = 0; i < products.length; i++)
            products[i] = product;
    }

    private FindProductResult findProduct(Product product) {
        FindProductResult result = new FindProductResult();
        for(int i = 0; i < products.length; i++) {
            if(products[i].getName().equals(product.getName()) &&
                    products[i].getPrice() == product.getPrice()) {
                result.isProductExist = true;
                result.indexOfProduct = i;
                return result;
            }
        }
        result.isProductExist = false;
        return result;
    }

    private void addProductsOnTheMiddle(Product product, int noProducts, int indexOfExistingProduct) {
        Product[] newTab = new Product[products.length + noProducts];
        for(int i = 0; i < indexOfExistingProduct; i++)
            newTab[i] = products[i];
        for(int i = indexOfExistingProduct; i < indexOfExistingProduct + noProducts; i++)
            newTab[i] = product;
        for(int i = indexOfExistingProduct + noProducts; i < newTab.length; i++)
            newTab[i] = products[i-noProducts];
        products = newTab;
    }

    private void addProductsOnTheEnd(Product product, int noProducts) {
        Product[] newTab = new Product[products.length + noProducts];
        for(int i = 0; i < products.length; i++)
            newTab[i] = products[i];
        for(int i = products.length; i < newTab.length; i++)
            newTab[i] = product;
        products = newTab;
    }

    public void displayProducts() {
        if(products == null || products.length == 0) {
            System.out.println("Warehouse is empty");
            return;
        }
        for (Product product:products)
            System.out.println("Product: " + product.getName() + ", price " + product.getPrice());
    }

    public Product takeProduct(String productName) {
        if(products == null)
            return null;

        int productIndex = 0;
        Product product = null;

        for(int i = 0; i < products.length; i++) {
            if(products[i].getName().equals(productName)){
                productIndex = i;
                product = products[i];
                break;
            }
        }
        if(product == null) {
            System.out.println("Brak " + productName + " w magazynie");
            return null;
        }
        Product[] newTab = new Product[products.length-1];
        for(int i = 0; i < productIndex; i++)
            newTab[i] = products[i];
        for(int i = productIndex; i <  newTab.length; i++)
            newTab[i] = products[i+1];
        products = newTab;
        return product;
    }
}
