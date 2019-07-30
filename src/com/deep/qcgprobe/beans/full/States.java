package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class States {

@SerializedName("IDLE")
@Expose
private long iDLE;

/**
* No args constructor for use in serialization
*
*/
public States() {
}

/**
*
* @param iDLE
*/
public States(long iDLE) {
super();
this.iDLE = iDLE;
}

public long getIDLE() {
return iDLE;
}

public void setIDLE(long iDLE) {
this.iDLE = iDLE;
}

public States withIDLE(long iDLE) {
this.iDLE = iDLE;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("iDLE", iDLE).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(iDLE).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof States) == false) {
return false;
}
States rhs = ((States) other);
return new EqualsBuilder().append(iDLE, rhs.iDLE).isEquals();
}

}