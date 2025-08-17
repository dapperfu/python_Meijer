package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9844wj0 extends AbstractC9951xj0 {

    /* renamed from: e, reason: collision with root package name */
    private final Callable f79520e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10058yj0 f79521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9844wj0(C10058yj0 c10058yj0, Callable callable, Executor executor) {
        super(c10058yj0, executor);
        this.f79521f = c10058yj0;
        this.f79520e = callable;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final Object a() throws Exception {
        return this.f79520e.call();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final String b() {
        return this.f79520e.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9951xj0
    final void h(Object obj) {
        this.f79521f.g(obj);
    }
}
