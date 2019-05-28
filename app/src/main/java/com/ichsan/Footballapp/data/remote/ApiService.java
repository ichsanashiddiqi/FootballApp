package com.ichsan.Footballapp.data.remote;

import com.ichsan.Footballapp.data.model.competitions.Competitions;
import com.ichsan.Footballapp.data.model.matches.Matches;
import com.ichsan.Footballapp.data.model.standings.Standings;
import com.ichsan.Footballapp.data.model.teams.Team;
import com.ichsan.Footballapp.data.model.teams.Teams;
import com.ichsan.Footballapp.util.Config;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers(Config.BASE_KEY)
    @GET("/v2/competitions")
    Call<Competitions> getCompetitions();

//    @Headers(Config.BASE_KEY)
//    @GET("/v2/competitions/{id}")
//    Call<Competitions> getCompetitions(@Query("q") String q);

    @Headers(Config.BASE_KEY)
    @GET("/v2/matches")
    Call<Matches> getFixtures();

    @Headers(Config.BASE_KEY)
    @GET("/v2/competitions/{id}/matches")
    Call<Matches> getMatches(@Path("id") int id);

    @Headers(Config.BASE_KEY)
    @GET("/v2/competitions/{id}/standings")
    Call<Standings> getStandings(@Path("id") int id);

    @Headers(Config.BASE_KEY)
    @GET("/v2/competitions/{id}/teams")
    Call<Teams> getTeams(@Path("id") int id);

    @Headers(Config.BASE_KEY)
    @GET("/v2/teams/{id}")
    Call<Team> getPlayers(@Path("id") int id);
}
