def split_odd_and_even(nums):
odds  = [num for num in nums if num % 2 != 0]
evens = [num for num in nums if num % 2 == 0]
return [odds, evens]

input1  = [45, 60, 3, 10, 9, 22]
result  = split_odd_and_even(input1)


print(f"Input : {input1}")
print(f"Output: {result}")

