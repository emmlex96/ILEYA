def two_sum(nums, target):
seen = {}

```
for index, num in enumerate(nums):
    complement = target - num

    if complement in seen:
        return [seen[complement], index]

    seen[num] = index

return []
```
