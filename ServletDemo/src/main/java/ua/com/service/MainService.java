package ua.com.service;


import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;
import ua.com.model.RegionName;

import java.util.List;


public interface MainService {

    List<Candidate> getCandidatesByAge(int minAge, int maxAge) throws NoEntityFoundException;
    List<Candidate> getCandidatesByRegion(RegionName region) throws NoEntityFoundException;
    Candidate createCandidate(Candidate entity) throws RegisterException, NoAvaliableTableException;
    String findCandidate(String name);

}
