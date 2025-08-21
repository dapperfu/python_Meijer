package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7764c2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C7764c2> CREATOR = new C7658b2();

    /* renamed from: b, reason: collision with root package name */
    public final String f73905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73906c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73907d;

    /* renamed from: e, reason: collision with root package name */
    public final long f73908e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73909f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC8938n2[] f73910g;

    C7764c2(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f73905b = string;
        this.f73906c = parcel.readInt();
        this.f73907d = parcel.readInt();
        this.f73908e = parcel.readLong();
        this.f73909f = parcel.readLong();
        int i11 = parcel.readInt();
        this.f73910g = new AbstractC8938n2[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f73910g[i12] = (AbstractC8938n2) parcel.readParcelable(AbstractC8938n2.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7764c2.class == obj.getClass()) {
            C7764c2 c7764c2 = (C7764c2) obj;
            if (this.f73906c == c7764c2.f73906c && this.f73907d == c7764c2.f73907d && this.f73908e == c7764c2.f73908e && this.f73909f == c7764c2.f73909f && Objects.equals(this.f73905b, c7764c2.f73905b) && Arrays.equals(this.f73910g, c7764c2.f73910g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f73905b;
        return ((((((((this.f73906c + 527) * 31) + this.f73907d) * 31) + ((int) this.f73908e)) * 31) + ((int) this.f73909f)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f73905b);
        parcel.writeInt(this.f73906c);
        parcel.writeInt(this.f73907d);
        parcel.writeLong(this.f73908e);
        parcel.writeLong(this.f73909f);
        parcel.writeInt(this.f73910g.length);
        for (AbstractC8938n2 abstractC8938n2 : this.f73910g) {
            parcel.writeParcelable(abstractC8938n2, 0);
        }
    }

    public C7764c2(String str, int i10, int i11, long j10, long j11, AbstractC8938n2[] abstractC8938n2Arr) {
        super("CHAP");
        this.f73905b = str;
        this.f73906c = i10;
        this.f73907d = i11;
        this.f73908e = j10;
        this.f73909f = j11;
        this.f73910g = abstractC8938n2Arr;
    }
}
