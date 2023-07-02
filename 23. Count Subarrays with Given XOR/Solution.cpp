#include <bits/stdc++.h>

int subarraysXor(vector<int> &arr, int target)
{
	int n = arr.size();
	int xr = 0;
	int count = 0;

	map<int, int> mpp;
	++mpp[0];

	for (int val : arr)
	{
		xr ^= val;
		count += mpp[xr ^ target];
		++mpp[xr];
	}

	return count;
}
