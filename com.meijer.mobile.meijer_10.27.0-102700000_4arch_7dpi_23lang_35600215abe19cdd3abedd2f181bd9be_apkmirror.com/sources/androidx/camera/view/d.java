package androidx.camera.view;

import C.InterfaceC2971n;
import C.P;
import F.AbstractC3611h;
import F.InterfaceC3627y;
import F.InterfaceC3628z;
import F.c0;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.c;
import androidx.view.C5988D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.InterfaceC16423a;

/* loaded from: classes.dex */
final class d implements c0.a<InterfaceC3628z.a> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3627y f47616a;

    /* renamed from: b, reason: collision with root package name */
    private final C5988D<PreviewView.e> f47617b;

    /* renamed from: c, reason: collision with root package name */
    private PreviewView.e f47618c;

    /* renamed from: d, reason: collision with root package name */
    private final i f47619d;

    /* renamed from: e, reason: collision with root package name */
    com.google.common.util.concurrent.q<Void> f47620e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47621f = false;

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f47622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2971n f47623b;

        a(List list, InterfaceC2971n interfaceC2971n) {
            this.f47622a = list;
            this.f47623b = interfaceC2971n;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            d.this.f47620e = null;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            d.this.f47620e = null;
            if (this.f47622a.isEmpty()) {
                return;
            }
            Iterator it = this.f47622a.iterator();
            while (it.hasNext()) {
                ((InterfaceC3627y) this.f47623b).f((AbstractC3611h) it.next());
            }
            this.f47622a.clear();
        }
    }

    class b extends AbstractC3611h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f47625a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2971n f47626b;

        b(c.a aVar, InterfaceC2971n interfaceC2971n) {
            this.f47625a = aVar;
            this.f47626b = interfaceC2971n;
        }

        @Override // F.AbstractC3611h
        public void b(int i10, F.r rVar) {
            this.f47625a.c(null);
            ((InterfaceC3627y) this.f47626b).f(this);
        }
    }

    void i(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (this.f47618c.equals(eVar)) {
                    return;
                }
                this.f47618c = eVar;
                P.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f47617b.m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void e() {
        com.google.common.util.concurrent.q<Void> qVar = this.f47620e;
        if (qVar != null) {
            qVar.cancel(false);
            this.f47620e = null;
        }
    }

    private void h(InterfaceC2971n interfaceC2971n) {
        i(PreviewView.e.IDLE);
        ArrayList arrayList = new ArrayList();
        I.d dVarD = I.d.a(j(interfaceC2971n, arrayList)).e(new I.a() { // from class: androidx.camera.view.a
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return this.f47611a.f47619d.i();
            }
        }, H.a.a()).d(new InterfaceC16423a() { // from class: androidx.camera.view.b
            @Override // q.InterfaceC16423a
            public final Object apply(Object obj) {
                return d.d(this.f47612a, (Void) obj);
            }
        }, H.a.a());
        this.f47620e = dVarD;
        I.n.j(dVarD, new a(arrayList, interfaceC2971n), H.a.a());
    }

    private com.google.common.util.concurrent.q<Void> j(final InterfaceC2971n interfaceC2971n, final List<AbstractC3611h> list) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: androidx.camera.view.c
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return d.b(this.f47613a, interfaceC2971n, list, aVar);
            }
        });
    }

    @Override // F.c0.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(InterfaceC3628z.a aVar) {
        if (aVar == InterfaceC3628z.a.CLOSING || aVar == InterfaceC3628z.a.CLOSED || aVar == InterfaceC3628z.a.RELEASING || aVar == InterfaceC3628z.a.RELEASED) {
            i(PreviewView.e.IDLE);
            if (this.f47621f) {
                this.f47621f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == InterfaceC3628z.a.OPENING || aVar == InterfaceC3628z.a.OPEN || aVar == InterfaceC3628z.a.PENDING_OPEN) && !this.f47621f) {
            h(this.f47616a);
            this.f47621f = true;
        }
    }

    d(InterfaceC3627y interfaceC3627y, C5988D<PreviewView.e> c5988d, i iVar) {
        this.f47616a = interfaceC3627y;
        this.f47617b = c5988d;
        this.f47619d = iVar;
        synchronized (this) {
            this.f47618c = c5988d.e();
        }
    }

    public static /* synthetic */ Object b(d dVar, InterfaceC2971n interfaceC2971n, List list, c.a aVar) {
        dVar.getClass();
        b bVar = dVar.new b(aVar, interfaceC2971n);
        list.add(bVar);
        ((InterfaceC3627y) interfaceC2971n).i(H.a.a(), bVar);
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
