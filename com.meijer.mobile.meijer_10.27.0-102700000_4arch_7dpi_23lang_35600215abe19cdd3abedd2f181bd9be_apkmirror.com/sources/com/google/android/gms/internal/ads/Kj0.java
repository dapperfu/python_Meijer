package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class Kj0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f68152a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7917eh0 f68153b;

    /* synthetic */ Kj0(boolean z10, AbstractC7917eh0 abstractC7917eh0, Lj0 lj0) {
        this.f68152a = z10;
        this.f68153b = abstractC7917eh0;
    }

    public final com.google.common.util.concurrent.q a(Callable callable, Executor executor) {
        return new C10058yj0(this.f68153b, this.f68152a, executor, callable);
    }
}
