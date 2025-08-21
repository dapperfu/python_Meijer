package P;

import C.P;
import C.d0;
import F.InterfaceC3290z;
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
    final S f25162a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3290z f25163b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC3290z f25164c;

    /* renamed from: d, reason: collision with root package name */
    private c f25165d;

    /* renamed from: e, reason: collision with root package name */
    private b f25166e;

    class a implements I.c<d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f25167a;

        a(N n10) {
            this.f25167a = n10;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (this.f25167a.t() == 2 && (th2 instanceof CancellationException)) {
                P.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            P.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + a0.b(this.f25167a.t()), th2);
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(d0 d0Var) {
            o2.i.g(d0Var);
            try {
                r.this.f25162a.a(d0Var);
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
        c cVar = rVar.f25165d;
        if (cVar != null) {
            Iterator<N> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    public void d() {
        this.f25162a.release();
        G.o.d(new Runnable() { // from class: P.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f25155a);
            }
        });
    }

    public r(InterfaceC3290z interfaceC3290z, InterfaceC3290z interfaceC3290z2, S s10) {
        this.f25163b = interfaceC3290z;
        this.f25164c = interfaceC3290z2;
        this.f25162a = s10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(InterfaceC3290z interfaceC3290z, InterfaceC3290z interfaceC3290z2, N n10, N n11, Map.Entry<d, N> entry) {
        N value = entry.getValue();
        Size sizeE = n10.s().e();
        Rect rectA = entry.getKey().a().a();
        if (!n10.u()) {
            interfaceC3290z = null;
        }
        d0.a aVarF = d0.a.f(sizeE, rectA, interfaceC3290z, entry.getKey().a().c(), entry.getKey().a().g());
        Size sizeE2 = n11.s().e();
        Rect rectA2 = entry.getKey().b().a();
        if (!n11.u()) {
            interfaceC3290z2 = null;
        }
        I.n.j(value.j(entry.getKey().a().b(), aVarF, d0.a.f(sizeE2, rectA2, interfaceC3290z2, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), H.a.d());
    }

    private void e(InterfaceC3290z interfaceC3290z, InterfaceC3290z interfaceC3290z2, N n10, N n11, Map<d, N> map) {
        for (final Map.Entry<d, N> entry : map.entrySet()) {
            final InterfaceC3290z interfaceC3290z3 = interfaceC3290z;
            final InterfaceC3290z interfaceC3290z4 = interfaceC3290z2;
            final N n12 = n10;
            final N n13 = n11;
            c(interfaceC3290z3, interfaceC3290z4, n12, n13, entry);
            entry.getValue().e(new Runnable() { // from class: P.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25156a.c(interfaceC3290z3, interfaceC3290z4, n12, n13, entry);
                }
            });
            interfaceC3290z = interfaceC3290z3;
            interfaceC3290z2 = interfaceC3290z4;
            n10 = n12;
            n11 = n13;
        }
    }

    private void f(InterfaceC3290z interfaceC3290z, N n10, Map<d, N> map, boolean z10) {
        try {
            this.f25162a.c(n10.l(interfaceC3290z, z10));
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
        this.f25166e = bVar;
        this.f25165d = new c();
        N nB = this.f25166e.b();
        N nC = this.f25166e.c();
        for (d dVar : this.f25166e.a()) {
            this.f25165d.put(dVar, h(nB, dVar.a()));
        }
        f(this.f25163b, nB, this.f25165d, true);
        f(this.f25164c, nC, this.f25165d, false);
        e(this.f25163b, this.f25164c, nB, nC, this.f25165d);
        return this.f25165d;
    }
}
