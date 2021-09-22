import java.util.Scanner;

/**
 This program shows a simple quiz with one question.
 */
public class App
{
    public static void main(String[] args)
    {

       
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        Question questao = new Question();
        questao.setText("Qual a cor do cavalo branco do Napoleão? ");
        questao.setAnswer("Branco");
        this.prova.Cadastro(questao);

        
        Question questao2 = new Question();
        questao2.setText("Quem descobriu o Brasil? ");
        questao2.setAnswer("Pedro Alvarez Cabral ");
        this.prova.Cadastro(questao2);

        //presentQuestion(first);
        //presentQuestion(second);

        Prova prova = new Prova();  
        prova.Cadastro(first);
        prova.Cadastro(second);
        prova.Cadastro(second);

        Prova prova2 = new Prova();  
        prova.Cadastro(first);
        prova.Cadastro(second);
        prova.Cadastro(second);



    }

    /**
     Presents a question to the user and checks the response.
     @param q the question
     */
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }

    public void CadastraResposta() {

    }



}