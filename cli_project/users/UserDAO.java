package com.sohail.cli_project.users;

import java.util.UUID;

public class UserDAO {
    private static int CAPACITY = 4;
    private static User[] users;
    private static int index = -1;

    static {
        users = new User[CAPACITY];
    }

    public static boolean contains(UUID userId) {
        for(User registeredUser : users) {
            if(registeredUser != null && userId.equals(registeredUser.getUserId())) {
                return true;
            }
        }

        return false;
    }

    public boolean contains(String name) {
        for(User registeredUser : users) {
            if(registeredUser != null && name.equals(registeredUser.getName())) {
                return true;
            }
        }

        return false;
    }

    public void addUser(User user) {
        if(index >= users.length) {
            growStorage();
            addUser(user);
        }

        users[++index] = user;
    }

    public void removeUser(UUID userId) {
        boolean removed = false;
        for(int i=0; i<CAPACITY; i++) {
            if(users[i] != null && userId.equals(users[i].getUserId())) {
                users[i] = null;
                index--;
                removed = true;
            }

            if(removed) {
                while(i<CAPACITY-1 && users[i+1] != null) {
                    users[i] = users[i+1];
                    i++;
                }
                break;
            }
        }
    }


    public static User getUser(UUID userId) {
        for(User user : users) {
            if(user != null && userId.equals(user.getUserId()))
                return user;
        }
        return null;
    }


    public User[] getAllUsers() {
        return users;
    }

    public int getUserCount() {
        return index+1;
    }

    private void growStorage() {
        CAPACITY += (CAPACITY/2);
        User[] newStorage = new User[CAPACITY];
        System.arraycopy(users, 0, newStorage, 0, users.length);
        users = newStorage;
    }
}
