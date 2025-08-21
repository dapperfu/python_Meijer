package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class E2 implements Parcelable {
    public static final Parcelable.Creator<E2> CREATOR = new D2();

    /* renamed from: a, reason: collision with root package name */
    public final long f67170a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67172c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E2.class == obj.getClass()) {
            E2 e22 = (E2) obj;
            if (this.f67170a == e22.f67170a && this.f67171b == e22.f67171b && this.f67172c == e22.f67172c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f67170a), Long.valueOf(this.f67171b), Integer.valueOf(this.f67172c)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f67170a), Long.valueOf(this.f67171b), Integer.valueOf(this.f67172c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f67170a);
        parcel.writeLong(this.f67171b);
        parcel.writeInt(this.f67172c);
    }

    public E2(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        this.f67170a = j10;
        this.f67171b = j11;
        this.f67172c = i10;
    }
}
