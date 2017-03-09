#include <iostream>

using namespace std;

class Myclass{
    int array[10];
    int index;
    public:
        Myclass(){
            index=0;
        }

        void add(int x);
        void print();

        Myclass & operator=(Myclass & x);
        int getDiziEleman(int i);
        int getIndex(){
            return index;
        }

};

void Myclass::add(int x){
    Myclass::array[index]=x;
    Myclass::index++;



}

void Myclass::print(){
    for(int i=0; i< index; i++)
        cout << array[i]<<" ";
    cout<< endl;
}

int Myclass::getDiziEleman(int x){
    return array[x];
}


Myclass & Myclass::operator=(Myclass &x){
        Myclass yeni;
        for(int i=0; i<x.getIndex(); i++){
            this->add(x.getDiziEleman(i));
        }

        return yeni;


}



int main()
{
    Myclass a,b;

    a.add(5);
    a.add(10);
    a.add(20);
    a.add(30);

    //a.print();
    b=a;
    b.print();

    cout <<"Karmaşıklık (Step sayısı) = " << "O(" << b.getIndex() << ") =O(n) " << endl;

    return 0;
}
