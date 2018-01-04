// 1. A + B
//def a = 5
//def b = 6
//println a + b

// 2. Sum in Loop
//def A = [110, 1]
//def sum = 0
//for (a in A) sum += a
//println sum

// 3. Sums in Loop
def size = 3
def A1 = [123, 23, 3]
def A2 = [100, 200, 300]
def A3 = []
0.upto(size - 1, {
    A3[it] = A1[it] + A2[it]
})
println A3

def A4 = []
size.times {
    A4[it] = A1[it] + A2[it]
}
println A4
assert A3 == A4
