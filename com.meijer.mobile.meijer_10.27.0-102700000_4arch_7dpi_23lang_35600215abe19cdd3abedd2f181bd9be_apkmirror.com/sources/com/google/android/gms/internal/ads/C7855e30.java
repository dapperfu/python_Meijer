package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.e30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7855e30 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<C7855e30> CREATOR = new C7640c20();

    /* renamed from: a, reason: collision with root package name */
    public final long f73753a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73754b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73755c;

    public C7855e30(long j10, long j11, long j12) {
        this.f73753a = j10;
        this.f73754b = j11;
        this.f73755c = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7855e30)) {
            return false;
        }
        C7855e30 c7855e30 = (C7855e30) obj;
        return this.f73753a == c7855e30.f73753a && this.f73754b == c7855e30.f73754b && this.f73755c == c7855e30.f73755c;
    }

    public final int hashCode() {
        long j10 = this.f73753a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f73755c;
        long j12 = this.f73754b;
        return ((((i10 + 527) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final /* synthetic */ void n0(J8 j82) {
    }

    /* synthetic */ C7855e30(Parcel parcel, D20 d20) {
        this.f73753a = parcel.readLong();
        this.f73754b = parcel.readLong();
        this.f73755c = parcel.readLong();
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f73753a + ", modification time=" + this.f73754b + ", timescale=" + this.f73755c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f73753a);
        parcel.writeLong(this.f73754b);
        parcel.writeLong(this.f73755c);
    }
}
