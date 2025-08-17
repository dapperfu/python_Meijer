package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9989y2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C9989y2> CREATOR = new C9882x2();

    /* renamed from: b, reason: collision with root package name */
    public final String f79917b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79918c;

    /* JADX WARN: Illegal instructions before constructor call */
    C9989y2(Parcel parcel) {
        String string = parcel.readString();
        int i10 = OV.f69091a;
        super(string);
        this.f79917b = parcel.readString();
        this.f79918c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9989y2.class == obj.getClass()) {
            C9989y2 c9989y2 = (C9989y2) obj;
            if (this.f76984a.equals(c9989y2.f76984a) && Objects.equals(this.f79917b, c9989y2.f79917b) && Objects.equals(this.f79918c, c9989y2.f79918c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f76984a.hashCode() + 527;
        String str = this.f79917b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i10 = iHashCode * 31;
        String str2 = this.f79918c;
        return ((i10 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2
    public final String toString() {
        return this.f76984a + ": url=" + this.f79918c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76984a);
        parcel.writeString(this.f79917b);
        parcel.writeString(this.f79918c);
    }

    public C9989y2(String str, String str2, String str3) {
        super(str);
        this.f79917b = str2;
        this.f79918c = str3;
    }
}
