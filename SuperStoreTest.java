// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
// - A protected String field called name
// - A protected double field called price
// - A private final int productId
// - A public static int nextId to help generate unique IDs
// - A constructor that sets name, price, and assigns a unique ID
// - Public getters for all fields
// - Override toString() to return formatted product details
// - Override equals(Object o) to compare name and productId


class Product {
    // I use protected when I want them to be hidden
    protected String name;
    protected double price;
    // I use private when I don't want it to be directly edited outside the class
    private final int productId;
    // I make the variables public when I plan to access them outside the class
    public static int nextId = 1;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.productId = nextId++;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String toString() {

        return "Product:"+name+" Price:"+price+" ProductId:"+productId;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return productId == product.productId && name.equals(product.name);
    }
}

// TODO: Define a subclass Electronics that extends Product
// - Add a private String field called brand
// - Add a private boolean field called hasBattery
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include brand and battery status


class Electronics extends Product {
    // I made brand final because the brand won't just suddenly change
    private final String brand;
    // I made battery final because the brand won't just suddenly change
    private final boolean hasBattery;

    Electronics(String name, double price, String brand, boolean hasBattery) {
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;

    }

    public final String warrantyInfo () {
        return "This product has warranty.";
    }

    public String toString() {

        return "Product:"+name+" Price:"+price+" Brand:"+brand+" hasBattery:"+hasBattery;
    }


}


// TODO: Define a subclass Grocery that extends Product
// - Add a private double field called weight (in kg)
// - Add a private boolean field called isPerishable
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include weight and perishability


class Grocery extends Product{
    // the weight won't change so I made it final
    private final double weight;
    // I made the isPerishable final because that won't change
    private final boolean isPerishable;

    Grocery (String name, double price, double weight, boolean isPerishable) {
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }

    public String toString() {

        return "Product:"+name+" Price:"+price+" Weight:"+weight+" isPerishable:"+isPerishable;
    }


}



// TODO: Define a final class Toy that extends Product
// - Add a private int field called minAge
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include minAge

final class Toy extends Product {
    // minAge won't suddenly go from 5 to 12
    private final int minAge;


    Toy(String name, double price, int minAge) {
        super(name, price);
        this.minAge = minAge;


    }

    public String toString() {

        return "Product:"+name+" Price:"+price+" minAge:"+minAge;
    }


}


// TODO: Define class SuperStoreTest with a main method
// - Create at least one instance of each subclass
// - Store them in a Product[] array
// - Loop through and print each item
// - Call equals() to compare two products with the same ID and name


public class SuperStoreTest {
    public static void main(String[] args) {

        Product product = new Product("apple", 5.0);
        Product product2 = new Product("apple", 5.0);
        // I don't get how you are supposed to get the same id since we get the id by incrementing
        System.out.println(product.equals(product2));
        Electronics electronics = new Electronics("battery", 10,"Sun", true);
        Grocery grocery = new Grocery("banana", 4, 1, true);
        Toy toy = new Toy("Batman", 500, 40);
        String Product[] = {electronics.toString(), grocery.toString(), toy.toString() };
        for (int i = 0; i < Product.length; i++) {
            System.out.println(Product[i]);
        }
        Coupon coupon = new Coupon(.20);

        System.out.println(coupon.apply(toy));

    }
}



// Additional TODOs:
// 1. Try to extend Toy — what happens and why?
//class batman extends Toy {
//    batman(String name, double price, int minAge) {
//        super(name, price, minAge);
//
//    }
//}
// It said it cannot inherit from final toy. Since it is final, you can't make subclasses.
// 2. Make a class Coupon with a final discountRate and apply it to a Product
class Coupon {
    final double discountRate;

    Coupon(double discountRate) {
        this.discountRate = discountRate;
    }
    public double apply(Product product) {
        return product.getPrice()*(1-discountRate);
    }

}


// 3. Add a method to Electronics called warrantyInfo() and mark it final

// 4. Use access modifiers appropriately and explain your choices in comments
