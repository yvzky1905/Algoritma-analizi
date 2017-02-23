#include <iostream>

using namespace std;

int power(double a, double b){
    double i;
    double sonuc=1;

    if(b==0){
        return 1;
    }
    if(b==1){
        return a;
    }

    for(i=0;i<b;i++){
       sonuc = a*sonuc;
    }
    return sonuc;

}


int main()
{

     double a,b;

     cout << "lutfen tabani giriniz" << endl;
     cin >> a;

     cout << "lutfen ustu giriniz" << endl;
     cin >>b;


     double c=power(a,b);
     cout <<"sonuc: " << c << endl;
     return 0;
}
