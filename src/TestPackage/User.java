package TestPackage;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private boolean isBlock;
    private long id;
    private long idAddress;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String login;
    private Date registerDate;
    private Date lastLoginDate;
    private String lastIP;
    private ArrayList<Role> roles;
    private ArrayList<Cart> carts;
    private ArrayList<PointOfSale> point;
    private ArrayList<Orders> orders;

}
