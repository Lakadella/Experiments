package dcc;

import tools.*;

public class OccupationDCC {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		}
		
		public static void Item() {
			int item = Diceroller.dx(1, 24);
			
			String equip = "null";
			switch(item) {
			
			case 1 : equip = "Backpack"; break;
			case 2 : equip = "Candle"; break;
			case 3 : equip = "Chain, 10’ "; break;
			case 4 : equip = "Chalk, 1 piece"; break;
			case 5 : equip = "Chest, empty"; break;
			case 6 : equip = "Crowbar"; break;
			case 7 : equip = "Flask, empty "; break;
			case 8 : equip = "Flint & steel"; break;
			case 9 : equip = "Grappling hook"; break;
			case 10 : equip = "Hammer, small"; break;
			case 11 : equip = "Holy Symbol"; break;
			case 12 : equip = "Holy water, 1 vial"; break;
			case 13 : equip = "Iron spikes"; break;
			case 14 : equip = "Lantern"; break;
			case 15 : equip = "Mirror, hand-sized"; break;
			case 16 : equip = "Oil, 1 flask"; break;
			case 17 : equip = "Pole, 10-foot "; break;
			case 18 : equip = "Rations"; break;
			case 19 : equip = "Rope, 50’"; break;
			case 20 : equip = "Sack, large"; break;
			case 21 : equip = "Sack, small"; break;
			case 22 : equip = "Thieves’ tools"; break;
			case 23 : equip = "Torch"; break;
			case 24 : equip = "Waterskin "; break;
			default : System.out.println("Error");
			}
		System.out.println("You have " + equip);
		}
		
		
		public static String weaponBackground(int random) {
			
		
			String job = "null";
			String weapon = "null";
			String goods = "null";
			
			
			switch(random){
				
			case 1 : job = "Alchemist"; weapon = "Staff"; goods = "Oil, 1 flask"; break;
			case 2 : job = "Animal trainer "; weapon = "Club"; goods = "Pony"; break;
			case 3 : job = "Armorer "; weapon = "Club"; goods = "Iron helmet"; break;
			case 4 : job = "Astrologer "; weapon = "Dagger"; goods = "Spyglass"; break;
			case 5 : job = "Barber" ; weapon = "Dagger"; goods = "Scissors"; break;
			case 6 : job = "Beadle"; weapon = "Staff"; goods = "Holy Symbol"; break;
			case 7 : job = "Beekeeper"; weapon = "Staff"; goods = "Jar of honey"; break;
			case 8 : job = "Blacksmith"; weapon = "Club"; goods = "Steel tongs"; break;
			case 9 : job = "Butcher"; weapon = "Handaxe"; goods = "Side of beef"; break;
			case 10 : job = "Caravan guard "; weapon = "Short Sword"; goods = "Linen, 1 yard"; break;
			case 11 : job = "Cheesemaker"; weapon = "Staff"; goods = "Stinky cheese"; break;
			case 12 : job = "Cobbler "; weapon = "Dagger"; goods = "Shoehorn"; break;
			case 13 : job = "Confidence artist"; weapon = "Dagger"; goods = "Quality cloak"; break;
			case 14 : job = "Cooper"; weapon = "Club"; goods = "Barrel"; break;
			case 15 : job = "Costermonger"; weapon = "Dagger"; goods = "Fruit"; break;
			case 16 : job = "Cutpurse"; weapon = "Dagger"; goods = "Small chest"; break;
			case 17 : job = "Ditch digger"; weapon = "Staff"; goods = "Fine dirt, 1 lb"; break;
			case 18 : job = "Dockworker"; weapon = "Staff"; goods = "Book"; break;
			case 19 : job = "Dwarven Apothecarist"; weapon = "Staff"; goods = "Steel Vial"; break;
			case 20 : job = "Dwarven blacksmith"; weapon = "Club"; goods = "Mithril, 1 oz."; break;
			case 21 : job = "Dwarven chestmaker"; weapon = "Dagger"; goods = "Wood, 10lbs"; break;
			case 22 : job = "Dwarven herder "; weapon = "Staff"; goods = "Sow"; break;
			case 23 :  
			case 24 : job = "Dwarven miner"; weapon = "Club"; goods = "Lantern"; break;
			case 25 : job = "Dwarven Mushroom-farmer"; weapon = "Staff"; goods = "Sack"; break;
			case 26 : job = "Dwarven Rat-catcher"; weapon = "Club"; goods = "Net"; break;
			case 27 : 
			case 28 : job = "Dwarven Stone-Mason"; weapon = "Club"; goods = "Fine Stone, 10lbs"; break;
			case 29 : job = "Elven artisan "; weapon = "Staff"; goods = "Clay, 1 lb."; break;
			case 30 : job = "Elven Barrister"; weapon = "Dart"; goods = "Book"; break;
			case 31 : job = "Elven Chandler"; weapon = "Dagger"; goods = "Candles, 20"; break;
			case 32 : job = "Elven Falconer"; weapon = "Dagger"; goods = "Falcon"; break;
			case 33 :
			case 34 : job = "Elven forester "; weapon = "Staff"; goods = "Herbs, 1 lb"; break;
			case 35 : job = "Elven glassblower"; weapon = "Club"; goods = "Glass beads"; break;
			case 36 : job = "Elven Navigator"; weapon = "Shortbow"; goods = "Spyglass"; break;
			case 37 : 
			case 38 : job = "Elven sage "; weapon = "Dagger"; goods = "Parchment and quill pen"; break;
			case 39 : 
			case 40 :
			case 41 :
			case 42 :
			case 43 :
			case 44 :
			case 45 :
			case 46 :
			case 47 : job = "farmer"; weapon = "Spear"; goods = "Hen"; break;
			case 48 : job = "Fortune-teller"; weapon = "Dagger"; goods = "Tarot deck"; break;
			case 49 : job = "Gambler"; weapon = "Club"; goods = "dice"; break;
			case 50 : job = "Gongfarmer "; weapon = "Dagger"; goods = "Sack of night soil"; break;
			case 51 :
			case 52 : job = "Grave Digger"; weapon = "Staff"; goods = "Trovel"; break;
			case 53 : 
			case 54 : job = "Guild Beggar"; weapon = "Sling" ; goods = "Crutches"; break;
			case 55 : job = "Halfling Chicken Butcher"; weapon = "Handaxe"; goods = "Chicken Meat, 5lbs"; break;
			case 56 : 
			case 57 : job = "Halfling Dyer"; weapon = "Staff"; goods = "Fabric, 2 yards"; break;
			case 58 : job = "Halfling Glovemaker"; weapon = "Dagger"; goods = "Gloves, 4 pairs"; break;
			case 59 : job = "Halfling gypsy"; weapon = "Sling"; goods = "Hex Doll"; break;
			case 60 : 
			case 61 : 
			case 62 : job = "Halfling trader"; weapon = "Short Sword"; goods = "20 sp"; break;
			case 63 : 
			case 64 : job = "Halfling vagrant"; weapon = "Club"; goods = "Begging Bowl"; break;
			case 65 : job = "Healer"; weapon = "Club"; goods = "Holy Water, 1 vial"; break;
			case 66 : job = "Herbalist"; weapon = "Club"; goods = "Herbs"; break;
			case 67 : 
			case 68 : 
			case 69 : job = "Herder"; weapon = "Staff"; goods = "Herding Dog"; break;
			case 70 :
			case 71 :
			case 72 : job = "Hunter"; weapon = "Shortbow"; goods = "Deer pelt"; break;
			case 73 : job = "Indentured servant"; weapon = "Staff"; goods = "Locket"; break;
			case 74 : job = "Jester"; weapon = "Dart"; goods = "Silk Clothes"; break;
			case 75 : job = "Jeweler"; weapon = "Dagger"; goods = "Gem worth 20 gp"; break;
			case 76 : job = "Locksmith"; weapon = "Dagger"; goods = "Fine tools"; break;
			case 77 : job = "Mercenary"; weapon = "Longsword"; goods = "Hide armor"; break;
			case 78 : job = "Miller/Baker"; weapon = "Club"; goods = "Flour, 1 lb"; break;
			case 79 : job = "Minstrel"; weapon = "Dagger"; goods = "Ukulele"; break;
			case 80 : job = "Noble"; weapon = "Longsword"; goods = "Gold ring worth 20 gp"; break;
			case 81 : job = "Orphan"; weapon = "Club"; goods = "Rag doll"; break;
			case 82 : job = "Ostler"; weapon = "Staff"; goods = "Bridle"; break;
			case 83 : job = "Outlaw"; weapon = "Short Sword"; goods = "Leather Armor"; break;
			case 84 : job = "Scribe"; weapon = "Dart"; goods = "Parchment, 10 sheets"; break;
			case 85 : job = "Shaman"; weapon = "Club"; goods = "Herbs, 1 lb"; break;
			case 86 : job = "Slave"; weapon = "Club"; goods = "Strange looking rock"; break;
			case 87 : job = "Smuggler"; weapon = "Sling"; goods = "Waterproof Sack"; break;
			case 88 :
			case 89 : job = "Soldier"; weapon = "Spear"; goods = "Shield"; break;
			case 90 : 
			case 91 : job = "Squire"; weapon = "Longsword"; goods = "Steel helmet"; break;
			case 92 : 
			case 93 : job = "Trapper"; weapon = "Sling"; goods = "Badger Pelt"; break;
			case 94 : job = "Urchin"; weapon = "Club"; goods = "Begging bowl"; break;
			case 95 : job = "Wainwright"; weapon = "Club"; goods = "Pushcart"; break;
			case 96 : job = "Weaver"; weapon = "Dagger"; goods = "Fine suit of clothes"; break;
			case 97 : job = "Wizards apprentice"; weapon = "Dagger"; goods = "Black grimoire"; break;
			case 98 :
			case 99 :
			case 100 : job = "Woodcutter"; weapon = "Handaxe"; goods = "Bundle of wood"; break;
			default : System.out.println("Error");		
			}
			System.out.println("You are a " + job + " with a " + weapon + " and " + goods);
			return weapon;
		}

		public static void Luck() {
			
			int luckroll = Diceroller.dx(1, 30);
			String luckMod = "null";
			String starSign = "null";
			
			switch(luckroll){
				
			case 1 : starSign = "Harsh winter"; luckMod = "All attack rolls"; break;
			case 2 : starSign = "Taurus"; luckMod = "Melee attack rolls"; break;
			case 3 : starSign = "Fortunate date"; luckMod = "Missile fire attack rolls"; break;
			case 4 : starSign = "Raised by wolves"; luckMod = "Unarmed attack rolls"; break;
			case 5 : starSign = "Conceived on horseback"; luckMod = "Mounted attack rolls"; break;
			case 6 : starSign = "Born on the battlefield"; luckMod = "Damage rolls"; break;
			case 7 : starSign = "Path of the bear"; luckMod = "Melee damage rolls"; break;
			case 8 : starSign = "Hawkeye"; luckMod = "Missile fire damage rolls"; break;
			case 9 : starSign = "Pack hunter"; luckMod = "Attack and damage rolls for 0-level\r\n" + 
					"trained weapon"; break;
			case 10 : starSign = "Born under the loom"; luckMod = "Skill checks"; break;
			case 11 : starSign = "Fox’s cunning"; luckMod = "Find/disable traps"; break;
			case 12 : starSign = "Four-leafed clover:"; luckMod = "Find secret doors"; break;
			case 13 : starSign = "Seventh son"; luckMod = "Spell Checks"; break;
			case 14 : starSign = "The raging storm"; luckMod = "Spell damage"; break;
			case 15 : starSign = "Righteous heart"; luckMod = "Turn unholy checks"; break;
			case 16 : starSign = "Survived the plague"; luckMod = "Medical healing"; break;
			case 17 : starSign = "Lucky sign"; luckMod = "Saving throws"; break;
			case 18 : starSign = "Guardian angel"; luckMod = "Savings throws to escape traps"; break;
			case 19 : starSign = "Survived a spider bite"; luckMod = "Saving throws against poison"; break;
			case 20 : starSign = "Struck by lightning"; luckMod = "Reflex saving throws"; break;
			case 21 : starSign = "Lived through famine"; luckMod = "Fortitude saving throws"; break;
			case 22 : starSign = "Resisted temptation"; luckMod = "Willpower saving throws"; break;
			case 23 : starSign = "Charmed house"; luckMod = "Armor Class"; break;
			case 24 : starSign = "Speed of the cobra"; luckMod = "Intiative"; break;
			case 25 : starSign = "Bountiful harvest"; luckMod = "Hit points(Applies at every level"; break;
			case 26 : starSign = "Warrior’s arm"; luckMod = "Critical hit rolls"; break;
			case 27 : starSign = "Unholy house"; luckMod = "Corruption rolls"; break;
			case 28 : starSign = "The Broken Star"; luckMod = "Fumbles"; break;
			case 29 : starSign = "Birdsong"; luckMod = "Number of languages"; break;
			case 30 : starSign = "Wild child"; luckMod = "+ 5 ft speed pr modifier"; break;
			default : System.out.print("Error"); break;
			
				
			}
			System.out.println("Your birthsign is " + starSign + " so your luck modifier applies to " + luckMod);
			}
		
		public static String Background(int random) {
			
			
			String job = "null";
			String weapon = "null";
			String goods = "null";
			
			
			switch(random){
				
			case 1 : job = "Alchemist"; weapon = "Staff"; goods = "Oil, 1 flask"; break;
			case 2 : job = "Animal trainer "; weapon = "Club"; goods = "Pony"; break;
			case 3 : job = "Armorer "; weapon = "Hammer"; goods = "Iron helmet"; break;
			case 4 : job = "Astrologer "; weapon = "Dagger"; goods = "Spyglass"; break;
			case 5 : job = "Barber" ; weapon = "Razor"; goods = "Scissors"; break;
			case 6 : job = "Beadle"; weapon = "Staff"; goods = "Holy Symbol"; break;
			case 7 : job = "Beekeeper"; weapon = "Staff"; goods = "Jar of honey"; break;
			case 8 : job = "Blacksmith"; weapon = "Hammer "; goods = "Steel tongs"; break;
			case 9 : job = "Butcher"; weapon = "Cleaver"; goods = "Side of beef"; break;
			case 10 : job = "Caravan guard "; weapon = "Short sword "; goods = "Linen, 1 yard"; break;
			case 11 : job = "Cheesemaker"; weapon = "Cudgel"; goods = "Stinky cheese"; break;
			case 12 : job = "Cobbler "; weapon = "Awl"; goods = "Shoehorn"; break;
			case 13 : job = "Confidence artist"; weapon = "Dagger "; goods = "Quality cloak"; break;
			case 14 : job = "Cooper"; weapon = "Crowbar"; goods = "Barrel"; break;
			case 15 : job = "Costermonger"; weapon = "Knife"; goods = "Fruit"; break;
			case 16 : job = "Cutpurse"; weapon = "Dagger"; goods = "Small chest"; break;
			case 17 : job = "Ditch digger"; weapon = "Shovel"; goods = "Fine dirt, 1 lb"; break;
			case 18 : job = "Dockworker"; weapon = "Pole"; goods = "Book"; break;
			case 19 : job = "Dwarven Apothecarist"; weapon = "Cudgel"; goods = "Steel Vial"; break;
			case 20 : job = "Dwarven blacksmith"; weapon = "Hammer"; goods = "Mithril, 1 oz."; break;
			case 21 : job = "Dwarven chestmaker"; weapon = "Chisel"; goods = "Wood, 10lbs"; break;
			case 22 : job = "Dwarven herder "; weapon = "Staff"; goods = "Sow"; break;
			case 23 :  
			case 24 : job = "Dwarven miner"; weapon = "Pick"; goods = "Lantern"; break;
			case 25 : job = "Dwarven Mushroom-farmer"; weapon = "Shovel"; goods = "Sack"; break;
			case 26 : job = "Dwarven Rat-catcher"; weapon = "Club"; goods = "Net"; break;
			case 27 : 
			case 28 : job = "Dwarven Stone-Mason"; weapon = "Hammer"; goods = "Fine Stone, 10lbs"; break;
			case 29 : job = "Elven artisan "; weapon = "Staff "; goods = "Clay, 1 lb."; break;
			case 30 : job = "Elven Barrister"; weapon = "Quill"; goods = "Book"; break;
			case 31 : job = "Elven Chandler"; weapon = "Scissors"; goods = "Candles, 20"; break;
			case 32 : job = "Elven Falconer"; weapon = "Dagger"; goods = "Falcon"; break;
			case 33 :
			case 34 : job = "Elven forester "; weapon = "Staff"; goods = "Herbs, 1 lb"; break;
			case 35 : job = "Elven glassblower"; weapon = "Hammer"; goods = "Glass beads"; break;
			case 36 : job = "Elven Navigator"; weapon = "Shortbow"; goods = "Spyglass"; break;
			case 37 : 
			case 38 : job = "Elven sage "; weapon = "Dagger"; goods = "Parchment and quill pen"; break;
			case 39 : 
			case 40 :
			case 41 :
			case 42 :
			case 43 :
			case 44 :
			case 45 :
			case 46 :
			case 47 : job = "farmer"; weapon = "Pitchfork"; goods = "Hen"; break;
			case 48 : job = "Fortune-teller"; weapon = "Dagger"; goods = "Tarot deck"; break;
			case 49 : job = "Gambler"; weapon = "Club"; goods = "dice"; break;
			case 50 : job = "Gongfarmer "; weapon = "Trowel"; goods = "Sack of night soil"; break;
			case 51 :
			case 52 : job = "Grave Digger"; weapon = "Shovel"; goods = "Trovel"; break;
			case 53 : 
			case 54 : job = "Guild Beggar"; weapon = "Sling" ; goods = "Crutches"; break;
			case 55 : job = "Halfling Chicken Butcher"; weapon = "Hand axe"; goods = "Chicken Meat, 5lbs"; break;
			case 56 : 
			case 57 : job = "Halfling Dyer"; weapon = "Staff"; goods = "Fabric, 2 yards"; break;
			case 58 : job = "Halfling Glovemaker"; weapon = "Awl"; goods = "Gloves, 4 pairs"; break;
			case 59 : job = "Halfling gypsy"; weapon = "Sling"; goods = "Hex Doll"; break;
			case 60 : 
			case 61 : 
			case 62 : job = "Halfling trader"; weapon = "Short Sword"; goods = "20 sp"; break;
			case 63 : 
			case 64 : job = "Halfling vagrant"; weapon = "Club"; goods = "Begging Bowl"; break;
			case 65 : job = "Healer"; weapon = "Club"; goods = "Holy Water, 1 vial"; break;
			case 66 : job = "Herbalist"; weapon = "Club"; goods = "Herbs"; break;
			case 67 : 
			case 68 : 
			case 69 : job = "Herder"; weapon = "Staff"; goods = "Herding Dog"; break;
			case 70 :
			case 71 :
			case 72 : job = "Hunter"; weapon = "Shortbow"; goods = "Deer pelt"; break;
			case 73 : job = "Indentured servant"; weapon = "Staff"; goods = "Locket"; break;
			case 74 : job = "Jester"; weapon = "Dart"; goods = "Silk Clothes"; break;
			case 75 : job = "Jeweler"; weapon = "Dagger"; goods = "Gem worth 20 gp"; break;
			case 76 : job = "Locksmith"; weapon = " Dagger"; goods = "Fine tools"; break;
			case 77 : job = "Mercenary"; weapon = "Longsword"; goods = "Hide armor"; break;
			case 78 : job = "Miller/Baker"; weapon = "Club"; goods = "Flour, 1 lb"; break;
			case 79 : job = "Minstrel"; weapon = "Dagger"; goods = "Ukulele"; break;
			case 80 : job = "Noble"; weapon = "Longsword"; goods = "Gold ring worth 20 gp"; break;
			case 81 : job = "Orphan"; weapon = "Club"; goods = "Rag doll"; break;
			case 82 : job = "Ostler"; weapon = "Staff"; goods = "Bridle"; break;
			case 83 : job = "Outlaw"; weapon = "Shortsword"; goods = "Leather Armor"; break;
			case 84 : job = "Scribe"; weapon = "Dart"; goods = "Parchment, 10 sheets"; break;
			case 85 : job = "Shaman"; weapon = "Mace"; goods = "Herbs, 1 lb"; break;
			case 86 : job = "Slave"; weapon = "Club"; goods = "Strange looking rock"; break;
			case 87 : job = "Smuggler"; weapon = "Sling"; goods = "Waterproof Sack"; break;
			case 88 :
			case 89 : job = "Soldier"; weapon = "Spear"; goods = "Shield"; break;
			case 90 : 
			case 91 : job = "Squire"; weapon = "Longsword"; goods = "Steel helmet"; break;
			case 92 : 
			case 93 : job = "Trapper"; weapon = "Sling"; goods = "Badger Pelt"; break;
			case 94 : job = "Urchin"; weapon = "Stick"; goods = "Begging bowl"; break;
			case 95 : job = "Wainwright"; weapon = "Club"; goods = "Pushcart"; break;
			case 96 : job = "Weaver"; weapon = "Dagger"; goods = "Fine suit of clothes"; break;
			case 97 : job = "Wizards apprentice"; weapon = "Dagger"; goods = "Black grimoire"; break;
			case 98 :
			case 99 :
			case 100 : job = "Woodcutter"; weapon = "Handaxe"; goods = "Bundle of wood"; break;
			default : System.out.println("Error");		
			}
			
			return job;
		}
		}
		
		


	

