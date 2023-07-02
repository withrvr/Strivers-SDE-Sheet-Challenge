Node *addTwoNumbers(Node *num1, Node *num2)
{
	Node *head = new Node();
	Node *point = head;
	int carry = 0;

	while (num1 != NULL || num2 != NULL)
	{
		int sum = 0;
		if (num1 != NULL)
		{
			sum += num1->data;
			num1 = num1->next;
		}
		if (num2 != NULL)
		{
			sum += num2->data;
			num2 = num2->next;
		}
		sum += carry;
		carry = sum / 10;

		// Node *node = new Node(sum % 10);
		point->next = new Node(sum % 10);
		point = point->next;
	}

	if (carry)
		point->next = new Node(carry);

	return head->next;
}
