package controller;

import dataAccess.UserRepository;

public class UserController {
    private UserRepository repository;

    public UserController(){
        repository = new UserRepository();
    }

    public UserRepository getRepository() {
        return repository;
    }

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    public boolean matchEmailAndPassword(String email, String password) {
        boolean b = repository.selectUserByEmailAndPassword(email, password) != null;
        return b;
    }

}
