# set logic

# TC: O(3n)
# SC: O(n)


def lengthOfLongestConsecutiveSequence(nums, n) -> int:
    nums = set(nums)  # O(n)
    # print(nums)  # .... diff ... will see sorted +ve set then -ve set
    best = 0  # result ... longest streak

    # O(n) .... to visit each ele ... in loop
    # O(n) .... to check if next ele there .... create cycle
    for x in nums:
        # if x-1 in set .... means it had been traveled throw .... or will travel ... no need to visit it again
        # if x - 1 in nums:
        #     continue

        if x - 1 not in nums:
            y = x + 1  # next ele

            while y in nums:  # till next ele
                y += 1

            # max result store ... y-x ... diff between start and end .... is count
            # print(y - x) # count result
            best = max(best, y - x)

    return best
