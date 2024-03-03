package DI;

    public class Main {
        public static void main(String[] args) {
            MessageService emailService = new EmailService();
            MessageProcessor processor = new MessageProcessor(emailService);

            processor.processMessage("Hello, DI!");
        }
    }
