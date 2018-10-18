package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int averageOfPostsPerUser;
    int averageOfCommentsPerUser;
    int averageOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfComments = statistics.commentsCount();
        numberOfPosts = statistics.postsCount();

        if (numberOfPosts == 0) {
            averageOfCommentsPerUser = numberOfComments / numberOfUsers;
            averageOfPostsPerUser = numberOfPosts / numberOfUsers;
        } else if (numberOfPosts != 0 && numberOfUsers !=0) {
            averageOfCommentsPerPost = numberOfComments / numberOfPosts;
            averageOfCommentsPerUser = numberOfComments / numberOfUsers;
            averageOfPostsPerUser = numberOfPosts / numberOfUsers;
        }
        else if (numberOfUsers == 0) {
            averageOfCommentsPerPost = numberOfComments / numberOfPosts;
        } else {
            averageOfCommentsPerUser = numberOfComments / numberOfUsers;
            averageOfPostsPerUser = numberOfPosts / numberOfUsers;
            averageOfCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }

    public String showStatistics() {
        return "Liczba użytkowników to: " + numberOfUsers + ". Postów napisano: " + numberOfPosts + ". Pod nimi zostawiono: " + numberOfComments +" komentarzy. Co daję nam średnią: " + averageOfPostsPerUser + "postów na użytkownika, " + averageOfCommentsPerUser + " komentarzy na użytkownika oraz średnio " + averageOfCommentsPerPost + "komentarzy na post.";
    }
}
