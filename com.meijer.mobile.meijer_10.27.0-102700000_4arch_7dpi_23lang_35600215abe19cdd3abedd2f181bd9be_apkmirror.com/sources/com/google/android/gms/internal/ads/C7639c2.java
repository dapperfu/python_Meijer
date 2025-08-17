package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7639c2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C7639c2> CREATOR = new C7533b2();

    /* renamed from: b, reason: collision with root package name */
    public final String f73065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73066c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73067d;

    /* renamed from: e, reason: collision with root package name */
    public final long f73068e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73069f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC8813n2[] f73070g;

    C7639c2(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f73065b = string;
        this.f73066c = parcel.readInt();
        this.f73067d = parcel.readInt();
        this.f73068e = parcel.readLong();
        this.f73069f = parcel.readLong();
        int i11 = parcel.readInt();
        this.f73070g = new AbstractC8813n2[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f73070g[i12] = (AbstractC8813n2) parcel.readParcelable(AbstractC8813n2.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7639c2.class == obj.getClass()) {
            C7639c2 c7639c2 = (C7639c2) obj;
            if (this.f73066c == c7639c2.f73066c && this.f73067d == c7639c2.f73067d && this.f73068e == c7639c2.f73068e && this.f73069f == c7639c2.f73069f && Objects.equals(this.f73065b, c7639c2.f73065b) && Arrays.equals(this.f73070g, c7639c2.f73070g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f73065b;
        return ((((((((this.f73066c + 527) * 31) + this.f73067d) * 31) + ((int) this.f73068e)) * 31) + ((int) this.f73069f)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f73065b);
        parcel.writeInt(this.f73066c);
        parcel.writeInt(this.f73067d);
        parcel.writeLong(this.f73068e);
        parcel.writeLong(this.f73069f);
        parcel.writeInt(this.f73070g.length);
        for (AbstractC8813n2 abstractC8813n2 : this.f73070g) {
            parcel.writeParcelable(abstractC8813n2, 0);
        }
    }

    public C7639c2(String str, int i10, int i11, long j10, long j11, AbstractC8813n2[] abstractC8813n2Arr) {
        super("CHAP");
        this.f73065b = str;
        this.f73066c = i10;
        this.f73067d = i11;
        this.f73068e = j10;
        this.f73069f = j11;
        this.f73070g = abstractC8813n2Arr;
    }
}
