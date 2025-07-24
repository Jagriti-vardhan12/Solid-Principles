package com.example.jv;
interface MessageSender {
 void sendMessage(String message, String recipient);
}

class EmailSender implements MessageSender {
 public void sendMessage(String message, String recipient) {
     System.out.println("Email sent to " + recipient + ": " + message);
 }
}

class SMSSender implements MessageSender {
 public void sendMessage(String message, String recipient) {
     System.out.println("SMS sent to " + recipient + ": " + message);
 }
}

class NotificationService {
 private final MessageSender messageSender;
 
 // Dependency is injected through constructor
 public NotificationService(MessageSender messageSender) {
     this.messageSender = messageSender;
 }

 public void notifyUser(String message, String recipient) {
     messageSender.sendMessage(message, recipient);
 }
}


public class Dependency {
 public static void main(String[] args) {
     // Use EmailSender
     MessageSender emailSender = new EmailSender();
     NotificationService emailNotification = new NotificationService(emailSender);
     emailNotification.notifyUser("Dependency Inversion Principle saves the day!", "alice@example.com");
     
     // Use SMSSender
     MessageSender smsSender = new SMSSender();
     NotificationService smsNotification = new NotificationService(smsSender);
     smsNotification.notifyUser("DIP allows for decoupling!", "+1234567890");
 }
}
