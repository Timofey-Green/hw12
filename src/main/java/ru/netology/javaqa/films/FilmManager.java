package ru.netology.javaqa.films;


public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;
    }


    public FilmManager(int limit) {
        this.limit = limit;

    }

    public int getLimit() {
        return limit;
    }

    public void saveFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;


    }


    public String[] findAll() {
        return films;

    }


    public String[] findLast() {
        int resultLeght;

        if (films.length < limit) {
            resultLeght = films.length;
        } else {
            resultLeght = limit;
        }
        String[] tmp = new String[resultLeght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }
        return tmp;
    }
}





























