package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7852e2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C7852e2> CREATOR = new C7746d2();

    /* renamed from: b, reason: collision with root package name */
    public final String f73740b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73741c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f73742d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f73743e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC8813n2[] f73744f;

    C7852e2(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f73740b = string;
        this.f73741c = parcel.readByte() != 0;
        this.f73742d = parcel.readByte() != 0;
        this.f73743e = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f73744f = new AbstractC8813n2[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f73744f[i12] = (AbstractC8813n2) parcel.readParcelable(AbstractC8813n2.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7852e2.class == obj.getClass()) {
            C7852e2 c7852e2 = (C7852e2) obj;
            if (this.f73741c == c7852e2.f73741c && this.f73742d == c7852e2.f73742d && Objects.equals(this.f73740b, c7852e2.f73740b) && Arrays.equals(this.f73743e, c7852e2.f73743e) && Arrays.equals(this.f73744f, c7852e2.f73744f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f73740b;
        return (((((this.f73741c ? 1 : 0) + 527) * 31) + (this.f73742d ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f73740b);
        parcel.writeByte(this.f73741c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f73742d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f73743e);
        parcel.writeInt(this.f73744f.length);
        for (AbstractC8813n2 abstractC8813n2 : this.f73744f) {
            parcel.writeParcelable(abstractC8813n2, 0);
        }
    }

    public C7852e2(String str, boolean z10, boolean z11, String[] strArr, AbstractC8813n2[] abstractC8813n2Arr) {
        super("CTOC");
        this.f73740b = str;
        this.f73741c = z10;
        this.f73742d = z11;
        this.f73743e = strArr;
        this.f73744f = abstractC8813n2Arr;
    }
}
