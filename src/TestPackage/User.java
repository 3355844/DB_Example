package TestPackage;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private boolean isBlock;
    private long id;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String login;
    private Date registerDate;
    private Date lastLoginDate;
    private String lastIP;


    // fields
    ArrayList<Role> roles;
    ArrayList<Cart> carts;
    ArrayList<PointOfSale> point;
    ArrayList<Orders> orders;

}
