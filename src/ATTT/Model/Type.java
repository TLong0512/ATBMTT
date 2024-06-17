/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Model;

import java.util.List;

/**
 *
 * @author longn
 */
public class Type {
    private Integer id;
    private String typeName,information;
    private List<Malware> list_malware;

    public Type(Integer id, String typeName, String information, List<Malware> list_malware) {
        this.id = id;
        this.typeName = typeName;
        this.information = information;
        this.list_malware = list_malware;
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

    public List<Malware> getList_malware() {
        return list_malware;
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

    public void setList_malware(List<Malware> list_malware) {
        this.list_malware = list_malware;
    }

    @Override
    public String toString() {
        return "Type{" + "id=" + id + ", typeName=" + typeName + ", information=" + information + ", list_malware=" + list_malware + '}';
    }
    
}
