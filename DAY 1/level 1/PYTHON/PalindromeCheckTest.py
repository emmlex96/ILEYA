import unittest
from palindrome_check import is_palindromic

class TestIsPalindromic(unittest.TestCase):


def test_valid_palindrome(self):
    self.assertTrue(is_palindromic([45, 0, 8, 0, 45]))

def test_not_a_palindrome(self):
    self.assertFalse(is_palindromic([1, 2, 3]))

def test_single_element(self):
    self.assertTrue(is_palindromic([7]))

def test_two_same_elements(self):
    self.assertTrue(is_palindromic([4, 4]))

def test_two_different_elements(self):
    self.assertFalse(is_palindromic([4, 5]))

def test_even_length_palindrome(self):
    self.assertTrue(is_palindromic([1, 2, 2, 1]))



