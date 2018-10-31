package com.company;

public class MainStackDouble {

    public static void main(String[] args) {
	// write your code here
        stack st = new stack();
        st.cetak();

        st.push(6.9);
        st.cetak();

        st.push(78.55);
        st.cetak();

        st.push(57.0);
        st.cetak();

        st.push(6.9);
        st.cetak();

        double p1 = st.pop();
        st.cetak();

        double p2 = st.pop();
        st.cetak();

        double p3 = st.pop();
        st.cetak();

        double p4 = st.pop();
        st.cetak();





    }
}
