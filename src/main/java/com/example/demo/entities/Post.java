package com.example.demo.entities;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Post extends Model {
    @Id
    private Integer id;
    private Integer authorId;
    @ManyToOne(targetEntity = Author.class)
    @JoinColumn(name = "author_id", updatable = false, insertable = false)
    private Author author;
    private String title;
}
