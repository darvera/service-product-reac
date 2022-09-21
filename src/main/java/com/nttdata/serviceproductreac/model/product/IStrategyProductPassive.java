package com.nttdata.serviceproductreac.model.product;


public interface IStrategyProductPassive {

   ProductType getType();
   float getNumMaintenanceCommission();
   boolean getBolMaintenanceCommission();
   int getNumLimitMovements();
   boolean getBolLimitMovements();

}

