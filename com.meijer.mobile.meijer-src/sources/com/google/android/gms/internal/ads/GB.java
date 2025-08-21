package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GB {

    /* renamed from: a, reason: collision with root package name */
    private Context f67965a;

    /* renamed from: b, reason: collision with root package name */
    private C9695u60 f67966b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f67967c;

    /* renamed from: d, reason: collision with root package name */
    private C8840m60 f67968d;

    /* renamed from: e, reason: collision with root package name */
    private C10132yB f67969e;

    /* renamed from: f, reason: collision with root package name */
    private C8981nT f67970f;

    /* renamed from: g, reason: collision with root package name */
    private int f67971g = 0;

    public final GB e(C8981nT c8981nT) {
        this.f67970f = c8981nT;
        return this;
    }

    public final GB f(Context context) {
        this.f67965a = context;
        return this;
    }

    public final GB g(Bundle bundle) {
        this.f67967c = bundle;
        return this;
    }

    public final GB h(C10132yB c10132yB) {
        this.f67969e = c10132yB;
        return this;
    }

    public final GB i(int i10) {
        this.f67971g = i10;
        return this;
    }

    public final GB j(C8840m60 c8840m60) {
        this.f67968d = c8840m60;
        return this;
    }

    public final GB k(C9695u60 c9695u60) {
        this.f67966b = c9695u60;
        return this;
    }

    public final IB l() {
        return new IB(this, null);
    }
}
