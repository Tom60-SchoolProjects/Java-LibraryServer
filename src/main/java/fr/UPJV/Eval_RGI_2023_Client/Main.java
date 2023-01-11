package fr.UPJV.Eval_RGI_2023_Client;

import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String urlBD;
        try {
        maCO = DriverManager.getConnection(urlBD);
        System.out.println("Connexion établie");
    } catch (SQLException e)

    {
        e.printStackTrace();
        System.exit(-3);
    }

        statement = maCO.createStatement();

        ///

        // 4 ème
        try {


        }

        //droptable
        /resuete sans select

        String requeteSansSelect = "CREATE TABLE if nt exists livre (" +
                "";


        try {
            monstatement.executeUpdate(inssertRequest);
            System.out.println("Requete sans select avec succes");
        }

        String requeteAvecSelect = "SELECT * FROM livres";

        // restituer maCo
    }
}