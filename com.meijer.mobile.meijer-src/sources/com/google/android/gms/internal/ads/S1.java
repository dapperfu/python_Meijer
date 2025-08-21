package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class S1 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<S1> CREATOR = new R1();

    /* renamed from: a, reason: collision with root package name */
    public final int f70829a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70830b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70831c;

    /* renamed from: d, reason: collision with root package name */
    public final int f70832d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f70834f;

    /* renamed from: g, reason: collision with root package name */
    public final int f70835g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f70836h;

    public S1(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f70829a = i10;
        this.f70830b = str;
        this.f70831c = str2;
        this.f70832d = i11;
        this.f70833e = i12;
        this.f70834f = i13;
        this.f70835g = i14;
        this.f70836h = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S1.class == obj.getClass()) {
            S1 s12 = (S1) obj;
            if (this.f70829a == s12.f70829a && this.f70830b.equals(s12.f70830b) && this.f70831c.equals(s12.f70831c) && this.f70832d == s12.f70832d && this.f70833e == s12.f70833e && this.f70834f == s12.f70834f && this.f70835g == s12.f70835g && Arrays.equals(this.f70836h, s12.f70836h)) {
                return true;
            }
        }
        return false;
    }

    S1(Parcel parcel) {
        this.f70829a = parcel.readInt();
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f70830b = string;
        this.f70831c = parcel.readString();
        this.f70832d = parcel.readInt();
        this.f70833e = parcel.readInt();
        this.f70834f = parcel.readInt();
        this.f70835g = parcel.readInt();
        this.f70836h = parcel.createByteArray();
    }

    public final int hashCode() {
        return ((((((((((((((this.f70829a + 527) * 31) + this.f70830b.hashCode()) * 31) + this.f70831c.hashCode()) * 31) + this.f70832d) * 31) + this.f70833e) * 31) + this.f70834f) * 31) + this.f70835g) * 31) + Arrays.hashCode(this.f70836h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final void o0(J8 j82) {
        j82.t(this.f70836h, this.f70829a);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f70830b + ", description=" + this.f70831c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f70829a);
        parcel.writeString(this.f70830b);
        parcel.writeString(this.f70831c);
        parcel.writeInt(this.f70832d);
        parcel.writeInt(this.f70833e);
        parcel.writeInt(this.f70834f);
        parcel.writeInt(this.f70835g);
        parcel.writeByteArray(this.f70836h);
    }

    public static S1 a(GQ gq2) {
        int iW = gq2.w();
        String strE = C7182Pc.e(gq2.b(gq2.w(), StandardCharsets.US_ASCII));
        String strB = gq2.b(gq2.w(), StandardCharsets.UTF_8);
        int iW2 = gq2.w();
        int iW3 = gq2.w();
        int iW4 = gq2.w();
        int iW5 = gq2.w();
        int iW6 = gq2.w();
        byte[] bArr = new byte[iW6];
        gq2.h(bArr, 0, iW6);
        return new S1(iW, strE, strB, iW2, iW3, iW4, iW5, bArr);
    }
}
