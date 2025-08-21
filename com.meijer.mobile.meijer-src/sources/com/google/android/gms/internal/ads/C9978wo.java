package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9978wo extends AbstractC15707a {
    public static final Parcelable.Creator<C9978wo> CREATOR = new C10085xo();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f80366a;

    /* renamed from: b, reason: collision with root package name */
    public final Sc.a f80367b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f80368c;

    /* renamed from: d, reason: collision with root package name */
    public final String f80369d;

    /* renamed from: e, reason: collision with root package name */
    public final List f80370e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f80371f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80372g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80373h;

    /* renamed from: i, reason: collision with root package name */
    public C9163p70 f80374i;

    /* renamed from: j, reason: collision with root package name */
    public String f80375j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f80376k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f80377l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f80378m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f80379n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f80366a;
        int iA = C15708b.a(parcel);
        C15708b.e(parcel, 1, bundle, false);
        C15708b.u(parcel, 2, this.f80367b, i10, false);
        C15708b.u(parcel, 3, this.f80368c, i10, false);
        C15708b.w(parcel, 4, this.f80369d, false);
        C15708b.y(parcel, 5, this.f80370e, false);
        C15708b.u(parcel, 6, this.f80371f, i10, false);
        C15708b.w(parcel, 7, this.f80372g, false);
        C15708b.w(parcel, 9, this.f80373h, false);
        C15708b.u(parcel, 10, this.f80374i, i10, false);
        C15708b.w(parcel, 11, this.f80375j, false);
        C15708b.c(parcel, 12, this.f80376k);
        C15708b.c(parcel, 13, this.f80377l);
        C15708b.e(parcel, 14, this.f80378m, false);
        C15708b.e(parcel, 15, this.f80379n, false);
        C15708b.b(parcel, iA);
    }

    public C9978wo(Bundle bundle, Sc.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, C9163p70 c9163p70, String str4, boolean z10, boolean z11, Bundle bundle2, Bundle bundle3) {
        this.f80366a = bundle;
        this.f80367b = aVar;
        this.f80369d = str;
        this.f80368c = applicationInfo;
        this.f80370e = list;
        this.f80371f = packageInfo;
        this.f80372g = str2;
        this.f80373h = str3;
        this.f80374i = c9163p70;
        this.f80375j = str4;
        this.f80376k = z10;
        this.f80377l = z11;
        this.f80378m = bundle2;
        this.f80379n = bundle3;
    }
}
