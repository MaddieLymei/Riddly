package za.co.riddly.controllers;

import java.util.ArrayList;
import java.util.List;

import za.co.riddly.interfaces.RiddleActions;

public class GameController {
	
	private List<RiddleActions> riddleList = new ArrayList<RiddleActions>(); 
	
	public void answerRiddles(RiddleActions riddleAction) {
		riddleList.add(riddleAction);
		
	}
	
	public void addRiddle() {
		for(RiddleActions riddleAction: riddleList) {
			riddleAction.excecute();
		}
		
		riddleList.clear();
	}
}
