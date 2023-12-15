/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dias.diaslgg.dao;

import br.com.dias.diaslgg.domain.User;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author luis.dias
 */
public class UserSetDAO implements UserDAO{
    
    private Set<User> set;
    
    public UserSetDAO() {
        this.set = new HashSet<>();
    }
    
    @Override
    public Boolean signup(User user) {
        return this.set.add(user);
    }
    
    @Override
    public void delete(Long cpf) {
        User searchedUser = null;
        for (User user : this.set) {
            if (user.getCpf().equals(cpf)) {
                searchedUser = user;
                break;
            }
        }
            
        if (searchedUser != null) {
                this.set.remove(searchedUser);
            }
        
    }
    
    @Override
    public void alter (User user) {
        if (this.set.contains(user)) {
            for (User signedupUser : this.set) {
                if (signedupUser.equals(user)) {
                    signedupUser.setName(user.getName());
                    signedupUser.setPhone(user.getPhone());
                    signedupUser.setAddress(user.getAddress());
                    signedupUser.
                            setAddressNumber(user.
                                    getAddressNumber());
                    signedupUser.setCity(user.getCity());
                    signedupUser.
                            setCountryState(user.
                                    getCountryState());
                    signedupUser.setPassword(user.getPassword());
                    signedupUser.setUsername(user.getUsername());
                    signedupUser.setPrivileges(user.getPrivileges());
                }
            }
        }
    }
    
    @Override
    public User check(Long cpf) {
        for (User signedupUser :this.set) {
            if (signedupUser.getCpf().equals(cpf)) {
                return signedupUser;
            }
        }        
            return null;        
    }
    
    @Override
    public Collection<User> getAll() {
        return this.set;
    }
}
