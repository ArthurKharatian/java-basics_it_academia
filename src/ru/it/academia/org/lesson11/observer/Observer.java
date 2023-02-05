package ru.it.academia.org.lesson11.observer;

import java.util.List;

public interface Observer {
    void handelEvent(List<String> vacancies);
}
