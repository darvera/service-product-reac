package com.nttdata.serviceproductreac.model.product.passive;


import com.nttdata.serviceproductreac.model.IBankingFunctions;
import com.nttdata.serviceproductreac.model.product.IStrategyProductPassive;
import com.nttdata.serviceproductreac.model.product.Product;
import com.nttdata.serviceproductreac.model.product.ProductType;

public class CurrentAccount extends Product implements IStrategyProductPassive, IBankingFunctions {

    //ArrayList<String> idSignatories;
    //ArrayList<String> idHolders;


    /*
    int valueCurrentAccount;

    public int getValueCurrentAccount() {
        return valueCurrentAccount;
    }

    public void setValueCurrentAccount(int valueCurrentAccount) {
        this.valueCurrentAccount = valueCurrentAccount;
    }

    public CurrentAccount(ArrayList<String> idSignatories,ArrayList<String> idHolders) {
        super();
        this.idSignatories=idSignatories;
        this.idHolders=idHolders;
    }
    public CurrentAccount() {
        super();
    }

     */
    @Override
    public ProductType getType() {
        return ProductType.CurrentAccount;
    }

    @Override
    public float getNumMaintenanceCommission() {
        return -1;
    }

    @Override
    public boolean getBolMaintenanceCommission() {
        return false;
    }

    @Override
    public int getNumLimitMovements() {
        return 5;
    }

    @Override
    public boolean getBolLimitMovements() {
        return true;
    }

    @Override
    public void Deposit() {
    }
    @Override
    public void Withdraw() {

    }
}
