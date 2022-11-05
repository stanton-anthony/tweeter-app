package edu.byu.cs.tweeter.model.net.request;

import edu.byu.cs.tweeter.model.domain.AuthToken;

/**
 * Contains all the information needed to make a request to have the server return the next page of
 * followers for a specified user.
 */
public class StoryRequest {

    private AuthToken authToken;
    private String followerAlias;
    private int limit;
    private String lastStatusUserAlias;
    private String date;

    /**
     * Allows construction of the object from Json. Private so it won't be called in normal code.
     */
    public StoryRequest() {}

    /**
     * Creates an instance.
     *
     * @param followerAlias the alias of the user whose followers are to be returned.
     * @param limit the maximum number of followers to return.
     * @param lastStatusUserAlias the alias of the user of the last status that was returned in the previous request (null if
     *                     there was no previous request or if no statuses were returned in the
     *                     previous request).
     */
    public StoryRequest(AuthToken authToken, String followerAlias, int limit, String lastStatusUserAlias, String date) {
        this.authToken = authToken;
        this.followerAlias = followerAlias;
        this.limit = limit;
        this.lastStatusUserAlias = lastStatusUserAlias;
        this.date = date;
    }

    /**
     * Returns the auth token of the user who is making the request.
     *
     * @return the auth token.
     */
    public AuthToken getAuthToken() {
        return authToken;
    }

    /**
     * Sets the auth token.
     *
     * @param authToken the auth token.
     */
    public void setAuthToken(AuthToken authToken) {
        this.authToken = authToken;
    }

    /**
     * Returns the follower whose followers are to be returned by this request.
     *
     * @return the follower.
     */
    public String getFollowerAlias() {
        return followerAlias;
    }

    /**
     * Sets the follower.
     *
     * @param followerAlias the follower.
     */
    public void setFollowerAlias(String followerAlias) {
        this.followerAlias = followerAlias;
    }

    /**
     * Returns the number representing the maximum number of followers to be returned by this request.
     *
     * @return the limit.
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the limit.
     *
     * @param limit the limit.
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getLastStatusUserAlias() {
        return lastStatusUserAlias;
    }

    public void setLastStatusUserAlias(String lastStatusUserAlias) {
        this.lastStatusUserAlias = lastStatusUserAlias;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
