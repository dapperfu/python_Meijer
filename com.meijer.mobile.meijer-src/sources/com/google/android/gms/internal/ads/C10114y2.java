package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10114y2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C10114y2> CREATOR = new C10007x2();

    /* renamed from: b, reason: collision with root package name */
    public final String f80757b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80758c;

    /* JADX WARN: Illegal instructions before constructor call */
    C10114y2(Parcel parcel) {
        String string = parcel.readString();
        int i10 = OV.f69931a;
        super(string);
        this.f80757b = parcel.readString();
        this.f80758c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10114y2.class == obj.getClass()) {
            C10114y2 c10114y2 = (C10114y2) obj;
            if (this.f77824a.equals(c10114y2.f77824a) && Objects.equals(this.f80757b, c10114y2.f80757b) && Objects.equals(this.f80758c, c10114y2.f80758c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f77824a.hashCode() + 527;
        String str = this.f80757b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i10 = iHashCode * 31;
        String str2 = this.f80758c;
        return ((i10 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2
    public final String toString() {
        return this.f77824a + ": url=" + this.f80758c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f77824a);
        parcel.writeString(this.f80757b);
        parcel.writeString(this.f80758c);
    }

    public C10114y2(String str, String str2, String str3) {
        super(str);
        this.f80757b = str2;
        this.f80758c = str3;
    }
}
