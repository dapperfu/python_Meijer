package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.mq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8913mq extends AbstractC15707a {
    public static final Parcelable.Creator<C8913mq> CREATOR = new C9020nq();

    /* renamed from: a, reason: collision with root package name */
    public final String f77747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77748b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final Oc.d2 f77749c;

    /* renamed from: d, reason: collision with root package name */
    public final Oc.Y1 f77750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77751e;

    /* renamed from: f, reason: collision with root package name */
    public final String f77752f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f77747a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f77748b, false);
        C15708b.u(parcel, 3, this.f77749c, i10, false);
        C15708b.u(parcel, 4, this.f77750d, i10, false);
        C15708b.n(parcel, 5, this.f77751e);
        C15708b.w(parcel, 6, this.f77752f, false);
        C15708b.b(parcel, iA);
    }

    public C8913mq(String str, String str2, Oc.d2 d2Var, Oc.Y1 y12, int i10, String str3) {
        this.f77747a = str;
        this.f77748b = str2;
        this.f77749c = d2Var;
        this.f77750d = y12;
        this.f77751e = i10;
        this.f77752f = str3;
    }
}
