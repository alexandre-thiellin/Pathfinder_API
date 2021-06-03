package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String alignment;

    @ManyToOne
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private int height;

    @Column(nullable = false)
    private int weight;

    @Column(nullable = false)
    private int strength;

    @Column(nullable = false)
    private int dexterity;

    @Column(nullable = false)
    private int constitution;

    @Column(nullable = false)
    private int intelligence;

    @Column(nullable = false)
    private int wisdom;

    @Column(nullable = false)
    private int charisma;

    @Column(nullable = false)
    private int hp;

    @Column(nullable = false)
    private int pc;

    @Column(nullable = false)
    private int pa;

    @Column(nullable = false)
    private int po;

    @Column(nullable = false)
    private int pp;

    @Column(nullable = false)
    private int exp;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Character_class> characters_classes;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Character_skill> characters_skills;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Character_talent> characters_talents;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Character_spell> characters_spells;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Character_weapon> characters_weapons;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Character_armor> characters_armors;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Character_Item> characters_items;

    public Character(){}

    public Character(int id, String name, String alignment, Race race, String gender, int age, int height, int weight, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int hp, int pc, int pa, int po, int pp, int exp) {

        this.id = id;
        this.name = name;
        this.alignment = alignment;
        this.race = race;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.hp = hp;
        this.pc = pc;
        this.pa = pa;
        this.po = po;
        this.pp = pp;
        this.exp = exp;
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

    public String getAlignment() {

        return alignment;
    }

    public void setAlignment(String alignment) {

        this.alignment = alignment;
    }

    public Race getRace() {

        return race;
    }

    public void setRace(Race race) {

        this.race = race;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {

        this.strength = strength;
    }

    public int getDexterity() {

        return dexterity;
    }

    public void setDexterity(int dexterity) {

        this.dexterity = dexterity;
    }

    public int getConstitution() {

        return constitution;
    }

    public void setConstitution(int constitution) {

        this.constitution = constitution;
    }

    public int getIntelligence() {

        return intelligence;
    }

    public void setIntelligence(int intelligence) {

        this.intelligence = intelligence;
    }

    public int getWisdom() {

        return wisdom;
    }

    public void setWisdom(int wisdom) {

        this.wisdom = wisdom;
    }

    public int getCharisma() {

        return charisma;
    }

    public void setCharisma(int charisma) {

        this.charisma = charisma;
    }

    public int getHp() {

        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public int getPc() {

        return pc;
    }

    public void setPc(int pc) {

        this.pc = pc;
    }

    public int getPa() {

        return pa;
    }

    public void setPa(int pa) {

        this.pa = pa;
    }

    public int getPo() {

        return po;
    }

    public void setPo(int po) {

        this.po = po;
    }

    public int getPp() {

        return pp;
    }

    public void setPp(int pp) {

        this.pp = pp;
    }

    public int getExp() {

        return exp;
    }

    public void setExp(int exp) {

        this.exp = exp;
    }

    public List<Character_class> getCharacters_classes() {

        return characters_classes;
    }

    public void setCharacters_classes(List<Character_class> characters_classes) {

        this.characters_classes = characters_classes;
    }

    public List<Character_skill> getCharacters_skills() {

        return characters_skills;
    }

    public void setCharacters_skills(List<Character_skill> characters_skills) {

        this.characters_skills = characters_skills;
    }

    public List<Character_talent> getCharacters_talents() {

        return characters_talents;
    }

    public void setCharacters_talents(List<Character_talent> characters_talents) {

        this.characters_talents = characters_talents;
    }

    public List<Character_spell> getCharacters_spells() {

        return characters_spells;
    }

    public void setCharacters_spells(List<Character_spell> characters_spells) {

        this.characters_spells = characters_spells;
    }

    public List<Character_weapon> getCharacters_weapons() {
        return characters_weapons;
    }

    public void setCharacters_weapons(List<Character_weapon> characters_weapons) {
        this.characters_weapons = characters_weapons;
    }

    public List<Character_armor> getCharacters_armors() {
        return characters_armors;
    }

    public void setCharacters_armors(List<Character_armor> characters_armors) {
        this.characters_armors = characters_armors;
    }

    public List<Character_Item> getCharacters_items() {
        return characters_items;
    }

    public void setCharacters_items(List<Character_Item> characters_items) {
        this.characters_items = characters_items;
    }
}
