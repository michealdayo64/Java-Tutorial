class Students{
    int rollNo;
    String name;
    double fee;
}



public class StringArrays{
    public static void main(String args[]){
        Students st = new Students();

        st.rollNo = 12;
        st.name = "Shola";
        st.fee = 21.3;
        
        Students st1 = new Students();

        st1.rollNo = 23;
        st1.name = "Dave";
        st1.fee = 45.3;

        Students st2 = new Students();

        st2.rollNo = 45;
        st2.name = "Larry";
        st2.fee = 13.3;
        

        Students stData[] = new Students[3];
        stData[0] = st;
        stData[1] = st1;
        stData[2] = st2;


        /**for(int i = 0; i < stData.length; i++){
            System.out.println("Name: " + stData[i].name + " Roll No: " + stData[i].rollNo + " Fee: " + stData[i].fee);
            //System.out.println(stData[i].name)
        } **/

       // Enhanced for loop
        for(Students s : stData){
            System.out.println("Name: " + s.name + " Roll No: " + s.rollNo + " Fee: " + s.fee);
        }

    }
}