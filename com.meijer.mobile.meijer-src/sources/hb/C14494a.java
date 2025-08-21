package hb;

import Db.k;
import eb.C13784a;
import eb.C13785b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kc.C15116a;
import kc.C15119d;
import nc.C15931c;

/* renamed from: hb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14494a implements k, kc.k {

    /* renamed from: i, reason: collision with root package name */
    private static final C13784a f135189i = C13785b.a(C14494a.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private C15119d f135192c;

    /* renamed from: d, reason: collision with root package name */
    private kc.e f135193d;

    /* renamed from: e, reason: collision with root package name */
    private bb.e f135194e;

    /* renamed from: f, reason: collision with root package name */
    public Db.e f135195f;

    /* renamed from: g, reason: collision with root package name */
    private Db.b f135196g;

    /* renamed from: b, reason: collision with root package name */
    private List<WeakReference<kc.k>> f135191b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f135190a = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f135197h = new AtomicInteger(0);

    public final synchronized void c() {
        e();
        f();
        g();
        this.f135195f.v();
        this.f135191b.isEmpty();
        this.f135190a.get();
        if (d()) {
            if (!this.f135191b.isEmpty() && !this.f135190a.get()) {
                this.f135192c.e(this);
                this.f135190a.set(true);
            }
        } else if (this.f135190a.get()) {
            this.f135192c.g(this);
            this.f135190a.set(false);
        }
    }

    private boolean f() {
        Gb.f fVarY = this.f135196g.y();
        if (fVarY != Gb.f.ON) {
            return fVarY == Gb.f.NOT_SET && e();
        }
        return true;
    }

    private boolean g() {
        Gb.f fVarY = this.f135196g.y();
        if (fVarY != Gb.f.ON) {
            return fVarY == Gb.f.NOT_SET && this.f135196g.r();
        }
        return true;
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("allowProximity".equals(str) || "overrideProximity".equals(str) || "Registration_Properties".equals(str)) {
            c();
        }
    }

    @Override // kc.k
    public final void b(C15116a c15116a, C15931c c15931c) {
        Integer numA = this.f135193d.a(c15116a.i(), c15931c.c());
        if (numA == null) {
            c15116a = null;
        } else {
            c15116a.C(numA.intValue());
        }
        if (c15116a != null) {
            for (WeakReference<kc.k> weakReference : this.f135191b) {
                if (weakReference.get() != null) {
                    weakReference.get().b(c15116a, c15931c);
                }
            }
        }
    }

    public final boolean e() {
        return this.f135197h.get() > 0;
    }

    public C14494a(C15119d c15119d, bb.e eVar, Db.e eVar2, Db.b bVar) {
        this.f135194e = eVar;
        this.f135195f = eVar2;
        this.f135192c = c15119d;
        this.f135196g = bVar;
        this.f135193d = new kc.f(this.f135194e, bVar);
        bVar.g(this, "allowProximity");
        bVar.g(this, "overrideProximity");
        eVar2.h(this, "Registration_Properties");
    }

    public final boolean d() {
        if (f() && this.f135195f.v() && g()) {
            return true;
        }
        return false;
    }
}
