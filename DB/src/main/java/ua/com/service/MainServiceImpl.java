package ua.com.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.dao.CandidateDao;
import ua.com.exceptions.InvalidInputException;
import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Candidate;
import ua.com.model.RegionName;

import java.util.List;

@Component
public class MainServiceImpl implements MainService {

    protected static final Logger LOG = Logger.getLogger(MainServiceImpl.class);

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
    public String createCandidate(Candidate entity) {
        try {
            candidateDao.create(entity);
        } catch (NoAvaliableTableException e) {
            e.printStackTrace();
        }
        return "Ok created!";
    }

    @Override
    public Candidate findCandidate(Long id) {
        try {
            return candidateDao.findOne(id);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        } catch (NoEntityFoundException e) {
            e.printStackTrace();
        } catch (NoAvaliableTableException e) {
            e.printStackTrace();
        }

        return null;
    }

}
