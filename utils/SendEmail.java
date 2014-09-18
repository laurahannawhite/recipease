/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recipease.utils;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Message.RecipientType;
import org.codemonkey.simplejavamail.*;

/**
 *
 * @author Laura
 */
public class SendEmail {
  
 final Email email;
 
    /**
     *Sends an email with the list of ingredients
     */
    public SendEmail(){
        email = new Email();
        run();
    }
    
    public final void run(){
        email.setFromAddress("lollypop", "lolly.pop@somemail.com");
        email.setSubject("hey");
        email.addRecipient("C. Cane", "candycane@candyshop.org", RecipientType.TO);
        email.addRecipient("C. Bo", "chocobo@candyshop.org", RecipientType.BCC);
        email.setText("We should meet up! ;)");
        email.setTextHTML("<img src='cid:wink1'><b>We should meet up!</b><img src='cid:wink2'>");

        System.out.println("sending email from run method");

        //TODO password
        new Mailer("smtp.gmail.com", 25, "laurahannawhite", "password").sendMail(email);
    }
    
    public static void main(String [] args)
   {    
       System.out.println("sending email");
       //giving error Must issue a STARTTLS command first
       
//      // Recipient's email ID needs to be mentioned.
//      String to = "laurahannawhite@gmail.com";
//
//      // Sender's email ID needs to be mentioned
//      String from = "web@gmail.com";
//
//      // Assuming you are sending email from localhost
//      String host = "localhost";
//
//      // Get system properties
//      Properties properties = System.getProperties();
//
//      // Setup mail server
//      properties.setProperty("mail.smtp.host", host);
//
//      // Get the default Session object.
//      Session session = Session.getDefaultInstance(properties);
//
//      try{
//         // Create a default MimeMessage object.
//         MimeMessage message = new MimeMessage(session);
//
//         // Set From: header field of the header.
//         message.setFrom(new InternetAddress(from));
//
//         // Set To: header field of the header.
//         message.addRecipient(Message.RecipientType.TO,
//                                  new InternetAddress(to));
//
//         // Set Subject: header field
//         message.setSubject("This is the Subject Line!");
//
//         // Now set the actual message
//         message.setText("This is actual message");
//
//         // Send message
//         Transport.send(message);
         System.out.println("Sent message successfully....");
//      }catch (MessagingException mex) {
//         mex.printStackTrace();
//      }
   }
    
}
