package androidx.camera.core;

import F.S;
import androidx.camera.core.e;
import androidx.camera.core.k;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class k extends i {

    /* renamed from: t, reason: collision with root package name */
    final Executor f47760t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f47761u = new Object();

    /* renamed from: v, reason: collision with root package name */
    n f47762v;

    /* renamed from: w, reason: collision with root package name */
    private b f47763w;

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f47764a;

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        a(b bVar) {
            this.f47764a = bVar;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            this.f47764a.close();
        }
    }

    static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        final WeakReference<k> f47766d;

        public static /* synthetic */ void c(b bVar, n nVar) {
            final k kVar = bVar.f47766d.get();
            if (kVar != null) {
                kVar.f47760t.execute(new Runnable() { // from class: androidx.camera.core.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        kVar.x();
                    }
                });
            }
        }

        b(n nVar, k kVar) {
            super(nVar);
            this.f47766d = new WeakReference<>(kVar);
            a(new e.a() { // from class: androidx.camera.core.l
                @Override // androidx.camera.core.e.a
                public final void a(n nVar2) {
                    k.b.c(this.f47767a, nVar2);
                }
            });
        }
    }

    @Override // androidx.camera.core.i
    void g() {
        synchronized (this.f47761u) {
            try {
                n nVar = this.f47762v;
                if (nVar != null) {
                    nVar.close();
                    this.f47762v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.i
    void m(n nVar) {
        synchronized (this.f47761u) {
            try {
                if (!this.f47529s) {
                    nVar.close();
                    return;
                }
                if (this.f47763w == null) {
                    b bVar = new b(nVar, this);
                    this.f47763w = bVar;
                    I.n.j(e(bVar), new a(bVar), H.a.a());
                } else {
                    if (nVar.S2().getTimestamp() <= this.f47763w.S2().getTimestamp()) {
                        nVar.close();
                    } else {
                        n nVar2 = this.f47762v;
                        if (nVar2 != null) {
                            nVar2.close();
                        }
                        this.f47762v = nVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        synchronized (this.f47761u) {
            try {
                this.f47763w = null;
                n nVar = this.f47762v;
                if (nVar != null) {
                    this.f47762v = null;
                    m(nVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    k(Executor executor) {
        this.f47760t = executor;
    }

    @Override // androidx.camera.core.i
    n d(S s10) {
        return s10.b();
    }
}
