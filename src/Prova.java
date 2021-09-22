
import java.util.ArrayList;

public class Prova {

    private ArrayList<Question> prova;
    private Question questao;


    public Prova() {

        prova = new ArrayList<Question>();

    }

    public void Cadastro(Question question) {

       // for ( int i = 0; i<= prova.size(); i++) {

       //     Question questao = new Question();
            prova.add(question);


     //   }
    }
    public Question Recuperar( int num) {
       // Question aux;
        //for ( int i = 0; i<= prova.size(); i++) {
            
            return prova.get(num-1);
      //      }
      //  return aux;
    }
    
    
    public void Remover( int num) {
        //for ( int i = 0; i<= 10; i++) {

            prova.remove(num);
            
//}
    }
  
	public StringBuilder getProva(){
        int num = 0;
        StringBuilder exibir = new StringBuilder();
        for (num = 1; num<= prova.size(); num++) {
            exibir.append("Questão número: "+ num);
            exibir.append(questao.toString() + "\n");
        }
        return exibir;
           
    }
	




    // exibir
    // num = 1
    // para cada quesdtao da prova
    //    texto = texto + num + questao.toSTtring + \n
    //    num ++
}
