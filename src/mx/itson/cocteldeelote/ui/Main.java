/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cocteldeelote.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.cocteldeelote.enums.Categories;
import mx.itson.cocteldeelote.enums.Reaction;
import mx.itson.cócteldeelote.entities.Date;
import mx.itson.cócteldeelote.entities.Page;
import mx.itson.cócteldeelote.entities.Post;
import mx.itson.cócteldeelote.entities.Replay;
import mx.itson.cócteldeelote.entities.User;

/**
 *
 * @author laura
 */
public class Main {
    public static void main(String[] args) {
        
        User user1 = new User ();
        user1.setName("Laura Valdez");
        user1.setEmail("LauraV@gmail.com");
        user1.setPassword("parangaricutirimicuaro");
         
        User user2 = new User ();
        user2.setName("Itzel Romero");
        user2.setEmail("ItzelR03@gmail.com");
        user2.setPassword("chocolate");
        
        Date date1 = new Date ();
        date1.setDay("Monday 1st");
        date1.setTime("8:45 a.m");
        
        Date date2 = new Date ();
        date2.setDay("Tuesday 2nd");
        date2.setTime("09:12 p.m");
        
        List <Post> posts = new ArrayList<>();
        Post post1 = new Post ();
        post1.setUser(user1);
        post1.setDate(date1);
        post1.setCategorie(Categories.SERIES);
        post1.setContent("Opino que hora de aventura es una exelente serie, tiene muy buena historia y desarollo");
        posts.add(post1);
        
        List<Replay> replays = new ArrayList<>();
        Replay r1 = new Replay ();
        r1.setUser(user2);
        r1.setDate(date1);
        r1.setCategorie(Categories.SERIES);
        r1.setContent("No opino lo mismo, para i es una serie muy infantil sin fundamentos");
        r1.setReaction(Reaction.DISLIKE);
        replays.add(r1);
        
        Page page1 = new Page ();
        page1.setName("ESPACIO PARA CARTOONS");
        page1.setPost(post1);
        page1.setReplay(r1);
        
        System.out.println(" --- RADITT --- ");
        System.out.println("");
        System.out.println("Page: "+ page1.getName());
        System.out.println("");
        System.out.println(post1.getUser());
        System.out.println("");
        System.out.println(post1.getDate());
        System.out.println("");
        System.out.println(post1.getCategorie());
        System.out.println("");
        System.out.println(post1.getContent());
        System.out.println("");
        System.out.println("");
        System.out.println("Replay");
        System.out.println(r1.getUser());
        System.out.println("");
        System.out.println(r1.getDate());
        System.out.println("");
        System.out.println(r1.getCategorie());
        System.out.println("");
        System.out.println(r1.getContent());
        System.out.println("");
        System.out.println("");
        
       /*for (Post p : posts){
            System.out.println(p.getUser()+" "+ p.getDate()+" "+p.getCategorie()+" "+p.getContent());
        }
        
        for (Replay r : replays){
            System.out.println(r.getUser()+" "+r.getDate()+" "+r.getCategorie()+" "+r.getContent()+" "+r.getReaction());
        }
        
        */
    }
}
