package m7;

import m7.InterfaceC15570e;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15567b implements InterfaceC15570e, InterfaceC15569d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f149897a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15570e f149898b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC15569d f149899c;

    /* renamed from: d, reason: collision with root package name */
    private volatile InterfaceC15569d f149900d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC15570e.a f149901e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC15570e.a f149902f;

    private boolean j(InterfaceC15569d interfaceC15569d) {
        InterfaceC15570e.a aVar = this.f149901e;
        InterfaceC15570e.a aVar2 = InterfaceC15570e.a.FAILED;
        if (aVar != aVar2) {
            return interfaceC15569d.equals(this.f149899c);
        }
        if (!interfaceC15569d.equals(this.f149900d)) {
            return false;
        }
        InterfaceC15570e.a aVar3 = this.f149902f;
        return aVar3 == InterfaceC15570e.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean k() {
        InterfaceC15570e interfaceC15570e = this.f149898b;
        return interfaceC15570e == null || interfaceC15570e.d(this);
    }

    private boolean l() {
        InterfaceC15570e interfaceC15570e = this.f149898b;
        return interfaceC15570e == null || interfaceC15570e.b(this);
    }

    private boolean m() {
        InterfaceC15570e interfaceC15570e = this.f149898b;
        return interfaceC15570e == null || interfaceC15570e.h(this);
    }

    @Override // m7.InterfaceC15570e, m7.InterfaceC15569d
    public boolean a() {
        boolean z10;
        synchronized (this.f149897a) {
            try {
                z10 = this.f149899c.a() || this.f149900d.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15570e
    public boolean b(InterfaceC15569d interfaceC15569d) {
        boolean z10;
        synchronized (this.f149897a) {
            try {
                z10 = l() && j(interfaceC15569d);
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15570e
    public void c(InterfaceC15569d interfaceC15569d) {
        synchronized (this.f149897a) {
            try {
                if (interfaceC15569d.equals(this.f149899c)) {
                    this.f149901e = InterfaceC15570e.a.SUCCESS;
                } else if (interfaceC15569d.equals(this.f149900d)) {
                    this.f149902f = InterfaceC15570e.a.SUCCESS;
                }
                InterfaceC15570e interfaceC15570e = this.f149898b;
                if (interfaceC15570e != null) {
                    interfaceC15570e.c(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.InterfaceC15569d
    public void clear() {
        synchronized (this.f149897a) {
            try {
                InterfaceC15570e.a aVar = InterfaceC15570e.a.CLEARED;
                this.f149901e = aVar;
                this.f149899c.clear();
                if (this.f149902f != aVar) {
                    this.f149902f = aVar;
                    this.f149900d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.InterfaceC15570e
    public boolean d(InterfaceC15569d interfaceC15569d) {
        boolean z10;
        synchronized (this.f149897a) {
            try {
                z10 = k() && interfaceC15569d.equals(this.f149899c);
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15569d
    public boolean e(InterfaceC15569d interfaceC15569d) {
        if (interfaceC15569d instanceof C15567b) {
            C15567b c15567b = (C15567b) interfaceC15569d;
            if (this.f149899c.e(c15567b.f149899c) && this.f149900d.e(c15567b.f149900d)) {
                return true;
            }
        }
        return false;
    }

    @Override // m7.InterfaceC15569d
    public boolean f() {
        boolean z10;
        synchronized (this.f149897a) {
            try {
                InterfaceC15570e.a aVar = this.f149901e;
                InterfaceC15570e.a aVar2 = InterfaceC15570e.a.CLEARED;
                z10 = aVar == aVar2 && this.f149902f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15570e
    public void g(InterfaceC15569d interfaceC15569d) {
        synchronized (this.f149897a) {
            try {
                if (interfaceC15569d.equals(this.f149900d)) {
                    this.f149902f = InterfaceC15570e.a.FAILED;
                    InterfaceC15570e interfaceC15570e = this.f149898b;
                    if (interfaceC15570e != null) {
                        interfaceC15570e.g(this);
                    }
                    return;
                }
                this.f149901e = InterfaceC15570e.a.FAILED;
                InterfaceC15570e.a aVar = this.f149902f;
                InterfaceC15570e.a aVar2 = InterfaceC15570e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f149902f = aVar2;
                    this.f149900d.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.InterfaceC15570e
    public InterfaceC15570e getRoot() {
        InterfaceC15570e root;
        synchronized (this.f149897a) {
            try {
                InterfaceC15570e interfaceC15570e = this.f149898b;
                root = interfaceC15570e != null ? interfaceC15570e.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // m7.InterfaceC15570e
    public boolean h(InterfaceC15569d interfaceC15569d) {
        boolean zM;
        synchronized (this.f149897a) {
            zM = m();
        }
        return zM;
    }

    @Override // m7.InterfaceC15569d
    public void i() {
        synchronized (this.f149897a) {
            try {
                InterfaceC15570e.a aVar = this.f149901e;
                InterfaceC15570e.a aVar2 = InterfaceC15570e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f149901e = aVar2;
                    this.f149899c.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.InterfaceC15569d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f149897a) {
            try {
                InterfaceC15570e.a aVar = this.f149901e;
                InterfaceC15570e.a aVar2 = InterfaceC15570e.a.SUCCESS;
                z10 = aVar == aVar2 || this.f149902f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15569d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f149897a) {
            try {
                InterfaceC15570e.a aVar = this.f149901e;
                InterfaceC15570e.a aVar2 = InterfaceC15570e.a.RUNNING;
                z10 = aVar == aVar2 || this.f149902f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    public void n(InterfaceC15569d interfaceC15569d, InterfaceC15569d interfaceC15569d2) {
        this.f149899c = interfaceC15569d;
        this.f149900d = interfaceC15569d2;
    }

    @Override // m7.InterfaceC15569d
    public void pause() {
        synchronized (this.f149897a) {
            try {
                InterfaceC15570e.a aVar = this.f149901e;
                InterfaceC15570e.a aVar2 = InterfaceC15570e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f149901e = InterfaceC15570e.a.PAUSED;
                    this.f149899c.pause();
                }
                if (this.f149902f == aVar2) {
                    this.f149902f = InterfaceC15570e.a.PAUSED;
                    this.f149900d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C15567b(Object obj, InterfaceC15570e interfaceC15570e) {
        InterfaceC15570e.a aVar = InterfaceC15570e.a.CLEARED;
        this.f149901e = aVar;
        this.f149902f = aVar;
        this.f149897a = obj;
        this.f149898b = interfaceC15570e;
    }
}
