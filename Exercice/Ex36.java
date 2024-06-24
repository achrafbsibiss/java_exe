import java.util.Scanner;

class Ex36{
    public static void main(String args[]){
        Scanner entre = new Scanner(System.in);
        String name , rev="";
        char ch;

        System.out.println("Entre the name to revere him");
        name =  entre.nextLine();

        for(int i = 0; i < name.length() ; i++){
           ch = name.charAt(i);
           rev = ch+rev;
        }

        System.out.println(rev);
    }
}