package com.computerience.todoapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TASK")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long task_id;

    private String task_content;

//    @Column(name="TASK_CONTENT")
//    private Boolean isDone;

//    @OneToMany(mappedBy = "TAG")
//    private List<Tag> tags;

    public String getTask_content() {
        return task_content;
    }

    public void setTask_content(String task_content) {
        this.task_content = task_content;
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

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }
}
