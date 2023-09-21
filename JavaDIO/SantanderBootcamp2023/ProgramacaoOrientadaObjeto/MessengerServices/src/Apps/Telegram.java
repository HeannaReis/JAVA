package Apps;
public class Telegram extends InstantMessagingService{
    public void SendMessage() {
        ValidateInternetConnection();
        System.out.println("SENDING MESSAGE ON TELEGRAM");
        SaveHistoryMessage();
    }

    public void ReceiveMessage() {
        ValidateInternetConnection();
        System.out.println("RECEIVING MESSAGE ON TELEGRAM.");
        SaveHistoryMessage();
    }
}
