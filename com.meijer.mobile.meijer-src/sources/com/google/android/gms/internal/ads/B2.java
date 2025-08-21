package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class B2 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<B2> CREATOR = new C10221z2();

    /* renamed from: a, reason: collision with root package name */
    public final long f66245a;

    /* renamed from: b, reason: collision with root package name */
    public final long f66246b;

    /* renamed from: c, reason: collision with root package name */
    public final long f66247c;

    /* renamed from: d, reason: collision with root package name */
    public final long f66248d;

    /* renamed from: e, reason: collision with root package name */
    public final long f66249e;

    public B2(long j10, long j11, long j12, long j13, long j14) {
        this.f66245a = j10;
        this.f66246b = j11;
        this.f66247c = j12;
        this.f66248d = j13;
        this.f66249e = j14;
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
            if (this.f66245a == b22.f66245a && this.f66246b == b22.f66246b && this.f66247c == b22.f66247c && this.f66248d == b22.f66248d && this.f66249e == b22.f66249e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f66245a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f66249e;
        long j12 = this.f66248d;
        long j13 = this.f66247c;
        long j14 = this.f66246b;
        return ((((((((i10 + 527) * 31) + ((int) ((j14 >>> 32) ^ j14))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final /* synthetic */ void o0(J8 j82) {
    }

    /* synthetic */ B2(Parcel parcel, A2 a22) {
        this.f66245a = parcel.readLong();
        this.f66246b = parcel.readLong();
        this.f66247c = parcel.readLong();
        this.f66248d = parcel.readLong();
        this.f66249e = parcel.readLong();
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f66245a + ", photoSize=" + this.f66246b + ", photoPresentationTimestampUs=" + this.f66247c + ", videoStartPosition=" + this.f66248d + ", videoSize=" + this.f66249e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f66245a);
        parcel.writeLong(this.f66246b);
        parcel.writeLong(this.f66247c);
        parcel.writeLong(this.f66248d);
        parcel.writeLong(this.f66249e);
    }
}
