package com.google.android.gms.maps.model;

import Md.a0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class LatLng extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final double f84814a;

    /* renamed from: b, reason: collision with root package name */
    public final double f84815b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f84814a) == Double.doubleToLongBits(latLng.f84814a) && Double.doubleToLongBits(this.f84815b) == Double.doubleToLongBits(latLng.f84815b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f84814a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f84815b);
        return ((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f84814a + "," + this.f84815b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f84814a;
        int iA = C15137b.a(parcel);
        C15137b.i(parcel, 2, d10);
        C15137b.i(parcel, 3, this.f84815b);
        C15137b.b(parcel, iA);
    }

    public LatLng(double d10, double d11) {
        if (d11 >= -180.0d && d11 < 180.0d) {
            this.f84815b = d11;
        } else {
            this.f84815b = ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f84814a = Math.max(-90.0d, Math.min(90.0d, d10));
    }
}
