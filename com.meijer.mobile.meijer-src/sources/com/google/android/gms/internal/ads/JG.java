package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class JG {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9502sH f68697a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9133ot f68698b;

    public JG(InterfaceC9502sH interfaceC9502sH, InterfaceC9133ot interfaceC9133ot) {
        this.f68697a = interfaceC9502sH;
        this.f68698b = interfaceC9133ot;
    }

    public final View a() {
        InterfaceC9133ot interfaceC9133ot = this.f68698b;
        if (interfaceC9133ot == null) {
            return null;
        }
        return interfaceC9133ot.zzG();
    }

    public final View b() {
        InterfaceC9133ot interfaceC9133ot = this.f68698b;
        if (interfaceC9133ot != null) {
            return interfaceC9133ot.zzG();
        }
        return null;
    }

    public final InterfaceC9133ot c() {
        return this.f68698b;
    }

    public final InterfaceC9502sH e() {
        return this.f68697a;
    }

    public final ZF d(Executor executor) {
        final InterfaceC9133ot interfaceC9133ot = this.f68698b;
        return new ZF(new InterfaceC9710uE() { // from class: com.google.android.gms.internal.ads.IG
            @Override // com.google.android.gms.internal.ads.InterfaceC9710uE
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.h hVarL;
                InterfaceC9133ot interfaceC9133ot2 = interfaceC9133ot;
                if (interfaceC9133ot2 == null || (hVarL = interfaceC9133ot2.l()) == null) {
                    return;
                }
                hVarL.zzb();
            }
        }, executor);
    }

    public Set f(C9597tB c9597tB) {
        return Collections.singleton(new ZF(c9597tB, C7033Kq.f69020g));
    }

    public Set g(C9597tB c9597tB) {
        return Collections.singleton(new ZF(c9597tB, C7033Kq.f69020g));
    }
}
