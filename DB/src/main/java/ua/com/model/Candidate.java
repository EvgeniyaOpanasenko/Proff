package ua.com.model;

import ua.com.utils.IdAutoGenerated;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "candidates")
//@NamedQuery(name = "getAllCandidates", query = "select c from Candidate c")
public class Candidate extends IdAutoGenerated implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clan_id", referencedColumnName = "id")
    private Clan clan;

    // connection => region.getRegionId + Candidate.getCAndidatId
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id", referencedColumnName = "id")
    private Region region;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hobby_id", referencedColumnName = "id")
    private Hobby hobby;

    public Candidate() {
    }

    public Candidate(String name, int age, Clan clan, Region region, Hobby hobby) {
        this.name = name;
        this.age = age;
        this.clan = clan;
        this.region = region;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", clan=" + clan +
                ", region=" + region +
                ", hobby=" + hobby +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }
}



