function twoSum(nums, target) {
const seen = {};

```
for (let index = 0; index < nums.length; index++) {
    const complement = target - nums[index];

    if (complement in seen) {
        return [seen[complement], index];
    }

    seen[nums[index]] = index;
}

return [];
```

}

module.exports = { twoSum };
