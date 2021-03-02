package com.gabrielfva.dataQuery;

import com.gabrielfva.dataAccess.dataAccess;
import com.gabrielfva.dto.CustomerDTO;
import com.gabrielfva.entities.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dataQuery {
    dataAccess co = new dataAccess();
    Customer customer = new Customer();
    CustomerDTO customerDTO = new CustomerDTO();

    public void customerData() throws ClassNotFoundException, SQLException {
        Connection connection = co.conexion();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT customer_id, first_name, last_name, email FROM customer");

        while (rs.next()) {
            customerDTO.setCustomerId(rs.getInt("customer_id"));
            customerDTO.setFullname((rs.getString("first_name")) + " " + (rs.getString("last_name")));
            customerDTO.setEmail(rs.getString("email"));
            System.out.println("Id: " + customerDTO.getCustomerId() + " - Full Name: " + customerDTO.getFullname() + " - Email: " + customerDTO.getEmail());
        }
    }
}
