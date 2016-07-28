package Maven_Oracle_Hibernate.Maven_Oracle_Hibernate;

import com.collaborative.dataProvider.DataProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DataProvider.insertUser();
        DataProvider.insertUserUsingHibernate();
    }
}
