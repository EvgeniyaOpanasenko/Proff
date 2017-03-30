package ua.com.dao;

import ua.com.exceptions.InvalidInputException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.NoAvaliableTableException;

import java.util.List;

/**
 * CRUD create, read, update, delete
 */
public interface Dao <T, ID>{
    T create(T entity) throws NoAvaliableTableException;
    List<T> getAll()throws NoAvaliableTableException, NoEntityFoundException;
    T findOne(ID id) throws InvalidInputException, NoEntityFoundException, NoAvaliableTableException;
    T delete(ID id)throws InvalidInputException, NoEntityFoundException;

}
