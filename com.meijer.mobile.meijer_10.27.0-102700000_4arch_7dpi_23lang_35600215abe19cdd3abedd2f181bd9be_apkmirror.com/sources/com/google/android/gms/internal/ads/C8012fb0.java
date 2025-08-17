package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.fb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8012fb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7259Vb0 f74123a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74124b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC6986Na0 f74125c;

    /* renamed from: d, reason: collision with root package name */
    private final String f74126d = "Ad overlay";

    public final EnumC6986Na0 a() {
        return this.f74125c;
    }

    public final C7259Vb0 b() {
        return this.f74123a;
    }

    public final String c() {
        return this.f74126d;
    }

    public final String d() {
        return this.f74124b;
    }

    public C8012fb0(View view, EnumC6986Na0 enumC6986Na0, String str) {
        this.f74123a = new C7259Vb0(view);
        this.f74124b = view.getClass().getCanonicalName();
        this.f74125c = enumC6986Na0;
    }
}
