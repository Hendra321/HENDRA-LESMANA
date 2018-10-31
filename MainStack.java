
public class MainStack {

    public static void main(String[] args) {
	// write your code here
        stack st = new stack();
        st.cetak();

        st.push("Ninja");
        st.cetak();

        st.push("Vixion");
        st.cetak();

        st.push("Satria");
        st.cetak();

        st.push("Beat");
        st.cetak();

        String p1 = st.pop();
        st.cetak();

        String p2 = st.pop();
        st.cetak();

        String p2 = st.pop();
        st.cetak();
		
	String p3 = st.pop();
        st.cetak();





    }
}
