package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class B2 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<B2> CREATOR = new C10096z2();

    /* renamed from: a, reason: collision with root package name */
    public final long f65405a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65406b;

    /* renamed from: c, reason: collision with root package name */
    public final long f65407c;

    /* renamed from: d, reason: collision with root package name */
    public final long f65408d;

    /* renamed from: e, reason: collision with root package name */
    public final long f65409e;

    public B2(long j10, long j11, long j12, long j13, long j14) {
        this.f65405a = j10;
        this.f65406b = j11;
        this.f65407c = j12;
        this.f65408d = j13;
        this.f65409e = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B2.class == obj.getClass()) {
            B2 b22 = (B2) obj;
            if (this.f65405a == b22.f65405a && this.f65406b == b22.f65406b && this.f65407c == b22.f65407c && this.f65408d == b22.f65408d && this.f65409e == b22.f65409e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f65405a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f65409e;
        long j12 = this.f65408d;
        long j13 = this.f65407c;
        long j14 = this.f65406b;
        return ((((((((i10 + 527) * 31) + ((int) ((j14 >>> 32) ^ j14))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final /* synthetic */ void n0(J8 j82) {
    }

    /* synthetic */ B2(Parcel parcel, A2 a22) {
        this.f65405a = parcel.readLong();
        this.f65406b = parcel.readLong();
        this.f65407c = parcel.readLong();
        this.f65408d = parcel.readLong();
        this.f65409e = parcel.readLong();
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f65405a + ", photoSize=" + this.f65406b + ", photoPresentationTimestampUs=" + this.f65407c + ", videoStartPosition=" + this.f65408d + ", videoSize=" + this.f65409e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f65405a);
        parcel.writeLong(this.f65406b);
        parcel.writeLong(this.f65407c);
        parcel.writeLong(this.f65408d);
        parcel.writeLong(this.f65409e);
    }
}
