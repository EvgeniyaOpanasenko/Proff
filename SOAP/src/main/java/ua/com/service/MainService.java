package ua.com.service;


import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;

import java.util.List;


public interface MainService {

    List<Candidate> getCandidatesByAge(int minAge, int maxAge) throws NoEntityFoundException;
    List<Candidate> getAllCandidates() throws NoEntityFoundException;
    Candidate createCandidate(Candidate entity) throws RegisterException;
    Candidate findCandidate(long id) throws NoEntityFoundException;

    Candidate login(String name) throws NoEntityFoundException;
}
