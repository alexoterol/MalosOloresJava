/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.malosolores.Bloaters;

/**
 *
 * @author alexo
 */
public class User {
    String id;
    String name;
    int balance;
    
    // LONG METHOD EJEMPLO.
    public void processTransaction(User user, Transaction transaction) {
    if (user.isActive() && transaction.getAmount() > 0) {
        if (user.getBalance() >= transaction.getAmount()) {
            System.out.println("Iniciando transacción para: " + user.getName());
            // Muchos detalles y pasos adicionales
            user.setBalance(user.getBalance() - transaction.getAmount());
            transaction.setStatus("COMPLETADA");
            saveTransaction(transaction);
            notifyUser(user, transaction);
            // Más procesamiento y lógica
            if (user.getBalance() < 100) {
                notifyLowBalance(user);
            }
            // Más y más lógica...
            } else {
                System.out.println("Fondos insuficientes para: " + user.getName());
                transaction.setStatus("FALLIDA");
            }
        } else {
            System.out.println("Usuario inactivo o monto inválido");
        }
    }
    
    // DATA CLUMPS
    public void setupAccount(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber) {
        // Configuración de la cuenta...
    }
    
    boolean isActive(){
        return true;
    }

    public String getName() {
        return name;
    }

    private int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private void saveTransaction(Transaction transaction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void notifyUser(User user, Transaction transaction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void notifyLowBalance(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
