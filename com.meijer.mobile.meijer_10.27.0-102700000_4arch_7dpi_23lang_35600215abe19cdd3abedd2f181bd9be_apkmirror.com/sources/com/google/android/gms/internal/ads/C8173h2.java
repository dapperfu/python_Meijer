package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8173h2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C8173h2> CREATOR = new C8066g2();

    /* renamed from: b, reason: collision with root package name */
    public final String f74575b;

    /* renamed from: c, reason: collision with root package name */
    public final String f74576c;

    /* renamed from: d, reason: collision with root package name */
    public final String f74577d;

    C8173h2(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f74575b = string;
        this.f74576c = parcel.readString();
        this.f74577d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8173h2.class == obj.getClass()) {
            C8173h2 c8173h2 = (C8173h2) obj;
            if (Objects.equals(this.f74576c, c8173h2.f74576c) && Objects.equals(this.f74575b, c8173h2.f74575b) && Objects.equals(this.f74577d, c8173h2.f74577d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f74575b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f74576c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f74577d;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2
    public final String toString() {
        return this.f76984a + ": language=" + this.f74575b + ", description=" + this.f74576c + ", text=" + this.f74577d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76984a);
        parcel.writeString(this.f74575b);
        parcel.writeString(this.f74577d);
    }

    public C8173h2(String str, String str2, String str3) {
        super("COMM");
        this.f74575b = str;
        this.f74576c = str2;
        this.f74577d = str3;
    }
}
