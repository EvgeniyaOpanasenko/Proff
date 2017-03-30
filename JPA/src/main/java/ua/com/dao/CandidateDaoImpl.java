package ua.com.dao;

import jdk.management.resource.internal.inst.InitInstrumentation;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Candidate;
import ua.com.model.RegionName;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CandidateDaoImpl implements CandidateDao {

    private static final Logger LOGGER = Logger.getLogger(Candidate.class);

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Candidate create(Candidate entity) {
        manager.persist(entity);
        return entity;
    }

    @Override
    public List<Candidate> getAll() {
        TypedQuery<Candidate> query = manager.createQuery("SELECT c FROM Canidadate c", Candidate.class);
        List<Candidate> candidates = query.getResultList();
        return candidates;
    }

    @Override
    public Candidate findOne(Long aLong) {
        List<Candidate> candidates = getAll();
        Candidate candidate = candidates.stream().filter(e -> e.getId() == aLong).findFirst().get();
        return candidate;
    }

    @Override
    public Candidate delete(Long aLong) {
        Candidate candidate = manager.find(Candidate.class, aLong);
        manager.remove(candidate);
        return candidate;
    }

    @Override
    public List<Candidate> getCandidatesByAge(int minAge, int maxAge) throws NoEntityFoundException {
        List<Candidate> resultList = manager.createQuery("SELECT c FROM Candidate c WHERE c.age between" +
                " :min and :max", Candidate.class)
                .setParameter("min", minAge)
                .setParameter("max", maxAge).getResultList();
        LOGGER.info("FIND CANDIDATES BY AGE");
        return resultList;

    }

    @Override
    public List<Candidate> getCandidatesByRegion(RegionName region) throws NoEntityFoundException {
        List<Candidate> candidates = getAll();
        List<Candidate> candidatesSortedByRegion = candidates.stream().filter(
                e -> e.getRegion().equals(region)).collect(Collectors.toList());
        return candidatesSortedByRegion;
    }
}
