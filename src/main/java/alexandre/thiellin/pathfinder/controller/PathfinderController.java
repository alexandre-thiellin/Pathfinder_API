package alexandre.thiellin.pathfinder.controller;

import alexandre.thiellin.pathfinder.model.*;
import alexandre.thiellin.pathfinder.model.Character;
import alexandre.thiellin.pathfinder.model.Class;
import alexandre.thiellin.pathfinder.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PathfinderController {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private TalentRepository talentRepository;

    @Autowired
    private SpellRepository spellRepository;

    @Autowired
    private WeaponRepository weaponRepository;

    @Autowired
    private ArmorRepository armorRepository;

    @Autowired
    private ItemRepository itemRepository;

    public PathfinderController() {
    }

    // --------------- CHARACTERS -----------------

    @GetMapping(path = "/characters")
    public List<Character> getCharacters() {

        return characterRepository.findAll();
    }

    @GetMapping(path = "/characters/id/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable long id) throws ResourceNotFoundException {

        Character character = characterRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(character);
    }

    @GetMapping(path = "/characters/name/{name}")
    public ResponseEntity<Character> getCharacterByName(@PathVariable String name) throws ResourceNotFoundException {

        Character character = characterRepository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("There is no resources with name : "+name));
        return ResponseEntity.ok().body(character);
    }

    // --------------- RACES -----------------

    @GetMapping(path = "/races")
    public List<Race> getRaces() {

        return raceRepository.findAll();
    }

    // --------------- CLASSES -----------------

    @GetMapping(path = "/classes")
    public List<Class> getClasses() {

        return classRepository.findAll();
    }

    // --------------- SKILLS -----------------

    @GetMapping(path = "/skills")
    public List<Skill> getSkills() {

        return skillRepository.findAll();
    }

    // --------------- TALENTS -----------------

    @GetMapping(path = "/talents")
    public List<Talent> getTalents() {

        return talentRepository.findAll();
    }

    // --------------- SPELLS -----------------

    @GetMapping(path = "/spells")
    public List<Spell> getSpells() {

        return spellRepository.findAll();
    }

    // --------------- WEAPONS -----------------

    @GetMapping(path = "/weapons")
    public List<Weapon> getWeapons() {

        return weaponRepository.findAll();
    }

    // --------------- ARMORS -----------------

    @GetMapping(path = "/armors")
    public List<Armor> getArmors() {

        return armorRepository.findAll();
    }

    // --------------- ITEMS -----------------

    @GetMapping(path = "/items")
    public List<Item> getItems() {

        return itemRepository.findAll();
    }
}
