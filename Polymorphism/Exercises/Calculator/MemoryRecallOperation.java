package Polymorphism.Calculator;

import java.util.ArrayList;
import java.util.List;

public class MemoryRecallOperation implements Operation{
    private List<Integer> operands;
    private int result;

    public MemoryRecallOperation(){
        this.operands = new ArrayList<>();
    }

    @Override
    public void addOperand(int operand) {
        this.operands.add(operand);

        if (this.isCompleted()) {
            this.result = this.operands.get(0);
        }
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 1;
    }

    @Override
    public int getResult() {
        return this.result;
    }
}
