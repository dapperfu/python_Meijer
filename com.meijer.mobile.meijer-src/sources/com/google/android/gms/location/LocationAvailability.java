package com.google.android.gms.location;

import Ld.A;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class LocationAvailability extends AbstractC15707a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f85547a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85548b;

    /* renamed from: c, reason: collision with root package name */
    private final long f85549c;

    /* renamed from: d, reason: collision with root package name */
    final int f85550d;

    /* renamed from: e, reason: collision with root package name */
    private final A[] f85551e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f85545f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: g, reason: collision with root package name */
    public static final LocationAvailability f85546g = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    public boolean B() {
        return this.f85550d < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f85547a == locationAvailability.f85547a && this.f85548b == locationAvailability.f85548b && this.f85549c == locationAvailability.f85549c && this.f85550d == locationAvailability.f85550d && Arrays.equals(this.f85551e, locationAvailability.f85551e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f85550d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f85547a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f85548b);
        C15708b.s(parcel, 3, this.f85549c);
        C15708b.n(parcel, 4, this.f85550d);
        C15708b.z(parcel, 5, this.f85551e, i10, false);
        C15708b.c(parcel, 6, B());
        C15708b.b(parcel, iA);
    }

    LocationAvailability(int i10, int i11, int i12, long j10, A[] aArr, boolean z10) {
        this.f85550d = i10 < 1000 ? 0 : 1000;
        this.f85547a = i11;
        this.f85548b = i12;
        this.f85549c = j10;
        this.f85551e = aArr;
    }

    public String toString() {
        boolean zB = B();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zB).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(zB);
        sb2.append("]");
        return sb2.toString();
    }
}
