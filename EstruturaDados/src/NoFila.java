public class NoFila<T> {
    private T object;
    private NoFila<T> refNo;

    public NoFila(){

    }

    public NoFila(T object){
        this.refNo = null;
        this.object = object;

    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoFila<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(NoFila<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" + 
        "objeto: " + object +
        '}';
    }
    
    
}
