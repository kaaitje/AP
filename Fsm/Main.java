package Fsm;
public class Main {
    public static void main(String[] args){
        // dice/ chance
        Node s0 = new Node("s0",false);
        Node s1 = new Node("s1",false);
        Node s2 = new Node("s2",false);
        Node s3 = new Node("s3",false);
        Node s4 = new Node("s4",  false);
        Node s5 = new Node("s5",  false);
        Node s6 = new Node("s6", false);
        Node num1 = new Node("1",  true);
        Node num2 = new Node("2",  true);
        Node num3 = new Node("3",  true);
        Node num4 = new Node("4",  true);
        Node num5 = new Node("5",  true);
        Node num6 = new Node("6",  true);
        s0.setOptionsChance(new Node[]{s1,s2});
        s1.setOptionsChance(new Node[]{s3,s4});
        s2.setOptionsChance(new Node[]{s5,s6});
        s3.setOptionsChance(new Node[]{s1,num1});
        s4.setOptionsChance(new Node[]{num2,num3});
        s5.setOptionsChance(new Node[]{num4,num5});
        s6.setOptionsChance(new Node[]{s2,num6});
        Fsm f1 = new Fsm();
        f1.FiniteStateMachine(new String[]{"a"},s0);
        System.out.println(f1.getState());
        // text input
        Node st0 = new Node("s0",false);
        Node st1 = new Node("s1",false);
        Node st2 = new Node("s2",false);
        Node st3 = new Node("s3",false);
        st0.setOptionsText(new Node[]{st1,st2}, new String[]{"b","a"});
        st1.setOptionsText(new Node[]{st1,st2}, new String[]{"a","b"});
        st2.setOptionsText(new Node[]{st3}, new String[]{"b"});
        st3.setOptionsText(new Node[]{st0,st3}, new String[]{"b","a"});
        Fsm f2 = new Fsm();
        f1.FiniteStateMachine(new String[]{"a","b"},st0);
        System.out.println(f2.getState());


    }
}