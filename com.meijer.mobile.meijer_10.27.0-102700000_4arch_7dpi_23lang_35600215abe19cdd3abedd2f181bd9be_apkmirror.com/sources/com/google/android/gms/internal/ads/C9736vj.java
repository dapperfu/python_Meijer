package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.vj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9736vj extends AbstractC15136a {
    public static final Parcelable.Creator<C9736vj> CREATOR = new C9843wj();

    /* renamed from: a, reason: collision with root package name */
    public final String f79111a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f79112b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f79113c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f79111a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.x(parcel, 2, this.f79112b, false);
        C15137b.x(parcel, 3, this.f79113c, false);
        C15137b.b(parcel, iA);
    }

    C9736vj(String str, String[] strArr, String[] strArr2) {
        this.f79111a = str;
        this.f79112b = strArr;
        this.f79113c = strArr2;
    }
}
