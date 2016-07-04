/**
n个台阶，一次走一个，或一次走俩个，多少种解法

典型的斐波那契数列
*/

int solve(int n){

if(n==1) return 1;
if(n==2) return 2;
return solve(n-1)+solve(n-2);
}