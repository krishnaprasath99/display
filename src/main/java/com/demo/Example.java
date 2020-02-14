package com.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Example {



    @JsonProperty("uId")
    private String uId;
    /*   @JsonProperty("status")
        private Integer status;
    */    @JsonProperty("clientContext")
    private String clientContext;

    @JsonProperty("sinceModifiedToken")
    private String sinceModifiedToken;
    /*@JsonProperty("location")
    private Example location;
    */@JsonProperty("users")
    private List<Example> users = null;
    @JsonProperty("totalBatchCount")
    private String totalBatchCount;
    @JsonProperty("totalCount")
    private Integer totalCount;
    @JsonProperty("batchCount")
    private Integer batchCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("uId")
    public String getUId() {
        return uId;
    }

    @JsonProperty("uId")
    public void setUId(String uId) {
        this.uId = uId;
    }

    /*    @JsonProperty("status")
        public Integer getStatus() {
            return status;
        }

        @JsonProperty("status")
        public void setStatus(Integer status) {
            this.status = status;
        }
    */
    @JsonProperty("clientContext")
    public String getClientContext() {
        return clientContext;
    }

    @JsonProperty("clientContext")
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }


    @JsonProperty("sinceModifiedToken")
    public String getSinceModifiedToken() {
        return sinceModifiedToken;
    }

    @JsonProperty("sinceModifiedToken")
    public void setSinceModifiedToken(String sinceModifiedToken) {
        this.sinceModifiedToken = sinceModifiedToken;
    }
    /*
        @JsonProperty("location")
        public Example getLocation() {
            return location;
        }

        @JsonProperty("location")
        public void setLocation(Example location) {
            this.location = location;
        }
    */
    @JsonProperty("users")
    public List<Example> getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(List<Example> users) {
        this.users = users;
    }

    @JsonProperty("totalBatchCount")
    public String getTotalBatchCount() {
        return totalBatchCount;
    }

    @JsonProperty("totalBatchCount")
    public void setTotalBatchCount(String totalBatchCount) {
        this.totalBatchCount = totalBatchCount;
    }

    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("batchCount")
    public Integer getBatchCount() {
        return batchCount;
    }

    @JsonProperty("batchCount")
    public void setBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    //-----------------------------------------

    @JsonProperty("locationName")
    private String locationName;
    @JsonProperty("locationId")
    private Integer locationId;
    /*    @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    */
    @JsonProperty("locationName")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("locationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
/*
    @JsonProperty("locationId")
    public Integer getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
*/
    //------------------------


    @JsonProperty("clientUserIdStr")
    private String clientUserIdStr;
    @JsonProperty("inviteCode")
    private String inviteCode;
    /*    @JsonProperty("status")
        private String status;
    */    @JsonProperty("inviteUrl")
    private String inviteUrl;
    @JsonProperty("userId")
    private Integer userId;
    /*    @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    */
    @JsonProperty("clientUserIdStr")
    public String getClientUserIdStr() {
        return clientUserIdStr;
    }

    @JsonProperty("clientUserIdStr")
    public void setClientUserIdStr(String clientUserIdStr) {
        this.clientUserIdStr = clientUserIdStr;
    }

    @JsonProperty("inviteCode")
    public String getInviteCode() {
        return inviteCode;
    }

    @JsonProperty("inviteCode")
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }
    /*
        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        @JsonProperty("status")
        public void setStatus(String status) {
            this.status = status;
        }
    */
    @JsonProperty("inviteUrl")
    public String getInviteUrl() {
        return inviteUrl;
    }

    @JsonProperty("inviteUrl")
    public void setInviteUrl(String inviteUrl) {
        this.inviteUrl = inviteUrl;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
/*
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
*/

}