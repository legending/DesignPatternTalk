package c1.simplefactory;

public class SimpleFactory {

    public static Operation getOperation(char opr) {
        switch (opr) {
            case '+':
                return new AddOperation();
            case '-':
                return new SubOperation();
            default:
                throw new RuntimeException();
        }
    }
}
