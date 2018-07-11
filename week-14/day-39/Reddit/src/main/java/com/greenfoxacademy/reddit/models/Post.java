package com.greenfoxacademy.reddit.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
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
    public Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "URL")
    private String url;

    @Column(name = "TIMESTAMP")
    public Timestamp timestamp;

    @Column(name = "SCORE")
    private Long score;

}
