/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dias.diaslgg.domain;

import java.util.Objects;

/**
 *
 * @author luis.dias
 */
public class User {
    private String username;
    private String password;
    private String privileges = "User";
    private String name;
    private Long cpf;
    private Long phone;
    private String address;
    private Integer addressNumber;
    private String city;
    private String countryState;
    
    public User(String username, String password, String name, String cpf,
            String phone, String address, String addressNumber,
            String city, String countryState) {
        this.username = username;
        this.password = password;
        this.name = name.trim();
        this.cpf = Long.valueOf(cpf.trim());
        this.phone = Long.valueOf(phone.trim());
        this.address = address.trim();
        this.addressNumber = Integer.valueOf(addressNumber.trim());
        this.city = city.trim();
        this.countryState = countryState.trim();
        
    }
    
    public User(String username, String password, String name, String cpf,
            String phone, String address, String addressNumber,
            String city, String countryState, String privileges) {
        this(username, password, name, cpf, phone, address, addressNumber,
                city, countryState);
        if (privileges.equalsIgnoreCase("admin")) {
            this.privileges = "Admin";
        } else {
            this.privileges = "User";
        }
        
    } 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryState() {
        return countryState;
    }

    public void setCountryState(String countryState) {
        this.countryState = countryState;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        if (privileges.equalsIgnoreCase("admin")) {
            this.privileges = "Admin";
        } else {
            this.privileges = "User";
        }
        
        
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.cpf, other.cpf)){
            return false;
        }
        return true;
    }
    
    
}
