package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class AH0 implements BH0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f65953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ME f65954b;

    AH0(Executor executor, ME me2) {
        this.f65953a = executor;
        this.f65954b = me2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f65953a.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final void zza() {
        this.f65954b.zza(this.f65953a);
    }
}
