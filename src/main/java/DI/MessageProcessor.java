package DI;

public class MessageProcessor {

    private final MessageService messageService;

    // Constructor Injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
