package rpg.combat.makers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EmptyTest {
    @Test
    fun `empty test`() {
        assertDoesNotThrow { Empty().doNothing() }
    }
}
