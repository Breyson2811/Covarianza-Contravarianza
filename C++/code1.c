#include <ostream>
#include <iostream>
#include <stdio.h>
class A{
  public:
    virtual void foo() = 0;
};

class B: public A{
  public:
    void foo();
};

void B::foo()override{
  std::cout << "B" << std::endl;
}

int main(){
  B b;
  b.foo();
  return 1;
}
