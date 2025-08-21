package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class J2 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<J2> CREATOR = new H2();

    /* renamed from: a, reason: collision with root package name */
    public final float f68593a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68594b;

    public J2(float f10, int i10) {
        this.f68593a = f10;
        this.f68594b = i10;
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
            if (this.f68593a == j22.f68593a && this.f68594b == j22.f68594b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final /* synthetic */ void o0(J8 j82) {
    }

    /* synthetic */ J2(Parcel parcel, I2 i22) {
        this.f68593a = parcel.readFloat();
        this.f68594b = parcel.readInt();
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f68593a).hashCode() + 527) * 31) + this.f68594b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f68593a + ", svcTemporalLayerCount=" + this.f68594b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f68593a);
        parcel.writeInt(this.f68594b);
    }
}
