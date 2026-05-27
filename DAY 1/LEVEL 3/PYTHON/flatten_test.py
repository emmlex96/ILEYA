import unittest
from flatten import flatten

class TestFlatten(unittest.TestCase):

def test_basic_flatten(self):
    result = flatten([[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]])
    self.assertEqual(result, [9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6])

def test_single_subarray(self):
    result = flatten([[1, 2, 3]])
    self.assertEqual(result, [1, 2, 3])

def test_single_element_subarrays(self):
    result = flatten([[1], [2], [3]])
    self.assertEqual(result, [1, 2, 3])

def test_empty_outer_array(self):
    result = flatten([])
    self.assertEqual(result, [])

def test_empty_inner_arrays(self):
    result = flatten([[], [], []])
    self.assertEqual(result, [])

