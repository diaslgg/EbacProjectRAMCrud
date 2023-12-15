/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.dias.diaslgg.dao;

import br.com.dias.diaslgg.domain.User;
import java.util.Collection;

/**
 *
 * @author luis.dias
 */
public interface UserDAO {
    
    public Boolean signup(User client);
    
    public void delete(Long cpf);
    
    public void alter(User client);
    
    public User check(Long cpf);
    
    public Collection<User> getAll();
    
}
