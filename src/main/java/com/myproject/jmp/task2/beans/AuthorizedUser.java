package com.myproject.jmp.task2.beans;

import java.util.List;

/**
 * Created by firel on 14.12.2015.
 */
public class AuthorizedUser extends User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected List<Comment> comments;
    protected List<Book> books;

    public AuthorizedUser() {
    }

    public AuthorizedUser(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = Role.AUTHORIZED;
    }

    public void editProfile() {

    }

    public void addComment(Comment comment) {

    }

    private void applyTraining() {

    }

    private void buyBook(Book book) {

    }
}
