package com.gabrielfva;

import com.gabrielfva.dataQuery.dataQuery;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// write your code here
        dataQuery dq = new dataQuery();
        dq.customerData();
    }
}
