package androidx.media3.exoplayer.source;

import a3.F;
import android.os.Handler;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13599a;
import d3.P;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.source.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6219c<T> extends AbstractC6217a {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f57069h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private Handler f57070i;

    /* renamed from: j, reason: collision with root package name */
    private f3.o f57071j;

    /* renamed from: androidx.media3.exoplayer.source.c$a */
    private final class a implements s, androidx.media3.exoplayer.drm.h {

        /* renamed from: a, reason: collision with root package name */
        private final T f57072a;

        /* renamed from: b, reason: collision with root package name */
        private s.a f57073b;

        /* renamed from: c, reason: collision with root package name */
        private h.a f57074c;

        public a(T t10) {
            this.f57073b = AbstractC6219c.this.t(null);
            this.f57074c = AbstractC6219c.this.r(null);
            this.f57072a = t10;
        }

        private boolean c(int i10, r.b bVar) {
            r.b bVarC;
            if (bVar != null) {
                bVarC = AbstractC6219c.this.C(this.f57072a, bVar);
                if (bVarC == null) {
                    return false;
                }
            } else {
                bVarC = null;
            }
            int iE = AbstractC6219c.this.E(this.f57072a, i10);
            s.a aVar = this.f57073b;
            if (aVar.f57162a != iE || !Objects.equals(aVar.f57163b, bVarC)) {
                this.f57073b = AbstractC6219c.this.s(iE, bVarC);
            }
            h.a aVar2 = this.f57074c;
            if (aVar2.f56337a == iE && Objects.equals(aVar2.f56338b, bVarC)) {
                return true;
            }
            this.f57074c = AbstractC6219c.this.q(iE, bVarC);
            return true;
        }

        private p3.j e(p3.j jVar, r.b bVar) {
            long jD = AbstractC6219c.this.D(this.f57072a, jVar.f156106f, bVar);
            long jD2 = AbstractC6219c.this.D(this.f57072a, jVar.f156107g, bVar);
            return (jD == jVar.f156106f && jD2 == jVar.f156107g) ? jVar : new p3.j(jVar.f156101a, jVar.f156102b, jVar.f156103c, jVar.f156104d, jVar.f156105e, jD, jD2);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void B(int i10, r.b bVar, p3.i iVar, p3.j jVar) {
            if (c(i10, bVar)) {
                this.f57073b.l(iVar, e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void E(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f57074c.h();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void G(int i10, r.b bVar, p3.i iVar, p3.j jVar, IOException iOException, boolean z10) {
            if (c(i10, bVar)) {
                this.f57073b.q(iVar, e(jVar, bVar), iOException, z10);
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void H(int i10, r.b bVar, p3.i iVar, p3.j jVar) {
            if (c(i10, bVar)) {
                this.f57073b.n(iVar, e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void I(int i10, r.b bVar, int i11) {
            if (c(i10, bVar)) {
                this.f57074c.k(i11);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void J(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f57074c.i();
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void K(int i10, r.b bVar, Exception exc) {
            if (c(i10, bVar)) {
                this.f57074c.l(exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void L(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f57074c.j();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i10, r.b bVar, p3.i iVar, p3.j jVar, int i11) {
            if (c(i10, bVar)) {
                this.f57073b.s(iVar, e(jVar, bVar), i11);
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void P(int i10, r.b bVar, p3.j jVar) {
            if (c(i10, bVar)) {
                this.f57073b.j(e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Q(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f57074c.m();
            }
        }
    }

    protected abstract r.b C(T t10, r.b bVar);

    protected long D(T t10, long j10, r.b bVar) {
        return j10;
    }

    protected int E(T t10, int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void F(T t10, r rVar, a3.F f10);

    /* renamed from: androidx.media3.exoplayer.source.c$b */
    private static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final r f57076a;

        /* renamed from: b, reason: collision with root package name */
        public final r.c f57077b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC6219c<T>.a f57078c;

        public b(r rVar, r.c cVar, AbstractC6219c<T>.a aVar) {
            this.f57076a = rVar;
            this.f57077b = cVar;
            this.f57078c = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void A() {
        for (b<T> bVar : this.f57069h.values()) {
            bVar.f57076a.k(bVar.f57077b);
            bVar.f57076a.b(bVar.f57078c);
            bVar.f57076a.g(bVar.f57078c);
        }
        this.f57069h.clear();
    }

    protected final void G(final T t10, r rVar) {
        C13599a.a(!this.f57069h.containsKey(t10));
        r.c cVar = new r.c() { // from class: p3.c
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar2, F f10) {
                this.f156085a.F(t10, rVar2, f10);
            }
        };
        a aVar = new a(t10);
        this.f57069h.put(t10, new b<>(rVar, cVar, aVar));
        rVar.a((Handler) C13599a.e(this.f57070i), aVar);
        rVar.f((Handler) C13599a.e(this.f57070i), aVar);
        rVar.d(cVar, this.f57071j, w());
        if (x()) {
            return;
        }
        rVar.l(cVar);
    }

    protected final void H(T t10) {
        b bVar = (b) C13599a.e(this.f57069h.remove(t10));
        bVar.f57076a.k(bVar.f57077b);
        bVar.f57076a.b(bVar.f57078c);
        bVar.f57076a.g(bVar.f57078c);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() throws IOException {
        Iterator<b<T>> it = this.f57069h.values().iterator();
        while (it.hasNext()) {
            it.next().f57076a.m();
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void u() {
        for (b<T> bVar : this.f57069h.values()) {
            bVar.f57076a.l(bVar.f57077b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void v() {
        for (b<T> bVar : this.f57069h.values()) {
            bVar.f57076a.i(bVar.f57077b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void y(f3.o oVar) {
        this.f57071j = oVar;
        this.f57070i = P.z();
    }

    protected AbstractC6219c() {
    }
}
