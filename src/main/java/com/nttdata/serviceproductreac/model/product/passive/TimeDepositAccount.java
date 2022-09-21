package com.nttdata.serviceproductreac.model.product.passive;

import com.nttdata.serviceproductreac.model.IBankingFunctions;
import com.nttdata.serviceproductreac.model.product.IStrategyProductPassive;
import com.nttdata.serviceproductreac.model.product.Product;
import com.nttdata.serviceproductreac.model.product.ProductType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeDepositAccount  extends Product implements IStrategyProductPassive, IBankingFunctions {

    @Override
    public ProductType getType() {
        return ProductType.TimeDepositAccount;
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
        return 1;
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
