package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8273hz extends AbstractC8804my {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC7033Oh f74854j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f74855k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f74856l;

    static /* synthetic */ void q(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final int i() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final View k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final Mc.Y0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final C7435a60 m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final C7435a60 n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final void p(ViewGroup viewGroup, Mc.d2 d2Var) {
    }

    @Override // com.google.android.gms.internal.ads.C6577Az
    public final void b() {
        final RunnableC8059fz runnableC8059fz = new RunnableC8059fz(new AtomicReference(this.f74855k));
        this.f74856l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gz
            @Override // java.lang.Runnable
            public final void run() {
                this.f74565a.r(runnableC8059fz);
            }
        });
    }

    final /* synthetic */ void r(Runnable runnable) {
        try {
            if (this.f74854j.zze(com.google.android.gms.dynamic.d.F2(runnable))) {
                return;
            }
            q(((RunnableC8059fz) runnable).f74207a);
        } catch (RemoteException unused) {
            q(((RunnableC8059fz) runnable).f74207a);
        }
    }

    public C8273hz(C10196zz c10196zz, InterfaceC7033Oh interfaceC7033Oh, Runnable runnable, Executor executor) {
        super(c10196zz);
        this.f74854j = interfaceC7033Oh;
        this.f74855k = runnable;
        this.f74856l = executor;
    }
}
