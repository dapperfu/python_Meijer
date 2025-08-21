package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7013Kc extends AbstractC15707a {
    public static final Parcelable.Creator<C7013Kc> CREATOR = new C7047Lc();

    /* renamed from: a, reason: collision with root package name */
    public final String f68962a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68963b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68964c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68965d;

    /* renamed from: e, reason: collision with root package name */
    public final String f68966e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f68967f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f68968g;

    /* renamed from: h, reason: collision with root package name */
    public long f68969h;

    /* renamed from: i, reason: collision with root package name */
    public String f68970i;

    /* renamed from: j, reason: collision with root package name */
    public int f68971j;

    public static C7013Kc B(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                Sc.p.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
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
            return new C7013Kc(queryParameter, j10, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e10) {
            e = e10;
            Sc.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            Sc.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f68962a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.s(parcel, 3, this.f68963b);
        C15708b.w(parcel, 4, this.f68964c, false);
        C15708b.w(parcel, 5, this.f68965d, false);
        C15708b.w(parcel, 6, this.f68966e, false);
        C15708b.e(parcel, 7, this.f68967f, false);
        C15708b.c(parcel, 8, this.f68968g);
        C15708b.s(parcel, 9, this.f68969h);
        C15708b.w(parcel, 10, this.f68970i, false);
        C15708b.n(parcel, 11, this.f68971j);
        C15708b.b(parcel, iA);
    }

    C7013Kc(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z10, long j11, String str5, int i10) {
        this.f68962a = str;
        this.f68963b = j10;
        this.f68964c = str2 == null ? "" : str2;
        this.f68965d = str3 == null ? "" : str3;
        this.f68966e = str4 == null ? "" : str4;
        this.f68967f = bundle == null ? new Bundle() : bundle;
        this.f68968g = z10;
        this.f68969h = j11;
        this.f68970i = str5;
        this.f68971j = i10;
    }
}
