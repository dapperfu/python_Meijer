package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
class d {

    /* renamed from: e, reason: collision with root package name */
    private static d f87570e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f87571a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f87572b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    private c f87573c;

    /* renamed from: d, reason: collision with root package name */
    private c f87574d;

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
        final WeakReference<b> f87576a;

        /* renamed from: b, reason: collision with root package name */
        int f87577b;

        /* renamed from: c, reason: collision with root package name */
        boolean f87578c;

        boolean a(b bVar) {
            return bVar != null && this.f87576a.get() == bVar;
        }

        c(int i10, b bVar) {
            this.f87576a = new WeakReference<>(bVar);
            this.f87577b = i10;
        }
    }

    private boolean a(c cVar, int i10) {
        b bVar = cVar.f87576a.get();
        if (bVar == null) {
            return false;
        }
        this.f87572b.removeCallbacksAndMessages(cVar);
        bVar.b(i10);
        return true;
    }

    static d c() {
        if (f87570e == null) {
            f87570e = new d();
        }
        return f87570e;
    }

    private boolean f(b bVar) {
        c cVar = this.f87573c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(b bVar) {
        c cVar = this.f87574d;
        return cVar != null && cVar.a(bVar);
    }

    private void l(c cVar) {
        int i10 = cVar.f87577b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f87572b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f87572b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    private void n() {
        c cVar = this.f87574d;
        if (cVar != null) {
            this.f87573c = cVar;
            this.f87574d = null;
            b bVar = cVar.f87576a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f87573c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f87571a) {
            try {
                if (f(bVar)) {
                    a(this.f87573c, i10);
                } else if (g(bVar)) {
                    a(this.f87574d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f87571a) {
            try {
                if (this.f87573c == cVar || this.f87574d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f87571a) {
            try {
                z10 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z10;
    }

    public void h(b bVar) {
        synchronized (this.f87571a) {
            try {
                if (f(bVar)) {
                    this.f87573c = null;
                    if (this.f87574d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f87571a) {
            try {
                if (f(bVar)) {
                    l(this.f87573c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f87571a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f87573c;
                    if (!cVar.f87578c) {
                        cVar.f87578c = true;
                        this.f87572b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f87571a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f87573c;
                    if (cVar.f87578c) {
                        cVar.f87578c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i10, b bVar) {
        synchronized (this.f87571a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f87573c;
                    cVar.f87577b = i10;
                    this.f87572b.removeCallbacksAndMessages(cVar);
                    l(this.f87573c);
                    return;
                }
                if (g(bVar)) {
                    this.f87574d.f87577b = i10;
                } else {
                    this.f87574d = new c(i10, bVar);
                }
                c cVar2 = this.f87573c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f87573c = null;
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
