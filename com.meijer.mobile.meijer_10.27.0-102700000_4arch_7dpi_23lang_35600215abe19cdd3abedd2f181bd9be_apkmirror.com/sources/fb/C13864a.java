package fb;

import Bb.k;
import cb.C6380a;
import cb.C6381b;
import ic.C14713a;
import ic.C14716d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lc.C15397c;

/* renamed from: fb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13864a implements k, ic.k {

    /* renamed from: i, reason: collision with root package name */
    private static final C6380a f130843i = C6381b.a(C13864a.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private C14716d f130846c;

    /* renamed from: d, reason: collision with root package name */
    private ic.e f130847d;

    /* renamed from: e, reason: collision with root package name */
    private Za.e f130848e;

    /* renamed from: f, reason: collision with root package name */
    public Bb.e f130849f;

    /* renamed from: g, reason: collision with root package name */
    private Bb.b f130850g;

    /* renamed from: b, reason: collision with root package name */
    private List<WeakReference<ic.k>> f130845b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f130844a = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f130851h = new AtomicInteger(0);

    public final synchronized void c() {
        e();
        f();
        g();
        this.f130849f.v();
        this.f130845b.isEmpty();
        this.f130844a.get();
        if (d()) {
            if (!this.f130845b.isEmpty() && !this.f130844a.get()) {
                this.f130846c.e(this);
                this.f130844a.set(true);
            }
        } else if (this.f130844a.get()) {
            this.f130846c.g(this);
            this.f130844a.set(false);
        }
    }

    private boolean f() {
        Eb.f fVarY = this.f130850g.y();
        if (fVarY != Eb.f.ON) {
            return fVarY == Eb.f.NOT_SET && e();
        }
        return true;
    }

    private boolean g() {
        Eb.f fVarY = this.f130850g.y();
        if (fVarY != Eb.f.ON) {
            return fVarY == Eb.f.NOT_SET && this.f130850g.r();
        }
        return true;
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("allowProximity".equals(str) || "overrideProximity".equals(str) || "Registration_Properties".equals(str)) {
            c();
        }
    }

    @Override // ic.k
    public final void b(C14713a c14713a, C15397c c15397c) {
        Integer numA = this.f130847d.a(c14713a.i(), c15397c.c());
        if (numA == null) {
            c14713a = null;
        } else {
            c14713a.C(numA.intValue());
        }
        if (c14713a != null) {
            for (WeakReference<ic.k> weakReference : this.f130845b) {
                if (weakReference.get() != null) {
                    weakReference.get().b(c14713a, c15397c);
                }
            }
        }
    }

    public final boolean e() {
        return this.f130851h.get() > 0;
    }

    public C13864a(C14716d c14716d, Za.e eVar, Bb.e eVar2, Bb.b bVar) {
        this.f130848e = eVar;
        this.f130849f = eVar2;
        this.f130846c = c14716d;
        this.f130850g = bVar;
        this.f130847d = new ic.f(this.f130848e, bVar);
        bVar.g(this, "allowProximity");
        bVar.g(this, "overrideProximity");
        eVar2.h(this, "Registration_Properties");
    }

    public final boolean d() {
        if (f() && this.f130849f.v() && g()) {
            return true;
        }
        return false;
    }
}
