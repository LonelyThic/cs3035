#donne checked

from enum import IntEnum

class Row(IntEnum):
    R0 = 0
    R1 = 1
    R2 = 2

class Col(IntEnum):
    C0 = 0
    C1 = 1
    C2 = 2

def matrixAdd(A, B, SUM):
    for r in Row:
        for c in Col:
            SUM[r][c] = A[r][c] + B[r][c]

def matrixAddAsString(A, B, SUM):
    for r in Row:
        for c in Col:
            SUM[r][c] = str(A[r][c]) + str(B[r][c])

def printMatrix(M, title):
    print(f"\n{title}")
    for row in M:
        print(row)

def main():
    A = [
        [1, -2, 3],
        [-4, 5, -6],
        [7, -8, 9]
    ]

    B = [
        [-1, 2, -3],
        [4, -5, 6],
        [-7, 8, -9]
    ]

    SUM_numeric = [[0 for _ in Col] for _ in Row]
    SUM_string  = [["" for _ in Col] for _ in Row]

    matrixAdd(A, B, SUM_numeric)
    matrixAddAsString(A, B, SUM_string)

    printMatrix(A, "Matrix A")
    printMatrix(B, "Matrix B")
    printMatrix(SUM_numeric, "Numeric Matrix Addition (A + B)")
    printMatrix(SUM_string, "String Matrix Addition (Concatenation)")

if __name__ == "__main__":
    main()