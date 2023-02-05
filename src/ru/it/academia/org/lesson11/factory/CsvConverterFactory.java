package ru.it.academia.org.lesson11.factory;

public class CsvConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new CsvConverter();
    }
}
