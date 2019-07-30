package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Normal {

@SerializedName("default")
@Expose
private boolean _default;
@SerializedName("def_walltime")
@Expose
private String defWalltime;
@SerializedName("max_nodes")
@Expose
private long maxNodes;
@SerializedName("max_time")
@Expose
private String maxTime;
@SerializedName("min_nodes")
@Expose
private long minNodes;
@SerializedName("nodes")
@Expose
private long nodes;
@SerializedName("priority")
@Expose
private long priority;
@SerializedName("state")
@Expose
private String state;
@SerializedName("cpus")
@Expose
private long cpus;

/**
* No args constructor for use in serialization
*
*/
public Normal() {
}

/**
*
* @param cpus
* @param priority
* @param nodes
* @param _default
* @param state
* @param maxTime
* @param minNodes
* @param maxNodes
* @param defWalltime
*/
public Normal(boolean _default, String defWalltime, long maxNodes, String maxTime, long minNodes, long nodes, long priority, String state, long cpus) {
super();
this._default = _default;
this.defWalltime = defWalltime;
this.maxNodes = maxNodes;
this.maxTime = maxTime;
this.minNodes = minNodes;
this.nodes = nodes;
this.priority = priority;
this.state = state;
this.cpus = cpus;
}

public boolean isDefault() {
return _default;
}

public void setDefault(boolean _default) {
this._default = _default;
}

public Normal withDefault(boolean _default) {
this._default = _default;
return this;
}

public String getDefWalltime() {
return defWalltime;
}

public void setDefWalltime(String defWalltime) {
this.defWalltime = defWalltime;
}

public Normal withDefWalltime(String defWalltime) {
this.defWalltime = defWalltime;
return this;
}

public long getMaxNodes() {
return maxNodes;
}

public void setMaxNodes(long maxNodes) {
this.maxNodes = maxNodes;
}

public Normal withMaxNodes(long maxNodes) {
this.maxNodes = maxNodes;
return this;
}

public String getMaxTime() {
return maxTime;
}

public void setMaxTime(String maxTime) {
this.maxTime = maxTime;
}

public Normal withMaxTime(String maxTime) {
this.maxTime = maxTime;
return this;
}

public long getMinNodes() {
return minNodes;
}

public void setMinNodes(long minNodes) {
this.minNodes = minNodes;
}

public Normal withMinNodes(long minNodes) {
this.minNodes = minNodes;
return this;
}

public long getNodes() {
return nodes;
}

public void setNodes(long nodes) {
this.nodes = nodes;
}

public Normal withNodes(long nodes) {
this.nodes = nodes;
return this;
}

public long getPriority() {
return priority;
}

public void setPriority(long priority) {
this.priority = priority;
}

public Normal withPriority(long priority) {
this.priority = priority;
return this;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public Normal withState(String state) {
this.state = state;
return this;
}

public long getCpus() {
return cpus;
}

public void setCpus(long cpus) {
this.cpus = cpus;
}

public Normal withCpus(long cpus) {
this.cpus = cpus;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("_default", _default).append("defWalltime", defWalltime).append("maxNodes", maxNodes).append("maxTime", maxTime).append("minNodes", minNodes).append("nodes", nodes).append("priority", priority).append("state", state).append("cpus", cpus).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(cpus).append(priority).append(nodes).append(_default).append(state).append(maxTime).append(minNodes).append(maxNodes).append(defWalltime).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Normal) == false) {
return false;
}
Normal rhs = ((Normal) other);
return new EqualsBuilder().append(cpus, rhs.cpus).append(priority, rhs.priority).append(nodes, rhs.nodes).append(_default, rhs._default).append(state, rhs.state).append(maxTime, rhs.maxTime).append(minNodes, rhs.minNodes).append(maxNodes, rhs.maxNodes).append(defWalltime, rhs.defWalltime).isEquals();
}

}