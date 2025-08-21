package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7551a2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C7551a2> CREATOR = new Z1();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f73173b;

    /* JADX WARN: Illegal instructions before constructor call */
    C7551a2(Parcel parcel) {
        String string = parcel.readString();
        int i10 = OV.f69931a;
        super(string);
        this.f73173b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7551a2.class == obj.getClass()) {
            C7551a2 c7551a2 = (C7551a2) obj;
            if (this.f77824a.equals(c7551a2.f77824a) && Arrays.equals(this.f73173b, c7551a2.f73173b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f77824a.hashCode() + 527) * 31) + Arrays.hashCode(this.f73173b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f77824a);
        parcel.writeByteArray(this.f73173b);
    }

    public C7551a2(String str, byte[] bArr) {
        super(str);
        this.f73173b = bArr;
    }
}
