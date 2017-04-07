package ua.com.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.com.exceptions.InvalidInputException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Clan;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class ClanDaoIml implements ClanDao {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Clan create(Clan entity) {
        manager.persist(entity);
        return entity;
    }

    @Override
    @Transactional
    public List<Clan> getAll() throws NoEntityFoundException {
        TypedQuery<Clan> query = manager.createQuery("SELECT c FROM Clan c", Clan.class);
        List<Clan> clans = query.getResultList();
        return clans;
    }

    @Override
    @Transactional
    public Clan findOne(Long aLong) throws InvalidInputException, NoEntityFoundException {
        List<Clan> clans = getAll();
        Clan clan = clans.stream().filter(e -> e.getId() == aLong).findFirst().get();
        return clan;
    }

    @Override
    @Transactional
    public Clan delete(Long aLong) throws InvalidInputException, NoEntityFoundException {
        Clan clan = manager.find(Clan.class, aLong);
        manager.remove(clan);
        return clan;
    }
}
