package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;

/* loaded from: classes6.dex */
public final class G extends AbstractC15136a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    public final String f85021a;

    /* renamed from: b, reason: collision with root package name */
    public final E f85022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85023c;

    /* renamed from: d, reason: collision with root package name */
    public final long f85024d;

    G(G g10, long j10) {
        com.google.android.gms.common.internal.r.l(g10);
        this.f85021a = g10.f85021a;
        this.f85022b = g10.f85022b;
        this.f85023c = g10.f85023c;
        this.f85024d = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f85022b);
        String str = this.f85023c;
        int length = String.valueOf(str).length();
        String str2 = this.f85021a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        H.a(this, parcel, i10);
    }

    public G(String str, E e10, String str2, long j10) {
        this.f85021a = str;
        this.f85022b = e10;
        this.f85023c = str2;
        this.f85024d = j10;
    }
}
