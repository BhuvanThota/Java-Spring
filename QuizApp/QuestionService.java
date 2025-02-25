package QuizApp;

import java.util.Scanner;

public class QuestionService {
     
    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "Which statement is true about Java?", "Java is a sequence-dependent programming language", "Java is a code dependent programming language","Java is a platform-dependent programming language", "Java is a platform-independent programming language", 4);

        questions[1] = new Question(2, "Which component is used to compile, debug and execute the java programs?", "JRE", "JIT", "JDK", "JVM",3 );

        questions[2] = new Question(3, "Which one of the following is not a Java feature?","Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible", 2 );

        questions[3] = new Question(4, "What is the extension of java code files?", ".js", ".txt", ".class", ".java", 4 );

        questions[4] = new Question(5, "Which of the following is a superclass of every class in Java?", "ArrayList", "Abstract class", "Object class", "String", 3);

    }

    public void playQuiz(){
        
        int total = 0;
        Scanner sc = new Scanner(System.in);
        
        for(Question q: questions){
            System.out.println("Question "+ q.getId() + ":");
            System.out.println(q.getQuestion());
            System.out.println("1. "+ q.getOpt1());
            System.out.println("2. "+ q.getOpt2());
            System.out.println("3. "+ q.getOpt3());
            System.out.println("4. "+ q.getOpt4());
            System.out.print("Enter your choice:");
            int res = sc.nextInt();
            
            if(res == q.getAnswer()){
                total += 1;  
            }  

            System.out.println();
        }

        System.out.println("You have scored "+ total+ "/5 !\n\n");

    }

}


