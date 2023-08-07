package edu.kosa.service;

import edu.kosa.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MemberServiceImpl implements CRUDService {

    private final MemberMapper mapper;

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
