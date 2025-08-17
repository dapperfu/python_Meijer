package com.google.android.gms.maps.model;

import Md.K;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.r;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public class a extends AbstractC15136a {
    public static final Parcelable.Creator<a> CREATOR = new K();

    /* renamed from: a, reason: collision with root package name */
    public final float f84829a;

    /* renamed from: b, reason: collision with root package name */
    public final float f84830b;

    /* renamed from: com.google.android.gms.maps.model.a$a, reason: collision with other inner class name */
    public static final class C1262a {

        /* renamed from: a, reason: collision with root package name */
        public float f84831a;

        /* renamed from: b, reason: collision with root package name */
        public float f84832b;

        public C1262a a(float f10) {
            this.f84831a = f10;
            return this;
        }

        public C1262a c(float f10) {
            this.f84832b = f10;
            return this;
        }

        public a b() {
            return new a(this.f84832b, this.f84831a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.floatToIntBits(this.f84829a) == Float.floatToIntBits(aVar.f84829a) && Float.floatToIntBits(this.f84830b) == Float.floatToIntBits(aVar.f84830b);
    }

    public int hashCode() {
        return C6535q.b(Float.valueOf(this.f84829a), Float.valueOf(this.f84830b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        float f10 = this.f84829a;
        int iA = C15137b.a(parcel);
        C15137b.k(parcel, 2, f10);
        C15137b.k(parcel, 3, this.f84830b);
        C15137b.b(parcel, iA);
    }

    public a(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f) {
            z10 = true;
        }
        r.b(z10, "Tilt needs to be between -90 and 90 inclusive: " + f10);
        this.f84829a = f10 + 0.0f;
        this.f84830b = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    public String toString() {
        return C6535q.c(this).a("tilt", Float.valueOf(this.f84829a)).a("bearing", Float.valueOf(this.f84830b)).toString();
    }
}
