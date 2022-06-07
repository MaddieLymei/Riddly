package za.co.riddly.actions;
import za.co.riddly.interfaces.RiddleActions;
import za.co.riddly.models.Riddles;
public class AddRiddle implements RiddleActions {
    private Riddles riddles;
    public AddRiddle(Riddles riddles) {
     this.riddles = riddles;
    }
    @Override
    public void execute() {
        riddles.add();
    }
}