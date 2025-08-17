package m7;

import m7.InterfaceC15570e;

/* renamed from: m7.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15575j implements InterfaceC15570e, InterfaceC15569d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15570e f149948a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f149949b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC15569d f149950c;

    /* renamed from: d, reason: collision with root package name */
    private volatile InterfaceC15569d f149951d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC15570e.a f149952e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC15570e.a f149953f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f149954g;

    private boolean j() {
        InterfaceC15570e interfaceC15570e = this.f149948a;
        return interfaceC15570e == null || interfaceC15570e.d(this);
    }

    private boolean k() {
        InterfaceC15570e interfaceC15570e = this.f149948a;
        return interfaceC15570e == null || interfaceC15570e.b(this);
    }

    private boolean l() {
        InterfaceC15570e interfaceC15570e = this.f149948a;
        return interfaceC15570e == null || interfaceC15570e.h(this);
    }

    @Override // m7.InterfaceC15570e, m7.InterfaceC15569d
    public boolean a() {
        boolean z10;
        synchronized (this.f149949b) {
            try {
                z10 = this.f149951d.a() || this.f149950c.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15570e
    public boolean b(InterfaceC15569d interfaceC15569d) {
        boolean z10;
        synchronized (this.f149949b) {
            try {
                z10 = k() && interfaceC15569d.equals(this.f149950c) && !a();
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15570e
    public void c(InterfaceC15569d interfaceC15569d) {
        synchronized (this.f149949b) {
            try {
                if (interfaceC15569d.equals(this.f149951d)) {
                    this.f149953f = InterfaceC15570e.a.SUCCESS;
                    return;
                }
                this.f149952e = InterfaceC15570e.a.SUCCESS;
                InterfaceC15570e interfaceC15570e = this.f149948a;
                if (interfaceC15570e != null) {
                    interfaceC15570e.c(this);
                }
                if (!this.f149953f.b()) {
                    this.f149951d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.InterfaceC15569d
    public void clear() {
        synchronized (this.f149949b) {
            this.f149954g = false;
            InterfaceC15570e.a aVar = InterfaceC15570e.a.CLEARED;
            this.f149952e = aVar;
            this.f149953f = aVar;
            this.f149951d.clear();
            this.f149950c.clear();
        }
    }

    @Override // m7.InterfaceC15570e
    public boolean d(InterfaceC15569d interfaceC15569d) {
        boolean z10;
        synchronized (this.f149949b) {
            try {
                z10 = j() && interfaceC15569d.equals(this.f149950c) && this.f149952e != InterfaceC15570e.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15569d
    public boolean e(InterfaceC15569d interfaceC15569d) {
        if (interfaceC15569d instanceof C15575j) {
            C15575j c15575j = (C15575j) interfaceC15569d;
            if (this.f149950c != null ? this.f149950c.e(c15575j.f149950c) : c15575j.f149950c == null) {
                if (this.f149951d == null) {
                    if (c15575j.f149951d == null) {
                        return true;
                    }
                } else if (this.f149951d.e(c15575j.f149951d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m7.InterfaceC15569d
    public boolean f() {
        boolean z10;
        synchronized (this.f149949b) {
            z10 = this.f149952e == InterfaceC15570e.a.CLEARED;
        }
        return z10;
    }

    @Override // m7.InterfaceC15570e
    public void g(InterfaceC15569d interfaceC15569d) {
        synchronized (this.f149949b) {
            try {
                if (!interfaceC15569d.equals(this.f149950c)) {
                    this.f149953f = InterfaceC15570e.a.FAILED;
                    return;
                }
                this.f149952e = InterfaceC15570e.a.FAILED;
                InterfaceC15570e interfaceC15570e = this.f149948a;
                if (interfaceC15570e != null) {
                    interfaceC15570e.g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.InterfaceC15570e
    public InterfaceC15570e getRoot() {
        InterfaceC15570e root;
        synchronized (this.f149949b) {
            try {
                InterfaceC15570e interfaceC15570e = this.f149948a;
                root = interfaceC15570e != null ? interfaceC15570e.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // m7.InterfaceC15570e
    public boolean h(InterfaceC15569d interfaceC15569d) {
        boolean z10;
        synchronized (this.f149949b) {
            try {
                z10 = l() && (interfaceC15569d.equals(this.f149950c) || this.f149952e != InterfaceC15570e.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15569d
    public void i() {
        synchronized (this.f149949b) {
            try {
                this.f149954g = true;
                try {
                    if (this.f149952e != InterfaceC15570e.a.SUCCESS) {
                        InterfaceC15570e.a aVar = this.f149953f;
                        InterfaceC15570e.a aVar2 = InterfaceC15570e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f149953f = aVar2;
                            this.f149951d.i();
                        }
                    }
                    if (this.f149954g) {
                        InterfaceC15570e.a aVar3 = this.f149952e;
                        InterfaceC15570e.a aVar4 = InterfaceC15570e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f149952e = aVar4;
                            this.f149950c.i();
                        }
                    }
                    this.f149954g = false;
                } catch (Throwable th2) {
                    this.f149954g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // m7.InterfaceC15569d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f149949b) {
            z10 = this.f149952e == InterfaceC15570e.a.SUCCESS;
        }
        return z10;
    }

    @Override // m7.InterfaceC15569d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f149949b) {
            z10 = this.f149952e == InterfaceC15570e.a.RUNNING;
        }
        return z10;
    }

    public void m(InterfaceC15569d interfaceC15569d, InterfaceC15569d interfaceC15569d2) {
        this.f149950c = interfaceC15569d;
        this.f149951d = interfaceC15569d2;
    }

    @Override // m7.InterfaceC15569d
    public void pause() {
        synchronized (this.f149949b) {
            try {
                if (!this.f149953f.b()) {
                    this.f149953f = InterfaceC15570e.a.PAUSED;
                    this.f149951d.pause();
                }
                if (!this.f149952e.b()) {
                    this.f149952e = InterfaceC15570e.a.PAUSED;
                    this.f149950c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C15575j(Object obj, InterfaceC15570e interfaceC15570e) {
        InterfaceC15570e.a aVar = InterfaceC15570e.a.CLEARED;
        this.f149952e = aVar;
        this.f149953f = aVar;
        this.f149949b = obj;
        this.f149948a = interfaceC15570e;
    }
}
