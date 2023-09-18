import Apps.InstantMessagingService;
import Apps.Messenger;
import Apps.Telegram;
import Apps.WhatsApp;

public class App {
    public static void main(String[] args) throws Exception {

        InstantMessagingService ims = null;

        //Não se sabe qual APP vai ser usado, mas qualquer um deve
        //enviar e receber mensagens !!!
        String choiceApp = "tlg";
        
        if(choiceApp.equals("msn"))
            ims = new Messenger();
        else if(choiceApp.equals("tlg"))
            ims = new Telegram();
        else if(choiceApp.equals("wts"))
            ims = new WhatsApp();

        ims.SendMessage();
        ims.ReceiveMessage();
        

        // System.out.println("\nMESSENGER SERVICE");
        // Messenger msn = new Messenger();
        // msn.SendMessage();
        // msn.ReceiveMessage();

        // System.out.println("\nWHATSAPP SERVICE");
        // WhatsApp whats= new WhatsApp();
        // whats.SendMessage();
        // whats.ReceiveMessage();

        // System.out.println("\nTELEGRAM SERVICE");
        // Telegram tele = new Telegram();
        // tele.SendMessage();
        // tele.ReceiveMessage();
    }
}
