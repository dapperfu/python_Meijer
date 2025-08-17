package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes7.dex */
public final class A extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f89450a;

    private BigDecimal a() {
        return C.b(this.f89450a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f89450a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.f89450a.equals(((A) obj).f89450a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f89450a);
    }

    public int hashCode() {
        return this.f89450a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f89450a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f89450a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f89450a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f89450a;
    }

    public A(String str) {
        this.f89450a = str;
    }
}
