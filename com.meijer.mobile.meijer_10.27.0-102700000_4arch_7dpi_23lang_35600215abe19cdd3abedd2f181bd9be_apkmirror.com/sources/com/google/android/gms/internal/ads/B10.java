package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class B10 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<B10> CREATOR = new C9986y00();

    /* renamed from: a, reason: collision with root package name */
    public final float f65403a;

    /* renamed from: b, reason: collision with root package name */
    public final float f65404b;

    public B10(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        C8086gC.e(z10, "Invalid latitude or longitude");
        this.f65403a = f10;
        this.f65404b = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B10.class == obj.getClass()) {
            B10 b10 = (B10) obj;
            if (this.f65403a == b10.f65403a && this.f65404b == b10.f65404b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final /* synthetic */ void n0(J8 j82) {
    }

    /* synthetic */ B10(Parcel parcel, Z00 z00) {
        this.f65403a = parcel.readFloat();
        this.f65404b = parcel.readFloat();
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f65403a).hashCode() + 527) * 31) + Float.valueOf(this.f65404b).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.f65403a + ", longitude=" + this.f65404b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f65403a);
        parcel.writeFloat(this.f65404b);
    }
}
