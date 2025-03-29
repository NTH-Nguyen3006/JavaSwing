package Assignment1.dao;

import Extension.Sql.Sql;

public class MyConnection {
    static Sql connect = new Sql("""
            jdbc:sqlserver://localhost:1433;
            databaseName=fpl_daotao;
            encrypt=true;
            trustServerCertificate=true
            """, "sa", "123").Connect();
}
