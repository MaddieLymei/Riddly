package za.co.riddly.actions;
import za.co.riddly.interfaces.RiddleActions;
import za.co.riddly.models.Riddles;
public class AnswerRiddle implements RiddleActions{
    private Riddles riddles;
    public AnswerRiddle(Riddles riddles) {
        this.riddles = riddles;
    }
    @Override
    public void execute() {
        riddles.answer();
    }
}