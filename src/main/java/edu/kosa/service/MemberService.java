package edu.kosa.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements CRUDService {

    @Override
    public boolean create(Object object) {
        return false;
    }

    @Override
    public List read(Object object) {
        return null;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }
}
