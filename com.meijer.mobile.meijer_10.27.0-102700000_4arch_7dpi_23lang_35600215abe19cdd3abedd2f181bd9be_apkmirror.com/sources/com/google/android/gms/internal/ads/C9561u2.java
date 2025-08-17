package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9561u2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C9561u2> CREATOR = new C9454t2();

    /* renamed from: b, reason: collision with root package name */
    public final String f78719b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f78720c;

    C9561u2(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f78719b = string;
        this.f78720c = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9561u2.class == obj.getClass()) {
            C9561u2 c9561u2 = (C9561u2) obj;
            if (Objects.equals(this.f78719b, c9561u2.f78719b) && Arrays.equals(this.f78720c, c9561u2.f78720c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f78719b;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f78720c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2
    public final String toString() {
        return this.f76984a + ": owner=" + this.f78719b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f78719b);
        parcel.writeByteArray(this.f78720c);
    }

    public C9561u2(String str, byte[] bArr) {
        super("PRIV");
        this.f78719b = str;
        this.f78720c = bArr;
    }
}
