/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cócteldeelote.entities;

/**
 *
 * @author laura
 */
public class Page {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the post
     */
    public Post getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(Post post) {
        this.post = post;
    }

    /**
     * @return the replay
     */
    public Replay getReplay() {
        return replay;
    }

    /**
     * @param replay the replay to set
     */
    public void setReplay(Replay replay) {
        this.replay = replay;
    }
    private String name;
    private Post post;
    private Replay replay;
}
