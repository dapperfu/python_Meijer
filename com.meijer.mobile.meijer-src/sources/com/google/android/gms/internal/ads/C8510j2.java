package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8510j2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C8510j2> CREATOR = new C8405i2();

    /* renamed from: b, reason: collision with root package name */
    public final String f76159b;

    /* renamed from: c, reason: collision with root package name */
    public final String f76160c;

    /* renamed from: d, reason: collision with root package name */
    public final String f76161d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f76162e;

    C8510j2(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f76159b = string;
        this.f76160c = parcel.readString();
        this.f76161d = parcel.readString();
        this.f76162e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8510j2.class == obj.getClass()) {
            C8510j2 c8510j2 = (C8510j2) obj;
            if (Objects.equals(this.f76159b, c8510j2.f76159b) && Objects.equals(this.f76160c, c8510j2.f76160c) && Objects.equals(this.f76161d, c8510j2.f76161d) && Arrays.equals(this.f76162e, c8510j2.f76162e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76159b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f76160c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f76161d;
        return (((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f76162e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2
    public final String toString() {
        return this.f77824a + ": mimeType=" + this.f76159b + ", filename=" + this.f76160c + ", description=" + this.f76161d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76159b);
        parcel.writeString(this.f76160c);
        parcel.writeString(this.f76161d);
        parcel.writeByteArray(this.f76162e);
    }

    public C8510j2(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f76159b = str;
        this.f76160c = str2;
        this.f76161d = str3;
        this.f76162e = bArr;
    }
}
