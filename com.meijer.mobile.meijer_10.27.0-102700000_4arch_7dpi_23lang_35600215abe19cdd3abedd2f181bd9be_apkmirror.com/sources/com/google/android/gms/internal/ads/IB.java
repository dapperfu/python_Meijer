package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class IB {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67566a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f67567b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f67568c;

    /* renamed from: d, reason: collision with root package name */
    private final C8715m60 f67569d;

    /* renamed from: e, reason: collision with root package name */
    private final C10007yB f67570e;

    /* renamed from: f, reason: collision with root package name */
    private final C8856nT f67571f;

    /* renamed from: g, reason: collision with root package name */
    private final int f67572g;

    /* synthetic */ IB(GB gb2, HB hb2) {
        this.f67566a = gb2.f67125a;
        this.f67567b = gb2.f67126b;
        this.f67568c = gb2.f67127c;
        this.f67569d = gb2.f67128d;
        this.f67570e = gb2.f67129e;
        this.f67571f = gb2.f67130f;
        this.f67572g = gb2.f67131g;
    }

    final int a() {
        return this.f67572g;
    }

    final Context b(Context context) {
        return this.f67566a;
    }

    final Bundle c() {
        return this.f67568c;
    }

    final C10007yB d() {
        return this.f67570e;
    }

    final C8715m60 g() {
        return this.f67569d;
    }

    final C9570u60 h() {
        return this.f67567b;
    }

    final GB e() {
        GB gb2 = new GB();
        gb2.f(this.f67566a);
        gb2.k(this.f67567b);
        gb2.g(this.f67568c);
        gb2.h(this.f67570e);
        gb2.e(this.f67571f);
        return gb2;
    }

    final C8856nT f(String str) {
        C8856nT c8856nT = this.f67571f;
        return c8856nT != null ? c8856nT : new C8856nT(str);
    }
}
