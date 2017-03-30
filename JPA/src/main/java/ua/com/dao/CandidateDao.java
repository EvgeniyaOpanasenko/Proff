package ua.com.dao;

import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Candidate;
import ua.com.model.RegionName;

import java.util.List;

/**
 * Created by EVA on 29.03.2017.
 */
public interface CandidateDao extends Dao<Candidate, Long> {

    List<Candidate> getCandidatesByAge(int minAge, int maxAge) throws NoEntityFoundException;
    List<Candidate> getCandidatesByRegion(RegionName region) throws NoEntityFoundException;

}
