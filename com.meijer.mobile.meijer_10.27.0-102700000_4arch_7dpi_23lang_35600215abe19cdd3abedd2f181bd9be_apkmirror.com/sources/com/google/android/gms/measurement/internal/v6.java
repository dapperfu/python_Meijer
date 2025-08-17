package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;

/* loaded from: classes6.dex */
public final class v6 extends AbstractC15136a {
    public static final Parcelable.Creator<v6> CREATOR = new w6();

    /* renamed from: a, reason: collision with root package name */
    public final int f85925a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85926b;

    /* renamed from: c, reason: collision with root package name */
    public final long f85927c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f85928d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85929e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85930f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f85931g;

    v6(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f85925a = i10;
        this.f85926b = str;
        this.f85927c = j10;
        this.f85928d = l10;
        this.f85931g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f85929e = str2;
        this.f85930f = str3;
    }

    public final Object B() {
        Long l10 = this.f85928d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f85931g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f85929e;
        if (str != null) {
            return str;
        }
        return null;
    }

    v6(x6 x6Var) {
        this(x6Var.f86032c, x6Var.f86033d, x6Var.f86034e, x6Var.f86031b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w6.a(this, parcel, i10);
    }

    v6(String str, long j10, Object obj, String str2) {
        com.google.android.gms.common.internal.r.f(str);
        this.f85925a = 2;
        this.f85926b = str;
        this.f85927c = j10;
        this.f85930f = str2;
        if (obj == null) {
            this.f85928d = null;
            this.f85931g = null;
            this.f85929e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f85928d = (Long) obj;
            this.f85931g = null;
            this.f85929e = null;
        } else if (obj instanceof String) {
            this.f85928d = null;
            this.f85931g = null;
            this.f85929e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f85928d = null;
                this.f85931g = (Double) obj;
                this.f85929e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
