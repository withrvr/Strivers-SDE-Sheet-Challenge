def subarraysXor(arr, target):
    count = 0
    xor = 0

    map = {}
    map[0] = 1

    for val in arr:
        xor ^= val
        count += map.get(target ^ xor, 0)
        map[xor] = map.get(xor, 0) + 1

    return count
