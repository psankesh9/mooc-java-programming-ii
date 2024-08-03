import java.util.ArrayList;

public class Message {
    private String name;

    public Message(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Message sms = new Message("SMS");
        Message mms = new Message("MMS");

        System.out.println(sms.equals(sms)); // true
        System.out.println(sms.equals(mms)); // false

        ArrayList<Message> messages = new ArrayList<>();
        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(new Message("SMS"))) {
            messages.add(sms);
        }

        System.out.println(messages.size()); // 2
    }
}


