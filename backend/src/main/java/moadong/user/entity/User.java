package moadong.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import moadong.user.entity.enums.UserStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

@Entity
public class User implements UserDetails {
    @Id
    private String id;
    @NotNull
    @Email
    @Size(min = 5,max = 50)
    private String email;
    @NotNull
    @Size(min = 8,max = 20)
    private String password;
    @NotNull
    private Boolean emailVerified = false;
    @NotNull
    private Date createdAt;
    @NotNull
    private Date lastLoginAt;
    @NotNull
    private UserStatus status;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }
}
