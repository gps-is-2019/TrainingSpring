package it.unisa.C9Tutorial.authentication.configuration;

import it.unisa.C9Tutorial.authentication.dao.UserDao;
import it.unisa.C9Tutorial.authentication.domain.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @NonNull
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User selectedUser = userDao.findByEmail(s);
        UserDetails details =  new UserDetailImpl(selectedUser);

        return details;
    }
}
