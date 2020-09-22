#include <iostream>

using namespace std;

void MyFunc(void)
{
	cout << "MyFunc(void) is called" << endl;
}

void MyFunc(char c)
{
	cout << "MyFunc(char c) is called" << endl;
}

void MyFunc(int a, int b)
{
	cout << "MyFunc(int a, int b) is called" << endl;
}

int main(void)
{
	MyFunc();
	MyFunc('A');
	MyFunc(3, 7);

	return 0;
}