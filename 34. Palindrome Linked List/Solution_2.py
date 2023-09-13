class Solution:
    def isPalindrome(self, root) -> bool:
        result = True
        head = root

        def check(point):
            nonlocal result, head

            if point:
                check(point.next)

                if head.val != point.val:
                    result = False

                head = head.next

        check(root)
        return result
