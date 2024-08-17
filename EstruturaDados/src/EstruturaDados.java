public class EstruturaDados {
    public static void main(String[] args) throws Exception {
        int intA = 1;
        int intB = intA;

        intA = 2;
        System.out.println("intA = " + intA);
        System.out.println("intB = " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        objA.setNum(2);

        System.out.println("objA = " + objA);
        System.out.println("objB = " + objB);
    }
}
