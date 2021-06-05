import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FiniteStateMachine {

    MachineState Zero;
    MachineState One;
    MachineState Two;
    MachineState Three;

    MachineState currentState;

    public FiniteStateMachine(){
        Zero = new Zero(this);
        One = new One(this);
        Two = new Two(this);
        Three = new Three(this);

        currentState = Zero;

    }
    void setMachineState(MachineState newMachineState){
        currentState = newMachineState;
    }
    public void setZero()
}