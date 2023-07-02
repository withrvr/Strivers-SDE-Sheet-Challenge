def subarraysXor(arr, target):
    count = 0  # result / answer
    # To keep track of the current xor.
    xor = 0  # current xor

    # To store the prefix XOR's.
    map = {}
    # Intialy Xor is 0.
    map[0] = 1

    for val in arr:
        # Update the Xor of the current prefix.
        xor ^= val

        # # Required value of the prefix Xor to make the xor of the subarray equal to X.
        # complement = target ^ xor  # requried

        # if complement in map:
        #     # Add the count of prefix arrays with required xor.
        #     count += map[complement]
        count += map.get(target ^ xor, 0)

        map[xor] = map.get(xor, 0) + 1  # update map

    return count
