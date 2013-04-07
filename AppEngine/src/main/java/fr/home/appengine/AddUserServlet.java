package fr.home.appengine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * User: Houssem
 * Date: 07/04/13
 * Time: 17:36
 */
public class AddUserServlet extends HttpServlet {
    private final Logger LOGGER = Logger.getLogger(AddUserServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String prenom = (String) request.getAttribute("prenom");
        LOGGER.info("Prenom : " + prenom);
        String nom = (String) request.getAttribute("nom");
        LOGGER.info("Nom " + nom);

    }
}
