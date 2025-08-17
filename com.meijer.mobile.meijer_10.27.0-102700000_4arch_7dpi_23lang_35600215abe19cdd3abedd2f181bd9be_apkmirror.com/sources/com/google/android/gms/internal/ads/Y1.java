package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Y1 extends AbstractC8813n2 {
    public static final Parcelable.Creator<Y1> CREATOR = new X1();

    /* renamed from: b, reason: collision with root package name */
    public final String f71456b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71457c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71458d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f71459e;

    Y1(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f71456b = string;
        this.f71457c = parcel.readString();
        this.f71458d = parcel.readInt();
        this.f71459e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y1.class == obj.getClass()) {
            Y1 y12 = (Y1) obj;
            if (this.f71458d == y12.f71458d && Objects.equals(this.f71456b, y12.f71456b) && Objects.equals(this.f71457c, y12.f71457c) && Arrays.equals(this.f71459e, y12.f71459e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f71456b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.f71458d;
        String str2 = this.f71457c;
        return ((((((i10 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f71459e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2, com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final void n0(J8 j82) {
        j82.t(this.f71459e, this.f71458d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2
    public final String toString() {
        return this.f76984a + ": mimeType=" + this.f71456b + ", description=" + this.f71457c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f71456b);
        parcel.writeString(this.f71457c);
        parcel.writeInt(this.f71458d);
        parcel.writeByteArray(this.f71459e);
    }

    public Y1(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f71456b = str;
        this.f71457c = str2;
        this.f71458d = i10;
        this.f71459e = bArr;
    }
}
