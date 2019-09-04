class Programa {
    public static void main(String[] args) {
        Conta cliente1;
        cliente1 = new Conta();

        cliente1.numero = 0000;
        cliente1.titular = "Akrasia";
        cliente1.saldo = 50;
        System.out.println(cliente1.numero);
        System.out.println(cliente1.titular);
        System.out.println(cliente1.saldo);
    }
}