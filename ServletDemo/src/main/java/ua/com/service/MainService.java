package ua.com.service;


import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;
import ua.com.model.RegionName;

import java.util.List;


public interface MainService {

    List<Candidate> getCandidatesByAge(int minAge, int maxAge) throws NoEntityFoundException;
    List<Candidate> getAllCanidates() throws NoEntityFoundException, NoAvaliableTableException;
    Candidate createCandidate(Candidate entity) throws RegisterException, NoAvaliableTableException;
    String findCandidate(String name);

}
