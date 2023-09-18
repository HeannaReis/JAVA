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

    private void ValidateInternetConnection() {
        System.out.println("VALIDATING INTERNET CONNECTION ON TELEGRAM.");
    }

    private void SaveHistoryMessage() {
        System.out.println("SAVE HISTORY MESSAGE ON TELEGRAM");
    }
}
