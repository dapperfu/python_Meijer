package Cd;

import Vd.C5517k;
import android.os.RemoteException;
import jd.C14987j;
import jd.InterfaceC14993p;

/* renamed from: Cd.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3055h implements InterfaceC14993p, K {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3053g f4251a;

    /* renamed from: b, reason: collision with root package name */
    private C14987j f4252b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4253c = true;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3057i f4254d;

    @Override // Cd.K
    public final synchronized void a(C14987j c14987j) {
        C14987j c14987j2 = this.f4252b;
        if (c14987j2 != c14987j) {
            c14987j2.a();
            this.f4252b = c14987j;
        }
    }

    @Override // Cd.K
    public final synchronized C14987j zza() {
        return this.f4252b;
    }

    @Override // Cd.K
    public final void zzc() {
        C14987j.a<?> aVarB;
        synchronized (this) {
            this.f4253c = false;
            aVarB = this.f4252b.b();
        }
        if (aVarB != null) {
            this.f4254d.doUnregisterEventListener(aVarB, 2441);
        }
    }

    C3055h(C3057i c3057i, C14987j c14987j, InterfaceC3053g interfaceC3053g) {
        this.f4254d = c3057i;
        this.f4252b = c14987j;
        this.f4251a = interfaceC3053g;
    }

    @Override // jd.InterfaceC14993p
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        C14987j.a aVarB;
        boolean z10;
        P p10 = (P) obj;
        C5517k c5517k = (C5517k) obj2;
        synchronized (this) {
            aVarB = this.f4252b.b();
            z10 = this.f4253c;
            this.f4252b.a();
        }
        if (aVarB == null) {
            c5517k.c(Boolean.FALSE);
        } else {
            this.f4251a.a(p10, aVarB, z10, c5517k);
        }
    }
}
