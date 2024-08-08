/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.malosolores.OOAbusers;

/**
 *
 * @author alexo
 */
public class Order {
    private double subtotal;
    private double discount;
    private boolean discountApplied;

    // TEMPORARY FIELD
    public void applyDiscount() {
        if (subtotal > 100) {
            discount = 0.1 * subtotal;
            discountApplied = true;
        }
    }

    public void finalizeOrder() {
        if (discountApplied) {
            subtotal -= discount;
        }
        System.out.println("Final Subtotal: " + subtotal);
    }
    
    // SWITCH STATEMENT
    public void calculateDiscount(String customerType) {
        double discount;
        switch (customerType) {
            case "VIP":
                discount = 0.25;
                break;
            case "Loyal":
                discount = 0.15;
                break;
            case "New":
                discount = 0.05;
                break;
            default:
                discount = 0;
        }
        System.out.println("Discount: " + discount);
    }
}
