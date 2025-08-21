package com.google.android.gms.internal.pal;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public final class jf extends C10796ef {

    /* renamed from: a, reason: collision with root package name */
    private final Object f84039a;

    public jf(Boolean bool) {
        this.f84039a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jf.class != obj.getClass()) {
            return false;
        }
        jf jfVar = (jf) obj;
        if (m(this) && m(jfVar)) {
            return h().longValue() == jfVar.h().longValue();
        }
        Object obj2 = this.f84039a;
        if (!(obj2 instanceof Number) || !(jfVar.f84039a instanceof Number)) {
            return obj2.equals(jfVar.f84039a);
        }
        double dDoubleValue = h().doubleValue();
        double dDoubleValue2 = jfVar.h().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public jf(Number number) {
        this.f84039a = number;
    }

    private static boolean m(jf jfVar) {
        Object obj = jfVar.f84039a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.pal.C10796ef
    public final int a() {
        return this.f84039a instanceof Number ? h().intValue() : Integer.parseInt(e());
    }

    @Override // com.google.android.gms.internal.pal.C10796ef
    public final String e() {
        Object obj = this.f84039a;
        return !(obj instanceof Number) ? obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj : h().toString();
    }

    public final Number h() {
        Object obj = this.f84039a;
        return obj instanceof String ? new of((String) obj) : (Number) obj;
    }

    public final boolean k() {
        return this.f84039a instanceof Boolean;
    }

    public final boolean l() {
        return this.f84039a instanceof Number;
    }

    public final boolean zzc() {
        Object obj = this.f84039a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(e());
    }

    public jf(String str) {
        str.getClass();
        this.f84039a = str;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (m(this)) {
            jDoubleToLongBits = h().longValue();
        } else {
            Object obj = this.f84039a;
            if (obj instanceof Number) {
                jDoubleToLongBits = Double.doubleToLongBits(h().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }
}
