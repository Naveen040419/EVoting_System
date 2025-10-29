package com.codingninjas.EVotingSystem.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "election")
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "election", cascade = CascadeType.ALL)
    private List<ElectionChoice> choices;

    @OneToMany(mappedBy = "election")
    private List<Vote> votes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElectionChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<ElectionChoice> choices) {
        this.choices = choices;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }
}
