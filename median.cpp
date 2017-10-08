#include<iostream>
#include<vector>

using namespace std;

void findMedian(float);
void displayResults();

vector<float> data;

vector<float> median;

int main(){

    int numberOfElements=0;
    float element;

    cin>>numberOfElements;

    while(numberOfElements--){

            cin>>element;

            findMedian(element);

    }

    displayResults();

    return 0;

}

void findMedian(float element){

            int mid;

            data.push_back(element);

            mid=(data.size()-1)/2;

            if((data.size()%2)==0){

                median.push_back((data[mid]+data[mid+1])/2.0);

            }

            else{

                median.push_back((data[mid]));

            }

}

void displayResults(){

    for(int i=0;i<median.size();i++){

        cout<<median[i]<<"\n";

    }

}

