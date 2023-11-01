package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.logic();
    }
}

class Quiz{

    Scanner sc = new Scanner(System.in);

    public void logic(){
        Questions q1 = new Questions(" Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Questions q2 = new Questions("What is the extension of java code files?", " A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Questions q3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");

        Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'C');



        int count=0;

        for (Map.Entry<Questions,Character> itr : hmap.entrySet()){

            System.out.println(itr.getKey().getQuestion());
            System.out.println(itr.getKey().getOption1());
            System.out.println(itr.getKey().getOption2());
            System.out.println(itr.getKey().getOption3());
            System.out.println(itr.getKey().getOption4());

            System.out.println("Guess the Answer :");
            char guessedAnswer = sc.next().toUpperCase().charAt(0);

            if(guessedAnswer==itr.getValue()){
                count++;
                System.out.println("Your answer is correct.");
            }else{
                System.out.println("Oops! Answer is wrong.... ");
                System.out.println("The correct answer is " + itr.getValue());
            }

        }

        System.out.println("Total Questions: " + hmap.size());
        System.out.println("Correct answers: "+ count);
        System.out.println("Wrong answers: "+ (hmap.size()-count));
        System.out.println("Your Score: " + count*5);
    }

}
