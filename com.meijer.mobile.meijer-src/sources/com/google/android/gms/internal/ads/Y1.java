package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Y1 extends AbstractC8938n2 {
    public static final Parcelable.Creator<Y1> CREATOR = new X1();

    /* renamed from: b, reason: collision with root package name */
    public final String f72296b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72297c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72298d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f72299e;

    Y1(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f72296b = string;
        this.f72297c = parcel.readString();
        this.f72298d = parcel.readInt();
        this.f72299e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y1.class == obj.getClass()) {
            Y1 y12 = (Y1) obj;
            if (this.f72298d == y12.f72298d && Objects.equals(this.f72296b, y12.f72296b) && Objects.equals(this.f72297c, y12.f72297c) && Arrays.equals(this.f72299e, y12.f72299e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f72296b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.f72298d;
        String str2 = this.f72297c;
        return ((((((i10 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f72299e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2, com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final void o0(J8 j82) {
        j82.t(this.f72299e, this.f72298d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2
    public final String toString() {
        return this.f77824a + ": mimeType=" + this.f72296b + ", description=" + this.f72297c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f72296b);
        parcel.writeString(this.f72297c);
        parcel.writeInt(this.f72298d);
        parcel.writeByteArray(this.f72299e);
    }

    public Y1(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f72296b = str;
        this.f72297c = str2;
        this.f72298d = i10;
        this.f72299e = bArr;
    }
}
