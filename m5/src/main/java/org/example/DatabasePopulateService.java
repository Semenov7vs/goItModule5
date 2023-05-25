package org.example;

import java.sql.*;


public class DatabasePopulateService {

    public static void main(String[] args) {

        try {
            Connection connection = Database.getConnection();

            insertWorkers(connection);
            insertClients(connection);
            insertProjects(connection);
            insertProjectWorkers(connection);

            connection.close();

            System.out.println("Базу даних успішно заповнено!");
        } catch (SQLException e) {
            System.err.println("Помилка SQL: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }

    private static void insertWorkers(Connection connection) throws SQLException {
        String query = "INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY) VALUES (?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        setWorkerParams(preparedStatement, "Linus Torvalds", Date.valueOf("1990-01-01"), "Trainee", 500);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Bill Gates", Date.valueOf("1995-02-15"), "Junior", 1200);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Steve Jobs", Date.valueOf("1985-03-05"), "Middle", 3000);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Mark Zuckerberg", Date.valueOf("1980-04-20"), "Senior", 6000);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Larry Page", Date.valueOf("1992-05-10"), "Trainee", 700);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Sergey Brin", Date.valueOf("1993-06-25"), "Junior", 1500);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Tim Berners-Lee", Date.valueOf("1988-07-15"), "Middle", 3500);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Ada Lovelace", Date.valueOf("1975-08-30"), "Senior", 8000);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Grace Hopper", Date.valueOf("1982-09-05"), "Trainee", 900);
        preparedStatement.execute();
        setWorkerParams(preparedStatement, "Alan Turing", Date.valueOf("1991-10-12"), "Junior", 1800);
        preparedStatement.execute();

        preparedStatement.close();

    }

    private static void insertClients(Connection connection) throws SQLException {
        String query = "INSERT INTO client (NAME) VALUES (?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        setStringParam(preparedStatement, 1, "Customer 1");
        preparedStatement.execute();

        setStringParam(preparedStatement, 1, "Customer 2");
        preparedStatement.execute();

        setStringParam(preparedStatement, 1, "Customer 3");
        preparedStatement.execute();

        setStringParam(preparedStatement, 1, "Customer 4");
        preparedStatement.execute();

        setStringParam(preparedStatement, 1, "Customer 5");
        preparedStatement.execute();

        preparedStatement.close();

    }

    private static void insertProjects(Connection connection) throws SQLException {
        String query = "INSERT INTO project (CLIENT_ID, START_DATE, FINISH_DATE) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        int clientId;

        clientId = 1;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2008-09-12"));
        setDateParam(preparedStatement, 3, Date.valueOf("2009-03-12"));
        preparedStatement.execute();

        clientId = 1;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2010-01-22"));
        setDateParam(preparedStatement, 3, Date.valueOf("2013-09-22"));
        preparedStatement.execute();

        clientId = 2;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2015-07-05"));
        setDateParam(preparedStatement, 3, Date.valueOf("2017-02-05"));
        preparedStatement.execute();

        clientId = 2;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2019-11-01"));
        setDateParam(preparedStatement, 3, Date.valueOf("2021-02-01"));
        preparedStatement.execute();

        clientId = 3;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2014-12-17"));
        setDateParam(preparedStatement, 3, Date.valueOf("2015-06-17"));
        preparedStatement.execute();

        clientId = 3;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2016-09-28"));
        setDateParam(preparedStatement, 3, Date.valueOf("2023-01-28"));
        preparedStatement.execute();

        clientId = 4;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2013-03-11"));
        setDateParam(preparedStatement, 3, Date.valueOf("2013-12-11"));
        preparedStatement.execute();

        clientId = 4;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2009-05-07"));
        setDateParam(preparedStatement, 3, Date.valueOf("2012-11-07"));
        preparedStatement.execute();

        clientId = 5;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2018-02-13"));
        setDateParam(preparedStatement, 3, Date.valueOf("2019-11-13"));
        preparedStatement.execute();

        clientId = 5;
        setIntParam(preparedStatement, 1, clientId);
        setDateParam(preparedStatement, 2, Date.valueOf("2011-08-19"));
        setDateParam(preparedStatement, 3, Date.valueOf("2012-08-19"));
        preparedStatement.execute();

        preparedStatement.close();
    }

    private static void insertProjectWorkers(Connection connection) throws SQLException {
        String query = "INSERT INTO project_worker (PROJECT_ID, WORKER_ID) VALUES (?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        int[] projectIds = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10};
        int[] workerIds = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 3, 6, 9, 10, 2, 4, 6, 8, 10, 1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 1, 3, 6, 8, 10, 2, 4, 5, 7, 9};

        for (int i = 0; i < projectIds.length; i++) {
            setIntParam(preparedStatement, 1, projectIds[i]);
            setIntParam(preparedStatement, 2, workerIds[i]);
            preparedStatement.addBatch();
        }

        preparedStatement.executeBatch();
        preparedStatement.close();
    }

    private static void setWorkerParams(PreparedStatement preparedStatement, String name, Date birthday, String level, int salary) throws SQLException {
        preparedStatement.setString(1, name);
        preparedStatement.setDate(2, birthday);
        preparedStatement.setString(3, level);
        preparedStatement.setInt(4, salary);
    }

    private static void setStringParam(PreparedStatement preparedStatement, int index, String value) throws SQLException {
        preparedStatement.setString(index, value);
    }

    private static void setDateParam(PreparedStatement preparedStatement, int index, Date value) throws SQLException {
        preparedStatement.setDate(index, value);
    }

    private static void setIntParam(PreparedStatement preparedStatement, int index, int value) throws SQLException {
        preparedStatement.setInt(index, value);
    }

}