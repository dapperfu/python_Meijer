package com.google.android.gms.maps.model;

import Od.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class CameraPosition extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f85646a;

    /* renamed from: b, reason: collision with root package name */
    public final float f85647b;

    /* renamed from: c, reason: collision with root package name */
    public final float f85648c;

    /* renamed from: d, reason: collision with root package name */
    public final float f85649d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private LatLng f85650a;

        /* renamed from: b, reason: collision with root package name */
        private float f85651b;

        /* renamed from: c, reason: collision with root package name */
        private float f85652c;

        /* renamed from: d, reason: collision with root package name */
        private float f85653d;

        public a a(float f10) {
            this.f85653d = f10;
            return this;
        }

        public a d(float f10) {
            this.f85652c = f10;
            return this;
        }

        public a e(float f10) {
            this.f85651b = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f85650a, this.f85651b, this.f85652c, this.f85653d);
        }

        public a c(LatLng latLng) {
            this.f85650a = (LatLng) r.m(latLng, "location must not be null.");
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
        return this.f85646a.equals(cameraPosition.f85646a) && Float.floatToIntBits(this.f85647b) == Float.floatToIntBits(cameraPosition.f85647b) && Float.floatToIntBits(this.f85648c) == Float.floatToIntBits(cameraPosition.f85648c) && Float.floatToIntBits(this.f85649d) == Float.floatToIntBits(cameraPosition.f85649d);
    }

    public static final CameraPosition T(LatLng latLng, float f10) {
        return new CameraPosition(latLng, f10, 0.0f, 0.0f);
    }

    public int hashCode() {
        return C6660q.b(this.f85646a, Float.valueOf(this.f85647b), Float.valueOf(this.f85648c), Float.valueOf(this.f85649d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f85646a;
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, latLng, i10, false);
        C15708b.k(parcel, 3, this.f85647b);
        C15708b.k(parcel, 4, this.f85648c);
        C15708b.k(parcel, 5, this.f85649d);
        C15708b.b(parcel, iA);
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        r.m(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        r.c(z10, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f85646a = latLng;
        this.f85647b = f10;
        this.f85648c = f11 + 0.0f;
        this.f85649d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public String toString() {
        return C6660q.c(this).a("target", this.f85646a).a("zoom", Float.valueOf(this.f85647b)).a("tilt", Float.valueOf(this.f85648c)).a("bearing", Float.valueOf(this.f85649d)).toString();
    }
}
