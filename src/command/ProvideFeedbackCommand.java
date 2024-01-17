package command;

import command.Command;

// Concrete command for providing feedback
public class ProvideFeedbackCommand implements Command {
    private String feedback;

    public ProvideFeedbackCommand(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public void execute() {
        System.out.println("Providing feedback: " + feedback);
        // Logic to process the feedback
    }
}
