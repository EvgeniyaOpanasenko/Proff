package ua.com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.dao.CandidateDao;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;

import java.util.List;

@Component
public class MainServiceImpl implements MainService {

    private CandidateDao candidateDao;

    @Autowired
    public MainServiceImpl(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;

    }

    @Override
    public List<Candidate> getCandidatesByAge(int minAge, int maxAge) throws NoEntityFoundException {
        return null;
    }

    @Override
    public List<Candidate> getAllCandidates() throws NoEntityFoundException {
        return candidateDao.getAll();
    }

    @Override
    public Candidate createCandidate(Candidate entity) throws RegisterException {
        return candidateDao.create(entity);
    }


    @Override
    public String findCandidate(String name) {
        return null;

    }

    @Override
    public Candidate login(String name) throws NoEntityFoundException {
        Candidate candidate = getAllCandidates().stream()
                .filter(x -> x.getName().equals(name)).findFirst().get();

        if (candidate == null) {
            throw new NoEntityFoundException("no user with login " + name);
        }

        return candidate;
    }

}
