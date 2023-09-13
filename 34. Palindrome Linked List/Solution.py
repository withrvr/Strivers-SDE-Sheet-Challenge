def isPalindrome(head):
    # Write your code here.
    prev = None
    slow = fast = head

    while fast and fast.next:
        fast = fast.next.next
        slow.next, prev, slow = prev, slow, slow.next

        # temp = slow.next
        # slow.next = prev
        # prev = slow
        # slow = temp

    if fast:
        slow = slow.next

    while prev and prev.data == slow.data:
        slow = slow.next
        prev = prev.next

    return not prev  # true if prev == null else false
