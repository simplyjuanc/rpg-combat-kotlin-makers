package rpg.combat.makers

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
}
