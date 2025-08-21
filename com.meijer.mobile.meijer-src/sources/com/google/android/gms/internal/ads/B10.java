package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class B10 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<B10> CREATOR = new C10111y00();

    /* renamed from: a, reason: collision with root package name */
    public final float f66243a;

    /* renamed from: b, reason: collision with root package name */
    public final float f66244b;

    public B10(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        C8211gC.e(z10, "Invalid latitude or longitude");
        this.f66243a = f10;
        this.f66244b = f11;
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
            if (this.f66243a == b10.f66243a && this.f66244b == b10.f66244b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final /* synthetic */ void o0(J8 j82) {
    }

    /* synthetic */ B10(Parcel parcel, Z00 z00) {
        this.f66243a = parcel.readFloat();
        this.f66244b = parcel.readFloat();
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f66243a).hashCode() + 527) * 31) + Float.valueOf(this.f66244b).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.f66243a + ", longitude=" + this.f66244b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f66243a);
        parcel.writeFloat(this.f66244b);
    }
}
