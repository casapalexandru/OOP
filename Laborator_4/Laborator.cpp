#include <iostream>
#include <string>
#include <fstream>
using namespace std;
void clrscr()
{
    system("@cls||clear");
}
void check_bracket(std::string expression){
        int count = 0;

        //char[] character = expression.toCharArray();
        char character[80];
        strcpy(character,expression.c_str());
        for (int i = 0; i < expression.length(); i++) {
            if (character[i] == '(') count++;
            if (character[i] == ')') count--;
            if (count < 0) {cout << "Incorrect expression";break;}

        }
        if (count == 0) cout <<"Correct expression";
        if (count > 0) cout << "Exists " << count << " unclosed bracket(s) in your expression";
    }
 
int main() {
	clrscr();
 
  std::ifstream infile("text1.txt");
  std::string expression;
  while (std::getline(infile, expression)) {
    std::cout << expression << std::endl;
    check_bracket(expression);
    cout <<endl;
  }
  infile.close();
 
  return EXIT_SUCCESS;
}