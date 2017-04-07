package ua.com.soap.run;

import ua.com.soap.Candidate;
import ua.com.soap.CandidateEndpoint;
import ua.com.soap.CandidateEndpointImplService;
import ua.com.soap.NoEntityFoundException_Exception;

/**
 * Created by EVA on 07.04.2017.
 */
public class RunClient {
    public static void main(String[] args) {
        CandidateEndpoint candidateEndpoint =
                new CandidateEndpointImplService().getCandidateEndpointImplPort();

        try {
            Candidate candidate = candidateEndpoint.findCandidate(2);
            System.out.printf("id %s, name %s, age %s, clan %s, hobby %s, region %s\n",
                    candidate.getId(),candidate.getName(), candidate.getAge(), candidate.getClan(),
                    candidate.getHobby(), candidate.getRegion());

        } catch (NoEntityFoundException_Exception e) {
            e.printStackTrace();
        }
    }
}

