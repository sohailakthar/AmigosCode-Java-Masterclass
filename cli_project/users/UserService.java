package com.sohail.cli_project.users;

import java.util.UUID;

public class UserService {
    UserDAO userDao;

    {
        userDao = new UserDAO();
    }

    public String registerUser(String name) {
        User user = new User(name);
        if(userDao.contains(user.getName())) {
            return null;
        }

        userDao.addUser(user);
        return user.getUserId().toString();
    }


    public boolean unregisterUser(UUID userId) {
        if(UserDAO.contains(userId)) {
            userDao.removeUser(userId);
            return true;
        }

        return false;
    }

    public String getAllUsers() {
        User[] users = userDao.getAllUsers();
        StringBuilder usersDataString = new StringBuilder();

        if(users[0] != null) {
            usersDataString.append("These are the currently registered users:-\n");
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null)
                    break;
                String s = String.format("user-%d:\t\tuserId: %s \tusername: %s\n", i+1, users[i].getUserId(), users[i].getName());
                usersDataString.append(s);
            }
        } else {
            usersDataString.append("There are no registered users ❌");
        }

        return usersDataString.toString();
    }
}
