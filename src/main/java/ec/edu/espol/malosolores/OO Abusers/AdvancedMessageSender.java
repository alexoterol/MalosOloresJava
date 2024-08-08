/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.malosolores.OOAbusers;

/**
 *
 * @author alexo
 */
public class AdvancedMessageSender implements MessageSender {
    // ALTERNATIVE CLASSES WITH DIFFERENT INTERFACES
    public void sendMessage(String recipient, String messageContent) {
        System.out.println("Sending message to " + recipient);
    }
}