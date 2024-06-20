/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Model;

/**
 *
 * @author longn
 */
public class AdminModel {
    private String username, password, name;
    private Integer id;

    public AdminModel() {
    }

    public AdminModel(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Admin: ");
        sb.append("username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", id=").append(id);

        return sb.toString();
    }
}
