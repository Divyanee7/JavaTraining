package com.yash.oopsproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class AccountSystem {
//    private JDBCUtil jdbcUtil;
//
//    public AccountSystem() {
//        jdbcUtil = new JDBCUtil();
//
//    }
//
//    public void addEmployee(Employee employee) {
//        String query = "INSERT INTO employees (name, id, type, salary, hoursWorked, rate) VALUES (?, ?, ?, ?, ?, ?)";
//        PreparedStatement statement = jdbcUtil.createPreparedStatement(query);
//        try {
//            statement.setString(1, employee.getName());
//            statement.setInt(2, employee.getId());
//
//            if (employee instanceof FullTimeEmployee) {
//                statement.setString(3, "FullTime");
//                statement.setDouble(4, employee.calculateSalary());
//                statement.setNull(5, Types.INTEGER); //for
//                statement.setNull(6, Types.DOUBLE);
//            } else if (employee instanceof PartTimeEmployee) {
//                statement.setString(3, "PartTime");
//                statement.setNull(4, Types.DOUBLE);
//                statement.setInt(5, ((PartTimeEmployee) employee).getHoursWorked());
//                statement.setDouble(6, ((PartTimeEmployee) employee).getRate());
//            }
//
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        } finally {
//            jdbcUtil.closePreparedStatement(statement);
//        }
//    }
//
//    public void removeEmployee(int id) throws IdDoesNotExistsException {
//        String query = "DELETE FROM employees WHERE id = ?";
//        PreparedStatement statement = jdbcUtil.createPreparedStatement(query);
//        try {
//            statement.setInt(1, id);
//            int rowsDeleted = statement.executeUpdate();
//            if (rowsDeleted == 0) {
//                throw new IdDoesNotExistsException("Employee with id " + id + " does not exist.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        } finally {
//            jdbcUtil.closePreparedStatement(statement);
//        }
//    }
//
//    public List<Employee> getAllEmployees() {
//        List<Employee> employees = new ArrayList<>();
//        String query = "SELECT * FROM employees";
//        ResultSet resultSet = jdbcUtil.createResultSet(query);
//        try {
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String type = resultSet.getString("type");
//                if (type.equals("FullTime")) {
//                    double salary = resultSet.getDouble("salary");
//                    employees.add(new FullTimeEmployee(name, id, salary));
//                } else if (type.equals("PartTime")) {
//                    int hoursWorked = resultSet.getInt("hoursWorked");
//                    double rate = resultSet.getDouble("rate");
//                    employees.add(new PartTimeEmployee(name, id, hoursWorked, rate));
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        } finally {
//            jdbcUtil.closeResultSet(resultSet);
//        }
//
//        return employees;
//    }
//
//    public void displayEmployees() {
//        List<Employee> employees = getAllEmployees();
//        for (Employee emp : employees) {
//            System.out.println(emp.toString());
//        }
//    }
//
//    public void close() {
//        jdbcUtil.closeConnection();
//    }
//}




public class AccountSystem {
    private JDBCUtil jdbcUtil;

    public AccountSystem() {
        jdbcUtil = new JDBCUtil();
    }

    public void addEmployee(Employee employee) {
        String query = "INSERT INTO employees (name, id, type, salary, hoursWorked, rate) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = jdbcUtil.createPreparedStatement(query)) {
            statement.setString(1, employee.getName());
            statement.setInt(2, employee.getId());

            if (employee instanceof FullTimeEmployee) {
                statement.setString(3, "FullTime");
                statement.setDouble(4, employee.calculateSalary());
                statement.setNull(5, Types.INTEGER);
                statement.setNull(6, Types.DOUBLE);
            } else if (employee instanceof PartTimeEmployee) {
                statement.setString(3, "PartTime");
                statement.setNull(4, Types.DOUBLE);
                statement.setInt(5, ((PartTimeEmployee) employee).getHoursWorked());
                statement.setDouble(6, ((PartTimeEmployee) employee).getRate());
            }

            System.out.println("Executing query: " + query);
            statement.executeUpdate();
            System.out.println("Query executed successfully");
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void removeEmployee(int id) throws IdDoesNotExistsException {
        String query = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement statement = jdbcUtil.createPreparedStatement(query)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted == 0) {
                throw new IdDoesNotExistsException("Employee with id " + id + " does not exist.");
            }
            System.out.println("Employee with id " + id + " deleted successfully");
        } catch (SQLException e) {
            System.out.println("Error deleting employee: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employees";
        try (ResultSet resultSet = jdbcUtil.createResultSet(query)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                if (type.equals("FullTime")) {
                    double salary = resultSet.getDouble("salary");
                    employees.add(new FullTimeEmployee(name, id, salary));
                } else if (type.equals("PartTime")) {
                    int hoursWorked = resultSet.getInt("hoursWorked");
                    double rate = resultSet.getDouble("rate");
                    employees.add(new PartTimeEmployee(name, id, hoursWorked, rate));
                }
            }
            System.out.println("Employees retrieved successfully");
        } catch (SQLException e) {
            System.out.println("Error retrieving employees: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return employees;
    }

    public void displayEmployees() {
        List<Employee> employees = getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public void close() {
        jdbcUtil.closeConnection();
    }
}






