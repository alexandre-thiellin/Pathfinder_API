DROP DATABASE IF EXISTS pathfinder;
CREATE DATABASE pathfinder;
USE pathfinder;
SET time_zone = "+01:00";

CREATE TABLE `races` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `characters` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `alignment` ENUM ('lb', 'nb', 'cb', 'ln', 'n', 'cn', 'lm', 'nm', 'cm') NOT NULL,
  `race_id` int NOT NULL,
  `gender` ENUM ('femme', 'homme') NOT NULL,
  `age` int NOT NULL,
  `height` int NOT NULL,
  `weight` int NOT NULL,
  `strength` int NOT NULL,
  `dexterity` int NOT NULL,
  `constitution` int NOT NULL,
  `intelligence` int NOT NULL,
  `wisdom` int NOT NULL,
  `charisma` int NOT NULL,
  `hp` int NOT NULL,
  `pc` int NOT NULL,
  `pa` int NOT NULL,
  `po` int NOT NULL,
  `pp` int NOT NULL,
  `exp` int NOT NULL
);

CREATE TABLE `classes` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `character_classes` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `character_id` int NOT NULL,
  `class_id` int NOT NULL,
  `lvl` int NOT NULL
);

CREATE TABLE `weapons` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `category` ENUM ('courante', 'guerre', 'exotique') NOT NULL,
  `range_cat` ENUM ('corps_a_corps', 'distance') NOT NULL,
  `price` int NOT NULL,
  `damage_p` varchar(255) NOT NULL,
  `damage_m` varchar(255) NOT NULL,
  `critical` varchar(255) NOT NULL,
  `range` int NOT NULL,
  `weight` int NOT NULL,
  `damage_type` ENUM ('T', 'P', 'C', 'P ou T', 'C et P', 'P ou C', 'C ou P') NOT NULL,
  `special` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `armors` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `category` ENUM ('legere', 'intermediaire', 'lourde', 'bouclier') NOT NULL,
  `price` int NOT NULL,
  `bonus_ca` int NOT NULL,
  `max_dex_bonus` int NOT NULL,
  `test_penalty` int NOT NULL,
  `spell_failure_risk` int NOT NULL,
  `speed_9` double NOT NULL,
  `speed_6` double NOT NULL,
  `weight` int NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `items` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `price` int NOT NULL,
  `weight` int NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `character_weapons` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `character_id` int NOT NULL,
  `weapon_id` int NOT NULL,
  `equipped` boolean NOT NULL
);

CREATE TABLE `character_armors` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `character_id` int NOT NULL,
  `armor_id` int NOT NULL,
  `equipped` boolean NOT NULL
);

CREATE TABLE `character_items` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `character_id` int NOT NULL,
  `item_id` int NOT NULL,
  `equipped` boolean NOT NULL
);

CREATE TABLE `talents` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `conditions` varchar(255) NOT NULL,
  `advantages` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `character_talents` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `character_id` int NOT NULL,
  `talent_id` int NOT NULL
);

CREATE TABLE `skills` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `require_training` boolean NOT NULL,
  `attribute` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `character_skills` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `character_id` int NOT NULL,
  `skill_id` int NOT NULL,
  `class_skill` boolean NOT NULL,
  `rank` int NOT NULL
);

CREATE TABLE `spells` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `school` varchar(255) NOT NULL,
  `level` varchar(255) NOT NULL,
  `casting_time` varchar(255) NOT NULL,
  `components` varchar(255) NOT NULL,
  `range` varchar(255) NOT NULL,
  `target` varchar(255) NOT NULL,
  `effect` varchar(255) NOT NULL,
  `duration` varchar(255) NOT NULL,
  `saving_throw` varchar(255) NOT NULL,
  `spell_resistance` boolean NOT NULL,
  `description` varchar(255) NOT NULL
);

CREATE TABLE `character_spells` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `character_id` int NOT NULL,
  `spell_id` int NOT NULL
);

ALTER TABLE `characters` ADD FOREIGN KEY (`race_id`) REFERENCES `races` (`id`);

ALTER TABLE `character_classes` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_classes` ADD FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`);

ALTER TABLE `character_weapons` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_weapons` ADD FOREIGN KEY (`weapon_id`) REFERENCES `weapons` (`id`);

ALTER TABLE `character_armors` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_armors` ADD FOREIGN KEY (`armor_id`) REFERENCES `armors` (`id`);

ALTER TABLE `character_items` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_items` ADD FOREIGN KEY (`item_id`) REFERENCES `items` (`id`);

ALTER TABLE `character_talents` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_talents` ADD FOREIGN KEY (`talent_id`) REFERENCES `talents` (`id`);

ALTER TABLE `character_skills` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_skills` ADD FOREIGN KEY (`skill_id`) REFERENCES `skills` (`id`);

ALTER TABLE `character_spells` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_spells` ADD FOREIGN KEY (`spell_id`) REFERENCES `spells` (`id`);
