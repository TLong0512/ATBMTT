/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Model;

/**
 *
 * @author longn
 */
public class Type {
    private Integer id;
    private String typeName,information;

    public Type(String typeName, String information) {
        this.typeName = typeName;
        this.information = information;
    }

    public Type() {
    }

    public Integer getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getInformation() {
        return information;
    }

    @Override
    public String toString() {
        return "Type{" + "id=" + id + ", typeName=" + typeName + ", information=" + information + '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
}
