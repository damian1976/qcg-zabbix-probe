
package com.deep.qcgprobe.beans.full;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class States_ {


@Override
public String toString() {
return new ToStringBuilder(this).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof States_) == false) {
return false;
}
States_ rhs = ((States_) other);
return new EqualsBuilder().isEquals();
}

}