package br.com.danilosilva;

import java.util.logging.Logger;

public class Principal {

    private static final Logger logger = Logger.getLogger("Principal.class");

    public static void main(String[] args){
        int x = 0;
        x++;
        logger.info("Hello: " + x);
    }
}
