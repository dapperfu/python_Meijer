package P;

import C.P;
import C.d0;
import F.InterfaceC3628z;
import O.N;
import O.S;
import O.a0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    final S f24464a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3628z f24465b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC3628z f24466c;

    /* renamed from: d, reason: collision with root package name */
    private c f24467d;

    /* renamed from: e, reason: collision with root package name */
    private b f24468e;

    class a implements I.c<d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f24469a;

        a(N n10) {
            this.f24469a = n10;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (this.f24469a.t() == 2 && (th2 instanceof CancellationException)) {
                P.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            P.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + a0.b(this.f24469a.t()), th2);
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(d0 d0Var) {
            o2.i.g(d0Var);
            try {
                r.this.f24464a.a(d0Var);
            } catch (ProcessingException e10) {
                P.d("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e10);
            }
        }
    }

    public static abstract class b {
        public abstract List<d> a();

        public abstract N b();

        public abstract N c();

        public static b d(N n10, N n11, List<d> list) {
            return new P.b(n10, n11, list);
        }
    }

    public static class c extends HashMap<d, N> {
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f24467d;
        if (cVar != null) {
            Iterator<N> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    public void d() {
        this.f24464a.release();
        G.o.d(new Runnable() { // from class: P.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f24457a);
            }
        });
    }

    public r(InterfaceC3628z interfaceC3628z, InterfaceC3628z interfaceC3628z2, S s10) {
        this.f24465b = interfaceC3628z;
        this.f24466c = interfaceC3628z2;
        this.f24464a = s10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(InterfaceC3628z interfaceC3628z, InterfaceC3628z interfaceC3628z2, N n10, N n11, Map.Entry<d, N> entry) {
        N value = entry.getValue();
        Size sizeE = n10.s().e();
        Rect rectA = entry.getKey().a().a();
        if (!n10.u()) {
            interfaceC3628z = null;
        }
        d0.a aVarF = d0.a.f(sizeE, rectA, interfaceC3628z, entry.getKey().a().c(), entry.getKey().a().g());
        Size sizeE2 = n11.s().e();
        Rect rectA2 = entry.getKey().b().a();
        if (!n11.u()) {
            interfaceC3628z2 = null;
        }
        I.n.j(value.j(entry.getKey().a().b(), aVarF, d0.a.f(sizeE2, rectA2, interfaceC3628z2, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), H.a.d());
    }

    private void e(InterfaceC3628z interfaceC3628z, InterfaceC3628z interfaceC3628z2, N n10, N n11, Map<d, N> map) {
        for (final Map.Entry<d, N> entry : map.entrySet()) {
            final InterfaceC3628z interfaceC3628z3 = interfaceC3628z;
            final InterfaceC3628z interfaceC3628z4 = interfaceC3628z2;
            final N n12 = n10;
            final N n13 = n11;
            c(interfaceC3628z3, interfaceC3628z4, n12, n13, entry);
            entry.getValue().e(new Runnable() { // from class: P.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24458a.c(interfaceC3628z3, interfaceC3628z4, n12, n13, entry);
                }
            });
            interfaceC3628z = interfaceC3628z3;
            interfaceC3628z2 = interfaceC3628z4;
            n10 = n12;
            n11 = n13;
        }
    }

    private void f(InterfaceC3628z interfaceC3628z, N n10, Map<d, N> map, boolean z10) {
        try {
            this.f24464a.c(n10.l(interfaceC3628z, z10));
        } catch (ProcessingException e10) {
            P.d("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e10);
        }
    }

    private N h(N n10, Q.f fVar) {
        boolean z10;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix();
        o2.i.a(G.p.j(G.p.f(rectA, iC), fVar.d()));
        Rect rectP = G.p.p(fVar.d());
        x xVarA = n10.s().g().e(fVar.d()).a();
        int iE = fVar.e();
        int iB = fVar.b();
        int iQ = n10.q() - iC;
        if (n10.w() != zG) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new N(iE, iB, xVarA, matrix, false, rectP, iQ, -1, z10);
    }

    public c g(b bVar) {
        G.o.a();
        this.f24468e = bVar;
        this.f24467d = new c();
        N nB = this.f24468e.b();
        N nC = this.f24468e.c();
        for (d dVar : this.f24468e.a()) {
            this.f24467d.put(dVar, h(nB, dVar.a()));
        }
        f(this.f24465b, nB, this.f24467d, true);
        f(this.f24466c, nC, this.f24467d, false);
        e(this.f24465b, this.f24466c, nB, nC, this.f24467d);
        return this.f24467d;
    }
}
