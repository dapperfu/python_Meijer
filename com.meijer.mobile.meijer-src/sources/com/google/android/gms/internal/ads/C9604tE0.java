package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.tE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9604tE0 implements Parcelable {
    public static final Parcelable.Creator<C9604tE0> CREATOR = new VD0();

    /* renamed from: a, reason: collision with root package name */
    private int f79362a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f79363b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79364c;

    /* renamed from: d, reason: collision with root package name */
    public final String f79365d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f79366e;

    C9604tE0(Parcel parcel) {
        this.f79363b = new UUID(parcel.readLong(), parcel.readLong());
        this.f79364c = parcel.readString();
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f79365d = string;
        this.f79366e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9604tE0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C9604tE0 c9604tE0 = (C9604tE0) obj;
        return Objects.equals(this.f79364c, c9604tE0.f79364c) && Objects.equals(this.f79365d, c9604tE0.f79365d) && Objects.equals(this.f79363b, c9604tE0.f79363b) && Arrays.equals(this.f79366e, c9604tE0.f79366e);
    }

    public final int hashCode() {
        int i10 = this.f79362a;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f79363b.hashCode() * 31;
        String str = this.f79364c;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f79365d.hashCode()) * 31) + Arrays.hashCode(this.f79366e);
        this.f79362a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f79363b.getMostSignificantBits());
        parcel.writeLong(this.f79363b.getLeastSignificantBits());
        parcel.writeString(this.f79364c);
        parcel.writeString(this.f79365d);
        parcel.writeByteArray(this.f79366e);
    }

    public C9604tE0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f79363b = uuid;
        this.f79364c = null;
        this.f79365d = C7182Pc.e(str2);
        this.f79366e = bArr;
    }
}
