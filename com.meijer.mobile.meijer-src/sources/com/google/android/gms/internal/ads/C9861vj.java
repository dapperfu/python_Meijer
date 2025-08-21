package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.vj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9861vj extends AbstractC15707a {
    public static final Parcelable.Creator<C9861vj> CREATOR = new C9968wj();

    /* renamed from: a, reason: collision with root package name */
    public final String f79951a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f79952b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f79953c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f79951a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.x(parcel, 2, this.f79952b, false);
        C15708b.x(parcel, 3, this.f79953c, false);
        C15708b.b(parcel, iA);
    }

    C9861vj(String str, String[] strArr, String[] strArr2) {
        this.f79951a = str;
        this.f79952b = strArr;
        this.f79953c = strArr2;
    }
}
