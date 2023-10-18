/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cócteldeelote.entities;

import mx.itson.cocteldeelote.enums.Categories;
import mx.itson.cocteldeelote.enums.Reaction;

/**
 *
 * @author laura
 */
public class Replay {

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the reaction
     */
    public Reaction getReaction() {
        return reaction;
    }

    /**
     * @param reaction the reaction to set
     */
    public void setReaction(Reaction reaction) {
        this.reaction = reaction;
    }

    /**
     * @return the categorie
     */
    public Categories getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }
    private User user;
    private Date date;
    private Reaction reaction;
    private Categories categorie;
    private String content;
}
