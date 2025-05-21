package rpg.combat.makers

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CharacterTest {
    @Test
    fun `should create a character with 1000 health at start`() {
        val character = Character()

        assertEquals(character.health, 1000)
    }

    @Test
    fun `should create a character starting at level 1`() {
        val character = Character()

        assertEquals(character.level, 1)
    }

    @Test
    fun `characters should be either alive or dead`() {
        val character = Character(health = 0)

        assertEquals(character.alive(), false)
    }

    @Test
    fun `chars should start alive`() {
        val character = Character()

        assertEquals(character.alive(), true)
    }

    @Nested
    inner class Part2 {
        @Test
        fun `when attacked damage is subtracted from health`() {
            val attacker = Character()
            val defender = Character()

            attacker.attack(defender, 100)

            assertEquals(defender.health, 900)
        }

        @Test
        fun `when damage is greater or equal to the remaining health character dies` () {
            val attacker = Character()
            val defender = Character()

            attacker.attack(defender, 2000)

            assertEquals(defender.alive(), false)
        }

        @Test
        fun `character health should never be lower than 0` () {
            val attacker = Character()
            val defender = Character()

            attacker.attack(defender, 2000)

            assertEquals(defender.health, 0)
        }
    }

    @Nested
    inner class Part3() {
        @Test
        fun `healing should increase health`() {
            val healer = Character()
            val patient = Character(900)

            healer.heal(patient, 100)

            assertEquals(1000,patient.health)
        }

        @Test
        fun `if char is dead it cannot be healed`() {
            val healer = Character()
            val patient = Character(0)

            healer.heal(patient, 100)

            assertEquals(false,patient.alive())
        }

        @Test
        fun `health cannot go over 1000`() {
            val healer = Character()
            val patient = Character(1000)

            healer.heal(patient, 100)

            assertEquals(patient.health, 1000)
        }
    }

}
