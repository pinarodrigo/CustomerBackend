/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinanet.newsintegration;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import org.json.JSONException;

import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author rpn8fe
 */
@Stateless
@Path("news")
public class NewsFacadeREST {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of News
     */
    public NewsFacadeREST() {
    }

    /**
     * Retrieves representation of an instance of
     * com.pinanet.newsintegration.News
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("stage")
    @Produces("application/json")
    public String getBZOStage() {
        JSONObject jsonObject = new JSONObject();
        String jsonString = "{\n"
                + "    \"glossary\": {\n"
                + "        \"title\": \"example glossary\",\n"
                + "		\"GlossDiv\": {\n"
                + "            \"title\": \"S\",\n"
                + "			\"GlossList\": {\n"
                + "                \"GlossEntry\": {\n"
                + "                    \"ID\": \"SGML\",\n"
                + "					\"SortAs\": \"SGML\",\n"
                + "					\"GlossTerm\": \"Standard Generalized Markup Language\",\n"
                + "					\"Acronym\": \"SGML\",\n"
                + "					\"Abbrev\": \"ISO 8879:1986\",\n"
                + "					\"GlossDef\": {\n"
                + "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n"
                + "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\n"
                + "                    },\n"
                + "					\"GlossSee\": \"markup\"\n"
                + "                }\n"
                + "            }\n"
                + "        }\n"
                + "    }\n"
                + "}";
        try {
            jsonObject = new JSONObject(jsonString);
        } catch (UnsupportedOperationException e) {
            return e.getMessage();
        } catch (JSONException ex) {
            Logger.getLogger(NewsFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jsonObject.toString();
    }

    /**
     * PUT method for updating or creating an instance of News
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
