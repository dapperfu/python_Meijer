package com.google.android.gms.location;

import Jd.A;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class LocationAvailability extends AbstractC15136a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f84707a;

    /* renamed from: b, reason: collision with root package name */
    private final int f84708b;

    /* renamed from: c, reason: collision with root package name */
    private final long f84709c;

    /* renamed from: d, reason: collision with root package name */
    final int f84710d;

    /* renamed from: e, reason: collision with root package name */
    private final A[] f84711e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f84705f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: g, reason: collision with root package name */
    public static final LocationAvailability f84706g = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    public boolean B() {
        return this.f84710d < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f84707a == locationAvailability.f84707a && this.f84708b == locationAvailability.f84708b && this.f84709c == locationAvailability.f84709c && this.f84710d == locationAvailability.f84710d && Arrays.equals(this.f84711e, locationAvailability.f84711e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f84710d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f84707a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f84708b);
        C15137b.s(parcel, 3, this.f84709c);
        C15137b.n(parcel, 4, this.f84710d);
        C15137b.z(parcel, 5, this.f84711e, i10, false);
        C15137b.c(parcel, 6, B());
        C15137b.b(parcel, iA);
    }

    LocationAvailability(int i10, int i11, int i12, long j10, A[] aArr, boolean z10) {
        this.f84710d = i10 < 1000 ? 0 : 1000;
        this.f84707a = i11;
        this.f84708b = i12;
        this.f84709c = j10;
        this.f84711e = aArr;
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
