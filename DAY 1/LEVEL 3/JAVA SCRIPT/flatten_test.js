const { flatten } = require(”./flatten”);

let passed = 0;
let failed = 0;

function assert(condition, testName) {
if (condition) {
console.log(`PASS: {testName}`);
passed++;
} else {
console.log(`FAIL: {testName}`);
failed++;
}
}

function arraysEqual(a, b) {

}

console.log(” flatten Tests \n”);

assert(arraysEqual(flatten([[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]]), [9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6]), “Test 1 - Basic flatten”);
assert(arraysEqual(flatten([[1, 2, 3]]),                                    [1, 2, 3]),                             “Test 2 - Single subarray”);
assert(arraysEqual(flatten([[1], [2], [3]]),                                [1, 2, 3]),                             “Test 3 - Single element subarrays”);
assert(arraysEqual(flatten([]),                                             []),                                    “Test 4 - Empty outer array”);
assert(arraysEqual(flatten([[], [], []]),                                   []),                                    “Test 5 - Empty inner arrays”);

console.log(`\n Results: {passed} passed, {failed} failed `);
