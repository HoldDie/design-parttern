package com.holddie.design.behavior.template;


import com.holddie.design.behavior.template.impl.CSVDataParser;
import com.holddie.design.behavior.template.impl.DatabaseDataParser;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        CSVDataParser csvDataParser = new CSVDataParser();
        csvDataParser.process();

        System.out.println("-------------------------");

        DatabaseDataParser databaseDataParser = new DatabaseDataParser();
        databaseDataParser.process();

    }
}
