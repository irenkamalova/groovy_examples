class Complex {
    // z = ai + b
    private def a, b

    Complex(a, b) {
        this.a = a
        this.b = b
    }

    Complex plus(Complex c) {
        return new Complex(this.a + c.a, this.b + c.b)
    }

    @Override
    boolean equals(Object object) {
        if (object != null && object instanceof Complex) {
            Complex complex = (Complex) object;
            return complex.a == this.a && complex.b == this.b
        }
        else return false;
    }

    @Override
    String toString() {
        return "(" + a + "i + " + b + ")"
    }

    static void main(String[] args) {
        def c1 = new Complex(1, 2);
        def c2 = new Complex(3, 4);
        def c3 = new Complex(4, 6);
        // To sum numbers we defined method plus
        // But for == operator we also needed to override method equals!
        assert c1 + c2 == c3
    }


}
