package com.myproject.jmp.task2.beans;

import java.util.List;

/**
 * Created by firel on 14.12.2015.
 */
public class User {
    protected Role role;
    protected List<News> news;
    protected List<Test> tests;
    protected List<Book> books;

    public User() {
        this.role = Role.DEFAULT;
    }

    public void viewNews() {

    }

    public void viewTests() {

    }

    public void viewBooks() {

    }
}
