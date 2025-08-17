package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.clearcut.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10322p {

    /* renamed from: a, reason: collision with root package name */
    private final String f81533a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f81534b;

    /* renamed from: c, reason: collision with root package name */
    private final String f81535c;

    /* renamed from: d, reason: collision with root package name */
    private final String f81536d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f81537e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f81538f;

    public C10322p(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public final <T> AbstractC10292f<T> a(String str, T t10, InterfaceC10319o<T> interfaceC10319o) {
        return AbstractC10292f.c(this, str, t10, interfaceC10319o);
    }

    public final AbstractC10292f<String> b(String str, String str2) {
        return AbstractC10292f.d(this, str, null);
    }

    public final AbstractC10292f<Boolean> e(String str, boolean z10) {
        return AbstractC10292f.e(this, str, false);
    }

    public final C10322p f(String str) {
        boolean z10 = this.f81537e;
        if (z10) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new C10322p(this.f81533a, this.f81534b, str, this.f81536d, z10, this.f81538f);
    }

    public final C10322p h(String str) {
        return new C10322p(this.f81533a, this.f81534b, this.f81535c, str, this.f81537e, this.f81538f);
    }

    private C10322p(String str, Uri uri, String str2, String str3, boolean z10, boolean z11) {
        this.f81533a = str;
        this.f81534b = uri;
        this.f81535c = str2;
        this.f81536d = str3;
        this.f81537e = z10;
        this.f81538f = z11;
    }
}
