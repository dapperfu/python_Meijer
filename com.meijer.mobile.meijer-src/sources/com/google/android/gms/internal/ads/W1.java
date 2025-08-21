package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class W1 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<W1> CREATOR = new V1();

    /* renamed from: a, reason: collision with root package name */
    public final int f71814a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71815b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71816c;

    /* renamed from: d, reason: collision with root package name */
    public final String f71817d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71818e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71819f;

    public W1(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        C8211gC.d(z11);
        this.f71814a = i10;
        this.f71815b = str;
        this.f71816c = str2;
        this.f71817d = str3;
        this.f71818e = z10;
        this.f71819f = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W1.class == obj.getClass()) {
            W1 w12 = (W1) obj;
            if (this.f71814a == w12.f71814a && Objects.equals(this.f71815b, w12.f71815b) && Objects.equals(this.f71816c, w12.f71816c) && Objects.equals(this.f71817d, w12.f71817d) && this.f71818e == w12.f71818e && this.f71819f == w12.f71819f) {
                return true;
            }
        }
        return false;
    }

    W1(Parcel parcel) {
        this.f71814a = parcel.readInt();
        this.f71815b = parcel.readString();
        this.f71816c = parcel.readString();
        this.f71817d = parcel.readString();
        int i10 = OV.f69931a;
        this.f71818e = parcel.readInt() != 0;
        this.f71819f = parcel.readInt();
    }

    public final int hashCode() {
        String str = this.f71815b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.f71814a;
        String str2 = this.f71816c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = ((i10 + 527) * 31) + iHashCode;
        String str3 = this.f71817d;
        return (((((((i11 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f71818e ? 1 : 0)) * 31) + this.f71819f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final void o0(J8 j82) {
        String str = this.f71816c;
        if (str != null) {
            j82.I(str);
        }
        String str2 = this.f71815b;
        if (str2 != null) {
            j82.B(str2);
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f71816c + "\", genre=\"" + this.f71815b + "\", bitrate=" + this.f71814a + ", metadataInterval=" + this.f71819f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f71814a);
        parcel.writeString(this.f71815b);
        parcel.writeString(this.f71816c);
        parcel.writeString(this.f71817d);
        int i11 = OV.f69931a;
        parcel.writeInt(this.f71818e ? 1 : 0);
        parcel.writeInt(this.f71819f);
    }
}
