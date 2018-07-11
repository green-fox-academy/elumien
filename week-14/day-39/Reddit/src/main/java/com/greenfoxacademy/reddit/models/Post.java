package com.greenfoxacademy.reddit.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_POST")
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "T_POST_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "URL")
    private String url;

    @Column(name = "TIMESTAMP")
    private String timestamp;

    @Column(name = "SCORE")
    private Long score;

    /*public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.score = 0L;
    }*/

    public Post(String title, String url, String timestamp, Long score) {
        this.title = title;
        this.url = url;
        this.timestamp = timestamp;
        this.score = score;
    }

    public Post() {
    }
}
