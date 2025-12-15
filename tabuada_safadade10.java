public class tabuada_safadade10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o valor da tabuada: ");
    int tabuada = sc.nextInt();

    for(int i = 1; i <=10;i++){

        System.out.println(tabuada + "*" + i + "=" + (tabuada*i));
        
    }
    }
}
