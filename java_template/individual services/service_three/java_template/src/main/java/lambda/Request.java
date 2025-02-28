/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

/**
 *
 * @author wlloyd
 */
public class Request {
    String filterBy;
    String aggregateBy;
    JSONObject filterByJSON;
    JSONObject aggregateByJSON;
    String bucketname;
    String key;

    public String getBucketName() {
        return this.bucketname;
    }
    
    public String getBucketNameALLCAPS() {
        return bucketname.toUpperCase();
    }

    public void setBucketname(String theBucketname) {
        this.bucketname = theBucketname;
    }


    public String getKey() {
        return this.key;
    }
    
    public String getKeyALLCAPS() {
        return this.key.toUpperCase();
    }

    public void setKey(String theKey) {
        this.key = theKey;
    }

    public String getFilterBy() {
        return this.filterBy;
    }
    
    public String getFilterByALLCAPS() {
        return filterBy.toUpperCase();
    }

    public void setFilterBy(String filterBy) {
		this.filterByJSON=new JSONObject(filterBy);
        this.filterBy = filterBy;
    }

    public JSONObject getFilterByAsJSONOBJ() {
            return this.filterByJSON;
    }


    public String getAggregateBy() {
        return this.aggregateBy;
    }
    
    public String getAggregateByALLCAPS() {
        return filterBy.toUpperCase();
    }

    public void setAggregateBy(String aggregateBy) {
        this.aggregateBy = aggregateBy;
		this.aggregateByJSON = new JSONObject(aggregateBy);
    }

    public JSONObject getAggregateByAsJSONOBJ() {
        return this.aggregateByJSON; 
    }
	//constructor
    public Request(String filterBy, String aggregateBy, String key, String bucketname) {
        this.setFilterBy(filterBy);
        this.setAggregateBy(aggregateBy);
        this.setBucketname(bucketname);
        this.setKey(key);
    }


    public Request() {

    }
}
