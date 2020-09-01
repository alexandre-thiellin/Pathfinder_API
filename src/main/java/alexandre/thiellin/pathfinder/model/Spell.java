package alexandre.thiellin.pathfinder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spells")
public class Spell {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String school;

    @Column(nullable = false)
    private String level;

    @Column(nullable = false)
    private String casting_time;

    @Column(nullable = false)
    private String Components;

    @Column(nullable = false)
    private String range;

    @Column(nullable = false)
    private String target;

    @Column(nullable = false)
    private String effect;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private String saving_throw;

    @Column(nullable = false)
    private boolean spell_resistance;

    @Column(nullable = false)
    private String description;

    public Spell() {

    }

    public Spell(long id, String name, String school, String level, String casting_time, String components, String range, String target, String effect, String duration, String saving_throw, boolean spell_resistance, String description) {

        this.id = id;
        this.name = name;
        this.school = school;
        this.level = level;
        this.casting_time = casting_time;
        Components = components;
        this.range = range;
        this.target = target;
        this.effect = effect;
        this.duration = duration;
        this.saving_throw = saving_throw;
        this.spell_resistance = spell_resistance;
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

    public String getSchool() {

        return school;
    }

    public void setSchool(String school) {

        this.school = school;
    }

    public String getLevel() {

        return level;
    }

    public void setLevel(String level) {

        this.level = level;
    }

    public String getCasting_time() {

        return casting_time;
    }

    public void setCasting_time(String casting_time) {

        this.casting_time = casting_time;
    }

    public String getComponents() {

        return Components;
    }

    public void setComponents(String components) {

        Components = components;
    }

    public String getRange() {

        return range;
    }

    public void setRange(String range) {

        this.range = range;
    }

    public String getTarget() {

        return target;
    }

    public void setTarget(String target) {

        this.target = target;
    }

    public String getEffect() {

        return effect;
    }

    public void setEffect(String effect) {

        this.effect = effect;
    }

    public String getDuration() {

        return duration;
    }

    public void setDuration(String duration) {

        this.duration = duration;
    }

    public String getSaving_throw() {

        return saving_throw;
    }

    public void setSaving_throw(String saving_throw) {

        this.saving_throw = saving_throw;
    }

    public boolean isSpell_resistance() {

        return spell_resistance;
    }

    public void setSpell_resistance(boolean spell_resistance) {

        this.spell_resistance = spell_resistance;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
