package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class W1 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<W1> CREATOR = new V1();

    /* renamed from: a, reason: collision with root package name */
    public final int f70974a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70975b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70976c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70977d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70978e;

    /* renamed from: f, reason: collision with root package name */
    public final int f70979f;

    public W1(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        C8086gC.d(z11);
        this.f70974a = i10;
        this.f70975b = str;
        this.f70976c = str2;
        this.f70977d = str3;
        this.f70978e = z10;
        this.f70979f = i11;
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
            if (this.f70974a == w12.f70974a && Objects.equals(this.f70975b, w12.f70975b) && Objects.equals(this.f70976c, w12.f70976c) && Objects.equals(this.f70977d, w12.f70977d) && this.f70978e == w12.f70978e && this.f70979f == w12.f70979f) {
                return true;
            }
        }
        return false;
    }

    W1(Parcel parcel) {
        this.f70974a = parcel.readInt();
        this.f70975b = parcel.readString();
        this.f70976c = parcel.readString();
        this.f70977d = parcel.readString();
        int i10 = OV.f69091a;
        this.f70978e = parcel.readInt() != 0;
        this.f70979f = parcel.readInt();
    }

    public final int hashCode() {
        String str = this.f70975b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.f70974a;
        String str2 = this.f70976c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = ((i10 + 527) * 31) + iHashCode;
        String str3 = this.f70977d;
        return (((((((i11 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f70978e ? 1 : 0)) * 31) + this.f70979f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final void n0(J8 j82) {
        String str = this.f70976c;
        if (str != null) {
            j82.I(str);
        }
        String str2 = this.f70975b;
        if (str2 != null) {
            j82.B(str2);
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f70976c + "\", genre=\"" + this.f70975b + "\", bitrate=" + this.f70974a + ", metadataInterval=" + this.f70979f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f70974a);
        parcel.writeString(this.f70975b);
        parcel.writeString(this.f70976c);
        parcel.writeString(this.f70977d);
        int i11 = OV.f69091a;
        parcel.writeInt(this.f70978e ? 1 : 0);
        parcel.writeInt(this.f70979f);
    }
}
