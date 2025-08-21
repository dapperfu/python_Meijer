package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;

/* loaded from: classes6.dex */
public final class v6 extends AbstractC15707a {
    public static final Parcelable.Creator<v6> CREATOR = new w6();

    /* renamed from: a, reason: collision with root package name */
    public final int f86765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86766b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86767c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f86768d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86769e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86770f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f86771g;

    v6(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f86765a = i10;
        this.f86766b = str;
        this.f86767c = j10;
        this.f86768d = l10;
        this.f86771g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f86769e = str2;
        this.f86770f = str3;
    }

    public final Object B() {
        Long l10 = this.f86768d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f86771g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f86769e;
        if (str != null) {
            return str;
        }
        return null;
    }

    v6(x6 x6Var) {
        this(x6Var.f86872c, x6Var.f86873d, x6Var.f86874e, x6Var.f86871b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w6.a(this, parcel, i10);
    }

    v6(String str, long j10, Object obj, String str2) {
        com.google.android.gms.common.internal.r.f(str);
        this.f86765a = 2;
        this.f86766b = str;
        this.f86767c = j10;
        this.f86770f = str2;
        if (obj == null) {
            this.f86768d = null;
            this.f86771g = null;
            this.f86769e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f86768d = (Long) obj;
            this.f86771g = null;
            this.f86769e = null;
        } else if (obj instanceof String) {
            this.f86768d = null;
            this.f86771g = null;
            this.f86769e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f86768d = null;
                this.f86771g = (Double) obj;
                this.f86769e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
