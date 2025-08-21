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
public final class C6870Fx implements InterfaceC9952wb, InterfaceC9813vC, Qc.p, InterfaceC9706uC {

    /* renamed from: a, reason: collision with root package name */
    private final C6700Ax f67865a;

    /* renamed from: b, reason: collision with root package name */
    private final C6734Bx f67866b;

    /* renamed from: d, reason: collision with root package name */
    private final C9224pl f67868d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f67869e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f67870f;

    /* renamed from: c, reason: collision with root package name */
    private final Set f67867c = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f67871g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final C6836Ex f67872h = new C6836Ex();

    /* renamed from: i, reason: collision with root package name */
    private boolean f67873i = false;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f67874j = new WeakReference(this);

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final synchronized void C0(C9845vb c9845vb) {
        C6836Ex c6836Ex = this.f67872h;
        c6836Ex.f67520a = c9845vb.f79930j;
        c6836Ex.f67525f = c9845vb;
        a();
    }

    @Override // Qc.p
    public final void I2() {
    }

    @Override // Qc.p
    public final void K1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final synchronized void L(Context context) {
        this.f67872h.f67521b = false;
        a();
    }

    @Override // Qc.p
    public final void Z3(int i10) {
    }

    public final synchronized void a() {
        try {
            if (this.f67874j.get() == null) {
                s();
                return;
            }
            if (this.f67873i || !this.f67871g.get()) {
                return;
            }
            try {
                this.f67872h.f67523d = this.f67870f.c();
                final JSONObject jSONObjectA = this.f67866b.zzb(this.f67872h);
                for (final InterfaceC9133ot interfaceC9133ot : this.f67867c) {
                    this.f67869e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Dx
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC9133ot.R0("AFMA_updateActiveView", jSONObjectA);
                        }
                    });
                }
                C7134Nq.b(this.f67868d.zzb(jSONObjectA), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e10) {
                Rc.p0.l("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Qc.p
    public final void c2() {
    }

    public final synchronized void i(InterfaceC9133ot interfaceC9133ot) {
        this.f67867c.add(interfaceC9133ot);
        this.f67865a.d(interfaceC9133ot);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final synchronized void j(Context context) {
        this.f67872h.f67524e = "u";
        a();
        v();
        this.f67873i = true;
    }

    @Override // Qc.p
    public final synchronized void m6() {
        this.f67872h.f67521b = true;
        a();
    }

    @Override // Qc.p
    public final synchronized void o7() {
        this.f67872h.f67521b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final synchronized void q(Context context) {
        this.f67872h.f67521b = true;
        a();
    }

    public final synchronized void s() {
        v();
        this.f67873i = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final synchronized void zzr() {
        if (this.f67871g.compareAndSet(false, true)) {
            this.f67865a.c(this);
            a();
        }
    }

    private final void v() {
        Iterator it = this.f67867c.iterator();
        while (it.hasNext()) {
            this.f67865a.f((InterfaceC9133ot) it.next());
        }
        this.f67865a.e();
    }

    public final void p(Object obj) {
        this.f67874j = new WeakReference(obj);
    }

    public C6870Fx(C8903ml c8903ml, C6734Bx c6734Bx, Executor executor, C6700Ax c6700Ax, com.google.android.gms.common.util.f fVar) {
        this.f67865a = c6700Ax;
        InterfaceC7464Xk interfaceC7464Xk = C7623al.f73326b;
        this.f67868d = c8903ml.a("google.afma.activeView.handleUpdate", interfaceC7464Xk, interfaceC7464Xk);
        this.f67866b = c6734Bx;
        this.f67869e = executor;
        this.f67870f = fVar;
    }
}
