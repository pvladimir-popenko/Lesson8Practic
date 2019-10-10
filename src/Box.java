public class Box<T extends Number, S extends  Number> {
    T number1;
    S number2;

    public Box(T number1, S number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1() {
        return number1;
    }

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public S getNumber2() {
        return number2;
    }

    public void setNumber2(S number2) {
        this.number2 = number2;
    }
}
