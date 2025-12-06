public static void main(String[] args){
        int i = 1, sum = 0;

        do {
            sum += i * i;
            i++;
        } while(i <= 10);

        System.out.println("Sum is:" + sum);
}
}
