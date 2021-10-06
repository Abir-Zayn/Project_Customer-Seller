package ProjectCustomerSeller;

class product{
        //Product ID
        //  quantity
        // price
        // Name

        private String productID;
        private int quantity;
        private int price;
        private String name;
        
        //changleable

      
        public product(String productID){
            this.productID = productID;
        }

        //parameterized constructor 1
        public product( String productID, String name){
            this.productID = productID;
            this.name = name;
        }

         //parameterized constructor 2
        public product( String productID, String name, int price){
            this.productID = productID;
            this.name = name;
            setPrice(price);
        }

        //parameterized constructor 3
        public product( String productID, String name, int price, int quantity){
            this.productID = productID;
            this.name = name;
            setPrice(price);
            setQuantity(quantity);
        }
        
        void display( ){
            System.out.println("");
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: "+name);
            System.out.println("Product Price:"+price);
            System.out.println("Quantity: " + quantity);
            System.out.println("");
        }
        //changleable
        public int getPrice(){
            return price;
        }
        
        public void setPrice(int price){
            this.price = price;
        }

        public  int getquantity(){
            return quantity;
        }

        public void  setQuantity(int quantity){
                this.quantity = quantity;
        }

        //Non-Changeable
        public String getName(){
            return name;
        }

        public String getProduct(){
            return productID;
        }

}

class customer{
    // cus Name
    // cus ID
    // cus address
    // cus phone

    private String customerID;               //Not Changeable
    private String customerAddress;     //changleable
    private String customerPhone;       //changleable
    private String customerName;       // not changeable

    public customer(String customerID, String customerAddress, String customerPhone,String customerName){
        this.customerID = customerID;
        setCustomerAddress(customerAddress);
        setCustomerPhone(customerPhone);
        this.customerName = customerName;
    }

    public customer(String customerID, String customerName, String customerPhone){
        this.customerID = customerID;
       setCustomerAddress(customerAddress);
       setCustomerPhone(customerPhone);
    }
    

    public customer(String customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }

    //non-changeable
    public String getCustomerID(){
        return customerID;
    }

    public String getCustomerName(){
        return customerName;
    }

    //Changeable
    public String getCustomerPhone(){
        return customerPhone;
    }

    public String getCustomerAddress(){
        return customerAddress;
    }


    public void setCustomerPhone(String customerPhone){
            this.customerPhone = customerPhone;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }

    void displayCust(){
        System.out.println("");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer address: " + customerAddress);
        System.out.println("Customer phone: " + customerPhone);
        System.out.println("Customer name: " + customerName);
       
    }

}

public class projectCust {
    public static void main(String[] args) {
        product p1=new product("66AUZ76","Heaphone",800,3);

        customer c1=new customer("666-54-34","Halishahar,K block","0183467990","Shafayet karim");

        product p2= new product("666AUZ77","KZ-ProHeadgear",1900,1);
        customer c2=new customer("666-54-38","agrabad","01839261","Meharaj");
        p1.display();
        c1.displayCust();

        p2.display();
        c2.displayCust();
    }
}
