import unittest

from run_length_encoding import (
    encode,
    decode,
)

# Tests adapted from `problem-specifications//canonical-data.json`


class RunLengthEncodingTest(unittest.TestCase):
    def test_encode_empty_string(self):
        self.assertMultiLineEqual(encode(""), "") # type: ignore

    def test_encode_single_characters_only_are_encoded_without_count(self):
        self.assertMultiLineEqual(encode("XYZ"), "XYZ") # type: ignore

    def test_encode_string_with_no_single_characters(self):
        self.assertMultiLineEqual(encode("AABBBCCCC"), "2A3B4C") # type: ignore

    def test_encode_single_characters_mixed_with_repeated_characters(self):
        self.assertMultiLineEqual(
            encode("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"), # type: ignore
            "12WB12W3B24WB",
        )

    def test_encode_multiple_whitespace_mixed_in_string(self):
        self.assertMultiLineEqual(encode("  hsqq qww  "), "2 hs2q q2w2 ") # type: ignore

    def test_encode_lowercase_characters(self):
        self.assertMultiLineEqual(encode("aabbbcccc"), "2a3b4c") # type: ignore

    def test_decode_empty_string(self):
        self.assertMultiLineEqual(decode(""), "") # type: ignore

    def test_decode_single_characters_only(self):
        self.assertMultiLineEqual(decode("XYZ"), "XYZ") # type: ignore

    def test_decode_string_with_no_single_characters(self):
        self.assertMultiLineEqual(decode("2A3B4C"), "AABBBCCCC") # type: ignore

    def test_decode_single_characters_with_repeated_characters(self):
        self.assertMultiLineEqual(
            decode("12WB12W3B24WB"), # type: ignore
            "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB",
        )

    def test_decode_multiple_whitespace_mixed_in_string(self):
        self.assertMultiLineEqual(decode("2 hs2q q2w2 "), "  hsqq qww  ") # type: ignore

    def test_decode_lowercase_string(self):
        self.assertMultiLineEqual(decode("2a3b4c"), "aabbbcccc") # type: ignore

    def test_encode_followed_by_decode_gives_original_string(self):
        self.assertMultiLineEqual(decode(encode("zzz ZZ  zZ")), "zzz ZZ  zZ") # type: ignore
