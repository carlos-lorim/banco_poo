package banco;

public class ContaCorrente extends Conta {

double chequeEspecial;

    public ContaCorrente(double saldoInicial , double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

public ContaCorrente(double saldoInicial ) {
        this ( saldoInicial , 0.0);
}


    @Override public boolean sacar(double valor) {

            if (valor > this.saldo + this.chequeEspecial) {
                return false;
            }
            if (valor <= this.saldo){
                this.saldo -= valor;
            }
            return true;



        //                else {
        //                    double deficitEspecial = this.saldo - valor ;
        //                    this.chequeEspecial =- deficitEspecial;
        //                }
        //
        //
            }


}
