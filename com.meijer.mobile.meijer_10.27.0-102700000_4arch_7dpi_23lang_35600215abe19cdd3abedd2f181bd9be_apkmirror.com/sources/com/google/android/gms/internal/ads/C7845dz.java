package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.dz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7845dz implements InterfaceC9827wb {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9008ot f73728a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f73729b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f73730c = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final synchronized void D0(C9720vb c9720vb) {
        if (this.f73728a != null) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76570wc)).booleanValue()) {
                if (c9720vb.f79090j) {
                    AtomicReference atomicReference = this.f73730c;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f73729b;
                        final InterfaceC9008ot interfaceC9008ot = this.f73728a;
                        Objects.requireNonNull(interfaceC9008ot);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.az
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC9008ot.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!c9720vb.f79090j) {
                    AtomicReference atomicReference2 = this.f73730c;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f73729b;
                        final InterfaceC9008ot interfaceC9008ot2 = this.f73728a;
                        Objects.requireNonNull(interfaceC9008ot2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cz
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC9008ot2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }

    C7845dz(InterfaceC9008ot interfaceC9008ot, Executor executor) {
        this.f73728a = interfaceC9008ot;
        this.f73729b = executor;
    }
}
