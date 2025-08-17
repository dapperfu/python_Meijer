package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7426a2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C7426a2> CREATOR = new Z1();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f72333b;

    /* JADX WARN: Illegal instructions before constructor call */
    C7426a2(Parcel parcel) {
        String string = parcel.readString();
        int i10 = OV.f69091a;
        super(string);
        this.f72333b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7426a2.class == obj.getClass()) {
            C7426a2 c7426a2 = (C7426a2) obj;
            if (this.f76984a.equals(c7426a2.f76984a) && Arrays.equals(this.f72333b, c7426a2.f72333b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f76984a.hashCode() + 527) * 31) + Arrays.hashCode(this.f72333b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76984a);
        parcel.writeByteArray(this.f72333b);
    }

    public C7426a2(String str, byte[] bArr) {
        super(str);
        this.f72333b = bArr;
    }
}
