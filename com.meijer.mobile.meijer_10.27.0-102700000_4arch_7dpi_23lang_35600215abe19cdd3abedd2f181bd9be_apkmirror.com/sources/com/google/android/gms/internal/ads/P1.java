package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class P1 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<P1> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final String f69231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69232b;

    /* renamed from: c, reason: collision with root package name */
    public final long f69233c;

    /* renamed from: d, reason: collision with root package name */
    public final long f69234d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f69235e;

    /* renamed from: f, reason: collision with root package name */
    private int f69236f;

    public P1(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f69231a = str;
        this.f69232b = str2;
        this.f69233c = j10;
        this.f69234d = j11;
        this.f69235e = bArr;
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
            if (this.f69233c == p12.f69233c && this.f69234d == p12.f69234d && Objects.equals(this.f69231a, p12.f69231a) && Objects.equals(this.f69232b, p12.f69232b) && Arrays.equals(this.f69235e, p12.f69235e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final /* synthetic */ void n0(J8 j82) {
    }

    static {
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.B("application/id3");
        c9592uH0.H();
        C9592uH0 c9592uH02 = new C9592uH0();
        c9592uH02.B("application/x-scte35");
        c9592uH02.H();
        CREATOR = new O1();
    }

    P1(Parcel parcel) {
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f69231a = string;
        this.f69232b = parcel.readString();
        this.f69233c = parcel.readLong();
        this.f69234d = parcel.readLong();
        this.f69235e = parcel.createByteArray();
    }

    public final int hashCode() {
        int i10 = this.f69236f;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f69231a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f69232b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.f69233c;
        long j11 = this.f69234d;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f69235e);
        this.f69236f = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f69231a + ", id=" + this.f69234d + ", durationMs=" + this.f69233c + ", value=" + this.f69232b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f69231a);
        parcel.writeString(this.f69232b);
        parcel.writeLong(this.f69233c);
        parcel.writeLong(this.f69234d);
        parcel.writeByteArray(this.f69235e);
    }
}
