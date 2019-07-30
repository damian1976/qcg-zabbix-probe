package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Total {

@SerializedName("nodes")
@Expose
private long nodes;
@SerializedName("cpus")
@Expose
private long cpus;
@SerializedName("memory")
@Expose
private long memory;

/**
* No args constructor for use in serialization
*
*/
public Total() {
}

/**
*
* @param cpus
* @param nodes
* @param memory
*/
public Total(long nodes, long cpus, long memory) {
super();
this.nodes = nodes;
this.cpus = cpus;
this.memory = memory;
}

public long getNodes() {
return nodes;
}

public void setNodes(long nodes) {
this.nodes = nodes;
}

public Total withNodes(long nodes) {
this.nodes = nodes;
return this;
}

public long getCpus() {
return cpus;
}

public void setCpus(long cpus) {
this.cpus = cpus;
}

public Total withCpus(long cpus) {
this.cpus = cpus;
return this;
}

public long getMemory() {
return memory;
}

public void setMemory(long memory) {
this.memory = memory;
}

public Total withMemory(long memory) {
this.memory = memory;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("nodes", nodes).append("cpus", cpus).append("memory", memory).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(cpus).append(nodes).append(memory).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Total) == false) {
return false;
}
Total rhs = ((Total) other);
return new EqualsBuilder().append(cpus, rhs.cpus).append(nodes, rhs.nodes).append(memory, rhs.memory).isEquals();
}

}