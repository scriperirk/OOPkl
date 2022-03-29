package ru.netology.manager;

import ru.netology.domain.FormDate;
import ru.netology.domain.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Афанасов";
        post.name = "Антон";
        post.patronymic = "Леонидович";
        post.passport = "6666 № 19639631";
        post.phone = "+7 (999)-333-66-99";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = String.valueOf(18);
        post.birthday.year = String.valueOf(1986);
        post.birthday.month = String.valueOf(7);
    }

}
