package com.google.gson;

import com.google.gson.internal.A;
import com.google.gson.internal.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class n extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f89696a;

    public n(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f89696a = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f89696a == null) {
            return nVar.f89696a == null;
        }
        if (w(this) && w(nVar)) {
            return ((this.f89696a instanceof BigInteger) || (nVar.f89696a instanceof BigInteger)) ? p().equals(nVar.p()) : u().longValue() == nVar.u().longValue();
        }
        Object obj2 = this.f89696a;
        if (obj2 instanceof Number) {
            Object obj3 = nVar.f89696a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return o().compareTo(nVar.o()) == 0;
                }
                double dR = r();
                double dR2 = nVar.r();
                return dR == dR2 || (Double.isNaN(dR) && Double.isNaN(dR2));
            }
        }
        return obj2.equals(nVar.f89696a);
    }

    private static boolean w(n nVar) {
        Object obj = nVar.f89696a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.k
    public String h() {
        Object obj = this.f89696a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (x()) {
            return u().toString();
        }
        if (v()) {
            return ((Boolean) this.f89696a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f89696a.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f89696a == null) {
            return 31;
        }
        if (w(this)) {
            jDoubleToLongBits = u().longValue();
        } else {
            Object obj = this.f89696a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(u().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal o() {
        Object obj = this.f89696a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : C.b(h());
    }

    public BigInteger p() {
        Object obj = this.f89696a;
        return obj instanceof BigInteger ? (BigInteger) obj : w(this) ? BigInteger.valueOf(u().longValue()) : C.c(h());
    }

    public Number u() {
        Object obj = this.f89696a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new A((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean v() {
        return this.f89696a instanceof Boolean;
    }

    public boolean x() {
        return this.f89696a instanceof Number;
    }

    public boolean y() {
        return this.f89696a instanceof String;
    }

    public n(Number number) {
        Objects.requireNonNull(number);
        this.f89696a = number;
    }

    public boolean q() {
        if (v()) {
            return ((Boolean) this.f89696a).booleanValue();
        }
        return Boolean.parseBoolean(h());
    }

    public double r() {
        if (x()) {
            return u().doubleValue();
        }
        return Double.parseDouble(h());
    }

    public int s() {
        if (x()) {
            return u().intValue();
        }
        return Integer.parseInt(h());
    }

    public long t() {
        if (x()) {
            return u().longValue();
        }
        return Long.parseLong(h());
    }

    public n(String str) {
        Objects.requireNonNull(str);
        this.f89696a = str;
    }
}
