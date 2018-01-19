package com.zgodnji.fifastattracker;

import com.kumuluz.ee.discovery.annotations.DiscoverService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RequestScoped
@Path("user-challenges")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserChallengeResource {

    @GET
    public Response getAllChallenges() {
        List<Challenge> challenges = Database.getChallenges();
        return Response.ok(challenges).build();
    }

    @GET
    @Path("{userId}")
    public Response getUserChallenges(@PathParam("userId") String userId) {
        List<Challenge> challenges = Database.getUserChallenges(userId);
        return Response.ok(challenges).build();
    }

    @POST
    public Response addNewChallenge(Challenge c) {
        Database.addChallenge(c);
        return Response.noContent().build();
    }

    @DELETE
    @Path("{userId}")
    public Response deleteChallenge(@PathParam("userId") String userId) {
        Database.deleteChallenge(userId);
        return Response.noContent().build();
    }

    @GET
    @Path("create")
    public Response fillDatabse() {
        Database.addChallenge(new Challenge(
                "1",
                "1",
                "2",
                "1",
                false,
                false,
                null
        ));
        Database.addChallenge(new Challenge(
                "2",
                "2",
                "1",
                "3",
                false,
                false,
                null
        ));
        return Response.noContent().build();
    }

    @Inject
    private UserChallengeProperties properties;

    @GET
    @Path("config")
    public Response getConfig() {
        String response =
                "{" +
                        "\"stringProperty\": \"%s\"," +
                        "\"booleanProperty\": %b," +
                        "\"integerProperty\": %d" +
                        "}";

        response = String.format(
                response,
                properties.getStringProperty(),
                properties.getBooleanProperty(),
                properties.getIntegerProperty());

        return Response.ok(response).build();
    }

}
