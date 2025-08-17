package com.google.android.gms.maps.model;

import Md.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class CameraPosition extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f84806a;

    /* renamed from: b, reason: collision with root package name */
    public final float f84807b;

    /* renamed from: c, reason: collision with root package name */
    public final float f84808c;

    /* renamed from: d, reason: collision with root package name */
    public final float f84809d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private LatLng f84810a;

        /* renamed from: b, reason: collision with root package name */
        private float f84811b;

        /* renamed from: c, reason: collision with root package name */
        private float f84812c;

        /* renamed from: d, reason: collision with root package name */
        private float f84813d;

        public a a(float f10) {
            this.f84813d = f10;
            return this;
        }

        public a d(float f10) {
            this.f84812c = f10;
            return this;
        }

        public a e(float f10) {
            this.f84811b = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f84810a, this.f84811b, this.f84812c, this.f84813d);
        }

        public a c(LatLng latLng) {
            this.f84810a = (LatLng) r.m(latLng, "location must not be null.");
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
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f84806a.equals(cameraPosition.f84806a) && Float.floatToIntBits(this.f84807b) == Float.floatToIntBits(cameraPosition.f84807b) && Float.floatToIntBits(this.f84808c) == Float.floatToIntBits(cameraPosition.f84808c) && Float.floatToIntBits(this.f84809d) == Float.floatToIntBits(cameraPosition.f84809d);
    }

    public static final CameraPosition T(LatLng latLng, float f10) {
        return new CameraPosition(latLng, f10, 0.0f, 0.0f);
    }

    public int hashCode() {
        return C6535q.b(this.f84806a, Float.valueOf(this.f84807b), Float.valueOf(this.f84808c), Float.valueOf(this.f84809d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f84806a;
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, latLng, i10, false);
        C15137b.k(parcel, 3, this.f84807b);
        C15137b.k(parcel, 4, this.f84808c);
        C15137b.k(parcel, 5, this.f84809d);
        C15137b.b(parcel, iA);
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        r.m(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        r.c(z10, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f84806a = latLng;
        this.f84807b = f10;
        this.f84808c = f11 + 0.0f;
        this.f84809d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public String toString() {
        return C6535q.c(this).a("target", this.f84806a).a("zoom", Float.valueOf(this.f84807b)).a("tilt", Float.valueOf(this.f84808c)).a("bearing", Float.valueOf(this.f84809d)).toString();
    }
}
