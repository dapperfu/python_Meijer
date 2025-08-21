package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9686u2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C9686u2> CREATOR = new C9579t2();

    /* renamed from: b, reason: collision with root package name */
    public final String f79559b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f79560c;

    C9686u2(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f79559b = string;
        this.f79560c = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9686u2.class == obj.getClass()) {
            C9686u2 c9686u2 = (C9686u2) obj;
            if (Objects.equals(this.f79559b, c9686u2.f79559b) && Arrays.equals(this.f79560c, c9686u2.f79560c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f79559b;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f79560c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2
    public final String toString() {
        return this.f77824a + ": owner=" + this.f79559b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f79559b);
        parcel.writeByteArray(this.f79560c);
    }

    public C9686u2(String str, byte[] bArr) {
        super("PRIV");
        this.f79559b = str;
        this.f79560c = bArr;
    }
}
