package Apps;
public abstract class InstantMessagingService {
    public abstract void SendMessage();
    public abstract void ReceiveMessage();

    protected void ValidateInternetConnection() {
        System.out.println("VALIDATING INTERNET CONNECTION.");
    }

    protected void SaveHistoryMessage() {
        System.out.println("SAVE HISTORY MESSAGE");
    }
}
