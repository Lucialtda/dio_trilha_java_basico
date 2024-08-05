public class ExemploFor2 {
    public static void main(String[] args) throws Exception {
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};
        System.out.println(alunos.length);

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indica x=" + x + " é " + alunos[x]);
        }

        for(String aluno: alunos){
            System.out.println("O aluno é " + aluno);
        }

        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }
}
