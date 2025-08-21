package com.google.android.gms.internal.atv_ads_framework;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f81580a;

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f81581b;

    /* renamed from: c, reason: collision with root package name */
    public static final Uri f81582c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f81583d;

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").appendPath("signals").build();
        f81580a = uriBuild;
        f81581b = uriBuild.buildUpon().authority("com.google.android.apps.tv.launcherx.ads.signals.AdsSignalsContentProvider").build();
        f81582c = uriBuild.buildUpon().authority("com.google.android.tvrecommendations.ads.signals.AdsSignalsContentProvider").build();
        f81583d = J.q(EnumC10332c0.ATC_RENDERING_CAPABILITY.a(), EnumC10332c0.ATC_RENDERING_CAPABILITY_DEPRECATED.a());
    }
}
