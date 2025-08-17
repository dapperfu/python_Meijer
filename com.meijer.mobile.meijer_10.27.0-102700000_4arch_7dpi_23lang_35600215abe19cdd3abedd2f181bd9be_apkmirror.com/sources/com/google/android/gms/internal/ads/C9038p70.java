package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.p70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9038p70 extends AbstractC15136a {
    public static final Parcelable.Creator<C9038p70> CREATOR = new C9145q70();

    /* renamed from: a, reason: collision with root package name */
    private final EnumC8717m70[] f77499a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f77500b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77501c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC8717m70 f77502d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77503e;

    /* renamed from: f, reason: collision with root package name */
    public final int f77504f;

    /* renamed from: g, reason: collision with root package name */
    public final int f77505g;

    /* renamed from: h, reason: collision with root package name */
    public final String f77506h;

    /* renamed from: i, reason: collision with root package name */
    private final int f77507i;

    /* renamed from: j, reason: collision with root package name */
    private final int f77508j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f77509k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f77510l;

    /* renamed from: m, reason: collision with root package name */
    public final int f77511m;

    public C9038p70(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        EnumC8717m70[] enumC8717m70ArrValues = EnumC8717m70.values();
        this.f77499a = enumC8717m70ArrValues;
        int[] iArrA = C8824n70.a();
        this.f77509k = iArrA;
        int[] iArrA2 = C8931o70.a();
        this.f77510l = iArrA2;
        this.f77500b = null;
        this.f77501c = i10;
        this.f77502d = enumC8717m70ArrValues[i10];
        this.f77503e = i11;
        this.f77504f = i12;
        this.f77505g = i13;
        this.f77506h = str;
        this.f77507i = i14;
        this.f77511m = iArrA[i14];
        this.f77508j = i15;
        int i16 = iArrA2[i15];
    }

    public static C9038p70 B(EnumC8717m70 enumC8717m70, Context context) {
        if (enumC8717m70 == EnumC8717m70.Rewarded) {
            return new C9038p70(context, enumC8717m70, ((Integer) Mc.A.c().a(C8659lf.f76368i6)).intValue(), ((Integer) Mc.A.c().a(C8659lf.f76452o6)).intValue(), ((Integer) Mc.A.c().a(C8659lf.f76480q6)).intValue(), (String) Mc.A.c().a(C8659lf.f76508s6), (String) Mc.A.c().a(C8659lf.f76396k6), (String) Mc.A.c().a(C8659lf.f76424m6));
        }
        if (enumC8717m70 == EnumC8717m70.Interstitial) {
            return new C9038p70(context, enumC8717m70, ((Integer) Mc.A.c().a(C8659lf.f76382j6)).intValue(), ((Integer) Mc.A.c().a(C8659lf.f76466p6)).intValue(), ((Integer) Mc.A.c().a(C8659lf.f76494r6)).intValue(), (String) Mc.A.c().a(C8659lf.f76522t6), (String) Mc.A.c().a(C8659lf.f76410l6), (String) Mc.A.c().a(C8659lf.f76438n6));
        }
        if (enumC8717m70 != EnumC8717m70.AppOpen) {
            return null;
        }
        return new C9038p70(context, enumC8717m70, ((Integer) Mc.A.c().a(C8659lf.f76564w6)).intValue(), ((Integer) Mc.A.c().a(C8659lf.f76592y6)).intValue(), ((Integer) Mc.A.c().a(C8659lf.f76606z6)).intValue(), (String) Mc.A.c().a(C8659lf.f76536u6), (String) Mc.A.c().a(C8659lf.f76550v6), (String) Mc.A.c().a(C8659lf.f76578x6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f77501c;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f77503e);
        C15137b.n(parcel, 3, this.f77504f);
        C15137b.n(parcel, 4, this.f77505g);
        C15137b.w(parcel, 5, this.f77506h, false);
        C15137b.n(parcel, 6, this.f77507i);
        C15137b.n(parcel, 7, this.f77508j);
        C15137b.b(parcel, iA);
    }

    private C9038p70(Context context, EnumC8717m70 enumC8717m70, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        this.f77499a = EnumC8717m70.values();
        this.f77509k = C8824n70.a();
        this.f77510l = C8931o70.a();
        this.f77500b = context;
        this.f77501c = enumC8717m70.ordinal();
        this.f77502d = enumC8717m70;
        this.f77503e = i10;
        this.f77504f = i11;
        this.f77505g = i12;
        this.f77506h = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.f77511m = i13;
        this.f77507i = i13 - 1;
        "onAdClosed".equals(str3);
        this.f77508j = 0;
    }
}
