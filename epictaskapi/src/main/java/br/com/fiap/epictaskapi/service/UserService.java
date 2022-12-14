package br.com.fiap.epictaskapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository repository;

    public Page<User> listAll(Pageable pageable){
       return repository.findAll(pageable);
    }

    public List<User> listAll(){
        return repository.findAll();
    }

    public void save(User user) {
        repository.save(user);
    }

    public Optional<User> getById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }





}
