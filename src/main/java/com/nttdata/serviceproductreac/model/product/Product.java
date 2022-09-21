package com.nttdata.serviceproductreac.model.product;
import com.nttdata.serviceproductreac.model.product.passive.CurrentAccount;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;


@Getter
@Setter
//@ToString(exclude = {"id"}) //uncoment
public class Product  {
    @Id       //uncoment
    String id; //unmcoment
    ProductType type;
    String idClient;
    //String ClientType;
    String description;
    ArrayList<String> benefits;
    CurrentAccount currentAccount;

    public Product(){

    }
    /*
    public Product(CurrentAccount currentAccount, String idClient){

    }
    public Product(SavingAccount savingAccount, String idClient){

    }
    public Product(TimeDepositAccount timeDepositAccount){

    }*/
/*
    ArrayList<String> considerations;

    ArrayList<String> restrictions;
*/

}
