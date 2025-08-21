package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.s2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9472s2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C9472s2> CREATOR = new C9365r2();

    /* renamed from: b, reason: collision with root package name */
    public final int f78953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78954c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78955d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f78956e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f78957f;

    public C9472s2(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f78953b = i10;
        this.f78954c = i11;
        this.f78955d = i12;
        this.f78956e = iArr;
        this.f78957f = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9472s2.class == obj.getClass()) {
            C9472s2 c9472s2 = (C9472s2) obj;
            if (this.f78953b == c9472s2.f78953b && this.f78954c == c9472s2.f78954c && this.f78955d == c9472s2.f78955d && Arrays.equals(this.f78956e, c9472s2.f78956e) && Arrays.equals(this.f78957f, c9472s2.f78957f)) {
                return true;
            }
        }
        return false;
    }

    C9472s2(Parcel parcel) {
        super("MLLT");
        this.f78953b = parcel.readInt();
        this.f78954c = parcel.readInt();
        this.f78955d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = OV.f69931a;
        this.f78956e = iArrCreateIntArray;
        this.f78957f = parcel.createIntArray();
    }

    public final int hashCode() {
        return ((((((((this.f78953b + 527) * 31) + this.f78954c) * 31) + this.f78955d) * 31) + Arrays.hashCode(this.f78956e)) * 31) + Arrays.hashCode(this.f78957f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f78953b);
        parcel.writeInt(this.f78954c);
        parcel.writeInt(this.f78955d);
        parcel.writeIntArray(this.f78956e);
        parcel.writeIntArray(this.f78957f);
    }
}
