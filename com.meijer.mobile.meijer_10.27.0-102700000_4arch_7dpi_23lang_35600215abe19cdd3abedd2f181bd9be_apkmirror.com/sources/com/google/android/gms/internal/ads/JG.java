package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class JG {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9377sH f67857a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9008ot f67858b;

    public JG(InterfaceC9377sH interfaceC9377sH, InterfaceC9008ot interfaceC9008ot) {
        this.f67857a = interfaceC9377sH;
        this.f67858b = interfaceC9008ot;
    }

    public final View a() {
        InterfaceC9008ot interfaceC9008ot = this.f67858b;
        if (interfaceC9008ot == null) {
            return null;
        }
        return interfaceC9008ot.zzG();
    }

    public final View b() {
        InterfaceC9008ot interfaceC9008ot = this.f67858b;
        if (interfaceC9008ot != null) {
            return interfaceC9008ot.zzG();
        }
        return null;
    }

    public final InterfaceC9008ot c() {
        return this.f67858b;
    }

    public final InterfaceC9377sH e() {
        return this.f67857a;
    }

    public final ZF d(Executor executor) {
        final InterfaceC9008ot interfaceC9008ot = this.f67858b;
        return new ZF(new InterfaceC9585uE() { // from class: com.google.android.gms.internal.ads.IG
            @Override // com.google.android.gms.internal.ads.InterfaceC9585uE
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.h hVarL;
                InterfaceC9008ot interfaceC9008ot2 = interfaceC9008ot;
                if (interfaceC9008ot2 == null || (hVarL = interfaceC9008ot2.l()) == null) {
                    return;
                }
                hVarL.zzb();
            }
        }, executor);
    }

    public Set f(C9472tB c9472tB) {
        return Collections.singleton(new ZF(c9472tB, C6908Kq.f68180g));
    }

    public Set g(C9472tB c9472tB) {
        return Collections.singleton(new ZF(c9472tB, C6908Kq.f68180g));
    }
}
