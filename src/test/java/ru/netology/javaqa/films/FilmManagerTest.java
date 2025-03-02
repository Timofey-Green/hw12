package ru.netology.javaqa.films;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class FilmManagerTest {

    @Test  //Добавляем 0 фильмов в менеджер. И выводим с помощбю метода findAll.

    public void added0Movies() {

        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test  //Добавляем 1 фильм в менеджер. И выводим с помощбю метода findAll.

    public void added1Movies() {
        FilmManager manager = new FilmManager();

        manager.saveFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test //Добавляем 8 фильмов в менеджер. И выводим с помощбю метода findAll.

    public void added8Movies() {
        FilmManager manager = new FilmManager();

        manager.saveFilm("Бладшот");
        manager.saveFilm("Вперед");
        manager.saveFilm("Отель Белград");
        manager.saveFilm("Джентльмены");
        manager.saveFilm("Человек-Невидимка");
        manager.saveFilm("Тролли. Мировой тур");
        manager.saveFilm("Номер один");


        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентльмены", "Человек-Невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test  //Проверка выставления в конструкторе лимита в 1 фильм

    public void setALimitOf1Movie() {

        FilmManager manager = new FilmManager(1);

        int expected = 1;
        int actual = manager.getLimit();
        Assertions.assertEquals(expected, actual);


    }

    @Test  //Проверка выставления в конструкторе лимита в 8 фильм

    public void setALimitOf8Movie() {

        FilmManager manager = new FilmManager(8);

        int expected = 8;
        int actual = manager.getLimit();
        Assertions.assertEquals(expected, actual);


    }


    @Test  //Проверка выставления в конструкторе лимита по умолчанию в 5 фильмов.

    public void setALimitOfMovie() {

        FilmManager manager = new FilmManager();

        int expected = 5;
        int actual = manager.getLimit();
        Assertions.assertEquals(expected, actual);


    }

    @Test  //Проверка вывода фильмов в обраном порядке с помощью метода findLast.

    public void reverseTheOrderOfThe2Films() {
        FilmManager manager = new FilmManager();

        manager.saveFilm("Бладшот");
        manager.saveFilm("Вперед");


        String[] expected = {"Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test //Проверка вывода фильмов в обраном порядке с помощью метода findLast.
    public void reverseTheOrderOfThe5Films() {
        FilmManager manager = new FilmManager();

        manager.saveFilm("Бладшот");
        manager.saveFilm("Вперед");
        manager.saveFilm("Отель Белград");
        manager.saveFilm("Джентльмены");
        manager.saveFilm("Человек-Невидимка");


        String[] expected = {"Человек-Невидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test //Проверка вывода фильмов в обраном порядке с помощью метода findLast и ограничения количества фильмов в 5 шт.
    public void reverseTheOrderOfThe6Films() {
        FilmManager manager = new FilmManager();

        manager.saveFilm("Бладшот");
        manager.saveFilm("Вперед");
        manager.saveFilm("Отель Белград");
        manager.saveFilm("Джентльмены");
        manager.saveFilm("Человек-Невидимка");
        manager.saveFilm("Тролли.Мировой тур");

        String[] expected = {"Тролли.Мировой тур", "Человек-Невидимка", "Джентльмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


}


