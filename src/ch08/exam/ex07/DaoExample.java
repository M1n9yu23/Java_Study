package ch08.exam.ex07;

public class DaoExample {
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }

    public static void dbWork(DataAccessObject dataAccessObject){
        dataAccessObject.select();
        dataAccessObject.insert();
        dataAccessObject.update();
        dataAccessObject.delete();
    }
}
