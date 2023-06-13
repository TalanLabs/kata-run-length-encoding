package com.talan.dojo.rle;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

public class RunLengthEncodingTest {

    private RunLengthEncoding runLengthEncoding;

    @BeforeEach
    public void setUp() {
        runLengthEncoding = new RunLengthEncoding();
    }

    @Test
    public void encodeEmpty() {
        Assertions.assertEquals("", runLengthEncoding.encode(""));
    }

    @Test
    public void encodeWithOnlySingleValues() {
        Assertions.assertEquals("XYZ", runLengthEncoding.encode("XYZ"));
    }

    @Test
    public void encodeWithNoSingleValues() {
        Assertions.assertEquals(
                "2A3B4C",
                runLengthEncoding.encode("AABBBCCCC"));
    }

    @Test
    public void encodeWithMixedValues() {
        Assertions.assertEquals(
                "12WB12W3B24WB",
                runLengthEncoding.encode(
                        "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"));
    }

    @Test
    public void encodeWithWhitespaceValues() {
        Assertions.assertEquals(
                "2 hs2q q2w2 ",
                runLengthEncoding.encode("  hsqq qww  "));
    }

    @Test
    public void encodeWithLowercaseValues() {
        Assertions.assertEquals(
                "2a3b4c",
                runLengthEncoding.encode("aabbbcccc"));
    }


    @Test
    public void decodeEmpty() {
        Assertions.assertEquals("", runLengthEncoding.decode(""));
    }


    @Test
    public void decodeWithOnlySingleValues() {
        Assertions.assertEquals(
                "XYZ",
                runLengthEncoding.decode("XYZ"));
    }


    @Test
    public void decodeWithNoSingleValues() {
        Assertions.assertEquals(
                "AABBBCCCC",
                runLengthEncoding.decode("2A3B4C"));
    }


    @Test
    public void decodeWithMixedValues() {
        Assertions.assertEquals(
                "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB",
                runLengthEncoding.decode("12WB12W3B24WB"));
    }


    @Test
    public void decodeWithWhitespaceValues() {
        Assertions.assertEquals(
                "  hsqq qww  ",
                runLengthEncoding.decode("2 hs2q q2w2 "));
    }


    @Test
    public void decodeWithLowercaseValues() {
        Assertions.assertEquals(
                "aabbbcccc",
                runLengthEncoding.decode("2a3b4c"));
    }

    @Test
    public void encodeThenDecode() {
        String inOut = "zzz ZZ  zZ";
        String encoded = runLengthEncoding.encode(inOut);
        Assertions.assertEquals(inOut, runLengthEncoding.decode(encoded));
    }
}
