import br.senai.sp.quizprogramacao.Model.Quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Quiz quiz = new Quiz(teclado);
        quiz.iniciarQuiz();
    }
}
