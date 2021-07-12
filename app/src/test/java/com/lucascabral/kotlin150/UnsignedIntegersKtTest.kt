package com.lucascabral.kotlin150

import org.junit.Assert.*
import org.junit.Test

class UnsignedIntegersKtTest {

    @Test
    fun `Testing unsigned`() {
        assertEquals((255).toUByte(), (-1).toUByte())
        assertEquals((65535).toUShort(), (-1).toUShort())
        assertEquals(4294967295u, (-1).toUInt())
        assertEquals(18446744073709551615uL, (-1L).toULong())
    }
}