package ua.com.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.com.model.Candidate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class CandidateDaoImpl implements CandidateDao {

    //private static final Logger LOGGER = Logger.getLogger(Candidate.class);

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Candidate create(Candidate entity) {
        manager.persist(entity);
        return entity;
    }

    @Override
    @Transactional
    public List<Candidate> getAll() {
        TypedQuery<Candidate> query = manager.createQuery("SELECT c FROM Canidadate c", Candidate.class);
        List<Candidate> candidates = query.getResultList();
        return candidates;
    }

    @Override
    @Transactional
    public Candidate findOne(Long aLong) {
        List<Candidate> candidates = getAll();
        Candidate candidate = candidates.stream().filter(e -> e.getId() == aLong).findFirst().get();
        return candidate;
    }

    @Override
    @Transactional
    public Candidate delete(Long aLong) {
        Candidate candidate = manager.find(Candidate.class, aLong);
        manager.remove(candidate);
        return candidate;
    }
}
