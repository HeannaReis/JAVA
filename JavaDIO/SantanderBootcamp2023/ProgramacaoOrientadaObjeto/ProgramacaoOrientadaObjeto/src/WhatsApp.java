public class WhatsApp extends InstantMessagingService {
    public void SendMessage() {
        ValidateInternetConnection();
        System.out.println("SENDING MESSAGE ON WHATSAPP");
        SaveHistoryMessage();
    }

    public void ReceiveMessage() {
        ValidateInternetConnection();
        System.out.println("RECEIVING MESSAGE ON WHATSAPP.");
        SaveHistoryMessage();
    }

    private void ValidateInternetConnection() {
        System.out.println("VALIDATING INTERNET CONNECTION ON WHATSAPP.");
    }

    private void SaveHistoryMessage() {
        System.out.println("SAVE HISTORY MESSAGE ON WHATSAPP");
    }
}
