package com.google.android.gms.maps.model;

import Od.a0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class LatLng extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final double f85654a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85655b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f85654a) == Double.doubleToLongBits(latLng.f85654a) && Double.doubleToLongBits(this.f85655b) == Double.doubleToLongBits(latLng.f85655b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f85654a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f85655b);
        return ((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f85654a + "," + this.f85655b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f85654a;
        int iA = C15708b.a(parcel);
        C15708b.i(parcel, 2, d10);
        C15708b.i(parcel, 3, this.f85655b);
        C15708b.b(parcel, iA);
    }

    public LatLng(double d10, double d11) {
        if (d11 >= -180.0d && d11 < 180.0d) {
            this.f85655b = d11;
        } else {
            this.f85655b = ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f85654a = Math.max(-90.0d, Math.min(90.0d, d10));
    }
}
