RPG Combat Kata
================
Source: [https://github.com/ardalis/kata-catalog](https://github.com/ardalis/kata-catalog)

# Background #

This is a fun kata that has the programmer building simple combat rules, as for a role-playing game (RPG). It is implemented as a sequence of iterations. The domain doesn't include a map or any other character skills apart from their ability to damage and heal one another.

# Instructions #

1. Complete each iteration before reading the next one.

2. It's recommended you perform this kata with a pairing partner and while writing tests.

## Iteration One ##

1. All Characters, when created, have:
    - Health, starting at 1000
    - Level, starting at 1
    - May be Alive or Dead, starting Alive (Alive may be a true/false)

2. Characters can Deal Damage to Characters.
    - Damage is subtracted from Health
    - When damage received exceeds current Health, Health becomes 0 and the character dies

3. A Character can Heal a Character.
    - Dead characters cannot be healed
    - Healing cannot raise health above 1000

## Iteration Two ##

1. A Character cannot Deal Damage to itself.

2. A Character can only Heal itself.

3. When dealing damage:
    - If the target is 5 or more Levels above the attacker, Damage is reduced by 50%
    - If the target is 5 or more levels below the attacker, Damage is increased by 50%

## Iteration Three ##

1. Characters have an attack Max Range.

2. *Melee* fighters have a range of 2 meters.

3. *Ranged* fighters have a range of 20 meters.

4. Characters must be in range to deal damage to a target.

To compute the distance, you can use whatever you find easier.
Two common approaches are:
- Manhattan distance: |x1 - x2| + |y1 - y2|
- Euclidean distance: sqrt((x1 - x2)^2 + (y1 - y2)^2)
## Retrospective ##

- Are you keeping up with the requirements? Has any iteration been a big challenge?
- Do you feel good about your design? How did it handle changes in different iterations?
- How did your tests hold up? Did they need to change? Why?
- If you had to support other combat rules, how ready does your design feel?

# Resources #

- Original Source: http://www.slideshare.net/DanielOjedaLoisel/rpg-combat-kata
