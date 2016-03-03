public class Aluno {
    int idade;
    String nome, numeroMatricula; 
   
    public void imprimirDadosCadastrais() {
        System.out.println ("Nome: " + this.nome);
        System.out.println ("Idade: " + this.idade);
        System.out.println ("Número de Matrícula: " + this.numeroMatricula);
        System.out.printf ("\n");
    }
         
    public static void main(String[] args) {
        
        Aluno objetoA = new Aluno();
        System.out.println ("Objeto A");
        objetoA.nome = "Aluno A";
        objetoA.idade = 18;
        objetoA.numeroMatricula = "20141811123";
        objetoA.imprimirDadosCadastrais();

        Aluno objetoB = new Aluno();
        System.out.println ("Objeto B");
        objetoB.nome="Aluno B";
        objetoB.idade = 18;
        objetoB.numeroMatricula = "20141811456";
        objetoB.imprimirDadosCadastrais();
        
        Aluno objetoC = new Aluno();
        System.out.println ("Objeto C");
        objetoC.nome = "Aluno C";
        objetoC.idade = 18;
        objetoC.numeroMatricula = "20141811789";
        objetoC.imprimirDadosCadastrais();
        
        Aluno objetoD = new Aluno();
        System.out.println ("Objeto D");
        objetoD.nome = "Aluno D";
        objetoD.idade = 50;
        objetoD.numeroMatricula = "20141811666";
        objetoD.imprimirDadosCadastrais();
    }
}
