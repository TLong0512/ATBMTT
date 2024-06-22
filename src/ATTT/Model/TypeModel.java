/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Model;


/**
 *
 * @author longn
 */
public class TypeModel {
    private Integer id;
    private String typeName,information;


    public TypeModel(Integer id, String typeName, String information) {
        this.id = id;
        this.typeName = typeName;
        this.information = information;
    }

    public TypeModel(String typeName, String information) {
        this.typeName = typeName;
        this.information = information;
    }

    
    
    public TypeModel() {
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


    public void setId(Integer id) {
        this.id = id;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setInformation(String information) {
        this.information = information;
    }



    @Override
    public String toString() {
        return this.getTypeName();
    }
    
}
