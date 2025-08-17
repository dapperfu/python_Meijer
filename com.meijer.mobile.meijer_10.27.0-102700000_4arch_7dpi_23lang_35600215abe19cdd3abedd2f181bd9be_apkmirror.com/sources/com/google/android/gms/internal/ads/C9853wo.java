package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9853wo extends AbstractC15136a {
    public static final Parcelable.Creator<C9853wo> CREATOR = new C9960xo();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f79526a;

    /* renamed from: b, reason: collision with root package name */
    public final Qc.a f79527b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f79528c;

    /* renamed from: d, reason: collision with root package name */
    public final String f79529d;

    /* renamed from: e, reason: collision with root package name */
    public final List f79530e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f79531f;

    /* renamed from: g, reason: collision with root package name */
    public final String f79532g;

    /* renamed from: h, reason: collision with root package name */
    public final String f79533h;

    /* renamed from: i, reason: collision with root package name */
    public C9038p70 f79534i;

    /* renamed from: j, reason: collision with root package name */
    public String f79535j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f79536k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f79537l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f79538m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f79539n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f79526a;
        int iA = C15137b.a(parcel);
        C15137b.e(parcel, 1, bundle, false);
        C15137b.u(parcel, 2, this.f79527b, i10, false);
        C15137b.u(parcel, 3, this.f79528c, i10, false);
        C15137b.w(parcel, 4, this.f79529d, false);
        C15137b.y(parcel, 5, this.f79530e, false);
        C15137b.u(parcel, 6, this.f79531f, i10, false);
        C15137b.w(parcel, 7, this.f79532g, false);
        C15137b.w(parcel, 9, this.f79533h, false);
        C15137b.u(parcel, 10, this.f79534i, i10, false);
        C15137b.w(parcel, 11, this.f79535j, false);
        C15137b.c(parcel, 12, this.f79536k);
        C15137b.c(parcel, 13, this.f79537l);
        C15137b.e(parcel, 14, this.f79538m, false);
        C15137b.e(parcel, 15, this.f79539n, false);
        C15137b.b(parcel, iA);
    }

    public C9853wo(Bundle bundle, Qc.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, C9038p70 c9038p70, String str4, boolean z10, boolean z11, Bundle bundle2, Bundle bundle3) {
        this.f79526a = bundle;
        this.f79527b = aVar;
        this.f79529d = str;
        this.f79528c = applicationInfo;
        this.f79530e = list;
        this.f79531f = packageInfo;
        this.f79532g = str2;
        this.f79533h = str3;
        this.f79534i = c9038p70;
        this.f79535j = str4;
        this.f79536k = z10;
        this.f79537l = z11;
        this.f79538m = bundle2;
        this.f79539n = bundle3;
    }
}
