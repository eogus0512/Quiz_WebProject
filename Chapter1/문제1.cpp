//구구단

#include <iostream>

using namespace std;

int main(void)
{
	int val1;
	cout << "단을 입력하세요 : ";
	cin >> val1;

	for (int i = 1; i < 10; i++)
	{
		cout << val1 << 'X' << i << '=' << val1 * i << endl;
	}

	return 0;
}