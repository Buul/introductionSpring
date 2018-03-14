package br.com.paulo.spring.service;

import br.com.paulo.spring.domain.Mailer;
import br.com.paulo.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private User user;

    @Autowired
    private Mailer mailer;

    public void setUser(User user) {
        this.user = user;
    }

    public void rememberPassByEmail(){
        mailer.setTo(user.getEmail());
        mailer.setMessage("the " + user.getLogin() + " user password is XXXXXX");
        mailer.sendEmail();
    }

}
