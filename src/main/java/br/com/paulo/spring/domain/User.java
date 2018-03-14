package br.com.paulo.spring.domain;

public class User {

   private long id;
   private String name;
   private String email;
   private String login;
   private String password;

   public User(String name, String email, String login){
       this.name = name;
       this.email = email;
       this.login = login;
   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
