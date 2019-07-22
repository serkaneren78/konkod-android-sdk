/*
 * KonkodLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.www.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Survey 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 7410419639570304023L;
    private Long konkodId;
    private Long star1;
    private Long star2;
    private Long star3;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("konkodId")
    public Long getKonkodId ( ) { 
        return this.konkodId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("konkodId")
    public void setKonkodId (Long value) { 
        this.konkodId = value;
        notifyObservers(this.konkodId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("star1")
    public Long getStar1 ( ) { 
        return this.star1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("star1")
    public void setStar1 (Long value) { 
        this.star1 = value;
        notifyObservers(this.star1);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("star2")
    public Long getStar2 ( ) { 
        return this.star2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("star2")
    public void setStar2 (Long value) { 
        this.star2 = value;
        notifyObservers(this.star2);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("star3")
    public Long getStar3 ( ) { 
        return this.star3;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("star3")
    public void setStar3 (Long value) { 
        this.star3 = value;
        notifyObservers(this.star3);
    }
 
}