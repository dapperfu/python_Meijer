package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.tE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9479tE0 implements Parcelable {
    public static final Parcelable.Creator<C9479tE0> CREATOR = new VD0();

    /* renamed from: a, reason: collision with root package name */
    private int f78522a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f78523b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78524c;

    /* renamed from: d, reason: collision with root package name */
    public final String f78525d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f78526e;

    C9479tE0(Parcel parcel) {
        this.f78523b = new UUID(parcel.readLong(), parcel.readLong());
        this.f78524c = parcel.readString();
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f78525d = string;
        this.f78526e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9479tE0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C9479tE0 c9479tE0 = (C9479tE0) obj;
        return Objects.equals(this.f78524c, c9479tE0.f78524c) && Objects.equals(this.f78525d, c9479tE0.f78525d) && Objects.equals(this.f78523b, c9479tE0.f78523b) && Arrays.equals(this.f78526e, c9479tE0.f78526e);
    }

    public final int hashCode() {
        int i10 = this.f78522a;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f78523b.hashCode() * 31;
        String str = this.f78524c;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f78525d.hashCode()) * 31) + Arrays.hashCode(this.f78526e);
        this.f78522a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f78523b.getMostSignificantBits());
        parcel.writeLong(this.f78523b.getLeastSignificantBits());
        parcel.writeString(this.f78524c);
        parcel.writeString(this.f78525d);
        parcel.writeByteArray(this.f78526e);
    }

    public C9479tE0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f78523b = uuid;
        this.f78524c = null;
        this.f78525d = C7057Pc.e(str2);
        this.f78526e = bArr;
    }
}
