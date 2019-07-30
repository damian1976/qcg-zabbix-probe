package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class NodeStats {

@SerializedName("total")
@Expose
private Total total;
@SerializedName("states")
@Expose
private States states;

/**
* No args constructor for use in serialization
*
*/
public NodeStats() {
}

/**
*
* @param total
* @param states
*/
public NodeStats(Total total, States states) {
super();
this.total = total;
this.states = states;
}

public Total getTotal() {
return total;
}

public void setTotal(Total total) {
this.total = total;
}

public NodeStats withTotal(Total total) {
this.total = total;
return this;
}

public States getStates() {
return states;
}

public void setStates(States states) {
this.states = states;
}

public NodeStats withStates(States states) {
this.states = states;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("total", total).append("states", states).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(total).append(states).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof NodeStats) == false) {
return false;
}
NodeStats rhs = ((NodeStats) other);
return new EqualsBuilder().append(total, rhs.total).append(states, rhs.states).isEquals();
}

}