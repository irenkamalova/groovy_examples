// Minimum of Two
def size = 5
def A = [1, 2, 3, 4, 5]
def B = [5, 4, 3, 2, 1]
def C = []
size.times {
    C[it] = Math.min(A[it], B[it])
}
println C

// Minimum of Three - have to contain if statement
C = [0, 1, 2, 3, 4]
def D = []
size.times {
    D[it] = Math.min(A[it], B[it])
    D[it] = Math.min(D[it], C[it])
}
println D
size.times {
    if (A[it] < B[it])
        if (A[it] < C[it]) D[it] = A[it]
        else D[it] = C[it]
    else
        if (B[it] < C[it]) D[it] = B[it]
        else D[it] = C[it]
}

// get minimum from array A
def getMin(size, A) {
    def min = A[0]
    size.times {
        if (A[it] < min) min = A[it]
    }
    min
}

assert 1 == getMin(A.size(), A)
assert 1 == getMin(B.size(), B)
assert 0 == getMin(C.size(), C)