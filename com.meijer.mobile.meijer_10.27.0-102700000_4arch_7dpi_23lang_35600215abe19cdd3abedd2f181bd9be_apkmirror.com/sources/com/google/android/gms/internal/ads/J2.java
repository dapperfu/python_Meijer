package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class J2 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<J2> CREATOR = new H2();

    /* renamed from: a, reason: collision with root package name */
    public final float f67753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67754b;

    public J2(float f10, int i10) {
        this.f67753a = f10;
        this.f67754b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J2.class == obj.getClass()) {
            J2 j22 = (J2) obj;
            if (this.f67753a == j22.f67753a && this.f67754b == j22.f67754b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final /* synthetic */ void n0(J8 j82) {
    }

    /* synthetic */ J2(Parcel parcel, I2 i22) {
        this.f67753a = parcel.readFloat();
        this.f67754b = parcel.readInt();
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f67753a).hashCode() + 527) * 31) + this.f67754b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f67753a + ", svcTemporalLayerCount=" + this.f67754b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f67753a);
        parcel.writeInt(this.f67754b);
    }
}
