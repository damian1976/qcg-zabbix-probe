package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Config {

@SerializedName("scheduler")
@Expose
private String scheduler;
@SerializedName("started")
@Expose
private String started;
@SerializedName("version")
@Expose
private String version;

/**
* No args constructor for use in serialization
*
*/
public Config() {
}

/**
*
* @param scheduler
* @param started
* @param version
*/
public Config(String scheduler, String started, String version) {
super();
this.scheduler = scheduler;
this.started = started;
this.version = version;
}

public String getScheduler() {
return scheduler;
}

public void setScheduler(String scheduler) {
this.scheduler = scheduler;
}

public Config withScheduler(String scheduler) {
this.scheduler = scheduler;
return this;
}

public String getStarted() {
return started;
}

public void setStarted(String started) {
this.started = started;
}

public Config withStarted(String started) {
this.started = started;
return this;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public Config withVersion(String version) {
this.version = version;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("scheduler", scheduler).append("started", started).append("version", version).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(scheduler).append(started).append(version).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Config) == false) {
return false;
}
Config rhs = ((Config) other);
return new EqualsBuilder().append(scheduler, rhs.scheduler).append(started, rhs.started).append(version, rhs.version).isEquals();
}

}