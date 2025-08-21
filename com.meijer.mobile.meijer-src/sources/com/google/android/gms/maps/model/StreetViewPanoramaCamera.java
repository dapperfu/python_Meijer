package com.google.android.gms.maps.model;

import Od.j0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.maps.model.a;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public class StreetViewPanoramaCamera extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final float f85662a;

    /* renamed from: b, reason: collision with root package name */
    public final float f85663b;

    /* renamed from: c, reason: collision with root package name */
    public final float f85664c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.maps.model.a f85665d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public float f85666a;

        /* renamed from: b, reason: collision with root package name */
        public float f85667b;

        /* renamed from: c, reason: collision with root package name */
        public float f85668c;

        public StreetViewPanoramaCamera a() {
            return new StreetViewPanoramaCamera(this.f85668c, this.f85667b, this.f85666a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f85662a) == Float.floatToIntBits(streetViewPanoramaCamera.f85662a) && Float.floatToIntBits(this.f85663b) == Float.floatToIntBits(streetViewPanoramaCamera.f85663b) && Float.floatToIntBits(this.f85664c) == Float.floatToIntBits(streetViewPanoramaCamera.f85664c);
    }

    public int hashCode() {
        return C6660q.b(Float.valueOf(this.f85662a), Float.valueOf(this.f85663b), Float.valueOf(this.f85664c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        float f10 = this.f85662a;
        int iA = C15708b.a(parcel);
        C15708b.k(parcel, 2, f10);
        C15708b.k(parcel, 3, this.f85663b);
        C15708b.k(parcel, 4, this.f85664c);
        C15708b.b(parcel, iA);
    }

    public StreetViewPanoramaCamera(float f10, float f11, float f12) {
        float f13;
        boolean z10 = false;
        if (f11 >= -90.0f && f11 <= 90.0f) {
            z10 = true;
        }
        r.b(z10, "Tilt needs to be between -90 and 90 inclusive: " + f11);
        this.f85662a = ((double) f10) <= 0.0d ? 0.0f : f10;
        this.f85663b = 0.0f + f11;
        if (f12 <= 0.0d) {
            f13 = (f12 % 360.0f) + 360.0f;
        } else {
            f13 = f12;
        }
        this.f85664c = f13 % 360.0f;
        a.C1271a c1271a = new a.C1271a();
        c1271a.c(f11);
        c1271a.a(f12);
        this.f85665d = c1271a.b();
    }

    public String toString() {
        return C6660q.c(this).a("zoom", Float.valueOf(this.f85662a)).a("tilt", Float.valueOf(this.f85663b)).a("bearing", Float.valueOf(this.f85664c)).toString();
    }
}
