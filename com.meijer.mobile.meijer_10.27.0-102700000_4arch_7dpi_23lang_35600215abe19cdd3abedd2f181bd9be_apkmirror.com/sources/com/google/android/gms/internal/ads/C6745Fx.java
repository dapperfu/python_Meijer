package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6745Fx implements InterfaceC9827wb, InterfaceC9688vC, Oc.p, InterfaceC9581uC {

    /* renamed from: a, reason: collision with root package name */
    private final C6575Ax f67025a;

    /* renamed from: b, reason: collision with root package name */
    private final C6609Bx f67026b;

    /* renamed from: d, reason: collision with root package name */
    private final C9099pl f67028d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f67029e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f67030f;

    /* renamed from: c, reason: collision with root package name */
    private final Set f67027c = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f67031g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final C6711Ex f67032h = new C6711Ex();

    /* renamed from: i, reason: collision with root package name */
    private boolean f67033i = false;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f67034j = new WeakReference(this);

    @Override // Oc.p
    public final void A1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final synchronized void D0(C9720vb c9720vb) {
        C6711Ex c6711Ex = this.f67032h;
        c6711Ex.f66680a = c9720vb.f79090j;
        c6711Ex.f66685f = c9720vb;
        a();
    }

    @Override // Oc.p
    public final void F2() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final synchronized void J(Context context) {
        this.f67032h.f66681b = false;
        a();
    }

    @Override // Oc.p
    public final void N3(int i10) {
    }

    @Override // Oc.p
    public final synchronized void W5() {
        this.f67032h.f66681b = true;
        a();
    }

    public final synchronized void a() {
        try {
            if (this.f67034j.get() == null) {
                s();
                return;
            }
            if (this.f67033i || !this.f67031g.get()) {
                return;
            }
            try {
                this.f67032h.f66683d = this.f67030f.c();
                final JSONObject jSONObjectA = this.f67026b.zzb(this.f67032h);
                for (final InterfaceC9008ot interfaceC9008ot : this.f67027c) {
                    this.f67029e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Dx
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC9008ot.R0("AFMA_updateActiveView", jSONObjectA);
                        }
                    });
                }
                C7009Nq.b(this.f67028d.zzb(jSONObjectA), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e10) {
                Pc.p0.l("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Oc.p
    public final void b2() {
    }

    @Override // Oc.p
    public final synchronized void d7() {
        this.f67032h.f66681b = false;
        a();
    }

    public final synchronized void i(InterfaceC9008ot interfaceC9008ot) {
        this.f67027c.add(interfaceC9008ot);
        this.f67025a.d(interfaceC9008ot);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final synchronized void j(Context context) {
        this.f67032h.f66684e = "u";
        a();
        v();
        this.f67033i = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final synchronized void q(Context context) {
        this.f67032h.f66681b = true;
        a();
    }

    public final synchronized void s() {
        v();
        this.f67033i = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final synchronized void zzr() {
        if (this.f67031g.compareAndSet(false, true)) {
            this.f67025a.c(this);
            a();
        }
    }

    private final void v() {
        Iterator it = this.f67027c.iterator();
        while (it.hasNext()) {
            this.f67025a.f((InterfaceC9008ot) it.next());
        }
        this.f67025a.e();
    }

    public final void p(Object obj) {
        this.f67034j = new WeakReference(obj);
    }

    public C6745Fx(C8778ml c8778ml, C6609Bx c6609Bx, Executor executor, C6575Ax c6575Ax, com.google.android.gms.common.util.f fVar) {
        this.f67025a = c6575Ax;
        InterfaceC7339Xk interfaceC7339Xk = C7498al.f72486b;
        this.f67028d = c8778ml.a("google.afma.activeView.handleUpdate", interfaceC7339Xk, interfaceC7339Xk);
        this.f67026b = c6609Bx;
        this.f67029e = executor;
        this.f67030f = fVar;
    }
}
