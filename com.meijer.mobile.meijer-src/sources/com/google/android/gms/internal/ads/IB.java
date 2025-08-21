package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class IB {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68406a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f68407b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f68408c;

    /* renamed from: d, reason: collision with root package name */
    private final C8840m60 f68409d;

    /* renamed from: e, reason: collision with root package name */
    private final C10132yB f68410e;

    /* renamed from: f, reason: collision with root package name */
    private final C8981nT f68411f;

    /* renamed from: g, reason: collision with root package name */
    private final int f68412g;

    /* synthetic */ IB(GB gb2, HB hb2) {
        this.f68406a = gb2.f67965a;
        this.f68407b = gb2.f67966b;
        this.f68408c = gb2.f67967c;
        this.f68409d = gb2.f67968d;
        this.f68410e = gb2.f67969e;
        this.f68411f = gb2.f67970f;
        this.f68412g = gb2.f67971g;
    }

    final int a() {
        return this.f68412g;
    }

    final Context b(Context context) {
        return this.f68406a;
    }

    final Bundle c() {
        return this.f68408c;
    }

    final C10132yB d() {
        return this.f68410e;
    }

    final C8840m60 g() {
        return this.f68409d;
    }

    final C9695u60 h() {
        return this.f68407b;
    }

    final GB e() {
        GB gb2 = new GB();
        gb2.f(this.f68406a);
        gb2.k(this.f68407b);
        gb2.g(this.f68408c);
        gb2.h(this.f68410e);
        gb2.e(this.f68411f);
        return gb2;
    }

    final C8981nT f(String str) {
        C8981nT c8981nT = this.f68411f;
        return c8981nT != null ? c8981nT : new C8981nT(str);
    }
}
