package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.mq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8788mq extends AbstractC15136a {
    public static final Parcelable.Creator<C8788mq> CREATOR = new C8895nq();

    /* renamed from: a, reason: collision with root package name */
    public final String f76907a;

    /* renamed from: b, reason: collision with root package name */
    public final String f76908b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final Mc.d2 f76909c;

    /* renamed from: d, reason: collision with root package name */
    public final Mc.Y1 f76910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76911e;

    /* renamed from: f, reason: collision with root package name */
    public final String f76912f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f76907a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f76908b, false);
        C15137b.u(parcel, 3, this.f76909c, i10, false);
        C15137b.u(parcel, 4, this.f76910d, i10, false);
        C15137b.n(parcel, 5, this.f76911e);
        C15137b.w(parcel, 6, this.f76912f, false);
        C15137b.b(parcel, iA);
    }

    public C8788mq(String str, String str2, Mc.d2 d2Var, Mc.Y1 y12, int i10, String str3) {
        this.f76907a = str;
        this.f76908b = str2;
        this.f76909c = d2Var;
        this.f76910d = y12;
        this.f76911e = i10;
        this.f76912f = str3;
    }
}
