#include <iostream>
#include <math.h>
#include <vector>

using namespace std;

typedef struct myVectorUnit
{
    int value;
    string label;

    myVectorUnit( string label,int value)
    {
        this->value=value;
        this->label=label;
    }


    myVectorUnit operator +(const myVectorUnit& m)
    {


        value=value+m.value;

        return m;
    }
};


class Vector
{

private:

    vector<myVectorUnit> v;

public:

    Vector()
    {
    }

    Vector(vector<myVectorUnit> x)
    {
        v=x;
    }


    vector<myVectorUnit> GetVector()
    {
        return v;
    }


    void addItem(string label,int value)
    {
        v.push_back(myVectorUnit(label,value));
    }

    void printVector()
    {
        int step=0;
        for(vector<myVectorUnit>::const_iterator x=v.begin(); x!= v.end(); ++x)
        {
            cout<<(*x).label<<" "<<(*x).value<<" ,";
            step++;
        }
        cout<<"printVector operations step count is:" <<step<<endl;
        cout<<endl;

    }

    myVectorUnit getItem(string label)
    {
        int step=0;
        for(vector<myVectorUnit>::iterator x=v.begin(); x!= v.end(); ++x)
        {
            step++;
            if((*x).label==label)
            {
                return (*x);
            }


        }
        cout<<"getItem operations step count is:" <<step<<endl;
        return myVectorUnit("N/A",-1);
    }

    void setItem(string label,int newValue)
    {
        int step=0;
        for(vector<myVectorUnit>::iterator x=v.begin(); x!= v.end(); ++x)
        {
            step++;
            if((*x).label==label)
            {
                (*x).value=newValue;
            }



        }
        cout<<"setItem operations step count is:" <<step<<endl;
    }

    void ScalerMult(int deger)
    {


        int step=0;
        for(vector<myVectorUnit>::iterator x=v.begin(); x!= v.end(); ++x)
        {


            (*x).value*=deger;

            step++;

        }
        cout<<"Scalar Mutl operations step count is:" <<step<<endl;

    }


};

Vector Sum(Vector vec1 ,Vector vec2)
{

    int step=0;
    vector<myVectorUnit> newVector;

    vector<myVectorUnit> smallerVector;
    vector<myVectorUnit> biggerVector;
    vector<myVectorUnit> temp;
    biggerVector=vec1.GetVector();
    smallerVector=vec2.GetVector();

    if(smallerVector.size()>vec1.GetVector().size())
    {
        temp=smallerVector;
        smallerVector=biggerVector;
        biggerVector=temp;
    }

    for(int i=0; i<smallerVector.size(); i++)
    {
        step++;
        newVector.push_back(myVectorUnit(biggerVector[i].label,

                                         (biggerVector[i].value + smallerVector[i].value)));
    }
    cout<<"Sum operation step count: "<<step<<endl;
    return Vector(newVector);
}



int main()
{

    Vector x,y;
    x.addItem("ozan",22);
    x.addItem("okan",15);
    x.addItem("defa",1);

    y.addItem("mert",12);
    y.addItem("1",5);
    y.addItem("3",13);


    Vector t =Sum(x,y);
    t.printVector();
    t.ScalerMult(5);
    t.printVector();
    return 0;
}
