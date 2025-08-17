package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class E2 implements Parcelable {
    public static final Parcelable.Creator<E2> CREATOR = new D2();

    /* renamed from: a, reason: collision with root package name */
    public final long f66330a;

    /* renamed from: b, reason: collision with root package name */
    public final long f66331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66332c;

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
            if (this.f66330a == e22.f66330a && this.f66331b == e22.f66331b && this.f66332c == e22.f66332c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f66330a), Long.valueOf(this.f66331b), Integer.valueOf(this.f66332c)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f66330a), Long.valueOf(this.f66331b), Integer.valueOf(this.f66332c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f66330a);
        parcel.writeLong(this.f66331b);
        parcel.writeInt(this.f66332c);
    }

    public E2(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        this.f66330a = j10;
        this.f66331b = j11;
        this.f66332c = i10;
    }
}
