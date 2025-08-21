package com.google.android.gms.maps.model;

import Od.K;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.r;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public class a extends AbstractC15707a {
    public static final Parcelable.Creator<a> CREATOR = new K();

    /* renamed from: a, reason: collision with root package name */
    public final float f85669a;

    /* renamed from: b, reason: collision with root package name */
    public final float f85670b;

    /* renamed from: com.google.android.gms.maps.model.a$a, reason: collision with other inner class name */
    public static final class C1271a {

        /* renamed from: a, reason: collision with root package name */
        public float f85671a;

        /* renamed from: b, reason: collision with root package name */
        public float f85672b;

        public C1271a a(float f10) {
            this.f85671a = f10;
            return this;
        }

        public C1271a c(float f10) {
            this.f85672b = f10;
            return this;
        }

        public a b() {
            return new a(this.f85672b, this.f85671a);
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
        return Float.floatToIntBits(this.f85669a) == Float.floatToIntBits(aVar.f85669a) && Float.floatToIntBits(this.f85670b) == Float.floatToIntBits(aVar.f85670b);
    }

    public int hashCode() {
        return C6660q.b(Float.valueOf(this.f85669a), Float.valueOf(this.f85670b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        float f10 = this.f85669a;
        int iA = C15708b.a(parcel);
        C15708b.k(parcel, 2, f10);
        C15708b.k(parcel, 3, this.f85670b);
        C15708b.b(parcel, iA);
    }

    public a(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f) {
            z10 = true;
        }
        r.b(z10, "Tilt needs to be between -90 and 90 inclusive: " + f10);
        this.f85669a = f10 + 0.0f;
        this.f85670b = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    public String toString() {
        return C6660q.c(this).a("tilt", Float.valueOf(this.f85669a)).a("bearing", Float.valueOf(this.f85670b)).toString();
    }
}
