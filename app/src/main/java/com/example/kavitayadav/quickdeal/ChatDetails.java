package com.example.kavitayadav.quickdeal;

/**
 * Created by kavita yadav on 20-04-17.
 */

public class ChatDetails {

    private String title;
    private String desc;
    private String post;

    public ChatDetails() {
    }

    public ChatDetails(String title, String desc, String post) {
        this.title = title;
        this.desc = desc;
        this.post = post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}
