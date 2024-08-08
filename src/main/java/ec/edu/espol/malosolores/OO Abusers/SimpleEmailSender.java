/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.malosolores.OOAbusers;

/**
 *
 * @author alexo
 */
public class SimpleEmailSender implements EmailSender {
    // ALTERNATIVE CLASSES WITH DIFFERENT INTERFACES
    public void sendEmail(String message, String recipient) {
        System.out.println("Sending email to " + recipient);
    }
}