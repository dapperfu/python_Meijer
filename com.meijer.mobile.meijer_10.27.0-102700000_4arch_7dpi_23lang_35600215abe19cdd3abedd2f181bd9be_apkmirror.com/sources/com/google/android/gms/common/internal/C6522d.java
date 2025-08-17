package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6522d extends AbstractC15136a {
    public static final Parcelable.Creator<C6522d> CREATOR = new C6543z();

    /* renamed from: a, reason: collision with root package name */
    public final int f64835a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64836b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6522d)) {
            return false;
        }
        C6522d c6522d = (C6522d) obj;
        return c6522d.f64835a == this.f64835a && C6535q.a(c6522d.f64836b, this.f64836b);
    }

    public final int hashCode() {
        return this.f64835a;
    }

    public final String toString() {
        return this.f64835a + ":" + this.f64836b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f64835a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.w(parcel, 2, this.f64836b, false);
        C15137b.b(parcel, iA);
    }

    public C6522d(int i10, String str) {
        this.f64835a = i10;
        this.f64836b = str;
    }
}
