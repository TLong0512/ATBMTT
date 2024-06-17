/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Model;

/**
 *
 * @author longn
 */
public class Ranking {
    private Integer id, ranking;
    private String description;

    public Ranking() {
    }

    public Ranking( Integer ranking, String description) {
      
        this.ranking = ranking;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ranking{");
        sb.append("id=").append(id);
        sb.append(", ranking=").append(ranking);
        sb.append(", description=").append(description);
        sb.append('}');
        return sb.toString();
    }
    
}
