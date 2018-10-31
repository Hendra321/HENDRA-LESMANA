package com.company;

public class MainStackFloat {

    public static void main(String[] args) {
	// write your code here
        stack st = new stack();
        st.cetak();

        st.push((float) 546.7);
        st.cetak();

        st.push((float) 6388.45);
        st.cetak();

        st.push((float) 7907.0);
        st.cetak();

        st.push((float) 96.979);
        st.cetak();

        float p1 = st.pop();
        st.cetak();

        float p2 = st.pop();
        st.cetak();

        float p3 = so.pop();
        st.cetak();

        float p4 = st.pop();
        st.cetak();
    }
}
