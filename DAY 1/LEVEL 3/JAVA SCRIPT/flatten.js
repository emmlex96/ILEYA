function flatten(arr) {
const result = [];


for (const subArray of arr) {
    for (const num of subArray) {
        result.push(num);
    }
}

return result;


}

module.exports = { flatten };
