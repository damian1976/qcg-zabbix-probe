package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class C6 {

@SerializedName("cpus")
@Expose
private long cpus;
@SerializedName("host")
@Expose
private String host;
@SerializedName("memory")
@Expose
private long memory;
@SerializedName("memory_alloc")
@Expose
private long memoryAlloc;
@SerializedName("state")
@Expose
private String state;
@SerializedName("queues")
@Expose
private String queues;

/**
* No args constructor for use in serialization
*
*/
public C6() {
}

/**
*
* @param memoryAlloc
* @param cpus
* @param host
* @param state
* @param queues
* @param memory
*/
public C6(long cpus, String host, long memory, long memoryAlloc, String state, String queues) {
super();
this.cpus = cpus;
this.host = host;
this.memory = memory;
this.memoryAlloc = memoryAlloc;
this.state = state;
this.queues = queues;
}

public long getCpus() {
return cpus;
}

public void setCpus(long cpus) {
this.cpus = cpus;
}

public C6 withCpus(long cpus) {
this.cpus = cpus;
return this;
}

public String getHost() {
return host;
}

public void setHost(String host) {
this.host = host;
}

public C6 withHost(String host) {
this.host = host;
return this;
}

public long getMemory() {
return memory;
}

public void setMemory(long memory) {
this.memory = memory;
}

public C6 withMemory(long memory) {
this.memory = memory;
return this;
}

public long getMemoryAlloc() {
return memoryAlloc;
}

public void setMemoryAlloc(long memoryAlloc) {
this.memoryAlloc = memoryAlloc;
}

public C6 withMemoryAlloc(long memoryAlloc) {
this.memoryAlloc = memoryAlloc;
return this;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public C6 withState(String state) {
this.state = state;
return this;
}

public String getQueues() {
return queues;
}

public void setQueues(String queues) {
this.queues = queues;
}

public C6 withQueues(String queues) {
this.queues = queues;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("cpus", cpus).append("host", host).append("memory", memory).append("memoryAlloc", memoryAlloc).append("state", state).append("queues", queues).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(memoryAlloc).append(cpus).append(host).append(state).append(queues).append(memory).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof C6) == false) {
return false;
}
C6 rhs = ((C6) other);
return new EqualsBuilder().append(memoryAlloc, rhs.memoryAlloc).append(cpus, rhs.cpus).append(host, rhs.host).append(state, rhs.state).append(queues, rhs.queues).append(memory, rhs.memory).isEquals();
}

}