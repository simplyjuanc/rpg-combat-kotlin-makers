package rpg.combat.makers

class Character(
    var health: Int = 1000,
    var level: Int = 1,
) {
    fun alive(): Boolean = health > 0
}
