package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;

/* loaded from: classes6.dex */
public final class G extends AbstractC15707a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    public final String f85861a;

    /* renamed from: b, reason: collision with root package name */
    public final E f85862b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85863c;

    /* renamed from: d, reason: collision with root package name */
    public final long f85864d;

    G(G g10, long j10) {
        com.google.android.gms.common.internal.r.l(g10);
        this.f85861a = g10.f85861a;
        this.f85862b = g10.f85862b;
        this.f85863c = g10.f85863c;
        this.f85864d = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f85862b);
        String str = this.f85863c;
        int length = String.valueOf(str).length();
        String str2 = this.f85861a;
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
        this.f85861a = str;
        this.f85862b = e10;
        this.f85863c = str2;
        this.f85864d = j10;
    }
}
