public class table {
    public static void main(String[]args){
        String[][] tableData={
            {"Name","age","city"},
            {"dharrun","20","mdu"},
            {"sachin","21","chennai"},
            {"shyam","19","trichy"}
        };
        for(int i=0;i<tableData.length;i++){
            for(int j=0;j<tableData[i].length;j++){
                System.out.print("+-----------");
            }
             System.out.println("+");
             
              for(int j=0;i<tableData[i].length;j++){
                System.out.printf("|%-13s",tableData[i][j]);
        }
        System.out.println("|");
}
 for(int j=0;j<tableData[0].length;j++){
    System.out.print("+--------------");
 }
 System.out.println("+");
}
}

        
    
