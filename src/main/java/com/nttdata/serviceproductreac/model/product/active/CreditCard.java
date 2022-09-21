package com.nttdata.serviceproductreac.model.product.active;


import com.nttdata.serviceproductreac.model.product.IStrategyProductActive;
import com.nttdata.serviceproductreac.model.product.Product;
import com.nttdata.serviceproductreac.model.product.ProductType;

public class CreditCard  extends Product implements IStrategyProductActive {

    @Override
    public ProductType getType() {
        return ProductType.CreditCard;
    }

    @Override
    public void MakePayments() {

    }
}
