package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8298h2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C8298h2> CREATOR = new C8191g2();

    /* renamed from: b, reason: collision with root package name */
    public final String f75415b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75416c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75417d;

    C8298h2(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f75415b = string;
        this.f75416c = parcel.readString();
        this.f75417d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8298h2.class == obj.getClass()) {
            C8298h2 c8298h2 = (C8298h2) obj;
            if (Objects.equals(this.f75416c, c8298h2.f75416c) && Objects.equals(this.f75415b, c8298h2.f75415b) && Objects.equals(this.f75417d, c8298h2.f75417d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f75415b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f75416c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f75417d;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2
    public final String toString() {
        return this.f77824a + ": language=" + this.f75415b + ", description=" + this.f75416c + ", text=" + this.f75417d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f77824a);
        parcel.writeString(this.f75415b);
        parcel.writeString(this.f75417d);
    }

    public C8298h2(String str, String str2, String str3) {
        super("COMM");
        this.f75415b = str;
        this.f75416c = str2;
        this.f75417d = str3;
    }
}
