package com.google.android.gms.maps.model;

import Md.j0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.maps.model.a;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public class StreetViewPanoramaCamera extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final float f84822a;

    /* renamed from: b, reason: collision with root package name */
    public final float f84823b;

    /* renamed from: c, reason: collision with root package name */
    public final float f84824c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.maps.model.a f84825d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public float f84826a;

        /* renamed from: b, reason: collision with root package name */
        public float f84827b;

        /* renamed from: c, reason: collision with root package name */
        public float f84828c;

        public StreetViewPanoramaCamera a() {
            return new StreetViewPanoramaCamera(this.f84828c, this.f84827b, this.f84826a);
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
        return Float.floatToIntBits(this.f84822a) == Float.floatToIntBits(streetViewPanoramaCamera.f84822a) && Float.floatToIntBits(this.f84823b) == Float.floatToIntBits(streetViewPanoramaCamera.f84823b) && Float.floatToIntBits(this.f84824c) == Float.floatToIntBits(streetViewPanoramaCamera.f84824c);
    }

    public int hashCode() {
        return C6535q.b(Float.valueOf(this.f84822a), Float.valueOf(this.f84823b), Float.valueOf(this.f84824c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        float f10 = this.f84822a;
        int iA = C15137b.a(parcel);
        C15137b.k(parcel, 2, f10);
        C15137b.k(parcel, 3, this.f84823b);
        C15137b.k(parcel, 4, this.f84824c);
        C15137b.b(parcel, iA);
    }

    public StreetViewPanoramaCamera(float f10, float f11, float f12) {
        float f13;
        boolean z10 = false;
        if (f11 >= -90.0f && f11 <= 90.0f) {
            z10 = true;
        }
        r.b(z10, "Tilt needs to be between -90 and 90 inclusive: " + f11);
        this.f84822a = ((double) f10) <= 0.0d ? 0.0f : f10;
        this.f84823b = 0.0f + f11;
        if (f12 <= 0.0d) {
            f13 = (f12 % 360.0f) + 360.0f;
        } else {
            f13 = f12;
        }
        this.f84824c = f13 % 360.0f;
        a.C1262a c1262a = new a.C1262a();
        c1262a.c(f11);
        c1262a.a(f12);
        this.f84825d = c1262a.b();
    }

    public String toString() {
        return C6535q.c(this).a("zoom", Float.valueOf(this.f84822a)).a("tilt", Float.valueOf(this.f84823b)).a("bearing", Float.valueOf(this.f84824c)).toString();
    }
}
