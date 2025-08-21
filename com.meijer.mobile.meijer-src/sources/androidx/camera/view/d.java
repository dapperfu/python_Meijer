package androidx.camera.view;

import C.InterfaceC3029n;
import C.P;
import F.AbstractC3273h;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import F.c0;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.c;
import androidx.view.C6130D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.InterfaceC16578a;

/* loaded from: classes.dex */
final class d implements c0.a<InterfaceC3290z.a> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3289y f47840a;

    /* renamed from: b, reason: collision with root package name */
    private final C6130D<PreviewView.e> f47841b;

    /* renamed from: c, reason: collision with root package name */
    private PreviewView.e f47842c;

    /* renamed from: d, reason: collision with root package name */
    private final i f47843d;

    /* renamed from: e, reason: collision with root package name */
    com.google.common.util.concurrent.q<Void> f47844e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47845f = false;

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f47846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3029n f47847b;

        a(List list, InterfaceC3029n interfaceC3029n) {
            this.f47846a = list;
            this.f47847b = interfaceC3029n;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            d.this.f47844e = null;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            d.this.f47844e = null;
            if (this.f47846a.isEmpty()) {
                return;
            }
            Iterator it = this.f47846a.iterator();
            while (it.hasNext()) {
                ((InterfaceC3289y) this.f47847b).f((AbstractC3273h) it.next());
            }
            this.f47846a.clear();
        }
    }

    class b extends AbstractC3273h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f47849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3029n f47850b;

        b(c.a aVar, InterfaceC3029n interfaceC3029n) {
            this.f47849a = aVar;
            this.f47850b = interfaceC3029n;
        }

        @Override // F.AbstractC3273h
        public void b(int i10, F.r rVar) {
            this.f47849a.c(null);
            ((InterfaceC3289y) this.f47850b).f(this);
        }
    }

    void i(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (this.f47842c.equals(eVar)) {
                    return;
                }
                this.f47842c = eVar;
                P.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f47841b.m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void e() {
        com.google.common.util.concurrent.q<Void> qVar = this.f47844e;
        if (qVar != null) {
            qVar.cancel(false);
            this.f47844e = null;
        }
    }

    private void h(InterfaceC3029n interfaceC3029n) {
        i(PreviewView.e.IDLE);
        ArrayList arrayList = new ArrayList();
        I.d dVarD = I.d.a(j(interfaceC3029n, arrayList)).e(new I.a() { // from class: androidx.camera.view.a
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return this.f47835a.f47843d.i();
            }
        }, H.a.a()).d(new InterfaceC16578a() { // from class: androidx.camera.view.b
            @Override // q.InterfaceC16578a
            public final Object apply(Object obj) {
                return d.d(this.f47836a, (Void) obj);
            }
        }, H.a.a());
        this.f47844e = dVarD;
        I.n.j(dVarD, new a(arrayList, interfaceC3029n), H.a.a());
    }

    private com.google.common.util.concurrent.q<Void> j(final InterfaceC3029n interfaceC3029n, final List<AbstractC3273h> list) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: androidx.camera.view.c
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return d.b(this.f47837a, interfaceC3029n, list, aVar);
            }
        });
    }

    @Override // F.c0.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(InterfaceC3290z.a aVar) {
        if (aVar == InterfaceC3290z.a.CLOSING || aVar == InterfaceC3290z.a.CLOSED || aVar == InterfaceC3290z.a.RELEASING || aVar == InterfaceC3290z.a.RELEASED) {
            i(PreviewView.e.IDLE);
            if (this.f47845f) {
                this.f47845f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == InterfaceC3290z.a.OPENING || aVar == InterfaceC3290z.a.OPEN || aVar == InterfaceC3290z.a.PENDING_OPEN) && !this.f47845f) {
            h(this.f47840a);
            this.f47845f = true;
        }
    }

    d(InterfaceC3289y interfaceC3289y, C6130D<PreviewView.e> c6130d, i iVar) {
        this.f47840a = interfaceC3289y;
        this.f47841b = c6130d;
        this.f47843d = iVar;
        synchronized (this) {
            this.f47842c = c6130d.e();
        }
    }

    public static /* synthetic */ Object b(d dVar, InterfaceC3029n interfaceC3029n, List list, c.a aVar) {
        dVar.getClass();
        b bVar = dVar.new b(aVar, interfaceC3029n);
        list.add(bVar);
        ((InterfaceC3289y) interfaceC3029n).i(H.a.a(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(d dVar, Void r12) {
        dVar.getClass();
        dVar.i(PreviewView.e.STREAMING);
        return null;
    }

    void f() {
        e();
    }

    @Override // F.c0.a
    public void onError(Throwable th2) {
        f();
        i(PreviewView.e.IDLE);
    }
}
