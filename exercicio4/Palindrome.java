public class Palindrome {
    int l1, l2;
    
    public int verificar_palindrome(String arg){
	int tamanho = arg.length();
	String arg1 = "";
	String arg2 = "";

	for(int i=0; i<=tamanho-5; i++){
            arg1 = arg.substring(i,i+5);
            
            for(int j = 4; j>=0; j--){
		arg2 = arg2 + arg1.charAt(j);
            } 
            
            if(arg1.equals(arg2)){
                this.l1 = i+1;
		this.l2 = i+5;
		return i;
            }
            
	arg2 = "";
	}
        
	return -1;
	}

    public static void main(String[] args){
    	String arg = args[0];
	Palindrome teste = new Palindrome();
	int a = teste.verificar_palindrome(arg);
        
        if(a == -1){
            System.out.println( "Palíndromo não encontrado." );		
	}else{
            System.out.println("PALÍNDROMO /// POSIÇÃO");
            System.out.println(arg.substring(a,a+5) + " /// " + teste.l1+"-"+ teste.l2);
	}
        
    }
}
