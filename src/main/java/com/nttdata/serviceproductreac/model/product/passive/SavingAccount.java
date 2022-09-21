package com.nttdata.serviceproductreac.model.product.passive;

import com.nttdata.serviceproductreac.model.IBankingFunctions;
import com.nttdata.serviceproductreac.model.product.IStrategyProductPassive;
import com.nttdata.serviceproductreac.model.product.Product;
import com.nttdata.serviceproductreac.model.product.ProductType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingAccount extends Product implements IStrategyProductPassive, IBankingFunctions {



   // int valueSavingAccount;

    @Override
    public ProductType getType() {
        return ProductType.SavingAccount;
    }

    @Override
    public float getNumMaintenanceCommission() {
        return (float) 5.0;
    }

    @Override
    public boolean getBolMaintenanceCommission() {
        return true;
    }

    @Override
    public int getNumLimitMovements() {
        return -1;
    }

    @Override
    public boolean getBolLimitMovements() {
        return false;
    }

    @Override
    public void Deposit() {

    }

    @Override
    public void Withdraw() {

    }
}
