package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.s2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9347s2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C9347s2> CREATOR = new C9240r2();

    /* renamed from: b, reason: collision with root package name */
    public final int f78113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78114c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78115d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f78116e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f78117f;

    public C9347s2(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f78113b = i10;
        this.f78114c = i11;
        this.f78115d = i12;
        this.f78116e = iArr;
        this.f78117f = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9347s2.class == obj.getClass()) {
            C9347s2 c9347s2 = (C9347s2) obj;
            if (this.f78113b == c9347s2.f78113b && this.f78114c == c9347s2.f78114c && this.f78115d == c9347s2.f78115d && Arrays.equals(this.f78116e, c9347s2.f78116e) && Arrays.equals(this.f78117f, c9347s2.f78117f)) {
                return true;
            }
        }
        return false;
    }

    C9347s2(Parcel parcel) {
        super("MLLT");
        this.f78113b = parcel.readInt();
        this.f78114c = parcel.readInt();
        this.f78115d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = OV.f69091a;
        this.f78116e = iArrCreateIntArray;
        this.f78117f = parcel.createIntArray();
    }

    public final int hashCode() {
        return ((((((((this.f78113b + 527) * 31) + this.f78114c) * 31) + this.f78115d) * 31) + Arrays.hashCode(this.f78116e)) * 31) + Arrays.hashCode(this.f78117f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f78113b);
        parcel.writeInt(this.f78114c);
        parcel.writeInt(this.f78115d);
        parcel.writeIntArray(this.f78116e);
        parcel.writeIntArray(this.f78117f);
    }
}
