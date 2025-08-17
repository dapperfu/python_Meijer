package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6888Kc extends AbstractC15136a {
    public static final Parcelable.Creator<C6888Kc> CREATOR = new C6922Lc();

    /* renamed from: a, reason: collision with root package name */
    public final String f68122a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68123b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68124c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68125d;

    /* renamed from: e, reason: collision with root package name */
    public final String f68126e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f68127f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f68128g;

    /* renamed from: h, reason: collision with root package name */
    public long f68129h;

    /* renamed from: i, reason: collision with root package name */
    public String f68130i;

    /* renamed from: j, reason: collision with root package name */
    public int f68131j;

    public static C6888Kc B(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                Qc.p.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j10 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C6888Kc(queryParameter, j10, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e10) {
            e = e10;
            Qc.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            Qc.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f68122a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.s(parcel, 3, this.f68123b);
        C15137b.w(parcel, 4, this.f68124c, false);
        C15137b.w(parcel, 5, this.f68125d, false);
        C15137b.w(parcel, 6, this.f68126e, false);
        C15137b.e(parcel, 7, this.f68127f, false);
        C15137b.c(parcel, 8, this.f68128g);
        C15137b.s(parcel, 9, this.f68129h);
        C15137b.w(parcel, 10, this.f68130i, false);
        C15137b.n(parcel, 11, this.f68131j);
        C15137b.b(parcel, iA);
    }

    C6888Kc(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z10, long j11, String str5, int i10) {
        this.f68122a = str;
        this.f68123b = j10;
        this.f68124c = str2 == null ? "" : str2;
        this.f68125d = str3 == null ? "" : str3;
        this.f68126e = str4 == null ? "" : str4;
        this.f68127f = bundle == null ? new Bundle() : bundle;
        this.f68128g = z10;
        this.f68129h = j11;
        this.f68130i = str5;
        this.f68131j = i10;
    }
}
