package Apps;
public class Messenger extends InstantMessagingService {
    public void SendMessage() {
        ValidateInternetConnection();
        System.out.println("SENDING MESSAGE ON MESSENGER");
        SaveHistoryMessage();
    }

    public void ReceiveMessage() {
        ValidateInternetConnection();
        System.out.println("RECEIVING MESSAGE ON MESSENGER.");
        SaveHistoryMessage();
    }
}