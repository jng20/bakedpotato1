/*
Jacob Ng + Jeffery Tang
APCS
HW64 -- Revisitation
2022-02-14
time spent: .6 hr
*/

/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/

public int factorial(int n) {
  if (n==1) {
    return n;
  }
  return(factorial(n-1) * n);
}
