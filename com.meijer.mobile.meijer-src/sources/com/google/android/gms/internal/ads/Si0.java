package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class Si0 {

    /* renamed from: d, reason: collision with root package name */
    static final Si0 f70985d = new Si0();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f70986a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f70987b;

    /* renamed from: c, reason: collision with root package name */
    Si0 f70988c;

    Si0() {
        this.f70986a = null;
        this.f70987b = null;
    }

    Si0(Runnable runnable, Executor executor) {
        this.f70986a = runnable;
        this.f70987b = executor;
    }
}
