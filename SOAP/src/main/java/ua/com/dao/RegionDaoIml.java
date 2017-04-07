package ua.com.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.com.exceptions.InvalidInputException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Region;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class RegionDaoIml implements RegionDao {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Region create(Region entity) {
        manager.persist(entity);
        return entity;
    }

    @Override
    @Transactional
    public List<Region> getAll() throws NoEntityFoundException {
        TypedQuery<Region> query = manager.createQuery("SELECT c FROM Region c", Region.class);
        List<Region> regions = query.getResultList();
        return regions;
    }

    @Override
    @Transactional
    public Region findOne(Long aLong) throws InvalidInputException, NoEntityFoundException {
        List<Region> clans = getAll();
        Region region = clans.stream().filter(e -> e.getId() == aLong).findFirst().get();
        return region;
    }

    @Override
    @Transactional
    public Region delete(Long aLong) throws InvalidInputException, NoEntityFoundException {
        Region region = manager.find(Region.class, aLong);
        manager.remove(region);
        return region;
    }
}
