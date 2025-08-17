package O;

import C.d0;
import C.o0;
import F.InterfaceC3628z;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
public class W {

    /* renamed from: a, reason: collision with root package name */
    final S f22851a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3628z f22852b;

    /* renamed from: c, reason: collision with root package name */
    private c f22853c;

    /* renamed from: d, reason: collision with root package name */
    private b f22854d;

    class a implements I.c<d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f22855a;

        a(N n10) {
            this.f22855a = n10;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (this.f22855a.t() == 2 && (th2 instanceof CancellationException)) {
                C.P.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            C.P.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + a0.b(this.f22855a.t()), th2);
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(d0 d0Var) {
            o2.i.g(d0Var);
            try {
                W.this.f22851a.a(d0Var);
            } catch (ProcessingException e10) {
                C.P.d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e10);
            }
        }
    }

    public static abstract class b {
        public abstract List<Q.f> a();

        public abstract N b();

        public static b c(N n10, List<Q.f> list) {
            return new C4417c(n10, list);
        }
    }

    public static class c extends HashMap<Q.f, N> {
    }

    public static /* synthetic */ void c(W w10) {
        c cVar = w10.f22853c;
        if (cVar != null) {
            Iterator<N> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    private void h(N n10) {
        try {
            this.f22851a.c(n10.k(this.f22852b));
        } catch (ProcessingException e10) {
            C.P.d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e10);
        }
    }

    public S e() {
        return this.f22851a;
    }

    public void f() {
        this.f22851a.release();
        G.o.d(new Runnable() { // from class: O.V
            @Override // java.lang.Runnable
            public final void run() {
                W.c(this.f22850a);
            }
        });
    }

    void i(N n10, final Map<Q.f, N> map) {
        n10.f(new InterfaceC15993a() { // from class: O.U
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                W.b(map, (o0.h) obj);
            }
        });
    }

    public W(InterfaceC3628z interfaceC3628z, S s10) {
        this.f22852b = interfaceC3628z;
        this.f22851a = s10;
    }

    public static /* synthetic */ void b(Map map, o0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((Q.f) entry.getKey()).c();
            if (((Q.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((N) entry.getValue()).z(G.p.u(iB), -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(N n10, Map.Entry<Q.f, N> entry) {
        InterfaceC3628z interfaceC3628z;
        N value = entry.getValue();
        Size sizeE = n10.s().e();
        Rect rectA = entry.getKey().a();
        if (n10.u()) {
            interfaceC3628z = this.f22852b;
        } else {
            interfaceC3628z = null;
        }
        I.n.j(value.j(entry.getKey().b(), d0.a.f(sizeE, rectA, interfaceC3628z, entry.getKey().c(), entry.getKey().g()), null), new a(value), H.a.d());
    }

    private void g(final N n10, Map<Q.f, N> map) {
        for (final Map.Entry<Q.f, N> entry : map.entrySet()) {
            d(n10, entry);
            entry.getValue().e(new Runnable() { // from class: O.T
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22846a.d(n10, entry);
                }
            });
        }
    }

    private N k(N n10, Q.f fVar) {
        Rect rectP;
        boolean z10;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n10.r());
        Matrix matrixE = G.p.e(new RectF(rectA), G.p.r(fVar.d()), iC, zG);
        matrix.postConcat(matrixE);
        o2.i.a(G.p.j(G.p.f(rectA, iC), fVar.d()));
        if (fVar.k()) {
            o2.i.b(fVar.a().contains(n10.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), n10.n()));
            rectP = new Rect();
            RectF rectF = new RectF(n10.n());
            matrixE.mapRect(rectF);
            rectF.round(rectP);
        } else {
            rectP = G.p.p(fVar.d());
        }
        Rect rect = rectP;
        androidx.camera.core.impl.x xVarA = n10.s().g().e(fVar.d()).a();
        int iE = fVar.e();
        int iB = fVar.b();
        int iQ = n10.q() - iC;
        if (n10.w() != zG) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new N(iE, iB, xVarA, matrix, false, rect, iQ, -1, z10);
    }

    public c j(b bVar) {
        G.o.a();
        this.f22854d = bVar;
        this.f22853c = new c();
        N nB = bVar.b();
        for (Q.f fVar : bVar.a()) {
            this.f22853c.put(fVar, k(nB, fVar));
        }
        h(nB);
        g(nB, this.f22853c);
        i(nB, this.f22853c);
        return this.f22853c;
    }
}
