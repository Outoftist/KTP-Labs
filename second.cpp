#include <vector>
#include <iostream>

using namespace std;

vector<int> GenVec(int n,int min,int max)
{
  vector vec;
  for (int i = 0; i < n; i++)
    vec.push_back(min + rand() % (max - min));
}

int main(){

  cout<<"Введите количество элементов"<<endl; cin>>n;
  cout<<"Введите минимальное значение"<<endl; cin>>min;
  cout<<"Введите максимальное значение"<<endl; cin>>max;

  auto vec = GenVec(n, min, max);

  for (int i : vec)
    cout<<i<<" ";

  return 0;
}
