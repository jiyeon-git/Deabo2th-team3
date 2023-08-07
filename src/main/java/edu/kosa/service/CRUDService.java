package edu.kosa.service;

import java.util.List;

public interface CRUDService {

    boolean create(Object object);

    List read(Object object);

    boolean update(Object object);

    boolean delete(Object object);
}
