package ua.com.soap;

import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;
import ua.com.service.MainService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CandidateEndpoint  {

   /* @WebMethod
    @Override
    List<Candidate> getCandidatesByAge(int minAge, int maxAge) throws NoEntityFoundException;

    @WebMethod
    @Override
    List<Candidate> getAllCandidates() throws NoEntityFoundException;*/

    @WebMethod

    Candidate createCandidate(Candidate entity) throws RegisterException;

    @WebMethod

    Candidate findCandidate(long id) throws NoEntityFoundException;

   /* @WebMethod
    @Override
    Candidate login(String name) throws NoEntityFoundException;*/
}