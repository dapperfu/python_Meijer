package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes8.dex */
public final class A extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f90292a;

    private BigDecimal a() {
        return C.b(this.f90292a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f90292a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.f90292a.equals(((A) obj).f90292a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f90292a);
    }

    public int hashCode() {
        return this.f90292a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f90292a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f90292a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f90292a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f90292a;
    }

    public A(String str) {
        this.f90292a = str;
    }
}
