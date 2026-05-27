const { findDuplicates } = require(”./findDuplicates”);

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

console.log(” findDuplicates Tests \n”);

assert(arraysEqual(findDuplicates([1, 2, 3, 2, 4, 3]), [2, 3]),  “Test 1 - Basic duplicates”);
assert(arraysEqual(findDuplicates([1, 2, 3, 4]),        []),      “Test 2 - No duplicates”);
assert(arraysEqual(findDuplicates([5, 5, 7, 7]),        [5, 7]),  “Test 3 - All duplicates”);
assert(arraysEqual(findDuplicates([9]),                 []),      “Test 4 - Single element”);
assert(arraysEqual(findDuplicates([]),                  []),      “Test 5 - Empty array”);

console.log(`\n Results: {passed} passed, {failed} failed `);
