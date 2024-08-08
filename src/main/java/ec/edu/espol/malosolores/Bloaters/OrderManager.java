/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.malosolores.Bloaters;

import java.util.List;
import java.util.Map;

/**
 *
 * @author alexo
 */

// LARGE CLASS
public class OrderManager {
    List<Order> orders;
    Map<Integer, User> userMap;
    Map<Integer, Product> productMap;
    // Más campos...

    // PRIMITIVE OBSESSION
    public void processPayment(int userId, double amount, String currencyCode, String transactionId) {
        // Procesamiento del pago...
    }
    
    // LONG PARAMETER LIST
    public void createReport(String title, String description, List<DataPoint> dataPoints, boolean includeImages, String footer, int formatType, boolean sendEmail, String emailRecipient) {
    // Creación del reporte...
    }
    
    
    public void processOrder(Order order) { /*...*/ }
    public void cancelOrder(Order order) { /*...*/ }
    public void updateOrder(Order order) { /*...*/ }
    public void printOrderDetails(Order order) { /*...*/ }
    // Muchos métodos...
}
