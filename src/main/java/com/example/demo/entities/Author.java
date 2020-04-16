package com.example.demo.entities;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Author extends Model {
    @Id
    private Integer id;
    private String name;

    @OneToMany(targetEntity = Post.class)
    private List<Post> posts;
}
