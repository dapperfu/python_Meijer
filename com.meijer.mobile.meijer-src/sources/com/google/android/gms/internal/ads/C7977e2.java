package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7977e2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C7977e2> CREATOR = new C7871d2();

    /* renamed from: b, reason: collision with root package name */
    public final String f74580b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74581c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f74582d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f74583e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC8938n2[] f74584f;

    C7977e2(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f74580b = string;
        this.f74581c = parcel.readByte() != 0;
        this.f74582d = parcel.readByte() != 0;
        this.f74583e = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f74584f = new AbstractC8938n2[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f74584f[i12] = (AbstractC8938n2) parcel.readParcelable(AbstractC8938n2.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7977e2.class == obj.getClass()) {
            C7977e2 c7977e2 = (C7977e2) obj;
            if (this.f74581c == c7977e2.f74581c && this.f74582d == c7977e2.f74582d && Objects.equals(this.f74580b, c7977e2.f74580b) && Arrays.equals(this.f74583e, c7977e2.f74583e) && Arrays.equals(this.f74584f, c7977e2.f74584f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f74580b;
        return (((((this.f74581c ? 1 : 0) + 527) * 31) + (this.f74582d ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f74580b);
        parcel.writeByte(this.f74581c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f74582d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f74583e);
        parcel.writeInt(this.f74584f.length);
        for (AbstractC8938n2 abstractC8938n2 : this.f74584f) {
            parcel.writeParcelable(abstractC8938n2, 0);
        }
    }

    public C7977e2(String str, boolean z10, boolean z11, String[] strArr, AbstractC8938n2[] abstractC8938n2Arr) {
        super("CTOC");
        this.f74580b = str;
        this.f74581c = z10;
        this.f74582d = z11;
        this.f74583e = strArr;
        this.f74584f = abstractC8938n2Arr;
    }
}
