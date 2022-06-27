package com.computerience.todoapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TASK")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long task_id;
    @Column(name="TASK_CONTENT")
    private String content;

//    @Column(name="TASK_CONTENT")
//    private Boolean isDone;

//    @OneToMany(mappedBy = "TAG")
//    private List<Tag> tags;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public Boolean getDone() {
//        return isDone;
//    }
//
//    public void setDone(Boolean done) {
//        isDone = done;
//    }

//    public List<Tag> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<Tag> tags) {
//        this.tags = tags;
//    }

    public void setId(Long id) {
        this.task_id = id;
    }

    @Id
    public Long getId() {
        return task_id;
    }
}
