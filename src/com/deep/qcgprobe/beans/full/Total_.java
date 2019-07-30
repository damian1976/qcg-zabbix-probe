package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Total_ {

@SerializedName("jobs")
@Expose
private long jobs;
@SerializedName("cpus")
@Expose
private long cpus;

/**
* No args constructor for use in serialization
*
*/
public Total_() {
}

/**
*
* @param cpus
* @param jobs
*/
public Total_(long jobs, long cpus) {
super();
this.jobs = jobs;
this.cpus = cpus;
}

public long getJobs() {
return jobs;
}

public void setJobs(long jobs) {
this.jobs = jobs;
}

public Total_ withJobs(long jobs) {
this.jobs = jobs;
return this;
}

public long getCpus() {
return cpus;
}

public void setCpus(long cpus) {
this.cpus = cpus;
}

public Total_ withCpus(long cpus) {
this.cpus = cpus;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("jobs", jobs).append("cpus", cpus).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(cpus).append(jobs).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Total_) == false) {
return false;
}
Total_ rhs = ((Total_) other);
return new EqualsBuilder().append(cpus, rhs.cpus).append(jobs, rhs.jobs).isEquals();
}

}