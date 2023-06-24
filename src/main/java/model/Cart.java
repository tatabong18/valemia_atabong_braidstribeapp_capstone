package model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<CartItem> cartItemList;

    private int currentItemQuantity;

    private double subTotal;

    private double total;

    public Cart() {
        currentItemQuantity = 1;
        cartItemList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCurrentItemQuantity() {
        return currentItemQuantity;
    }

    public void setCurrentItemQuantity(int currentItemQuantity) {
        this.currentItemQuantity = currentItemQuantity;
    }

    public double getSubTotal() {
        subTotal = 0.0d;
        cartItemList.forEach(i -> subTotal += i.getSubTotal());

        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartItemList=" + cartItemList +
                ", currentItemQuantity=" + currentItemQuantity +
                ", subTotal=" + subTotal +
                ", total=" + total +
                '}';
    }

    // ------------ custom methods start here ------------
    public String getSubTotalDisplay() {
        return String.format("$%.2f", getSubTotal());
    }


    public String getTotalDisplay() {
        return String.format("$%.2f", getTotal());
    }

    public void addCartItemToCart(CartItem cartItem) {
        cartItem.setQuantity(this.getCurrentItemQuantity());
        this.getCartItemList().add(cartItem);
        this.setCurrentItemQuantity(1);
    }
}