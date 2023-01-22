public class NumberHolder{
    private int anInt;
    private float aFloat;
    public static void main(String[] args) {
        NumberHolder aNumberHolder = new NumberHolder();
        aNumberHolder.anInt = 10;
        aNumberHolder.aFloat = 10.01f;
        System.out.println(aNumberHolder.anInt);
        System.out.println(aNumberHolder.aFloat);
    }
}