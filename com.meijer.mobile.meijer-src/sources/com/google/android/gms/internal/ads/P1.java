package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class P1 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<P1> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final String f70071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70072b;

    /* renamed from: c, reason: collision with root package name */
    public final long f70073c;

    /* renamed from: d, reason: collision with root package name */
    public final long f70074d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f70075e;

    /* renamed from: f, reason: collision with root package name */
    private int f70076f;

    public P1(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f70071a = str;
        this.f70072b = str2;
        this.f70073c = j10;
        this.f70074d = j11;
        this.f70075e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P1.class == obj.getClass()) {
            P1 p12 = (P1) obj;
            if (this.f70073c == p12.f70073c && this.f70074d == p12.f70074d && Objects.equals(this.f70071a, p12.f70071a) && Objects.equals(this.f70072b, p12.f70072b) && Arrays.equals(this.f70075e, p12.f70075e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    public final /* synthetic */ void o0(J8 j82) {
    }

    static {
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.B("application/id3");
        c9717uH0.H();
        C9717uH0 c9717uH02 = new C9717uH0();
        c9717uH02.B("application/x-scte35");
        c9717uH02.H();
        CREATOR = new O1();
    }

    P1(Parcel parcel) {
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f70071a = string;
        this.f70072b = parcel.readString();
        this.f70073c = parcel.readLong();
        this.f70074d = parcel.readLong();
        this.f70075e = parcel.createByteArray();
    }

    public final int hashCode() {
        int i10 = this.f70076f;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f70071a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f70072b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.f70073c;
        long j11 = this.f70074d;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f70075e);
        this.f70076f = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f70071a + ", id=" + this.f70074d + ", durationMs=" + this.f70073c + ", value=" + this.f70072b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f70071a);
        parcel.writeString(this.f70072b);
        parcel.writeLong(this.f70073c);
        parcel.writeLong(this.f70074d);
        parcel.writeByteArray(this.f70075e);
    }
}
