package ru.it.academia.org.lesson11.factory;

public class DocxConverter implements DocumentConverter{
    @Override
    public void convertFile() {
        System.out.println("Converting to docx...");
    }
}
