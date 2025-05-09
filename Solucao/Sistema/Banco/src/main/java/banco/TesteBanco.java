package banco;

public class TesteBanco {

    public static void main(String[] args) {
        Banco banco = new Banco();


        Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
        Conta contaBH = new ContaPoupança(50000, 3);
        brunoHenrique.setConta(contaBH);


        banco.adicionarCliente(brunoHenrique);



        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            Cliente cliente = banco.getCliente(i);
            Conta conta = cliente.getConta();

            String temp = "Cliente [" + (i + 1) + "] : " +
                          cliente.getNome() + " " +
                          cliente.getSobrenome() + "." +
                          " Saldo R$:" + conta.getSaldo();
            System.out.println(temp);
        }
    }
}
