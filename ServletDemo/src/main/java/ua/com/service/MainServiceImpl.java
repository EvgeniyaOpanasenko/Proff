package ua.com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.dao.CandidateDao;
import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;
import ua.com.model.RegionName;

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
    public List<Candidate> getCandidatesByRegion(RegionName region) throws NoEntityFoundException {
        return null;
    }

    @Override
    public Candidate createCandidate(Candidate entity) throws RegisterException, NoAvaliableTableException {
        return candidateDao.create(entity);
    }


    @Override
    public String findCandidate(String name) {
        return null;
    }

}
