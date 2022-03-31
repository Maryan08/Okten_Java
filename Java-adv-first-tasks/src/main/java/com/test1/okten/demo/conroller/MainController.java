package com.test1.okten.demo.conroller;

import com.test1.okten.demo.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionException;

@RestController
public class MainController {
    List<User> users = new ArrayList<>();
    public MainController(){
        users.add(new User(1,"Ivan","Ryfh",true));
        users.add(new User(2,"Stepan","jggsrdg",true));
        users.add(new User(3,"Maryan","Rgrmeg",false));
        users.add(new User(4,"Oleg","Hhffjg",true));
        users.add(new User(5,"Andr","Jhrekg",false));
    }
    @GetMapping("/users")
    public List<User> welcome(){
        System.out.println(users);
        return users;
    }
    @GetMapping("/users/{id}")
    public User welcomeSomeUser(@PathVariable("id") int id){
        return users.stream().filter(user -> user.getId()==id).findFirst().get();
    }
    @GetMapping("/user")
    public User findUser(@RequestParam("id") int id){
        return users.stream().filter(user -> user.getId()==id).findFirst().get();
    }
    @PostMapping("/user")
    public User savedUser(@RequestBody User user){
        if(user!=null){
            users.add(user);
        }
        else throw new RuntimeException();

        return user;
    }
}
