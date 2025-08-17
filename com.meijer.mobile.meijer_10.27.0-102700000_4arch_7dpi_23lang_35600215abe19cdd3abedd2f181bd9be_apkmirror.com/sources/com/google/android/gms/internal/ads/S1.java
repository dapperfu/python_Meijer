package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class S1 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<S1> CREATOR = new R1();

    /* renamed from: a, reason: collision with root package name */
    public final int f69989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69990b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69991c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69992d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69993e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69994f;

    /* renamed from: g, reason: collision with root package name */
    public final int f69995g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f69996h;

    public S1(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f69989a = i10;
        this.f69990b = str;
        this.f69991c = str2;
        this.f69992d = i11;
        this.f69993e = i12;
        this.f69994f = i13;
        this.f69995g = i14;
        this.f69996h = bArr;
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
            if (this.f69989a == s12.f69989a && this.f69990b.equals(s12.f69990b) && this.f69991c.equals(s12.f69991c) && this.f69992d == s12.f69992d && this.f69993e == s12.f69993e && this.f69994f == s12.f69994f && this.f69995g == s12.f69995g && Arrays.equals(this.f69996h, s12.f69996h)) {
                return true;
            }
        }
        return false;
    }

    S1(Parcel parcel) {
        this.f69989a = parcel.readInt();
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f69990b = string;
        this.f69991c = parcel.readString();
        this.f69992d = parcel.readInt();
        this.f69993e = parcel.readInt();
        this.f69994f = parcel.readInt();
        this.f69995g = parcel.readInt();
        this.f69996h = parcel.createByteArray();
    }

    public final int hashCode() {
        return ((((((((((((((this.f69989a + 527) * 31) + this.f69990b.hashCode()) * 31) + this.f69991c.hashCode()) * 31) + this.f69992d) * 31) + this.f69993e) * 31) + this.f69994f) * 31) + this.f69995g) * 31) + Arrays.hashCode(this.f69996h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final void n0(J8 j82) {
        j82.t(this.f69996h, this.f69989a);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f69990b + ", description=" + this.f69991c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f69989a);
        parcel.writeString(this.f69990b);
        parcel.writeString(this.f69991c);
        parcel.writeInt(this.f69992d);
        parcel.writeInt(this.f69993e);
        parcel.writeInt(this.f69994f);
        parcel.writeInt(this.f69995g);
        parcel.writeByteArray(this.f69996h);
    }

    public static S1 a(GQ gq2) {
        int iW = gq2.w();
        String strE = C7057Pc.e(gq2.b(gq2.w(), StandardCharsets.US_ASCII));
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
