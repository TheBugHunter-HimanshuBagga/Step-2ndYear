// public class basicsweek2 {
//     public static void main(String[] args){
//         // Ascii - int
//         char[] chars = {'A','B','C','D'};
//         for(char c: chars){
//             // Print character and its ASCII value
//             System.out.println(c + " : " + (int)c);
//         }
//     }
// }

public class basicsweek2{
    public static void main(String[] args){
        int[] asciivalues = {65, 97, 48, 57, 32, 33, 64};
        for(int ascii : asciivalues){
            System.out.println(ascii + ":" + (char)ascii);
        }
    }
}
