def is_palindromic(nums):
left  = 0
right = len(nums) - 1


while left < right:
    if nums[left] != nums[right]:
        return False
    left  += 1
    right -= 1

return True


if name == “main”:
palindrome     = [45, 0, 8, 0, 45]
not_palindrome = [1, 2, 3]


print(f"Input : {palindrome}")
print(f"Result: {is_palindromic(palindrome)}")     

print(f"Input : {not_palindrome}")
print(f"Result: {is_palindromic(not_palindrome)}") 

