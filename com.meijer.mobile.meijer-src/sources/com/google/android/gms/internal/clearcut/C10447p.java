package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.clearcut.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10447p {

    /* renamed from: a, reason: collision with root package name */
    private final String f82373a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f82374b;

    /* renamed from: c, reason: collision with root package name */
    private final String f82375c;

    /* renamed from: d, reason: collision with root package name */
    private final String f82376d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f82377e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f82378f;

    public C10447p(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public final <T> AbstractC10417f<T> a(String str, T t10, InterfaceC10444o<T> interfaceC10444o) {
        return AbstractC10417f.c(this, str, t10, interfaceC10444o);
    }

    public final AbstractC10417f<String> b(String str, String str2) {
        return AbstractC10417f.d(this, str, null);
    }

    public final AbstractC10417f<Boolean> e(String str, boolean z10) {
        return AbstractC10417f.e(this, str, false);
    }

    public final C10447p f(String str) {
        boolean z10 = this.f82377e;
        if (z10) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new C10447p(this.f82373a, this.f82374b, str, this.f82376d, z10, this.f82378f);
    }

    public final C10447p h(String str) {
        return new C10447p(this.f82373a, this.f82374b, this.f82375c, str, this.f82377e, this.f82378f);
    }

    private C10447p(String str, Uri uri, String str2, String str3, boolean z10, boolean z11) {
        this.f82373a = str;
        this.f82374b = uri;
        this.f82375c = str2;
        this.f82376d = str3;
        this.f82377e = z10;
        this.f82378f = z11;
    }
}
