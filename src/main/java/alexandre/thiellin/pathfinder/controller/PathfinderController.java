package alexandre.thiellin.pathfinder.controller;

import alexandre.thiellin.pathfinder.model.*;
import alexandre.thiellin.pathfinder.model.Character;
import alexandre.thiellin.pathfinder.model.Class;
import alexandre.thiellin.pathfinder.repository.*;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class PathfinderController {

    private final CharacterRepository characterRepository;
    private final RaceRepository raceRepository;
    private final ClassRepository classRepository;
    private final SkillRepository skillRepository;
    private final TalentRepository talentRepository;
    private final SpellRepository spellRepository;
    private final WeaponRepository weaponRepository;
    private final ArmorRepository armorRepository;
    private final ItemRepository itemRepository;

    public PathfinderController(CharacterRepository characterRepository, RaceRepository raceRepository, ClassRepository classRepository, SkillRepository skillRepository, TalentRepository talentRepository, SpellRepository spellRepository, WeaponRepository weaponRepository, ArmorRepository armorRepository, ItemRepository itemRepository) {
        this.characterRepository = characterRepository;
        this.raceRepository = raceRepository;
        this.classRepository = classRepository;
        this.skillRepository = skillRepository;
        this.talentRepository = talentRepository;
        this.spellRepository = spellRepository;
        this.weaponRepository = weaponRepository;
        this.armorRepository = armorRepository;
        this.itemRepository = itemRepository;
    }

    // --------------- CHARACTERS -----------------

    @GetMapping(path = "/characters")
    public List<Character> getCharacters() {

        return characterRepository.findAll();
    }

    @GetMapping(path = "/characters/overview")
    public Map<Long, String> getCharactersOverview(){
        List<Character> characters = characterRepository.findAll();
        Map<Long, String> overview = new HashMap<>();
        characters.forEach(c -> overview.put(c.getId(), c.getName()));
        return overview;
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

    @PostMapping(path = "/characters")
    public Character postCharacter(@Valid @RequestBody Character character) {

        character.getCharacters_classes().forEach(character_class -> character_class.setCharacter(character));
        character.getCharacters_skills().forEach(character_skill -> character_skill.setCharacter(character));
        character.getCharacters_talents().forEach(character_talent -> character_talent.setCharacter(character));
        character.getCharacters_spells().forEach(character_spell -> character_spell.setCharacter(character));
        character.getCharacters_weapons().forEach(character_weapon -> character_weapon.setCharacter(character));
        character.getCharacters_armors().forEach(character_armor -> character_armor.setCharacter(character));
        character.getCharacters_items().forEach(character_item -> character_item.setCharacter(character));

        characterRepository.save(character);

        return character;
    }

    // --------------- RACES -----------------

    @GetMapping(path = "/races")
    public List<Race> getRaces() {

        return raceRepository.findAll();
    }

    @GetMapping(path = "/races/id/{id}")
    public ResponseEntity<Race> getRaceById(@PathVariable long id) throws ResourceNotFoundException {

        Race race = raceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(race);
    }

    // --------------- CLASSES -----------------

    @GetMapping(path = "/classes")
    public List<Class> getClasses() {

        return classRepository.findAll();
    }

    @GetMapping(path = "/classes/id/{id}")
    public ResponseEntity<Class> getClassById(@PathVariable long id) throws ResourceNotFoundException {

        Class class_ = classRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(class_);
    }

    // --------------- SKILLS -----------------

    @GetMapping(path = "/skills")
    public List<Skill> getSkills() {

        return skillRepository.findAll();
    }

    @GetMapping(path = "/skills/id/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable long id) throws ResourceNotFoundException {

        Skill skill = skillRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(skill);
    }

    // --------------- TALENTS -----------------

    @GetMapping(path = "/talents")
    public List<Talent> getTalents() {

        return talentRepository.findAll();
    }

    @GetMapping(path = "/talents/id/{id}")
    public ResponseEntity<Talent> getTalentById(@PathVariable long id) throws ResourceNotFoundException {

        Talent talent = talentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(talent);
    }

    // --------------- SPELLS -----------------

    @GetMapping(path = "/spells")
    public List<Spell> getSpells() {

        return spellRepository.findAll();
    }

    @GetMapping(path = "/spells/id/{id}")
    public ResponseEntity<Spell> getSpellById(@PathVariable long id) throws ResourceNotFoundException {

        Spell spell = spellRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(spell);
    }

    // --------------- WEAPONS -----------------

    @GetMapping(path = "/weapons")
    public List<Weapon> getWeapons() {

        return weaponRepository.findAll();
    }

    @GetMapping(path = "/weapons/id/{id}")
    public ResponseEntity<Weapon> getWeaponById(@PathVariable long id) throws ResourceNotFoundException {

        Weapon weapon = weaponRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(weapon);
    }

    // --------------- ARMORS -----------------

    @GetMapping(path = "/armors")
    public List<Armor> getArmors() {

        return armorRepository.findAll();
    }

    @GetMapping(path = "/armors/id/{id}")
    public ResponseEntity<Armor> getArmorById(@PathVariable long id) throws ResourceNotFoundException {

        Armor armor = armorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(armor);
    }

    // --------------- ITEMS -----------------

    @GetMapping(path = "/items")
    public List<Item> getItems() {

        return itemRepository.findAll();
    }

    @GetMapping(path = "/items/id/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable long id) throws ResourceNotFoundException {

        Item item = itemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(item);
    }
}
