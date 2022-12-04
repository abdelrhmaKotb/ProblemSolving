#include <bits/stdc++.h>
#include <math.h>
#include <stack>
using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'waiter' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY number
 *  2. INTEGER q
 */
 
bool isPrime(int num)
{
    for(int i = 2; i <= sqrt(num); i++)
    {
        if(num % i == 0)
        {
            return false;
        }
    }
    
    return true;
}
 
int getNextPrime(int currentPrime)
{
    while(true)
    {
        if(isPrime(++currentPrime))
        {
            return currentPrime;
        }
    }
}

vector<int> waiter(vector<int> number, int q) {
    vector<int> answers;
    int prime = 2;
    
    for(int i = 0;i < q;i++)
    {
        stack<int> a;
        stack<int> b;
       
        for(int j = number.size() - 1 ; j >= 0 ; j--)
        {
            if(number[j] % prime == 0)
            {
                b.push(number[j]);
            }else {
                a.push(number[j]);
            }
        }
        
        while (b.size()) {
            cout << b.top();
            answers.push_back(b.top());
            b.pop();
        }
        cout << endl;   
        
        number.clear();
        
        while (!a.empty()) {
            cout << a.top();
            if(q - i == 1)
            { 
                number.push_back(a.top());
            }else
            {
              number.insert(number.begin(), a.top());
            }
            a.pop();
        }
        cout << endl; 
        
        prime = getNextPrime(prime);
        
    }
    

    for(int j = 0 ; j < number.size() ; j++)
    {
        cout << "test from back" << number[j] << endl;
        answers.push_back(number[j]);
    } 
    
    
    return answers;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string first_multiple_input_temp;
    getline(cin, first_multiple_input_temp);

    vector<string> first_multiple_input = split(rtrim(first_multiple_input_temp));

    int n = stoi(first_multiple_input[0]);

    int q = stoi(first_multiple_input[1]);

    string number_temp_temp;
    getline(cin, number_temp_temp);

    vector<string> number_temp = split(rtrim(number_temp_temp));

    vector<int> number(n);

    for (int i = 0; i < n; i++) {
        int number_item = stoi(number_temp[i]);

        number[i] = number_item;
    }

    vector<int> result = waiter(number, q);

    for (size_t i = 0; i < result.size(); i++) {
        fout << result[i];

        if (i != result.size() - 1) {
            fout << "\n";
        }
    }

    fout << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}

vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}
