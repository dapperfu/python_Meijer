package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes4.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f65769a;

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f65770b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f65771c = 0;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f65769a = uri;
        f65770b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
