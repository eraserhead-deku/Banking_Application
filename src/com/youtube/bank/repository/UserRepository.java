package com.youtube.bank.repository;

import com.youtube.bank.entity.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserRepository {

    private static  Set<User> users = new HashSet<>();

    static {
        User user1 = new User("admin","admin","123454664","admin",0.0) ;
        User user3 = new User("user3","user3","32423423","user",20000.0) ;
        User user2 = new User("user2","user2","23423411","user",1000.0) ;

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public void printUsers(){
        System.out.println(users);
    }

    public User login (String username , String password ){
        List<User> finalList = users.stream()
                .filter(user -> user.getUsername().equals(username)
                && user.getPassword().equals(password))
                .collect(Collectors.toList());

        if(! finalList.isEmpty()){
            return finalList.get(0);
        }else{
            return null ;
        }
    }
}
