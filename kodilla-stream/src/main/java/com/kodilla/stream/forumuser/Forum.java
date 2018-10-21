package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumsUserList = new ArrayList<>();

    public Forum() {
        theForumsUserList.add(new ForumUser(1, "Lukasz", 'M', LocalDate.of(1988,12,15),222));
        theForumsUserList.add(new ForumUser(2,"Adam", 'M', LocalDate.of(2010, 1, 11), 111));
        theForumsUserList.add(new ForumUser(3,"Jola", 'F', LocalDate.of(1990, 3, 23), 0));
        theForumsUserList.add(new ForumUser(4,"Stefan", 'M', LocalDate.of(1978, 11, 11), 0));
        theForumsUserList.add(new ForumUser(5,"Piotr", 'F', LocalDate.of(2007, 6, 1), 321));
        theForumsUserList.add(new ForumUser(6,"Kasia", 'F', LocalDate.of(1923, 12, 31), 21));
        theForumsUserList.add(new ForumUser(7,"Jerzy", 'M', LocalDate.of(1998, 10, 21), 678));
        theForumsUserList.add(new ForumUser(8,"Dominika", 'F', LocalDate.of(1982, 2, 21), 7891));
        theForumsUserList.add(new ForumUser(9,"Karol", 'M', LocalDate.of(2012, 10, 10), 1));
        theForumsUserList.add(new ForumUser(10,"Lech", 'M', LocalDate.of(1998, 4, 20), 345));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumsUserList);
    }
}
