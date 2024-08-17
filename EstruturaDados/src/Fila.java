public class Fila<T> {
    private NoFila<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj){
        NoFila<T> novoNo = new NoFila<T>(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            NoFila<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }

            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public Object dequeue(){
        if(!this.isEmpty()){
            NoFila<T> primeiroNo = refNoEntradaFila;
            NoFila<T> noAuxiliar = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }

            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null? true: false;
    }

    public String toString(){
        String stringRetorno = " -------------------\n";
        stringRetorno += "        Fila \n";
        stringRetorno += "--------------------\n";

        NoFila<T> noAuxiliar = refNoEntradaFila;

        if(noAuxiliar != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() + "}]---->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += null;
                    break;
                }
            }
            }else{
                stringRetorno += "null";
            }
        stringRetorno += "\n";
        return stringRetorno;
    }

    
}
