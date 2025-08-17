package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8385j2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C8385j2> CREATOR = new C8280i2();

    /* renamed from: b, reason: collision with root package name */
    public final String f75319b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75320c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75321d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f75322e;

    C8385j2(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f75319b = string;
        this.f75320c = parcel.readString();
        this.f75321d = parcel.readString();
        this.f75322e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8385j2.class == obj.getClass()) {
            C8385j2 c8385j2 = (C8385j2) obj;
            if (Objects.equals(this.f75319b, c8385j2.f75319b) && Objects.equals(this.f75320c, c8385j2.f75320c) && Objects.equals(this.f75321d, c8385j2.f75321d) && Arrays.equals(this.f75322e, c8385j2.f75322e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f75319b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f75320c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f75321d;
        return (((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f75322e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2
    public final String toString() {
        return this.f76984a + ": mimeType=" + this.f75319b + ", filename=" + this.f75320c + ", description=" + this.f75321d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f75319b);
        parcel.writeString(this.f75320c);
        parcel.writeString(this.f75321d);
        parcel.writeByteArray(this.f75322e);
    }

    public C8385j2(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f75319b = str;
        this.f75320c = str2;
        this.f75321d = str3;
        this.f75322e = bArr;
    }
}
