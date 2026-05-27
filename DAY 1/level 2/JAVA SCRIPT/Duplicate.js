function findDuplicates(nums) {
const seen       = new Set();
const duplicates = new Set()


for (const num of nums) {
    if (seen.has(num)) {
        duplicates.add(num);
    } else {
        seen.add(num);
    }
}

return Array.from(duplicates);


}

module.exports = { findDuplicates };
