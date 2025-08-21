package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9259q2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C9259q2> CREATOR = new C9152p2();

    /* renamed from: b, reason: collision with root package name */
    public final String f78533b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78534c;

    /* renamed from: d, reason: collision with root package name */
    public final String f78535d;

    C9259q2(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f78533b = string;
        this.f78534c = parcel.readString();
        this.f78535d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9259q2.class == obj.getClass()) {
            C9259q2 c9259q2 = (C9259q2) obj;
            if (Objects.equals(this.f78534c, c9259q2.f78534c) && Objects.equals(this.f78533b, c9259q2.f78533b) && Objects.equals(this.f78535d, c9259q2.f78535d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f78533b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f78534c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f78535d;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2
    public final String toString() {
        return this.f77824a + ": domain=" + this.f78533b + ", description=" + this.f78534c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f77824a);
        parcel.writeString(this.f78533b);
        parcel.writeString(this.f78535d);
    }

    public C9259q2(String str, String str2, String str3) {
        super("----");
        this.f78533b = str;
        this.f78534c = str2;
        this.f78535d = str3;
    }
}
