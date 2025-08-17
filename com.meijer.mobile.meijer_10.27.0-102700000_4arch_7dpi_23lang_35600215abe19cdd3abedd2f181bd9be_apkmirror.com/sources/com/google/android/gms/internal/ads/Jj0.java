package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
final class Jj0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final Future f67954a;

    /* renamed from: b, reason: collision with root package name */
    final Ij0 f67955b;

    Jj0(Future future, Ij0 ij0) {
        this.f67954a = future;
        this.f67955b = ij0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Object obj = this.f67954a;
        if ((obj instanceof AbstractC9205qk0) && (thA = C9311rk0.a((AbstractC9205qk0) obj)) != null) {
            this.f67955b.zza(thA);
            return;
        }
        try {
            this.f67955b.zzb(Mj0.p(this.f67954a));
        } catch (ExecutionException e10) {
            this.f67955b.zza(e10.getCause());
        } catch (Throwable th2) {
            this.f67955b.zza(th2);
        }
    }

    public final String toString() {
        C9943xf0 c9943xf0A = C10157zf0.a(this);
        c9943xf0A.a(this.f67955b);
        return c9943xf0A.toString();
    }
}
