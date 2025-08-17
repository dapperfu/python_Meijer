package androidx.media3.exoplayer.source;

import a3.F;
import android.os.Handler;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13466a;
import d3.P;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.source.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6077c<T> extends AbstractC6075a {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f56845h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private Handler f56846i;

    /* renamed from: j, reason: collision with root package name */
    private f3.o f56847j;

    /* renamed from: androidx.media3.exoplayer.source.c$a */
    private final class a implements s, androidx.media3.exoplayer.drm.h {

        /* renamed from: a, reason: collision with root package name */
        private final T f56848a;

        /* renamed from: b, reason: collision with root package name */
        private s.a f56849b;

        /* renamed from: c, reason: collision with root package name */
        private h.a f56850c;

        public a(T t10) {
            this.f56849b = AbstractC6077c.this.t(null);
            this.f56850c = AbstractC6077c.this.r(null);
            this.f56848a = t10;
        }

        private boolean c(int i10, r.b bVar) {
            r.b bVarC;
            if (bVar != null) {
                bVarC = AbstractC6077c.this.C(this.f56848a, bVar);
                if (bVarC == null) {
                    return false;
                }
            } else {
                bVarC = null;
            }
            int iE = AbstractC6077c.this.E(this.f56848a, i10);
            s.a aVar = this.f56849b;
            if (aVar.f56938a != iE || !Objects.equals(aVar.f56939b, bVarC)) {
                this.f56849b = AbstractC6077c.this.s(iE, bVarC);
            }
            h.a aVar2 = this.f56850c;
            if (aVar2.f56113a == iE && Objects.equals(aVar2.f56114b, bVarC)) {
                return true;
            }
            this.f56850c = AbstractC6077c.this.q(iE, bVarC);
            return true;
        }

        private p3.j e(p3.j jVar, r.b bVar) {
            long jD = AbstractC6077c.this.D(this.f56848a, jVar.f155432f, bVar);
            long jD2 = AbstractC6077c.this.D(this.f56848a, jVar.f155433g, bVar);
            return (jD == jVar.f155432f && jD2 == jVar.f155433g) ? jVar : new p3.j(jVar.f155427a, jVar.f155428b, jVar.f155429c, jVar.f155430d, jVar.f155431e, jD, jD2);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void B(int i10, r.b bVar, p3.i iVar, p3.j jVar) {
            if (c(i10, bVar)) {
                this.f56849b.l(iVar, e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void E(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f56850c.h();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void G(int i10, r.b bVar, p3.i iVar, p3.j jVar, IOException iOException, boolean z10) {
            if (c(i10, bVar)) {
                this.f56849b.q(iVar, e(jVar, bVar), iOException, z10);
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void H(int i10, r.b bVar, p3.i iVar, p3.j jVar) {
            if (c(i10, bVar)) {
                this.f56849b.n(iVar, e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void I(int i10, r.b bVar, int i11) {
            if (c(i10, bVar)) {
                this.f56850c.k(i11);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void J(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f56850c.i();
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void K(int i10, r.b bVar, Exception exc) {
            if (c(i10, bVar)) {
                this.f56850c.l(exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void L(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f56850c.j();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i10, r.b bVar, p3.i iVar, p3.j jVar, int i11) {
            if (c(i10, bVar)) {
                this.f56849b.s(iVar, e(jVar, bVar), i11);
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void P(int i10, r.b bVar, p3.j jVar) {
            if (c(i10, bVar)) {
                this.f56849b.j(e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Q(int i10, r.b bVar) {
            if (c(i10, bVar)) {
                this.f56850c.m();
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
        public final r f56852a;

        /* renamed from: b, reason: collision with root package name */
        public final r.c f56853b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC6077c<T>.a f56854c;

        public b(r rVar, r.c cVar, AbstractC6077c<T>.a aVar) {
            this.f56852a = rVar;
            this.f56853b = cVar;
            this.f56854c = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void A() {
        for (b<T> bVar : this.f56845h.values()) {
            bVar.f56852a.k(bVar.f56853b);
            bVar.f56852a.b(bVar.f56854c);
            bVar.f56852a.g(bVar.f56854c);
        }
        this.f56845h.clear();
    }

    protected final void G(final T t10, r rVar) {
        C13466a.a(!this.f56845h.containsKey(t10));
        r.c cVar = new r.c() { // from class: p3.c
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar2, F f10) {
                this.f155411a.F(t10, rVar2, f10);
            }
        };
        a aVar = new a(t10);
        this.f56845h.put(t10, new b<>(rVar, cVar, aVar));
        rVar.a((Handler) C13466a.e(this.f56846i), aVar);
        rVar.f((Handler) C13466a.e(this.f56846i), aVar);
        rVar.d(cVar, this.f56847j, w());
        if (x()) {
            return;
        }
        rVar.l(cVar);
    }

    protected final void H(T t10) {
        b bVar = (b) C13466a.e(this.f56845h.remove(t10));
        bVar.f56852a.k(bVar.f56853b);
        bVar.f56852a.b(bVar.f56854c);
        bVar.f56852a.g(bVar.f56854c);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() throws IOException {
        Iterator<b<T>> it = this.f56845h.values().iterator();
        while (it.hasNext()) {
            it.next().f56852a.m();
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void u() {
        for (b<T> bVar : this.f56845h.values()) {
            bVar.f56852a.l(bVar.f56853b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void v() {
        for (b<T> bVar : this.f56845h.values()) {
            bVar.f56852a.i(bVar.f56853b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void y(f3.o oVar) {
        this.f56847j = oVar;
        this.f56846i = P.z();
    }

    protected AbstractC6077c() {
    }
}
