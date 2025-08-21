package o7;

import o7.InterfaceC16080e;

/* renamed from: o7.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16085j implements InterfaceC16080e, InterfaceC16079d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC16080e f153735a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f153736b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC16079d f153737c;

    /* renamed from: d, reason: collision with root package name */
    private volatile InterfaceC16079d f153738d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC16080e.a f153739e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC16080e.a f153740f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f153741g;

    private boolean j() {
        InterfaceC16080e interfaceC16080e = this.f153735a;
        return interfaceC16080e == null || interfaceC16080e.c(this);
    }

    private boolean k() {
        InterfaceC16080e interfaceC16080e = this.f153735a;
        return interfaceC16080e == null || interfaceC16080e.b(this);
    }

    private boolean l() {
        InterfaceC16080e interfaceC16080e = this.f153735a;
        return interfaceC16080e == null || interfaceC16080e.d(this);
    }

    @Override // o7.InterfaceC16080e, o7.InterfaceC16079d
    public boolean a() {
        boolean z10;
        synchronized (this.f153736b) {
            try {
                z10 = this.f153738d.a() || this.f153737c.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16080e
    public boolean b(InterfaceC16079d interfaceC16079d) {
        boolean z10;
        synchronized (this.f153736b) {
            try {
                z10 = k() && interfaceC16079d.equals(this.f153737c) && !a();
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16080e
    public boolean c(InterfaceC16079d interfaceC16079d) {
        boolean z10;
        synchronized (this.f153736b) {
            try {
                z10 = j() && interfaceC16079d.equals(this.f153737c) && this.f153739e != InterfaceC16080e.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16079d
    public void clear() {
        synchronized (this.f153736b) {
            this.f153741g = false;
            InterfaceC16080e.a aVar = InterfaceC16080e.a.CLEARED;
            this.f153739e = aVar;
            this.f153740f = aVar;
            this.f153738d.clear();
            this.f153737c.clear();
        }
    }

    @Override // o7.InterfaceC16080e
    public boolean d(InterfaceC16079d interfaceC16079d) {
        boolean z10;
        synchronized (this.f153736b) {
            try {
                z10 = l() && (interfaceC16079d.equals(this.f153737c) || this.f153739e != InterfaceC16080e.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16079d
    public boolean e() {
        boolean z10;
        synchronized (this.f153736b) {
            z10 = this.f153739e == InterfaceC16080e.a.CLEARED;
        }
        return z10;
    }

    @Override // o7.InterfaceC16080e
    public void f(InterfaceC16079d interfaceC16079d) {
        synchronized (this.f153736b) {
            try {
                if (!interfaceC16079d.equals(this.f153737c)) {
                    this.f153740f = InterfaceC16080e.a.FAILED;
                    return;
                }
                this.f153739e = InterfaceC16080e.a.FAILED;
                InterfaceC16080e interfaceC16080e = this.f153735a;
                if (interfaceC16080e != null) {
                    interfaceC16080e.f(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o7.InterfaceC16080e
    public void g(InterfaceC16079d interfaceC16079d) {
        synchronized (this.f153736b) {
            try {
                if (interfaceC16079d.equals(this.f153738d)) {
                    this.f153740f = InterfaceC16080e.a.SUCCESS;
                    return;
                }
                this.f153739e = InterfaceC16080e.a.SUCCESS;
                InterfaceC16080e interfaceC16080e = this.f153735a;
                if (interfaceC16080e != null) {
                    interfaceC16080e.g(this);
                }
                if (!this.f153740f.b()) {
                    this.f153738d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o7.InterfaceC16080e
    public InterfaceC16080e getRoot() {
        InterfaceC16080e root;
        synchronized (this.f153736b) {
            try {
                InterfaceC16080e interfaceC16080e = this.f153735a;
                root = interfaceC16080e != null ? interfaceC16080e.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // o7.InterfaceC16079d
    public boolean h(InterfaceC16079d interfaceC16079d) {
        if (interfaceC16079d instanceof C16085j) {
            C16085j c16085j = (C16085j) interfaceC16079d;
            if (this.f153737c != null ? this.f153737c.h(c16085j.f153737c) : c16085j.f153737c == null) {
                if (this.f153738d == null) {
                    if (c16085j.f153738d == null) {
                        return true;
                    }
                } else if (this.f153738d.h(c16085j.f153738d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o7.InterfaceC16079d
    public void i() {
        synchronized (this.f153736b) {
            try {
                this.f153741g = true;
                try {
                    if (this.f153739e != InterfaceC16080e.a.SUCCESS) {
                        InterfaceC16080e.a aVar = this.f153740f;
                        InterfaceC16080e.a aVar2 = InterfaceC16080e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f153740f = aVar2;
                            this.f153738d.i();
                        }
                    }
                    if (this.f153741g) {
                        InterfaceC16080e.a aVar3 = this.f153739e;
                        InterfaceC16080e.a aVar4 = InterfaceC16080e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f153739e = aVar4;
                            this.f153737c.i();
                        }
                    }
                    this.f153741g = false;
                } catch (Throwable th2) {
                    this.f153741g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // o7.InterfaceC16079d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f153736b) {
            z10 = this.f153739e == InterfaceC16080e.a.SUCCESS;
        }
        return z10;
    }

    @Override // o7.InterfaceC16079d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f153736b) {
            z10 = this.f153739e == InterfaceC16080e.a.RUNNING;
        }
        return z10;
    }

    public void m(InterfaceC16079d interfaceC16079d, InterfaceC16079d interfaceC16079d2) {
        this.f153737c = interfaceC16079d;
        this.f153738d = interfaceC16079d2;
    }

    @Override // o7.InterfaceC16079d
    public void pause() {
        synchronized (this.f153736b) {
            try {
                if (!this.f153740f.b()) {
                    this.f153740f = InterfaceC16080e.a.PAUSED;
                    this.f153738d.pause();
                }
                if (!this.f153739e.b()) {
                    this.f153739e = InterfaceC16080e.a.PAUSED;
                    this.f153737c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C16085j(Object obj, InterfaceC16080e interfaceC16080e) {
        InterfaceC16080e.a aVar = InterfaceC16080e.a.CLEARED;
        this.f153739e = aVar;
        this.f153740f = aVar;
        this.f153736b = obj;
        this.f153735a = interfaceC16080e;
    }
}
