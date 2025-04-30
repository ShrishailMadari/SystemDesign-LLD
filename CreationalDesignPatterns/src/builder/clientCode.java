package builder;

import java.util.Locale;

class Product {
    private String name;
    private Double price;
    private String category;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public static class ProductBuilder {
        private String name;
        private Double price;
        private String category;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

//        @Override
//        public String toString() {
//            return "ProductBuilder{" +
//                    "name='" + name + '\'' +
//                    ", price=" + price +
//                    ", category='" + category + '\'' +
//                    '}';
//        }

        // build() method to construct Product
        public Product build() {
            return new Product(this);
        }
    }
}

public class clientCode {
    public static void main(String[] args) {
        Product shriHari = new Product.ProductBuilder().setName("ShriHari").setPrice(192872.8).build();
        System.out.println(shriHari.toString());
    }
}
