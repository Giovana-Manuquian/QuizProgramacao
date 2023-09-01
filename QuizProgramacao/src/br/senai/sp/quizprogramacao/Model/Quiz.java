package br.senai.sp.quizprogramacao.Model;

import java.util.Scanner;

public class Quiz {
    private Scanner teclado;
    private int pontuacao;

    public Quiz(Scanner teclado) {
        this.teclado = teclado;
        this.pontuacao = 0;
    }

    public void iniciarQuiz(){
        pergunta("1 - Qual é a função principal de um compilador?",
                "a) Executar o código-fonte imediatamente.",
                "b) Converter código-fonte em linguagem de máquina.",
                "c) Realizar depuração de código.",
                "d) Otimizar o desempenho do código.",
                "b");

        pergunta("2 - O que é um loop \"for\" em programação?",
                "a) Uma declaração de variável.",
                "b) Uma estrutura de decisão.",
                "c) Uma estrutura de repetição.",
                "d) Uma função matemática.",
                "c");

        pergunta("3 - O que significa 'instanciar' uma classe em POO em Java?",
                "a) Criar um objeto a partir da classe.",
                "b) Declarar uma variável sem atribuir valor.",
                "c) Criar uma cópia exata da classe.",
                "d) Definir uma classe como final.",
                "a");

        pergunta("4 - O que é um construtor em programação orientada a objetos (POO) em Java?",
                "a) Um método que destrói objetos.",
                "b) Um método que realiza operações matemáticas.",
                "c) Um método que inicializa objetos.",
                "d) Um método que remove herança de classes.",
                "c");

        pergunta("5 - Qual é o objetivo principal da herança em programação orientada a objetos (POO) em Java?",
                "a) Reduzir o uso de memória.",
                "b) Permitir a criação de novas classes.",
                "c) Evitar a reutilização de código.",
                "d) Facilitar a criação de objetos.",
                "b");

        pergunta("6 - O que é um método em Java?",
                "a) Um atributo de uma classe.",
                "b) Uma variável global.",
                "c) Um construtor.",
                "d) Uma função que opera em objetos de uma classe.",
                "d");

        pergunta("7 - O que é o encapsulamento em programação em POO em Java?",
                "a) Ocultar informações de um programa.",
                "b) Criar classes dentro de outras classes.",
                "c) Utilizar herança para estender uma classe.",
                "d) Armazenar informações em uma variável global.",
                "a");

        pergunta("8 - Qual é a diferença entre uma classe e um objeto em Java?",
                "a) Uma classe é uma instância de um objeto.",
                "b) Uma classe é uma representação de um objeto.",
                "c) Um objeto é uma instância de uma classe.",
                "d) Não há diferença entre uma classe e um objeto.",
                "b");

        pergunta("9 - O que é o polimorfismo em programação orientada a objetos (POO) em Java?",
                "a) A capacidade de uma classe ter múltiplas instâncias.",
                "b) A capacidade de uma classe herdar de múltiplas classes.",
                "c) A capacidade de uma classe ter múltiplos métodos com o mesmo nome, mas comportamentos diferentes.",
                "d) A capacidade de uma classe ter múltiplas variáveis de instância.",
                "c");

        System.out.println("Sua pontuação final é: " + pontuacao);
    }

    public void pergunta(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoCorreta){
        System.out.println(pergunta);
        System.out.println(opcaoA);
        System.out.println(opcaoB);
        System.out.println(opcaoC);
        System.out.println(opcaoD);
        System.out.print("Resposta: ");
        String resposta = teclado.next();

        if(resposta.equals(opcaoCorreta)){
            System.out.println("Resposta correta!");
            pontuacao++;
        }else {
            System.out.println("Resposta incorreta! A resposta correta era " + opcaoCorreta);
        }
    }

}

