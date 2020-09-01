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

    @OneToMany(mappedBy = "character")
    private List<Character_class> character_classes;

    @OneToMany(mappedBy = "character")
    private List<Character_skill> character_skills;

    @OneToMany(mappedBy = "character")
    private List<Character_talent> character_talents;

    @OneToMany(mappedBy = "character")
    private List<Character_spell> character_spells;

    @OneToMany(mappedBy = "character")
    private List<Inventory_weapon> inventory_weapons;

    @OneToMany(mappedBy = "character")
    private List<Inventory_armor> inventory_armors;

    @OneToMany(mappedBy = "character")
    private List<Inventory_Item> inventory_items;

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

    public List<Character_class> getCharacter_classes() {

        return character_classes;
    }

    public void setCharacter_classes(List<Character_class> character_classes) {

        this.character_classes = character_classes;
    }

    public List<Character_skill> getCharacter_skills() {

        return character_skills;
    }

    public void setCharacter_skills(List<Character_skill> character_skills) {

        this.character_skills = character_skills;
    }

    public List<Character_talent> getCharacter_talents() {

        return character_talents;
    }

    public void setCharacter_talents(List<Character_talent> character_talents) {

        this.character_talents = character_talents;
    }

    public List<Character_spell> getCharacter_spells() {

        return character_spells;
    }

    public void setCharacter_spells(List<Character_spell> character_spells) {

        this.character_spells = character_spells;
    }

    public List<Inventory_weapon> getInventory_weapons() {

        return inventory_weapons;
    }

    public void setInventory_weapons(List<Inventory_weapon> inventory_weapons) {

        this.inventory_weapons = inventory_weapons;
    }

    public List<Inventory_armor> getInventory_armors() {

        return inventory_armors;
    }

    public void setInventory_armors(List<Inventory_armor> inventory_armors) {

        this.inventory_armors = inventory_armors;
    }

    public List<Inventory_Item> getInventory_items() {

        return inventory_items;
    }

    public void setInventory_items(List<Inventory_Item> inventory_items) {

        this.inventory_items = inventory_items;
    }
}
