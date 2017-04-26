package ua.com.soap;

import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;
import ua.com.Fixtures.MainService;

import javax.jws.WebService;

@WebService(endpointInterface = "ua.com.soap.CandidateEndpoint")
public class CandidateEndpointImpl implements CandidateEndpoint {

    public CandidateEndpointImpl() {
    }

   public MainService service;

    public CandidateEndpointImpl(MainService service) {
        this.service = service;
    }

    @Override
    public Candidate createCandidate(Candidate entity) throws RegisterException {
        return service.createCandidate(entity);
    }

    @Override
    public Candidate findCandidate(long id) throws NoEntityFoundException {
        return service.findCandidate(id);
    }

  /*  @Override
    public Candidate login(String name) throws NoEntityFoundException {
        Candidate candidate = getAllCandidates().stream()
                .filter(x -> x.getName().equals(name)).findFirst().get();

        if (candidate == null) {
            throw new NoEntityFoundException("no user with login " + name);
        }

        return candidate;
    }*/

}
