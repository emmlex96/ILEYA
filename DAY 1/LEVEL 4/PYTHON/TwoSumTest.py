import unittest
from two_sum import two_sum

class TestTwoSum(unittest.TestCase):

```
def test_basic_case(self):
    # 2 + 7 = 9, indices 0 and 1
    self.assertEqual(two_sum([2, 7, 11, 15], 9), [0, 1])

def test_target_at_end(self):
    # 11 + 15 = 26, indices 2 and 3
    self.assertEqual(two_sum([2, 7, 11, 15], 26), [2, 3])

def test_negative_numbers(self):
    # -3 + 7 = 4, indices 0 and 2
    self.assertEqual(two_sum([-3, 2, 7], 4), [0, 2])

def test_pair_in_middle(self):
    # 3 + 5 = 8, indices 1 and 2
    self.assertEqual(two_sum([1, 3, 5, 9], 8), [1, 2])
```

if **name** == “**main**”:
unittest.main(verbosity=2)
