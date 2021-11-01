package br.edu.utfpr.alomundo.service;


import br.edu.utfpr.alomundo.model.dao.UserDAO;
import br.edu.utfpr.alomundo.model.domain.User;
import br.edu.utfpr.alomundo.util.JPAUtil;

public class UserService extends AbstractService<Long, User> {
    public UserService() {

        dao = new UserDAO();
    }
}
