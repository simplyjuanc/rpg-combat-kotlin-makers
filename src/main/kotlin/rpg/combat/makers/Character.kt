package rpg.combat.makers

class Character(
    var health: Int = 1000,
    var level: Int = 1,
) {
    fun alive(): Boolean = health > 0

    fun attack(defender: Character, damage: Int) {
        defender.receiveDamage(damage)
    }

    fun receiveDamage(damage: Int) {
        health -= damage.coerceAtMost(health)
    }

    fun heal(patient: Character, hitpoints: Int) {
        patient.receiveHealing(hitpoints)
    }

    fun receiveHealing(hitpoints: Int) {
        health += if (health == 0) 0 else hitpoints.coerceAtMost(1000-health)
    }
}
