import java.util.ArrayList;

public class AplicacaoDeProva {
    Prova prova;
    Question questao;
    ArrayList<String> respostas;


    public void definirProva(Prova p ) {
        this.prova = p;
    
   
    }
    public void cadastrarResposta(String answer, int num) {
        
    ArrayList<String> respostas;
        this.respostas = new ArrayList<String>();
        this.respostas.add(num, answer);        
        
    }

    public double notaProva(ChoiceQuestion, Question, TrueFalseQuestion) {
        double nota = 0;
        double pontos;

        if (questao.equals(choices) {

        }
        if (choices.checkAnswer() == true) {
            pontos = 1.5;
            nota = nota +pontos;
        }

        if (TrueFalseQuestion.checkAnswer() == true) {
            pontos = 1.5;
            nota = nota +pontos;
        }
        if (Question.checkAnswer() == true) {
            pontos = 1.5;
            nota = nota +pontos;
        }

    //     for ( int i = 0; i<= respostas.size(); i++){
    //         Question pergunta = this.prova.Recuperar(i);

    //         if ( pergunta.checkAnswer(respostas.get(i))) {
    //             if 

    //         }

    //     }

    }

    public StringBuilder relatorio() {
    
        StringBuilder retorno = new StringBuilder();
        for ( int i = 0; i<= respostas.size(); i++){
            Question pergunta = this.prova.Recuperar(i);

        retorno.append(pergunta.toString());
        retorno.append(this.respostas.get(i));

        if (pergunta.checkAnswer(this.respostas.get(i))){
            retorno.append("Resposta certa! ");
        }
        else {
            retorno.append("A resposta correta é: "+ pergunta.getAnswer());
        }


   


    }



}    


