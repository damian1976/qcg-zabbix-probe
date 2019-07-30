package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Queues {

@SerializedName("list")
@Expose
private List_ list;
@SerializedName("job_stats")
@Expose
private JobStats jobStats;

/**
* No args constructor for use in serialization
*
*/
public Queues() {
}

/**
*
* @param list
* @param jobStats
*/
public Queues(List_ list, JobStats jobStats) {
super();
this.list = list;
this.jobStats = jobStats;
}

public List_ getList() {
return list;
}

public void setList(List_ list) {
this.list = list;
}

public Queues withList(List_ list) {
this.list = list;
return this;
}

public JobStats getJobStats() {
return jobStats;
}

public void setJobStats(JobStats jobStats) {
this.jobStats = jobStats;
}

public Queues withJobStats(JobStats jobStats) {
this.jobStats = jobStats;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("list", list).append("jobStats", jobStats).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(list).append(jobStats).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Queues) == false) {
return false;
}
Queues rhs = ((Queues) other);
return new EqualsBuilder().append(list, rhs.list).append(jobStats, rhs.jobStats).isEquals();
}

}