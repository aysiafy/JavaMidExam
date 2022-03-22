package messenger_soalke3;

/**
 *
 * @author Aysia
 */
public class Sender {
    public static void main(String[] args) {
        StdMessenger aysiaStd = new StdMessenger(); 
        MailMessenger aysiaMail = new MailMessenger();
        
//        StdMessenger Test
        System.out.println("= Test_Std_Messenger_Started =");
        System.out.println("Sending a Messege");
        aysiaStd.sendMessege("Mama", "Lagi Apa", "Mama lagi apa?");
        System.out.println("= Test_Std_Messenger_Finished =");
        System.out.println(""); System.out.println("");
//        Mail Messenger Test
        System.out.println("= Test_Mail_Messenger_Started =");
        System.out.println("Sending a Messege"); // Not Connected Yet.
        aysiaMail.sendMessege("Papa", "Lagi Apa", "Papa lagi apa?");
        
        aysiaMail.disconnect(); //Disconnecting
        
        System.out.println("Connecting"); // Connecting
        aysiaMail.connect(); //Connected
        
//        Resend
        System.out.println("Resend a Messege");
        aysiaMail.sendMessege("Papa", "Lagi Apa", "Papa lagi apa?");
        System.out.println("= Test_Mail_Messenger_Finished =");
    }
}
