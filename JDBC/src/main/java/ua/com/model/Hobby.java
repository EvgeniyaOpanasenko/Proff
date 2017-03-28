package ua.com.model;

import ua.com.utils.IdAutoGenerated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "hobbies")
public class Hobby extends IdAutoGenerated {

    @Column(name = "type")
    private HobbyType type;

    @OneToMany(mappedBy = "hobby")
    List<Candidate> candidates;

    public Hobby() {
    }

    public Hobby(HobbyType type, List<Candidate> candidates) {
        this.type = type;
        this.candidates = candidates;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "type=" + type +
                ", candidates=" + candidates +
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