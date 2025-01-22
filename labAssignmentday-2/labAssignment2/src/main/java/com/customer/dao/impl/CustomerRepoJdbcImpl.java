package com.customer.dao.impl;
import com.customer.dao.Customer;
import com.customer.dao.CustomerRepo;
import com.customer.factory.ConnectionFactory;
import java.sql.*;
import java.util.List;


public class CustomerRepoJdbcImpl implements CustomerRepo {

    private final Connection connection;

    // Constructor
    public CustomerRepoJdbcImpl() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }


    // Find customer by ID
    @Override
    public Customer findById(int id) {
        Customer customer=null;
        try {
            PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from Customers where id=?");
            preparedStatement.setInt(1,id);

            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
                customer = new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customer;
    }

    // Save a customer (insert)
    @Override
    public Customer save(Customer customer) {
        String query = "INSERT INTO Customers (id, name, address) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            // Assuming 'getId()' returns an int, 'getName()' returns a String, 'getEmail()' returns a String, and 'getSalary()' returns an int.
            preparedStatement.setInt(1, customer.getId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getAddress());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        customer.setId(generatedKeys.getInt(1)); // Set the auto-generated ID
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving customer", e);
        }

        return customer;
    }
}
