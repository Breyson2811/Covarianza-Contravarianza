#include <ostream>
#include <iostream>
#include <stdio.h>
class A{
  public:
    virtual void goo() = 0;
};

class B: public A{
  public:
    void goo() override{
      std::cout << "B" << std::endl;
    }

};

class C: public B{
  public:
    void goo() override{
      std::cout << "C" << std::endl;
    }

};

class D: public C{
  public:
    void goo() override{
      std::cout << "D" << std::endl;
    }

};

class X{
  public:
     B* foo(A* c);
};

class Y{
  public:
    B* foo(A* c);
};

B* X::foo(A* c){
  c->goo();
  return new B();
}

B* Y::foo(A* c){
  c->goo();
  return new B();
}

int main(){
  C c;
  Y y;
  D* d = new D();
  B* d1 = y.foo(d);
  d1->goo();
  return 1;
}
