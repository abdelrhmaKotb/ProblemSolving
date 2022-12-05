#include <bits/stdc++.h>
#include <stack>
using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'isBalanced' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string isBalanced(string s) {
    stack<char> stk;
    int ln = s.length();
    
    if(ln == 0)
    {
        return "NO";
    }
    
    for(int i = 0;i < ln;i++)
    {
        if(s[i] == '{' || s[i] == '(' || s[i] == '[')
        {
            stk.push(s[i]);
        }else if(s[i] == '}' || s[i] == ')' || s[i] == ']'){
            if(!stk.size())
            {
                return  "NO";
            }
            if(stk.top() == '(')
            {
                if(s[i] - stk.top() != 1)
                {
                    return "NO";
                }
            }else {
                if(s[i] - stk.top() != 2)
                {
                    return "NO";
                }
            }
            
            stk.pop();
        }
    }
    
    return stk.size() ? "NO" : "YES";
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string t_temp;
    getline(cin, t_temp);

    int t = stoi(ltrim(rtrim(t_temp)));

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string s;
        getline(cin, s);

        string result = isBalanced(s);

        fout << result << "\n";
    }

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
