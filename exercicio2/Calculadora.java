public class Calculadora {
    int a, b;
    
    public void soma(){
        System.out.println ("A soma dos dois números é: " + (this.a+this.b));
    }
    
    public void subtracao(){
        System.out.println ("A subtração dos dois números é: " + (this.a-this.b));
    }
    
    public void multiplicacao(){
        System.out.println ("A multiplicação dos dois números é: " + (this.a*this.b));
    }
    
    public void divisao(){
        System.out.println ("A divisão dos dois números é: " + (this.a/this.b));
    }
    
    public static void main(String[] args) {
        
        Calculadora objetoA = new Calculadora();
        System.out.println ("Objeto A");
        objetoA.a=150;
        objetoA.b=125;
        objetoA.soma();
        objetoA.subtracao();
        objetoA.multiplicacao();
        objetoA.divisao();
        System.out.printf("\n");
        
        Calculadora objetoB = new Calculadora();
        System.out.println ("Objeto B");
        objetoB.a=100;
        objetoB.b=75;
        objetoB.soma();
        objetoB.subtracao();
        objetoB.multiplicacao();
        objetoB.divisao();
        System.out.printf("\n");
        
        Calculadora objetoC = new Calculadora();        
        System.out.println ("OBjeto C");
        objetoC.a=50;
        objetoC.b=25;
        objetoC.soma();
        objetoC.subtracao();
        objetoC.multiplicacao();
        objetoC.divisao();
    }
}
