package org.howard.edu.lspfinal.question1; 
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ShoppingCartTest {

    @Test
    @DisplayName("Test for adding valid item")
    void testAddValidItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.50);
        assertEquals(1, cart.getItemCount());
        assertEquals(1.50, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test for adding item with zero price (expect exception)")
    void testAddItemZeroPriceThrows() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Banana", 0.0));
    }

    @Test
    @DisplayName("Test for adding item with negative price (expect exception)")
    void testAddItemNegativePriceThrows() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Cherry", -2.00));
    }

    @Test
    @DisplayName("Test for removing existing item")
    void testRemoveExistingItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Donut", 2.00);
        cart.removeItem("Donut");
        assertEquals(0, cart.getItemCount());
    }

    @Test
    @DisplayName("Test for removing non-existent item (expect exception)")
    void testRemoveNonExistingItemThrows() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.removeItem("Egg"));
    }

    @Test
    @DisplayName("Test for applying SAVE10")
    void testApplySave10() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE10");
        assertEquals(10.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test for applying SAVE20")
    void testApplySave20() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE20");
        assertEquals(20.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test for applying invalid discount code (expect exception)")
    void testApplyInvalidCodeThrows() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("SAVE50"));
    }

    @Test
    @DisplayName("Test total cost without discount")
    void testTotalCostWithoutDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Fish", 5.00);
        cart.addItem("Grapes", 3.00);
        assertEquals(8.00, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test total cost with discount")
    void testTotalCostWithDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Hat", 20.00);
        cart.applyDiscountCode("SAVE20");
        assertEquals(16.00, cart.getTotalCost(), 0.0001);
    }

    @Test
    @DisplayName("Test total cost with empty cart")
    void testTotalCostEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotalCost());
    }

    //Source: https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions
    //Source: https://junit.org/junit5/docs/current/user-guide/#writing-tests-exceptions
    //Source: 
}

