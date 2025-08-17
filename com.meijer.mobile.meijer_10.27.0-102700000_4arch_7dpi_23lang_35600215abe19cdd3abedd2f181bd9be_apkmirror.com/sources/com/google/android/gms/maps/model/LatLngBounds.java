package com.google.android.gms.maps.model;

import Md.Z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class LatLngBounds extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Z();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f84816a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f84817b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private double f84818a = Double.POSITIVE_INFINITY;

        /* renamed from: b, reason: collision with root package name */
        private double f84819b = Double.NEGATIVE_INFINITY;

        /* renamed from: c, reason: collision with root package name */
        private double f84820c = Double.NaN;

        /* renamed from: d, reason: collision with root package name */
        private double f84821d = Double.NaN;

        public LatLngBounds a() {
            r.q(!Double.isNaN(this.f84820c), "no included points");
            return new LatLngBounds(new LatLng(this.f84818a, this.f84820c), new LatLng(this.f84819b, this.f84821d));
        }

        public a b(LatLng latLng) {
            r.m(latLng, "point must not be null");
            this.f84818a = Math.min(this.f84818a, latLng.f84814a);
            this.f84819b = Math.max(this.f84819b, latLng.f84814a);
            double d10 = latLng.f84815b;
            if (Double.isNaN(this.f84820c)) {
                this.f84820c = d10;
                this.f84821d = d10;
                return this;
            }
            double d11 = this.f84820c;
            double d12 = this.f84821d;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    this.f84820c = d10;
                    return this;
                }
                this.f84821d = d10;
            }
            return this;
        }
    }

    public static a B() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f84816a.equals(latLngBounds.f84816a) && this.f84817b.equals(latLngBounds.f84817b);
    }

    private final boolean c0(double d10) {
        LatLng latLng = this.f84817b;
        double d11 = this.f84816a.f84815b;
        double d12 = latLng.f84815b;
        return d11 <= d12 ? d11 <= d10 && d10 <= d12 : d11 <= d10 || d10 <= d12;
    }

    public boolean T(LatLng latLng) {
        LatLng latLng2 = (LatLng) r.m(latLng, "point must not be null.");
        double d10 = latLng2.f84814a;
        return this.f84816a.f84814a <= d10 && d10 <= this.f84817b.f84814a && c0(latLng2.f84815b);
    }

    public int hashCode() {
        return C6535q.b(this.f84816a, this.f84817b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f84816a;
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, latLng, i10, false);
        C15137b.u(parcel, 3, this.f84817b, i10, false);
        C15137b.b(parcel, iA);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        boolean z10;
        r.m(latLng, "southwest must not be null.");
        r.m(latLng2, "northeast must not be null.");
        double d10 = latLng2.f84814a;
        double d11 = latLng.f84814a;
        Object[] objArr = {Double.valueOf(d11), Double.valueOf(latLng2.f84814a)};
        if (d10 >= d11) {
            z10 = true;
        } else {
            z10 = false;
        }
        r.c(z10, "southern latitude exceeds northern latitude (%s > %s)", objArr);
        this.f84816a = latLng;
        this.f84817b = latLng2;
    }

    public String toString() {
        return C6535q.c(this).a("southwest", this.f84816a).a("northeast", this.f84817b).toString();
    }
}
