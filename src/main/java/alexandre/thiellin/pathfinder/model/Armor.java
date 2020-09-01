package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "armors")
public class Armor {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int bonus_ca;

    @Column(nullable = false)
    private int max_dex_bonus;

    @Column(nullable = false)
    private int test_penalty;

    @Column(nullable = false)
    private int spell_failure_risk;

    @Column(nullable = false)
    private double speed_9;

    @Column(nullable = false)
    private double speed_6;

    @Column(nullable = false)
    private int weight;

    @Column(nullable = false)
    private String description;

    public Armor() {

    }

    public Armor(long id, String name, String category, int price, int bonus_ca, int max_dex_bonus, int test_penalty, int spell_failure_risk, double speed_9, double speed_6, int weight, String description) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.bonus_ca = bonus_ca;
        this.max_dex_bonus = max_dex_bonus;
        this.test_penalty = test_penalty;
        this.spell_failure_risk = spell_failure_risk;
        this.speed_9 = speed_9;
        this.speed_6 = speed_6;
        this.weight = weight;
        this.description = description;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public int getBonus_ca() {

        return bonus_ca;
    }

    public void setBonus_ca(int bonus_ca) {

        this.bonus_ca = bonus_ca;
    }

    public int getMax_dex_bonus() {

        return max_dex_bonus;
    }

    public void setMax_dex_bonus(int max_dex_bonus) {

        this.max_dex_bonus = max_dex_bonus;
    }

    public int getTest_penalty() {

        return test_penalty;
    }

    public void setTest_penalty(int test_penalty) {

        this.test_penalty = test_penalty;
    }

    public int getSpell_failure_risk() {

        return spell_failure_risk;
    }

    public void setSpell_failure_risk(int spell_failure_risk) {

        this.spell_failure_risk = spell_failure_risk;
    }

    public double getSpeed_9() {

        return speed_9;
    }

    public void setSpeed_9(double speed_9) {

        this.speed_9 = speed_9;
    }

    public double getSpeed_6() {

        return speed_6;
    }

    public void setSpeed_6(double speed_6) {

        this.speed_6 = speed_6;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
