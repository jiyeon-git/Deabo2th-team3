package edu.kosa.service;

import edu.kosa.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements CRUDService {

    private final UserMapper mapper;
    private final BCryptPasswordEncoder encoder;

    @Override
    public boolean create(Object object) {
        Map<String, String> map = (Map<String, String>)object;
        map.put("password", encoder.encode(map.get("password")));
        return mapper.insertUser(map) >= 1;
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
