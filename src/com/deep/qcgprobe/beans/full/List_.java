package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class List_ {

@SerializedName("normal")
@Expose
private Normal normal;
@SerializedName("debug")
@Expose
private Debug debug;

/**
* No args constructor for use in serialization
*
*/
public List_() {
}

/**
*
* @param normal
* @param debug
*/
public List_(Normal normal, Debug debug) {
super();
this.normal = normal;
this.debug = debug;
}

public Normal getNormal() {
return normal;
}

public void setNormal(Normal normal) {
this.normal = normal;
}

public List_ withNormal(Normal normal) {
this.normal = normal;
return this;
}

public Debug getDebug() {
return debug;
}

public void setDebug(Debug debug) {
this.debug = debug;
}

public List_ withDebug(Debug debug) {
this.debug = debug;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("normal", normal).append("debug", debug).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(normal).append(debug).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof List_) == false) {
return false;
}
List_ rhs = ((List_) other);
return new EqualsBuilder().append(normal, rhs.normal).append(debug, rhs.debug).isEquals();
}

}