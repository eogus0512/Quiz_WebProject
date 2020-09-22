//급여 계산 프로그램

#include <iostream>

using namespace std;

int main(void)
{
	int sell, pay;
	cout << "판매 금액을 만원 단위로 입력(-1 to end): ";
	cin >> sell;

	while (sell != -1)
	{
		pay = 50 + sell * 0.12;
		cout << "이번 달 급여: " << pay << "만원" << endl << endl;

		cout << "판매 금액을 만원 단위로 입력(-1 to end): ";
		cin >> sell;
	}

	cout << "프로그램을 종료합니다." << endl;

	return 0;
	
}