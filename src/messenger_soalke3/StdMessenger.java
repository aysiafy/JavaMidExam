package messenger_soalke3;

/**
 *
 * @author Aysia
 */
public class StdMessenger implements Messenger {
    boolean isSuccess = false;

    @Override
    public boolean sendMessege(String reciever, String subject, String messege) {
        System.out.println("Sent.");
        return isSuccess = true;
    }
}
