package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8398hz extends AbstractC8929my {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC7158Oh f75694j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f75695k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f75696l;

    static /* synthetic */ void q(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final int i() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final View k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final Oc.Y0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final C7560a60 m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final C7560a60 n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final void p(ViewGroup viewGroup, Oc.d2 d2Var) {
    }

    @Override // com.google.android.gms.internal.ads.C6702Az
    public final void b() {
        final RunnableC8184fz runnableC8184fz = new RunnableC8184fz(new AtomicReference(this.f75695k));
        this.f75696l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gz
            @Override // java.lang.Runnable
            public final void run() {
                this.f75405a.r(runnableC8184fz);
            }
        });
    }

    final /* synthetic */ void r(Runnable runnable) {
        try {
            if (this.f75694j.zze(com.google.android.gms.dynamic.d.I2(runnable))) {
                return;
            }
            q(((RunnableC8184fz) runnable).f75047a);
        } catch (RemoteException unused) {
            q(((RunnableC8184fz) runnable).f75047a);
        }
    }

    public C8398hz(C10321zz c10321zz, InterfaceC7158Oh interfaceC7158Oh, Runnable runnable, Executor executor) {
        super(c10321zz);
        this.f75694j = interfaceC7158Oh;
        this.f75695k = runnable;
        this.f75696l = executor;
    }
}
