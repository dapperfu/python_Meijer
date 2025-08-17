package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GB {

    /* renamed from: a, reason: collision with root package name */
    private Context f67125a;

    /* renamed from: b, reason: collision with root package name */
    private C9570u60 f67126b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f67127c;

    /* renamed from: d, reason: collision with root package name */
    private C8715m60 f67128d;

    /* renamed from: e, reason: collision with root package name */
    private C10007yB f67129e;

    /* renamed from: f, reason: collision with root package name */
    private C8856nT f67130f;

    /* renamed from: g, reason: collision with root package name */
    private int f67131g = 0;

    public final GB e(C8856nT c8856nT) {
        this.f67130f = c8856nT;
        return this;
    }

    public final GB f(Context context) {
        this.f67125a = context;
        return this;
    }

    public final GB g(Bundle bundle) {
        this.f67127c = bundle;
        return this;
    }

    public final GB h(C10007yB c10007yB) {
        this.f67129e = c10007yB;
        return this;
    }

    public final GB i(int i10) {
        this.f67131g = i10;
        return this;
    }

    public final GB j(C8715m60 c8715m60) {
        this.f67128d = c8715m60;
        return this;
    }

    public final GB k(C9570u60 c9570u60) {
        this.f67126b = c9570u60;
        return this;
    }

    public final IB l() {
        return new IB(this, null);
    }
}
