package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9134q2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C9134q2> CREATOR = new C9027p2();

    /* renamed from: b, reason: collision with root package name */
    public final String f77693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77694c;

    /* renamed from: d, reason: collision with root package name */
    public final String f77695d;

    C9134q2(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = OV.f69091a;
        this.f77693b = string;
        this.f77694c = parcel.readString();
        this.f77695d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9134q2.class == obj.getClass()) {
            C9134q2 c9134q2 = (C9134q2) obj;
            if (Objects.equals(this.f77694c, c9134q2.f77694c) && Objects.equals(this.f77693b, c9134q2.f77693b) && Objects.equals(this.f77695d, c9134q2.f77695d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f77693b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f77694c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f77695d;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2
    public final String toString() {
        return this.f76984a + ": domain=" + this.f77693b + ", description=" + this.f77694c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76984a);
        parcel.writeString(this.f77693b);
        parcel.writeString(this.f77695d);
    }

    public C9134q2(String str, String str2, String str3) {
        super("----");
        this.f77693b = str;
        this.f77694c = str2;
        this.f77695d = str3;
    }
}
