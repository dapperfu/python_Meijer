package com.google.android.gms.maps.model;

import Od.Z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class LatLngBounds extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Z();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f85656a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f85657b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private double f85658a = Double.POSITIVE_INFINITY;

        /* renamed from: b, reason: collision with root package name */
        private double f85659b = Double.NEGATIVE_INFINITY;

        /* renamed from: c, reason: collision with root package name */
        private double f85660c = Double.NaN;

        /* renamed from: d, reason: collision with root package name */
        private double f85661d = Double.NaN;

        public LatLngBounds a() {
            r.q(!Double.isNaN(this.f85660c), "no included points");
            return new LatLngBounds(new LatLng(this.f85658a, this.f85660c), new LatLng(this.f85659b, this.f85661d));
        }

        public a b(LatLng latLng) {
            r.m(latLng, "point must not be null");
            this.f85658a = Math.min(this.f85658a, latLng.f85654a);
            this.f85659b = Math.max(this.f85659b, latLng.f85654a);
            double d10 = latLng.f85655b;
            if (Double.isNaN(this.f85660c)) {
                this.f85660c = d10;
                this.f85661d = d10;
                return this;
            }
            double d11 = this.f85660c;
            double d12 = this.f85661d;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    this.f85660c = d10;
                    return this;
                }
                this.f85661d = d10;
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
        return this.f85656a.equals(latLngBounds.f85656a) && this.f85657b.equals(latLngBounds.f85657b);
    }

    private final boolean b0(double d10) {
        LatLng latLng = this.f85657b;
        double d11 = this.f85656a.f85655b;
        double d12 = latLng.f85655b;
        return d11 <= d12 ? d11 <= d10 && d10 <= d12 : d11 <= d10 || d10 <= d12;
    }

    public boolean T(LatLng latLng) {
        LatLng latLng2 = (LatLng) r.m(latLng, "point must not be null.");
        double d10 = latLng2.f85654a;
        return this.f85656a.f85654a <= d10 && d10 <= this.f85657b.f85654a && b0(latLng2.f85655b);
    }

    public int hashCode() {
        return C6660q.b(this.f85656a, this.f85657b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f85656a;
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, latLng, i10, false);
        C15708b.u(parcel, 3, this.f85657b, i10, false);
        C15708b.b(parcel, iA);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        boolean z10;
        r.m(latLng, "southwest must not be null.");
        r.m(latLng2, "northeast must not be null.");
        double d10 = latLng2.f85654a;
        double d11 = latLng.f85654a;
        Object[] objArr = {Double.valueOf(d11), Double.valueOf(latLng2.f85654a)};
        if (d10 >= d11) {
            z10 = true;
        } else {
            z10 = false;
        }
        r.c(z10, "southern latitude exceeds northern latitude (%s > %s)", objArr);
        this.f85656a = latLng;
        this.f85657b = latLng2;
    }

    public String toString() {
        return C6660q.c(this).a("southwest", this.f85656a).a("northeast", this.f85657b).toString();
    }
}
