package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes4.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f64929a;

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f64930b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f64931c = 0;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f64929a = uri;
        f64930b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
