public class App {
    public static void main(String[] args) throws Exception {
        //This will do the job:
        System.out.println("Hello, World!");
        //Better and more JAVA-like do this:
        Hello helloObj = new Hello("H", "e", "l", "l", "o", ",", " ", "W", "o", "r", "l", "d", "!");
        System.out.println(helloObj.getLetter1() + helloObj.getLetter2() + helloObj.getLetter3() + helloObj.getLetter4() + helloObj.getLetter5() + helloObj.getLetter6() + helloObj.getLetter7() + helloObj.getLetter8() +helloObj.getLetter9() + helloObj.getLetter10() + helloObj.getLetter11() + helloObj.getLetter12()+ helloObj.getLetter13());
    }
}
