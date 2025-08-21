package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class Kj0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f68992a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8042eh0 f68993b;

    /* synthetic */ Kj0(boolean z10, AbstractC8042eh0 abstractC8042eh0, Lj0 lj0) {
        this.f68992a = z10;
        this.f68993b = abstractC8042eh0;
    }

    public final com.google.common.util.concurrent.q a(Callable callable, Executor executor) {
        return new C10183yj0(this.f68993b, this.f68992a, executor, callable);
    }
}
