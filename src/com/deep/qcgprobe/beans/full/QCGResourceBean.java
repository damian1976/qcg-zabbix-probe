package com.deep.qcgprobe.beans.full;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.deep.qcgprobe.beans.QCGResourcesBean.Nodes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QCGResourceBean {

@SerializedName("date")
@Expose
private String date;
@SerializedName("nodes")
@Expose
private Nodes nodes;
@SerializedName("queues")
@Expose
private Queues queues;
@SerializedName("config")
@Expose
private Config config;

/**
* No args constructor for use in serialization
*
*/
public QCGResourceBean() {
}

/**
*
* @param nodes
* @param config
* @param queues
* @param date
*/
public QCGResourceBean(String date, Nodes nodes, Queues queues, Config config) {
super();
this.date = date;
this.nodes = nodes;
this.queues = queues;
this.config = config;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public QCGResourceBean withDate(String date) {
this.date = date;
return this;
}

public Nodes getNodes() {
return nodes;
}

public void setNodes(Nodes nodes) {
this.nodes = nodes;
}

public QCGResourceBean withNodes(Nodes nodes) {
this.nodes = nodes;
return this;
}

public Queues getQueues() {
return queues;
}

public void setQueues(Queues queues) {
this.queues = queues;
}

public QCGResourceBean withQueues(Queues queues) {
this.queues = queues;
return this;
}

public Config getConfig() {
return config;
}

public void setConfig(Config config) {
this.config = config;
}

public QCGResourceBean withConfig(Config config) {
this.config = config;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("date", date).append("nodes", nodes).append("queues", queues).append("config", config).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(nodes).append(config).append(queues).append(date).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof QCGResourceBean) == false) {
return false;
}
QCGResourceBean rhs = ((QCGResourceBean) other);
return new EqualsBuilder().append(nodes, rhs.nodes).append(config, rhs.config).append(queues, rhs.queues).append(date, rhs.date).isEquals();
}

}