package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
final class Jj0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final Future f68794a;

    /* renamed from: b, reason: collision with root package name */
    final Ij0 f68795b;

    Jj0(Future future, Ij0 ij0) {
        this.f68794a = future;
        this.f68795b = ij0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Object obj = this.f68794a;
        if ((obj instanceof AbstractC9330qk0) && (thA = C9436rk0.a((AbstractC9330qk0) obj)) != null) {
            this.f68795b.zza(thA);
            return;
        }
        try {
            this.f68795b.zzb(Mj0.p(this.f68794a));
        } catch (ExecutionException e10) {
            this.f68795b.zza(e10.getCause());
        } catch (Throwable th2) {
            this.f68795b.zza(th2);
        }
    }

    public final String toString() {
        C10068xf0 c10068xf0A = C10282zf0.a(this);
        c10068xf0A.a(this.f68795b);
        return c10068xf0A.toString();
    }
}
