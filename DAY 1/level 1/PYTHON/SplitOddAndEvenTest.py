import unittest
from split_odd_and_even import split_odd_and_even

class TestSplitOddAndEven(unittest.TestCase):

def test_mixed_odd_and_even(self):
    result = split_odd_and_even([45, 60, 3, 10, 9, 22])
    self.assertEqual(result[0], [45, 3, 9])
    self.assertEqual(result[1], [60, 10, 22])

def test_all_odd(self):
    result = split_odd_and_even([1, 3, 5])
    self.assertEqual(result[0], [1, 3, 5])
    self.assertEqual(result[1], [])

def test_all_even(self):
    result = split_odd_and_even([2, 4, 6])
    self.assertEqual(result[0], [])
    self.assertEqual(result[1], [2, 4, 6])

def test_empty_array(self):
    result = split_odd_and_even([])
    self.assertEqual(result[0], [])
    self.assertEqual(result[1], [])




