package shopobj;

public class Warehouse {
    private Product[] products;

    public void addProduct(Product product, int noProducts) {
        if (products == null) {
            products = new Product[noProducts];
            for (int i = 0; i < products.length; i++)
                products[i] = product;
            return;
        }

        int indexOfExistingProduct = 0;
        boolean productExist = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(product.getName()) && products[i].getPrice() == product.getPrice()) {
                indexOfExistingProduct = i;
                productExist = true;
                break;
            }
        }
        Product[] newTab = new Product[products.length + noProducts];
        if (productExist) {
            for (int i = 0; i < indexOfExistingProduct; i++)
                newTab[i] = products[i];
            for (int i = indexOfExistingProduct; i < indexOfExistingProduct + noProducts; i++)
                newTab[i] = product;
            for (int i = indexOfExistingProduct + noProducts; i < newTab.length; i++)
                newTab[i] = products[i - noProducts];
            products = newTab;
            return;
        }

        for (int i = 0; i < products.length; i++)
            newTab[i] = products[i];
        for (int i = products.length; i < newTab.length; i++)
            newTab[i] = product;
        products = newTab;
    }

    public void displayProducts() {
        if (products == null || products.length == 0) { // zapis po to, że jesli nie mamy nic w tablicy to nam nie wyswietli elementów
            System.out.println("Warehouse is empty.");
            return;
    }
        for (Product product : products)
            System.out.println("Product: " + product.getName() + ", price: " + product.getPrice());
    }

    public Product takeProduct(String productName) { // zwracamy obiekt typu Product
        if(products==null) return null;

        int productIndex = 0;
        Product product = null;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName)) {
                productIndex = i;
                product = products[i];
                break;
            }
            if (product == null) {
                System.out.println("Brak " + productName + " w magazynie");
                return null;
            }
        }
        Product[] newTab = new Product[products.length - 1];
        for (int i = 0; i < productIndex; i++) {
            newTab[i] = products[i];
        }
        for (int i = productIndex; i < newTab.length; i++)
            newTab[i] = products[i + 1];
        products = newTab;
        return product;
    }
}
