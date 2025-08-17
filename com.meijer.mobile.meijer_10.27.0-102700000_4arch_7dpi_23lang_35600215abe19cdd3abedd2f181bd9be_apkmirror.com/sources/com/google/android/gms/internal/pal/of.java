package com.google.android.gms.internal.pal;

import java.math.BigDecimal;

/* loaded from: classes6.dex */
public final class of extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f83268a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of)) {
            return false;
        }
        String str = this.f83268a;
        String str2 = ((of) obj).f83268a;
        return str == str2 || str.equals(str2);
    }

    public final String toString() {
        return this.f83268a;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f83268a);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f83268a);
    }

    public final int hashCode() {
        return this.f83268a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f83268a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f83268a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f83268a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f83268a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f83268a).longValue();
        }
    }

    public of(String str) {
        this.f83268a = str;
    }
}
