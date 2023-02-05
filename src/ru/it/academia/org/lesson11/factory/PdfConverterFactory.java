package ru.it.academia.org.lesson11.factory;

public class PdfConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new PdfConverter();
    }
}
