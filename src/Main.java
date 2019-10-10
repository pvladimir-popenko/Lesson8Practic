public class Main {

    public static void main(String[] args) {


        Box<Double, Integer> box1 = new Box<>(2.05, 5);
        Box<Float, Float> box2 = new Box<>(0.005F, 12.051F);

        addition(box1, box2);
        multiplication(box1,box2);

    }

    public static void addition(Box<? extends Number,? extends Number> b1,
                                Box<? extends Number,? extends Number> b2){

        System.out.println(b1.number1.doubleValue() + b1.number2.doubleValue() + b2.number1.doubleValue()
                + b2.number2.doubleValue());
    }

    public static void multiplication(Box<? extends Number, ? extends Number> b1,
                                      Box<? extends  Number, ? extends Number> b2){
        System.out.println(b1.number1.doubleValue() * b1.number2.doubleValue() * b2.number1.doubleValue()
                * b2.number2.doubleValue());
    }
}
