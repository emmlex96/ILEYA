import unittest
from find_duplicates import find_duplicates

class TestFindDuplicates(unittest.TestCase):


def test_basic_duplicates(self):
    result = find_duplicates([1, 2, 3, 2, 4, 3])
    self.assertEqual(sorted(result), [2, 3])

def test_no_duplicates(self):
    result = find_duplicates([1, 2, 3, 4])
    self.assertEqual(result, [])

def test_all_duplicates(self):
    result = find_duplicates([5, 5, 7, 7])
    self.assertEqual(sorted(result), [5, 7])

def test_single_element(self):
    result = find_duplicates([9])
    self.assertEqual(result, [])

def test_empty_array(self):
    result = find_duplicates([])
    self.assertEqual(result, [])



