package com.deep.qcgprobe.beans.full;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class List {

@SerializedName("c1")
@Expose
private C1 c1;
@SerializedName("c2")
@Expose
private C2 c2;
@SerializedName("c3")
@Expose
private C3 c3;
@SerializedName("c4")
@Expose
private C4 c4;
@SerializedName("c5")
@Expose
private C5 c5;
@SerializedName("c6")
@Expose
private C6 c6;
@SerializedName("c7")
@Expose
private C7 c7;
@SerializedName("c8")
@Expose
private C8 c8;
@SerializedName("c9")
@Expose
private C9 c9;
@SerializedName("c10")
@Expose
private C10 c10;

/**
* No args constructor for use in serialization
*
*/
public List() {
}

/**
*
* @param c1
* @param c2
* @param c6
* @param c5
* @param c4
* @param c10
* @param c3
* @param c9
* @param c8
* @param c7
*/
public List(C1 c1, C2 c2, C3 c3, C4 c4, C5 c5, C6 c6, C7 c7, C8 c8, C9 c9, C10 c10) {
super();
this.c1 = c1;
this.c2 = c2;
this.c3 = c3;
this.c4 = c4;
this.c5 = c5;
this.c6 = c6;
this.c7 = c7;
this.c8 = c8;
this.c9 = c9;
this.c10 = c10;
}

public C1 getC1() {
return c1;
}

public void setC1(C1 c1) {
this.c1 = c1;
}

public List withC1(C1 c1) {
this.c1 = c1;
return this;
}

public C2 getC2() {
return c2;
}

public void setC2(C2 c2) {
this.c2 = c2;
}

public List withC2(C2 c2) {
this.c2 = c2;
return this;
}

public C3 getC3() {
return c3;
}

public void setC3(C3 c3) {
this.c3 = c3;
}

public List withC3(C3 c3) {
this.c3 = c3;
return this;
}

public C4 getC4() {
return c4;
}

public void setC4(C4 c4) {
this.c4 = c4;
}

public List withC4(C4 c4) {
this.c4 = c4;
return this;
}

public C5 getC5() {
return c5;
}

public void setC5(C5 c5) {
this.c5 = c5;
}

public List withC5(C5 c5) {
this.c5 = c5;
return this;
}

public C6 getC6() {
return c6;
}

public void setC6(C6 c6) {
this.c6 = c6;
}

public List withC6(C6 c6) {
this.c6 = c6;
return this;
}

public C7 getC7() {
return c7;
}

public void setC7(C7 c7) {
this.c7 = c7;
}

public List withC7(C7 c7) {
this.c7 = c7;
return this;
}

public C8 getC8() {
return c8;
}

public void setC8(C8 c8) {
this.c8 = c8;
}

public List withC8(C8 c8) {
this.c8 = c8;
return this;
}

public C9 getC9() {
return c9;
}

public void setC9(C9 c9) {
this.c9 = c9;
}

public List withC9(C9 c9) {
this.c9 = c9;
return this;
}

public C10 getC10() {
return c10;
}

public void setC10(C10 c10) {
this.c10 = c10;
}

public List withC10(C10 c10) {
this.c10 = c10;
return this;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("c1", c1).append("c2", c2).append("c3", c3).append("c4", c4).append("c5", c5).append("c6", c6).append("c7", c7).append("c8", c8).append("c9", c9).append("c10", c10).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(c1).append(c2).append(c6).append(c5).append(c4).append(c10).append(c3).append(c9).append(c8).append(c7).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof List) == false) {
return false;
}
List rhs = ((List) other);
return new EqualsBuilder().append(c1, rhs.c1).append(c2, rhs.c2).append(c6, rhs.c6).append(c5, rhs.c5).append(c4, rhs.c4).append(c10, rhs.c10).append(c3, rhs.c3).append(c9, rhs.c9).append(c8, rhs.c8).append(c7, rhs.c7).isEquals();
}

}