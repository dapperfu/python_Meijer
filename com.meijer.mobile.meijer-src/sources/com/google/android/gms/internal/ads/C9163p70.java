package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.p70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9163p70 extends AbstractC15707a {
    public static final Parcelable.Creator<C9163p70> CREATOR = new C9270q70();

    /* renamed from: a, reason: collision with root package name */
    private final EnumC8842m70[] f78339a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f78340b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78341c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC8842m70 f78342d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78343e;

    /* renamed from: f, reason: collision with root package name */
    public final int f78344f;

    /* renamed from: g, reason: collision with root package name */
    public final int f78345g;

    /* renamed from: h, reason: collision with root package name */
    public final String f78346h;

    /* renamed from: i, reason: collision with root package name */
    private final int f78347i;

    /* renamed from: j, reason: collision with root package name */
    private final int f78348j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f78349k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f78350l;

    /* renamed from: m, reason: collision with root package name */
    public final int f78351m;

    public C9163p70(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        EnumC8842m70[] enumC8842m70ArrValues = EnumC8842m70.values();
        this.f78339a = enumC8842m70ArrValues;
        int[] iArrA = C8949n70.a();
        this.f78349k = iArrA;
        int[] iArrA2 = C9056o70.a();
        this.f78350l = iArrA2;
        this.f78340b = null;
        this.f78341c = i10;
        this.f78342d = enumC8842m70ArrValues[i10];
        this.f78343e = i11;
        this.f78344f = i12;
        this.f78345g = i13;
        this.f78346h = str;
        this.f78347i = i14;
        this.f78351m = iArrA[i14];
        this.f78348j = i15;
        int i16 = iArrA2[i15];
    }

    public static C9163p70 B(EnumC8842m70 enumC8842m70, Context context) {
        if (enumC8842m70 == EnumC8842m70.Rewarded) {
            return new C9163p70(context, enumC8842m70, ((Integer) Oc.A.c().a(C8784lf.f77208i6)).intValue(), ((Integer) Oc.A.c().a(C8784lf.f77292o6)).intValue(), ((Integer) Oc.A.c().a(C8784lf.f77320q6)).intValue(), (String) Oc.A.c().a(C8784lf.f77348s6), (String) Oc.A.c().a(C8784lf.f77236k6), (String) Oc.A.c().a(C8784lf.f77264m6));
        }
        if (enumC8842m70 == EnumC8842m70.Interstitial) {
            return new C9163p70(context, enumC8842m70, ((Integer) Oc.A.c().a(C8784lf.f77222j6)).intValue(), ((Integer) Oc.A.c().a(C8784lf.f77306p6)).intValue(), ((Integer) Oc.A.c().a(C8784lf.f77334r6)).intValue(), (String) Oc.A.c().a(C8784lf.f77362t6), (String) Oc.A.c().a(C8784lf.f77250l6), (String) Oc.A.c().a(C8784lf.f77278n6));
        }
        if (enumC8842m70 != EnumC8842m70.AppOpen) {
            return null;
        }
        return new C9163p70(context, enumC8842m70, ((Integer) Oc.A.c().a(C8784lf.f77404w6)).intValue(), ((Integer) Oc.A.c().a(C8784lf.f77432y6)).intValue(), ((Integer) Oc.A.c().a(C8784lf.f77446z6)).intValue(), (String) Oc.A.c().a(C8784lf.f77376u6), (String) Oc.A.c().a(C8784lf.f77390v6), (String) Oc.A.c().a(C8784lf.f77418x6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f78341c;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f78343e);
        C15708b.n(parcel, 3, this.f78344f);
        C15708b.n(parcel, 4, this.f78345g);
        C15708b.w(parcel, 5, this.f78346h, false);
        C15708b.n(parcel, 6, this.f78347i);
        C15708b.n(parcel, 7, this.f78348j);
        C15708b.b(parcel, iA);
    }

    private C9163p70(Context context, EnumC8842m70 enumC8842m70, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        this.f78339a = EnumC8842m70.values();
        this.f78349k = C8949n70.a();
        this.f78350l = C9056o70.a();
        this.f78340b = context;
        this.f78341c = enumC8842m70.ordinal();
        this.f78342d = enumC8842m70;
        this.f78343e = i10;
        this.f78344f = i11;
        this.f78345g = i12;
        this.f78346h = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.f78351m = i13;
        this.f78347i = i13 - 1;
        "onAdClosed".equals(str3);
        this.f78348j = 0;
    }
}
