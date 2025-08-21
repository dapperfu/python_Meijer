package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.dz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7970dz implements InterfaceC9952wb {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9133ot f74568a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f74569b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f74570c = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final synchronized void C0(C9845vb c9845vb) {
        if (this.f74568a != null) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77410wc)).booleanValue()) {
                if (c9845vb.f79930j) {
                    AtomicReference atomicReference = this.f74570c;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f74569b;
                        final InterfaceC9133ot interfaceC9133ot = this.f74568a;
                        Objects.requireNonNull(interfaceC9133ot);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.az
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC9133ot.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!c9845vb.f79930j) {
                    AtomicReference atomicReference2 = this.f74570c;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f74569b;
                        final InterfaceC9133ot interfaceC9133ot2 = this.f74568a;
                        Objects.requireNonNull(interfaceC9133ot2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cz
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC9133ot2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }

    C7970dz(InterfaceC9133ot interfaceC9133ot, Executor executor) {
        this.f74568a = interfaceC9133ot;
        this.f74569b = executor;
    }
}
