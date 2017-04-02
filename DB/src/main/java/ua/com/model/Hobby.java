package ua.com.model;

import ua.com.utils.IdAutoGenerated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "hobbies")
public class Hobby extends IdAutoGenerated implements Serializable {

    //TODO how to get value of type using cmd query?
    @Column(name = "type")
   // @Formula("(select text from HobbyType dt where dt.id = typeId)")
    @Enumerated(EnumType.STRING)
    private HobbyType type;

    @OneToMany(mappedBy = "hobby")
    List<Candidate> candidates;

    public Hobby() {
    }

    public Hobby(HobbyType type, List<Candidate> candidates) {
        this.type = type;
        this.candidates = candidates;
    }

    public Hobby(HobbyType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "type=" + type +
                '}';
    }

    public HobbyType getType() {
        return type;
    }

    public void setType(HobbyType type) {
        this.type = type;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
