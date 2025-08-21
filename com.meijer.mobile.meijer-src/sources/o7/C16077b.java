package o7;

import o7.InterfaceC16080e;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16077b implements InterfaceC16080e, InterfaceC16079d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f153684a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16080e f153685b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC16079d f153686c;

    /* renamed from: d, reason: collision with root package name */
    private volatile InterfaceC16079d f153687d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC16080e.a f153688e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC16080e.a f153689f;

    private boolean j(InterfaceC16079d interfaceC16079d) {
        InterfaceC16080e.a aVar = this.f153688e;
        InterfaceC16080e.a aVar2 = InterfaceC16080e.a.FAILED;
        if (aVar != aVar2) {
            return interfaceC16079d.equals(this.f153686c);
        }
        if (!interfaceC16079d.equals(this.f153687d)) {
            return false;
        }
        InterfaceC16080e.a aVar3 = this.f153689f;
        return aVar3 == InterfaceC16080e.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean k() {
        InterfaceC16080e interfaceC16080e = this.f153685b;
        return interfaceC16080e == null || interfaceC16080e.c(this);
    }

    private boolean l() {
        InterfaceC16080e interfaceC16080e = this.f153685b;
        return interfaceC16080e == null || interfaceC16080e.b(this);
    }

    private boolean m() {
        InterfaceC16080e interfaceC16080e = this.f153685b;
        return interfaceC16080e == null || interfaceC16080e.d(this);
    }

    @Override // o7.InterfaceC16080e, o7.InterfaceC16079d
    public boolean a() {
        boolean z10;
        synchronized (this.f153684a) {
            try {
                z10 = this.f153686c.a() || this.f153687d.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16080e
    public boolean b(InterfaceC16079d interfaceC16079d) {
        boolean z10;
        synchronized (this.f153684a) {
            try {
                z10 = l() && j(interfaceC16079d);
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16080e
    public boolean c(InterfaceC16079d interfaceC16079d) {
        boolean z10;
        synchronized (this.f153684a) {
            try {
                z10 = k() && interfaceC16079d.equals(this.f153686c);
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16079d
    public void clear() {
        synchronized (this.f153684a) {
            try {
                InterfaceC16080e.a aVar = InterfaceC16080e.a.CLEARED;
                this.f153688e = aVar;
                this.f153686c.clear();
                if (this.f153689f != aVar) {
                    this.f153689f = aVar;
                    this.f153687d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o7.InterfaceC16080e
    public boolean d(InterfaceC16079d interfaceC16079d) {
        boolean zM;
        synchronized (this.f153684a) {
            zM = m();
        }
        return zM;
    }

    @Override // o7.InterfaceC16079d
    public boolean e() {
        boolean z10;
        synchronized (this.f153684a) {
            try {
                InterfaceC16080e.a aVar = this.f153688e;
                InterfaceC16080e.a aVar2 = InterfaceC16080e.a.CLEARED;
                z10 = aVar == aVar2 && this.f153689f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16080e
    public void f(InterfaceC16079d interfaceC16079d) {
        synchronized (this.f153684a) {
            try {
                if (interfaceC16079d.equals(this.f153687d)) {
                    this.f153689f = InterfaceC16080e.a.FAILED;
                    InterfaceC16080e interfaceC16080e = this.f153685b;
                    if (interfaceC16080e != null) {
                        interfaceC16080e.f(this);
                    }
                    return;
                }
                this.f153688e = InterfaceC16080e.a.FAILED;
                InterfaceC16080e.a aVar = this.f153689f;
                InterfaceC16080e.a aVar2 = InterfaceC16080e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f153689f = aVar2;
                    this.f153687d.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o7.InterfaceC16080e
    public void g(InterfaceC16079d interfaceC16079d) {
        synchronized (this.f153684a) {
            try {
                if (interfaceC16079d.equals(this.f153686c)) {
                    this.f153688e = InterfaceC16080e.a.SUCCESS;
                } else if (interfaceC16079d.equals(this.f153687d)) {
                    this.f153689f = InterfaceC16080e.a.SUCCESS;
                }
                InterfaceC16080e interfaceC16080e = this.f153685b;
                if (interfaceC16080e != null) {
                    interfaceC16080e.g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o7.InterfaceC16080e
    public InterfaceC16080e getRoot() {
        InterfaceC16080e root;
        synchronized (this.f153684a) {
            try {
                InterfaceC16080e interfaceC16080e = this.f153685b;
                root = interfaceC16080e != null ? interfaceC16080e.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // o7.InterfaceC16079d
    public boolean h(InterfaceC16079d interfaceC16079d) {
        if (interfaceC16079d instanceof C16077b) {
            C16077b c16077b = (C16077b) interfaceC16079d;
            if (this.f153686c.h(c16077b.f153686c) && this.f153687d.h(c16077b.f153687d)) {
                return true;
            }
        }
        return false;
    }

    @Override // o7.InterfaceC16079d
    public void i() {
        synchronized (this.f153684a) {
            try {
                InterfaceC16080e.a aVar = this.f153688e;
                InterfaceC16080e.a aVar2 = InterfaceC16080e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f153688e = aVar2;
                    this.f153686c.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o7.InterfaceC16079d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f153684a) {
            try {
                InterfaceC16080e.a aVar = this.f153688e;
                InterfaceC16080e.a aVar2 = InterfaceC16080e.a.SUCCESS;
                z10 = aVar == aVar2 || this.f153689f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16079d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f153684a) {
            try {
                InterfaceC16080e.a aVar = this.f153688e;
                InterfaceC16080e.a aVar2 = InterfaceC16080e.a.RUNNING;
                z10 = aVar == aVar2 || this.f153689f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    public void n(InterfaceC16079d interfaceC16079d, InterfaceC16079d interfaceC16079d2) {
        this.f153686c = interfaceC16079d;
        this.f153687d = interfaceC16079d2;
    }

    @Override // o7.InterfaceC16079d
    public void pause() {
        synchronized (this.f153684a) {
            try {
                InterfaceC16080e.a aVar = this.f153688e;
                InterfaceC16080e.a aVar2 = InterfaceC16080e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f153688e = InterfaceC16080e.a.PAUSED;
                    this.f153686c.pause();
                }
                if (this.f153689f == aVar2) {
                    this.f153689f = InterfaceC16080e.a.PAUSED;
                    this.f153687d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C16077b(Object obj, InterfaceC16080e interfaceC16080e) {
        InterfaceC16080e.a aVar = InterfaceC16080e.a.CLEARED;
        this.f153688e = aVar;
        this.f153689f = aVar;
        this.f153684a = obj;
        this.f153685b = interfaceC16080e;
    }
}
