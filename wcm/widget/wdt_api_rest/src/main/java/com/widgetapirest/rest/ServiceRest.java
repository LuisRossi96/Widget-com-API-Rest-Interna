package com.widgetapirest.rest;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

import com.fluig.customappkey.Keyring;
import com.fluig.sdk.api.customappkey.KeyVO;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.totvs.technology.wcm.sdk.rest.WCMRest;

/* 

 *	'URL_FLUIG/wdt_api_rest/api/rest/service/helloWorld'
 
 * 	/wdt_api_rest 		Código do context-root no arquivo 'jboss-web.xml'
 * 	/api/rest			É o Path da classe 'ApplicationConfig.java'
 * 	/service			É o Path da classe 'ServiceRest.java' 
 * 	/helloWorld			É o endpoint disopnível dentro da classe 'ServiceRest.java'
 
 */

@Path("/service")
@Produces(MediaType.APPLICATION_JSON)
public class ServiceRest extends WCMRest {
 
    @GET
    @Path("/helloWorld")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHelloWorld() {
      String hello = "Hello World!";
      Integer status = 200;
      
      Map<String, String> response = new HashMap<String, String>();
      response.put("chave_1", hello);
      
      return Response.status(status).entity(response).type(MediaType.APPLICATION_JSON).build();
    }
}