package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
class d {

    /* renamed from: e, reason: collision with root package name */
    private static d f88410e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f88411a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f88412b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    private c f88413c;

    /* renamed from: d, reason: collision with root package name */
    private c f88414d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            d.this.d((c) message.obj);
            return true;
        }
    }

    interface b {
        void a();

        void b(int i10);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference<b> f88416a;

        /* renamed from: b, reason: collision with root package name */
        int f88417b;

        /* renamed from: c, reason: collision with root package name */
        boolean f88418c;

        boolean a(b bVar) {
            return bVar != null && this.f88416a.get() == bVar;
        }

        c(int i10, b bVar) {
            this.f88416a = new WeakReference<>(bVar);
            this.f88417b = i10;
        }
    }

    private boolean a(c cVar, int i10) {
        b bVar = cVar.f88416a.get();
        if (bVar == null) {
            return false;
        }
        this.f88412b.removeCallbacksAndMessages(cVar);
        bVar.b(i10);
        return true;
    }

    static d c() {
        if (f88410e == null) {
            f88410e = new d();
        }
        return f88410e;
    }

    private boolean f(b bVar) {
        c cVar = this.f88413c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(b bVar) {
        c cVar = this.f88414d;
        return cVar != null && cVar.a(bVar);
    }

    private void l(c cVar) {
        int i10 = cVar.f88417b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f88412b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f88412b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    private void n() {
        c cVar = this.f88414d;
        if (cVar != null) {
            this.f88413c = cVar;
            this.f88414d = null;
            b bVar = cVar.f88416a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f88413c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f88411a) {
            try {
                if (f(bVar)) {
                    a(this.f88413c, i10);
                } else if (g(bVar)) {
                    a(this.f88414d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f88411a) {
            try {
                if (this.f88413c == cVar || this.f88414d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f88411a) {
            try {
                z10 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z10;
    }

    public void h(b bVar) {
        synchronized (this.f88411a) {
            try {
                if (f(bVar)) {
                    this.f88413c = null;
                    if (this.f88414d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f88411a) {
            try {
                if (f(bVar)) {
                    l(this.f88413c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f88411a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f88413c;
                    if (!cVar.f88418c) {
                        cVar.f88418c = true;
                        this.f88412b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f88411a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f88413c;
                    if (cVar.f88418c) {
                        cVar.f88418c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i10, b bVar) {
        synchronized (this.f88411a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f88413c;
                    cVar.f88417b = i10;
                    this.f88412b.removeCallbacksAndMessages(cVar);
                    l(this.f88413c);
                    return;
                }
                if (g(bVar)) {
                    this.f88414d.f88417b = i10;
                } else {
                    this.f88414d = new c(i10, bVar);
                }
                c cVar2 = this.f88413c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f88413c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private d() {
    }
}
