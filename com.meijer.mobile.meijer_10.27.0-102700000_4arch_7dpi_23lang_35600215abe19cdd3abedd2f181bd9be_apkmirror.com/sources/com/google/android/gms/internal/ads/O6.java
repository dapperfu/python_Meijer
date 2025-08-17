package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f69008a;

    public O6(Handler handler) {
        this.f69008a = new M6(this, handler);
    }

    public final void a(V6 v62, zzapv zzapvVar) {
        v62.z("post-error");
        ((M6) this.f69008a).f68527a.post(new N6(v62, C7543b7.a(zzapvVar), null));
    }

    public final void b(V6 v62, C7543b7 c7543b7, Runnable runnable) {
        v62.E();
        v62.z("post-response");
        ((M6) this.f69008a).f68527a.post(new N6(v62, c7543b7, runnable));
    }
}
