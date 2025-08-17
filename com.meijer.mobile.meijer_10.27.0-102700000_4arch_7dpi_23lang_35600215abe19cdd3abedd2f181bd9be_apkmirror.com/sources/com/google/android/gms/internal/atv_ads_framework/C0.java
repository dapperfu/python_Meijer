package com.google.android.gms.internal.atv_ads_framework;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f80740a;

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f80741b;

    /* renamed from: c, reason: collision with root package name */
    public static final Uri f80742c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f80743d;

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").appendPath("signals").build();
        f80740a = uriBuild;
        f80741b = uriBuild.buildUpon().authority("com.google.android.apps.tv.launcherx.ads.signals.AdsSignalsContentProvider").build();
        f80742c = uriBuild.buildUpon().authority("com.google.android.tvrecommendations.ads.signals.AdsSignalsContentProvider").build();
        f80743d = J.q(EnumC10207c0.ATC_RENDERING_CAPABILITY.a(), EnumC10207c0.ATC_RENDERING_CAPABILITY_DEPRECATED.a());
    }
}
