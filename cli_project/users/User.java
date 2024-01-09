package com.sohail.cli_project.users;

import java.util.UUID;

public class User {
    private UUID userId;
    private String name;

    public User(String name) {
        this.userId = generateUUID();
        this.name = name;
    }

    private UUID generateUUID() {
        return UUID.randomUUID();
    }

    public UUID getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
