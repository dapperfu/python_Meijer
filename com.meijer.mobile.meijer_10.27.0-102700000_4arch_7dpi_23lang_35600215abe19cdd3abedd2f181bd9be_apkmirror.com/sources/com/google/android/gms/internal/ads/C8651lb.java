package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8651lb implements Parcelable {
    public static final Parcelable.Creator<C8651lb> CREATOR = new C8435ja();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6884Ka[] f75866a;

    /* renamed from: b, reason: collision with root package name */
    public final long f75867b;

    public C8651lb(long j10, InterfaceC6884Ka... interfaceC6884KaArr) {
        this.f75867b = j10;
        this.f75866a = interfaceC6884KaArr;
    }

    public final C8651lb c(InterfaceC6884Ka... interfaceC6884KaArr) {
        int length = interfaceC6884KaArr.length;
        if (length == 0) {
            return this;
        }
        long j10 = this.f75867b;
        InterfaceC6884Ka[] interfaceC6884KaArr2 = this.f75866a;
        int i10 = OV.f69091a;
        int length2 = interfaceC6884KaArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC6884KaArr2, length2 + length);
        System.arraycopy(interfaceC6884KaArr, 0, objArrCopyOf, length2, length);
        return new C8651lb(j10, (InterfaceC6884Ka[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8651lb.class == obj.getClass()) {
            C8651lb c8651lb = (C8651lb) obj;
            if (Arrays.equals(this.f75866a, c8651lb.f75866a) && this.f75867b == c8651lb.f75867b) {
                return true;
            }
        }
        return false;
    }

    C8651lb(Parcel parcel) {
        this.f75866a = new InterfaceC6884Ka[parcel.readInt()];
        int i10 = 0;
        while (true) {
            InterfaceC6884Ka[] interfaceC6884KaArr = this.f75866a;
            if (i10 >= interfaceC6884KaArr.length) {
                this.f75867b = parcel.readLong();
                return;
            } else {
                interfaceC6884KaArr[i10] = (InterfaceC6884Ka) parcel.readParcelable(InterfaceC6884Ka.class.getClassLoader());
                i10++;
            }
        }
    }

    public final int a() {
        return this.f75866a.length;
    }

    public final InterfaceC6884Ka b(int i10) {
        return this.f75866a[i10];
    }

    public final C8651lb d(C8651lb c8651lb) {
        return c8651lb == null ? this : c(c8651lb.f75866a);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f75866a) * 31;
        long j10 = this.f75867b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        long j10 = this.f75867b;
        String string = Arrays.toString(this.f75866a);
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f75866a.length);
        for (InterfaceC6884Ka interfaceC6884Ka : this.f75866a) {
            parcel.writeParcelable(interfaceC6884Ka, 0);
        }
        parcel.writeLong(this.f75867b);
    }

    public C8651lb(List list) {
        this(-9223372036854775807L, (InterfaceC6884Ka[]) list.toArray(new InterfaceC6884Ka[0]));
    }
}
