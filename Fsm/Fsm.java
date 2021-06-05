package Fsm;

import java.util.ArrayList;
import java.util.Random;

public class Fsm {

    private Node state;
    private String name;
    private boolean end;
    private boolean chanceOrText;
    private ArrayList<String> paths;
    private ArrayList<Node> option;

    public Node FiniteStateMachine(String[] fsm, Node start) {
        this.state = start;
        this.chanceOrText = state.isChanceOrText();
        this.end = state.isEnd();
        if (chanceOrText) {
            for (int i = 0; i < fsm.length; i++) {
                this.option = state.getOption();
                this.paths = state.getPaths();
                if (!end) {

                    if (paths.contains(fsm[i])) {
                        String test = fsm[i];
                        int place = paths.indexOf(fsm[i]);
                        this.state = option.get(place);
                    }
                } else {
                    break;
                }
            }
        } else {
            Random rand = new Random();
            while (!end) {
                this.option = state.getOption();
                int randInt = rand.nextInt(option.size());
                this.state = option.get(randInt);
                end = state.isEnd();
            }
        }
        name = state.getState();
        return state;
    }

    public String getState() {
        return name;
    }
}