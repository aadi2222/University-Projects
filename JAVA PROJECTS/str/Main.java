package com.adi;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        making arrays to store data
        ArrayList <String> article = new ArrayList<>();
        ArrayList <String> noun = new ArrayList<>();
        ArrayList <String> verb = new ArrayList<>();
        ArrayList <String> preposition = new ArrayList<>();

//        adding data to arrays

        article.add("the");
        article.add("a");
        article.add("one");
        article.add("some");
        article.add("any");

        noun.add("boy");
        noun.add("girl");
        noun.add("dog");
        noun.add("town");
        noun.add("car");

        verb.add("drove");
        verb.add("jumped");
        verb.add("ran");
        verb.add("walked");
        verb.add("skipped");

        preposition.add("to");
        preposition.add("from");
        preposition.add("over");
        preposition.add("under");
        preposition.add("on");

        Random random = new Random();

//        getting a complete sentence for 20 times and printing result
        for (int i = 0; i < 20; i++) {
            String sentence = "";

            sentence = sentence.concat(article.get(random.nextInt(article.toArray().length)));
            sentence = sentence.concat(" ");
            sentence = sentence.concat(noun.get(random.nextInt(noun.toArray().length)));
            sentence = sentence.concat(" ");
            sentence = sentence.concat(verb.get(random.nextInt(verb.toArray().length)));
            sentence = sentence.concat(" ");
            sentence = sentence.concat(preposition.get(random.nextInt(preposition.toArray().length)));
            sentence = sentence.concat(" ");
            sentence = sentence.concat(article.get(random.nextInt(article.toArray().length)));
            sentence = sentence.concat(" ");
            sentence = sentence.concat(noun.get(random.nextInt(noun.toArray().length)));
            sentence = sentence.concat(".");

            String sub1 = sentence.substring(0,1);
            String sub2 = sentence.substring(1);

            String finalSentence = sub1.toUpperCase() + sub2;

            System.out.println( (i+1) +  ". " + finalSentence);
        }
    }
}
