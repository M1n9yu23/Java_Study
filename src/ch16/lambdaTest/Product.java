package ch16.lambdaTest;

class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

@FunctionalInterface
interface Condition<T> {
    boolean test(T t);
}

class Example {
    private static Product[] products = {
            new Product("Laptop", 1000, "Electronics"),
            new Product("Smartphone", 800, "Electronics"),
            new Product("Shirt", 40, "Clothing"),
            new Product("Pants", 60, "Clothing")
    };

    public static double avgPriceByCondition(Product[] products, Condition<Product> condition) {
        int count = 0;
        double sum = 0;
        for (Product p : products) {
            if (condition.test(p)) {
                sum += p.getPrice();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static void main(String[] args) {
        // Electronics 카테고리의 평균 가격 구하기
        double electronicsAvg = avgPriceByCondition(products, p -> p.getCategory().equals("Electronics"));
        System.out.println("Electronics 카테고리 평균 가격: " + electronicsAvg);

        // Clothing 카테고리의 평균 가격 구하기
        double clothingAvg = avgPriceByCondition(products, p -> p.getCategory().equals("Clothing"));
        System.out.println("Clothing 카테고리 평균 가격: " + clothingAvg);
    }
}
