package appconfig.services;

import appconfig.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private static Map<Integer,Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Thuy","thuy@gmail.com","Thai binh"));
        customers.put(2,new Customer(2,"Thanh","thanh@gmail.com","Thanh Hoa"));
        customers.put(3,new Customer(3,"Yen","yen@gmail.com","Ha Nam"));
        customers.put(4,new Customer(4,"Giang","giang@gmail.com","Ha Noi"));
        customers.put(5,new Customer(5,"Yen","Yen@gmail.com","Thai binh"));

    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
