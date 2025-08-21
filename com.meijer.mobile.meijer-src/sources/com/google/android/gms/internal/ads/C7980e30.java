package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.e30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7980e30 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<C7980e30> CREATOR = new C7765c20();

    /* renamed from: a, reason: collision with root package name */
    public final long f74593a;

    /* renamed from: b, reason: collision with root package name */
    public final long f74594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74595c;

    public C7980e30(long j10, long j11, long j12) {
        this.f74593a = j10;
        this.f74594b = j11;
        this.f74595c = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7980e30)) {
            return false;
        }
        C7980e30 c7980e30 = (C7980e30) obj;
        return this.f74593a == c7980e30.f74593a && this.f74594b == c7980e30.f74594b && this.f74595c == c7980e30.f74595c;
    }

    public final int hashCode() {
        long j10 = this.f74593a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f74595c;
        long j12 = this.f74594b;
        return ((((i10 + 527) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final /* synthetic */ void o0(J8 j82) {
    }

    /* synthetic */ C7980e30(Parcel parcel, D20 d20) {
        this.f74593a = parcel.readLong();
        this.f74594b = parcel.readLong();
        this.f74595c = parcel.readLong();
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f74593a + ", modification time=" + this.f74594b + ", timescale=" + this.f74595c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f74593a);
        parcel.writeLong(this.f74594b);
        parcel.writeLong(this.f74595c);
    }
}
