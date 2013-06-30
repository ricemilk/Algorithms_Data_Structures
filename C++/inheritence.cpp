#include <iostream>
#include <string>

using namespace std;

class BasePoint{
public:
    BasePoint(int px, int py) : x (px), y (py) {}
    int x, y;
    virtual string type() = 0;
    virtual void info() {
        cout << endl << "figure: " << type() << endl;
        cout << "position: x=" << x << ", y=" << y << endl;
    }
};

class Figure1P : public BasePoint {
public:
    Figure1P(int px, int py, int r) : p1(r), BasePoint(px, py) {}
    int p1;
    virtual void info() {
        BasePoint::info();
        cout << "porperty 1: p=" << p1 << endl;
    }
};

class Square : public Figure1P {
public:
    Square(int px, int py, int r) : Figure1P(px, py, r) {}
    virtual string type() {
        return "square";
    }
};

class Circle : public Figure1P {
public:
    Circle(int px, int py, int r) : Figure1P(px, py, r) {}
    virtual string type() {
        return "circle";
    }
};

class Figure2P : public Figure1P {
public:
    Figure2P(int px, int py, int w, int h) : p2(h), Figure1P(px, py, w) {}
    int p2;
    virtual void info() {
        Figure1P::info();
        cout << "property 2:p=" << p2 << endl;
    }
};

class Rectangle : public Figure2P {
public:
    Rectangle(int px, int py, int w, int h) : Figure2P(px, py, w, h) {}
    virtual string type() { return "rectangle"; }
};

class Oval : public Figure2P {
public:
    Oval(int px, int py, int w, int h) : Figure2P(px, py, w, h) {}
    virtual string type() { return "oval"; }
};


int main() {
    BasePoint **objs = new BasePoint*[5];
    objs[0] = new Circle(7, 6, 15);
    objs[1] = new Rectangle(12, 54, 21, 14);
    objs[2] = new Square(19, 32, 10);
    objs[3] = new Oval(43, 10, 4, 3);
    objs[4] = new Square(3, 41, 3);
    char onum;
    while (cin >> onum) {
        if (onum >= '0' && onum <= '4')
            objs[onum - '0']->info();
    }
    for (int i = 0; i < 5; ++ i) delete objs[i];
    delete objs;
    return 0;
}