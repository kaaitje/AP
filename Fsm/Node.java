package Fsm;
import java.util.ArrayList;
import java.util.Arrays;


public class Node {
    private String state;
    private boolean chanceOrText;
    private boolean end;
    private ArrayList<Node> option;
    private ArrayList<String> paths;

    public Node(String s, boolean end){
        this.state = s;
        this.end = end;

    }

    public String getState() {
        return state;
    }

    public boolean isEnd() {
        return end;
    }

    public ArrayList<Node> getOption() {
        return option;
    }

    public ArrayList<String> getPaths() {
        return paths;
    }

    public boolean isChanceOrText() {
        return chanceOrText;
    }

    public void setOptionsText(Node[] options, String[] paths) {
        this.chanceOrText = true;
        this.option = new ArrayList<>();
        this.paths = new ArrayList<>();
        this.option.addAll(Arrays.asList(options));
        this.paths.addAll(Arrays.asList(paths));
    }
    //    public Node returnState(){
//        if(chanceOrText == true){
//            return null;
//        }
//        else {
//            return null;
//        }
//    }
    public void setOptionsChance(Node[] options) {
        this.chanceOrText = false;
        this.option = new ArrayList<>();
        this.option.addAll(Arrays.asList(options));

    }


}