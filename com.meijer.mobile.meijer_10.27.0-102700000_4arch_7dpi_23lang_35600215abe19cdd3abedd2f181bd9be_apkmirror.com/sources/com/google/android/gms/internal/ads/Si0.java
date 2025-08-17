package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class Si0 {

    /* renamed from: d, reason: collision with root package name */
    static final Si0 f70145d = new Si0();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f70146a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f70147b;

    /* renamed from: c, reason: collision with root package name */
    Si0 f70148c;

    Si0() {
        this.f70146a = null;
        this.f70147b = null;
    }

    Si0(Runnable runnable, Executor executor) {
        this.f70146a = runnable;
        this.f70147b = executor;
    }
}
