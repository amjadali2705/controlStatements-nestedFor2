class Core2Web{
    public static void main(String[] args) {
        int num1=1;
        for(int i=1; i<=3; i++){
            int num2=3;
            char ch='C';
            for(int j=1; j<=3; j++){
                System.out.print(num1*num1+""+ch-- +""+num2-- +" ");
                num1++;
            }
            System.out.println();
        }
    }
}
