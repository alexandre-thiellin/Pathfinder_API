insert into races values(0,"demi_elf","TODO");
insert into races values(0,"demi_orc","TODO");
insert into races values(0,"elfe","TODO");
insert into races values(0,"halfelin","TODO");
insert into races values(0,"gnome","TODO");
insert into races values(0,"humain","TODO");
insert into races values(0,"nain","TODO");

insert into classes values(0,"barbare","TODO");
insert into classes values(0,"barde","TODO");
insert into classes values(0,"druide","TODO");
insert into classes values(0,"ensorceleur","TODO");
insert into classes values(0,"guerrier","TODO");
insert into classes values(0,"magicien","TODO");
insert into classes values(0,"moine","TODO");
insert into classes values(0,"paladin","TODO");
insert into classes values(0,"pretre","TODO");
insert into classes values(0,"rodeur","TODO");
insert into classes values(0,"roublard","TODO");

insert into skills values(0,"Athlétisme",false,"Force","TODO");
insert into skills values(0,"Mobilité",false,"Dextérité","TODO");
insert into skills values(0,"Doigts de fée",true,"Dextérité","TODO");
insert into skills values(0,"Discrétion",false,"Dextérité","TODO");
insert into skills values(0,"Érudition (mystères)",true,"Intelligence","TODO");
insert into skills values(0,"Érudition (monde)",true,"Intelligence","TODO");
insert into skills values(0,"Connaissance (nature)",true,"Sagesse","TODO");
insert into skills values(0,"Connaissance (sacré)",true,"Sagesse","TODO");
insert into skills values(0,"Perception",false,"Sagesse","TODO");
insert into skills values(0,"Éloquence",false,"Charisme","TODO");
insert into skills values(0,"Utilisation d'objets magiques",true,"Charisme","TODO");

insert into talents values(0,"Écriture de parchemins","nls1","Création de parchemins magiques","TODO");
insert into talents values(0,"Incantation rapide","-","Lance le sort par une action rapide","TODO");

insert into spells values(0,"Agrandissement","Transmutation","Ens/Mag 1","1 round","V, G, M (une pincée de poudre de fer)","courte (7,5 m +1,5 m/2 niveaux)","1 créature humanoïde","-","1 minute/niveau (T)","Vigueur, annule",true,"TODO");
insert into spells values(0,"Projectile magique","Évocation","Ens/Mag 1","1 action simple","V, G","moyenne (30 m + 3 m/niveau)","Jusqu'à 5 créatures situées à 4,5 m ou moins les unes des autres","-","instantanée","aucun",true,"TODO");

insert into weapons values(0,"Dague","courante","corps_a_corps",200,"1d3","1d4","19-20/x2",0,500,"P ou T","-","TODO");
insert into weapons values(0,"Épée courte","guerre","corps_a_corps",1000,"1d4","1d6","19-20/x2",0,1000,"P","-","TODO");
insert into weapons values(0,"Épée longue","guerre","corps_a_corps",1500,"1d6","1d8","19-20/x2",0,2000,"T","-","TODO");
insert into weapons values(0,"Épée bâtarde","exotique","corps_a_corps",3500,"1d8","1d10","19-20/x2",0,3000,"T","-","TODO");

insert into armors values(0,"Armure de cuir","legere",1000,2,6,0,10,9,6,7500,"TODO");
insert into armors values(0,"Armure d'écailles","intermediaire",5000,5,3,-4,25,6,4.5,15000,"TODO");
insert into armors values(0,"Harnois","lourde",150000,9,1,-6,35,6,4.5,25000,"TODO");
insert into armors values(0,"Écu en acier","bouclier",2000,2,-1,-2,15,-1,-1,7500,"TODO");

insert into items values(0,"Torche",1,500,"TODO");
insert into items values(0,"Corde en chanvre, 15m",100,5000,"TODO");
insert into items values(0,"Rations de survie / 1 jour",50,500,"TODO");
insert into items values(0,"Tente",1000,10000,"TODO");

insert into characters values(0,"Horialt","nb",6,"homme",27,185,75,10,15,14,18,12,17,10,0,0,100,0,0);

insert into character_classes values(0,1,6,1);
insert into character_classes values(0,1,11,1);

insert into character_skills values(0,1,5,true,1);
insert into character_skills values(0,1,6,true,1);
insert into character_skills values(0,1,7,true,1);
insert into character_skills values(0,1,8,true,1);
insert into character_skills values(0,1,11,true,1);

insert into character_talents values(0,1,1);
insert into character_talents values(0,1,2);

insert into character_spells values(0,1,1);
insert into character_spells values(0,1,2);

insert into inventory_weapons values(0,1,1,true);
insert into inventory_weapons values(0,1,4,false);

insert into inventory_armors values(0,1,1,false);
insert into inventory_armors values(0,1,3,false);

insert into inventory_items values(0,1,1,false);
insert into inventory_items values(0,1,2,false);
insert into inventory_items values(0,1,3,false);
insert into inventory_items values(0,1,4,false);