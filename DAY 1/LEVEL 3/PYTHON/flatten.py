def flatten(arr):
result = []


for sub_array in arr:
    for num in sub_array:
        result.append(num)

return result

