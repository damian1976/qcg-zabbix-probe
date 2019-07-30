package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class JobStats {

@SerializedName("total")
@Expose
private Total_ total;
@SerializedName("states")
@Expose

private States_ states;

/**
* No args constructor for use in serialization
*
*/
public JobStats() {
}

/**
*
* @param total
* @param states
*/
public JobStats(Total_ total, States_ states) {
super();
this.total = total;
this.states = states;
}

public Total_ getTotal() {
return total;
}

public void setTotal(Total_ total) {
this.total = total;
}

public JobStats withTotal(Total_ total) {
this.total = total;
return this;
}

public States_ getStates() {
return states;
}

public void setStates(States_ states) {
this.states = states;
}

public JobStats withStates(States_ states) {
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
if ((other instanceof JobStats) == false) {
return false;
}
JobStats rhs = ((JobStats) other);
return new EqualsBuilder().append(total, rhs.total).append(states, rhs.states).isEquals();
}

}