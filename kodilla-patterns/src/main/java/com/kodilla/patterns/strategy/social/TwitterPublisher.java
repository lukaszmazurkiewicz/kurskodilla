package com.kodilla.patterns.strategy.social;

public class TwitterPublisher  implements SocialPublisher {
    @Override
    public String share() {
        return "Use [Twitter] account to share your post!";
    }
}
