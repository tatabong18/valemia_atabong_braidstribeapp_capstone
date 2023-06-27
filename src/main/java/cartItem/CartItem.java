package cartItem;

import cart.Cart;
import product.Product;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;


@Entity
@Table(name="CART_ITEMS")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    private long productId;

    @NotNull
    private String name;

    @NotNull
    private double price;

    @NotNull
    private int quantity;

    public CartItem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public CartItem(Cart cart, Product product) {
        this.cart = cart;
        this.productId = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();

        System.out.println("quantity = " + cart.getCurrentItemQuantity());
        this.quantity = cart.getCurrentItemQuantity();
        cart.setCurrentItemQuantity(1);     // clear it back to 1 for the next item user wants to add
    }

}