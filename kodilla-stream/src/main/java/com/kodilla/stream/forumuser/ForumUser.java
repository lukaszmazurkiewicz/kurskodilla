package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userSignature;
    private final String userName;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int userNumberOfPosts;

    ForumUser(final int userSignature, final String userName, final char userSex, final LocalDate userDateOfBirth, final int userNumberOfPosts) {
        this.userSignature = userSignature;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.userNumberOfPosts = userNumberOfPosts;
    }

    public int getUserSignature() {
        return userSignature;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getUserNumberOfPosts() {
        return userNumberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userSignature=" + userSignature +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", userNumberOfPosts=" + userNumberOfPosts +
                '}';
    }
}
