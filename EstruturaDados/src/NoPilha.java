public class NoPilha {
    private int dado;
    private NoPilha refNo = null;

    public NoPilha (int dado){
        this.dado = dado;

    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }    
    public NoPilha getRefNo() {
        return refNo;
    }

    public void setRefNo(NoPilha refNo) {
        this.refNo = refNo;
    }

    public String toString(){
        return "No{" + 
                "dado: " + dado + '\'' +
                ", No= " + refNo +
                '}';
    }
    
}
