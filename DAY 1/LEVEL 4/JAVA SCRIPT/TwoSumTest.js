const { twoSum } = require(”./twoSum”);

let passed = 0;
let failed = 0;

function assert(condition, testName) {
if (condition) {
console.log(`PASS: ${testName}`);
passed++;
} else {
console.log(`FAIL: ${testName}`);
failed++;
}
}

function arraysEqual(a, b) {
return JSON.stringify(a) === JSON.stringify(b);
}

console.log(”=== twoSum Tests ===\n”);

assert(arraysEqual(twoSum([2, 7, 11, 15], 9),  [0, 1]), “Test 1 - Basic case (2 + 7 = 9)”);
assert(arraysEqual(twoSum([2, 7, 11, 15], 26), [2, 3]), “Test 2 - Target at end (11 + 15 = 26)”);
assert(arraysEqual(twoSum([-3, 2, 7], 4),      [0, 2]), “Test 3 - Negative numbers (-3 + 7 = 4)”);
assert(arraysEqual(twoSum([1, 3, 5, 9], 8),    [1, 2]), “Test 4 - Pair in middle (3 + 5 = 8)”);

console.log(`\n=== Results: ${passed} passed, ${failed} failed ===`);
