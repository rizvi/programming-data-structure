package nmn.geeks.stack;

/**
 * Created by naman.nigam on 16/02/16.
 */
public class MinimumValue {
    public static StackCustom inputStack = new StackCustom();
    public static StackCustom alternateStack = new StackCustom();

    public static void pushValue(int value) {
        inputStack.push(value);
        if (alternateStack.pop() > value)
            alternateStack.push(value);
    }

    public static int minimumValue() {
        return alternateStack.pop();
    }

    public static int popValue() {
        return inputStack.pop();
    }

}


