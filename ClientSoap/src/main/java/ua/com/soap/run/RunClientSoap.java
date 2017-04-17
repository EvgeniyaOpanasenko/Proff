package ua.com.soap.run;

import ua.com.soap.Candidate;
import ua.com.soap.CandidateEndpoint;
import ua.com.soap.CandidateEndpointImplService;
import ua.com.soap.NoEntityFoundException_Exception;


public class RunClientSoap {
    public static void main(String[] args) {
        CandidateEndpoint candidateEndpoint =
                new CandidateEndpointImplService().getCandidateEndpointImplPort();

        try {
            Candidate candidate = candidateEndpoint.findCandidate(1);
            System.out.printf("id %s, name %s/n", candidate.getId(),
                    candidate.getName(), candidate.getAge());
        } catch (NoEntityFoundException_Exception e) {
            e.printStackTrace();
        }
    }
}
