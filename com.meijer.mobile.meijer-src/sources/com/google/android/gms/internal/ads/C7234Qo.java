package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Qo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7234Qo extends AbstractC15707a {
    public static final Parcelable.Creator<C7234Qo> CREATOR = new C7268Ro();

    /* renamed from: a, reason: collision with root package name */
    public final Oc.Y1 f70488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70489b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Oc.Y1 y12 = this.f70488a;
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, y12, i10, false);
        C15708b.w(parcel, 3, this.f70489b, false);
        C15708b.b(parcel, iA);
    }

    public C7234Qo(Oc.Y1 y12, String str) {
        this.f70488a = y12;
        this.f70489b = str;
    }
}
