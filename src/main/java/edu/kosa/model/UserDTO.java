package edu.kosa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Date;

public class UserDTO extends User {
    public UserDTO(String username, String password, boolean enabled, boolean accountNonExpired,
                   boolean credentialsNonExpired, boolean accountNonLocked,
                   Collection<? extends GrantedAuthority> authorities, String userid) {

        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.userid = userid;
    }

    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }


}
