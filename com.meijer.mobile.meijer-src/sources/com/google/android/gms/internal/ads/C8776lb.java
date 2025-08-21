package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8776lb implements Parcelable {
    public static final Parcelable.Creator<C8776lb> CREATOR = new C8560ja();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7009Ka[] f76706a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76707b;

    public C8776lb(long j10, InterfaceC7009Ka... interfaceC7009KaArr) {
        this.f76707b = j10;
        this.f76706a = interfaceC7009KaArr;
    }

    public final C8776lb c(InterfaceC7009Ka... interfaceC7009KaArr) {
        int length = interfaceC7009KaArr.length;
        if (length == 0) {
            return this;
        }
        long j10 = this.f76707b;
        InterfaceC7009Ka[] interfaceC7009KaArr2 = this.f76706a;
        int i10 = OV.f69931a;
        int length2 = interfaceC7009KaArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC7009KaArr2, length2 + length);
        System.arraycopy(interfaceC7009KaArr, 0, objArrCopyOf, length2, length);
        return new C8776lb(j10, (InterfaceC7009Ka[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8776lb.class == obj.getClass()) {
            C8776lb c8776lb = (C8776lb) obj;
            if (Arrays.equals(this.f76706a, c8776lb.f76706a) && this.f76707b == c8776lb.f76707b) {
                return true;
            }
        }
        return false;
    }

    C8776lb(Parcel parcel) {
        this.f76706a = new InterfaceC7009Ka[parcel.readInt()];
        int i10 = 0;
        while (true) {
            InterfaceC7009Ka[] interfaceC7009KaArr = this.f76706a;
            if (i10 >= interfaceC7009KaArr.length) {
                this.f76707b = parcel.readLong();
                return;
            } else {
                interfaceC7009KaArr[i10] = (InterfaceC7009Ka) parcel.readParcelable(InterfaceC7009Ka.class.getClassLoader());
                i10++;
            }
        }
    }

    public final int a() {
        return this.f76706a.length;
    }

    public final InterfaceC7009Ka b(int i10) {
        return this.f76706a[i10];
    }

    public final C8776lb d(C8776lb c8776lb) {
        return c8776lb == null ? this : c(c8776lb.f76706a);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f76706a) * 31;
        long j10 = this.f76707b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        long j10 = this.f76707b;
        String string = Arrays.toString(this.f76706a);
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f76706a.length);
        for (InterfaceC7009Ka interfaceC7009Ka : this.f76706a) {
            parcel.writeParcelable(interfaceC7009Ka, 0);
        }
        parcel.writeLong(this.f76707b);
    }

    public C8776lb(List list) {
        this(-9223372036854775807L, (InterfaceC7009Ka[]) list.toArray(new InterfaceC7009Ka[0]));
    }
}
