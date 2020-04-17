#include<iostream>
using namespace std;
int main()
{
int a,b,c;
  cin>>a>>b>>c;
  int d = ((a * b * c) / 100);
  int e = a + d;
  float f = ((float)d * 2)/100;
  float g = (float)e - (float)f;
  cout<<d<<endl<<e<<endl<<f<<endl<<g;
}