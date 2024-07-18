package estudos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class voltando4 {
  public static void main(String[] args) {
	   //Crie um programa que solicite ao usuário para inserir 5 nomes. 
	   //Use ArrayList para armazenar os nomes 
	   //e depois ordene em alfabética. Exiba a lista ordenada.
	  naorepetenomes();
       
  }
  public static boolean naorepetenomes() {
	  Scanner sc = new Scanner(System.in);
	  //melhor usar o map por conta que se fosse em uma tabela de nomes ou lista escolar
	  // o nome pode sim se repetir mas cada valor vai ser unico.
	  //Melhor otimização,lógica e evita erros na hora de produção.
	  //aprendendo pesquisando a sintaxe e assim adquirindo conhecimento, isso ai!
	  //O hashmap vai definir cada registro com uma chave unica e o nome do elemento,SEMPRE!!!
	  //standard syntax of HashMap. 
	  HashMap<Integer,String> nome = new HashMap<>();
      for(int i = 0; i <=5; i++) {
    	  System.out.println("Digite seu nome");
    	  String nomes = sc.nextLine();
    	  nome.put(i,nomes);
    	  System.out.println(i + " " + nomes);
    	  //vai pegar o contador do for e colocar ao lado de cada registro.
    	  //vivendo e aprendendo!! 
    	  //sempre usar put ao inves de add nesse caso de Hash.
          //ter costume de colocar true or false para saber se deu certo.
    	  //Provavelmente vai usar muito isso em trabalho.
       }
      return true;
      //nao esquecer () para ser denominado uma função e acabar dando erro.
      //resolver isso depois com mais calma preciso ir no banheiro,tomar banho e ir pra gym
      //qualquer apprende com o gpt para saber como fazer essa parada pra ver se deu certo com true e false direitinho
	  
  }
}