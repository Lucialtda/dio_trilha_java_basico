public class mainFila {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");



        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);
    }
}
