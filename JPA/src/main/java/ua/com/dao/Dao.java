package ua.com.dao;

import ua.com.exceptions.InvalidInputException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.exceptions.noAvaliableTableException;

import java.util.List;

/**
 * CRUD create, read, update, delete
 */
public interface Dao <T, ID>{
    T create(T entity) throws noAvaliableTableException;
    List<T> getAll()throws noAvaliableTableException, NoEntityFoundException;
    T findOne(ID id) throws InvalidInputException, NoEntityFoundException;
    T delete(ID id)throws InvalidInputException, NoEntityFoundException;

}
