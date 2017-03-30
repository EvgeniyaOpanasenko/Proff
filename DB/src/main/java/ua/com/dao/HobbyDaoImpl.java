package ua.com.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.com.exceptions.InvalidInputException;
import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Clan;
import ua.com.model.Hobby;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class HobbyDaoImpl implements HobbyDao {

    @PersistenceContext
    private EntityManager manager;


    @Override
    @Transactional
    public Hobby create(Hobby entity) throws NoAvaliableTableException {
        manager.persist(entity);
        return entity;
    }

    @Override
    @Transactional
    public List<Hobby> getAll() throws NoAvaliableTableException, NoEntityFoundException {
        TypedQuery<Hobby> query = manager.createQuery("SELECT c FROM Hobby c", Hobby.class);
        List<Hobby> hobbies = query.getResultList();
        return hobbies;
    }

    @Override
    @Transactional
    public Hobby findOne(Long aLong) throws InvalidInputException, NoEntityFoundException, NoAvaliableTableException {
        List<Hobby> clans = getAll();
        Hobby hobby = clans.stream().filter(e -> e.getId() == aLong).findFirst().get();
        return hobby;
    }

    @Override
    @Transactional
    public Hobby delete(Long aLong) throws InvalidInputException, NoEntityFoundException {
        Hobby hobby = manager.find(Hobby.class, aLong);
        manager.remove(hobby);
        return hobby;
    }
}
