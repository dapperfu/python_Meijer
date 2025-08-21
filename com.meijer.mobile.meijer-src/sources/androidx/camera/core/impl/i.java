package androidx.camera.core.impl;

import F.AbstractC3273h;
import F.Z;
import F.b0;
import F.x0;
import android.util.Range;
import androidx.camera.core.impl.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    public static final k.a<Integer> f47624i = k.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j, reason: collision with root package name */
    public static final k.a<Integer> f47625j = k.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: k, reason: collision with root package name */
    private static final k.a<Range<Integer>> f47626k = k.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* renamed from: a, reason: collision with root package name */
    final List<DeferrableSurface> f47627a;

    /* renamed from: b, reason: collision with root package name */
    final k f47628b;

    /* renamed from: c, reason: collision with root package name */
    final int f47629c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f47630d;

    /* renamed from: e, reason: collision with root package name */
    final List<AbstractC3273h> f47631e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f47632f;

    /* renamed from: g, reason: collision with root package name */
    private final x0 f47633g;

    /* renamed from: h, reason: collision with root package name */
    private final F.r f47634h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<DeferrableSurface> f47635a;

        /* renamed from: b, reason: collision with root package name */
        private r f47636b;

        /* renamed from: c, reason: collision with root package name */
        private int f47637c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f47638d;

        /* renamed from: e, reason: collision with root package name */
        private List<AbstractC3273h> f47639e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f47640f;

        /* renamed from: g, reason: collision with root package name */
        private b0 f47641g;

        /* renamed from: h, reason: collision with root package name */
        private F.r f47642h;

        public a() {
            this.f47635a = new HashSet();
            this.f47636b = s.b0();
            this.f47637c = -1;
            this.f47638d = false;
            this.f47639e = new ArrayList();
            this.f47640f = false;
            this.f47641g = b0.g();
        }

        public static a j(D<?> d10) {
            b bVarQ = d10.q(null);
            if (bVarQ != null) {
                a aVar = new a();
                bVarQ.a(d10, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + d10.u(d10.toString()));
        }

        public static a k(i iVar) {
            return new a(iVar);
        }

        public void b(x0 x0Var) {
            this.f47641g.f(x0Var);
        }

        public void c(AbstractC3273h abstractC3273h) {
            if (this.f47639e.contains(abstractC3273h)) {
                return;
            }
            this.f47639e.add(abstractC3273h);
        }

        public <T> void d(k.a<T> aVar, T t10) {
            this.f47636b.r(aVar, t10);
        }

        public void f(DeferrableSurface deferrableSurface) {
            this.f47635a.add(deferrableSurface);
        }

        public void g(String str, Object obj) {
            this.f47641g.i(str, obj);
        }

        public i h() {
            return new i(new ArrayList(this.f47635a), t.a0(this.f47636b), this.f47637c, this.f47638d, new ArrayList(this.f47639e), this.f47640f, x0.c(this.f47641g), this.f47642h);
        }

        public void i() {
            this.f47635a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.f47636b.h(i.f47626k, x.f47721a);
        }

        public Set<DeferrableSurface> m() {
            return this.f47635a;
        }

        public int n() {
            return this.f47637c;
        }

        public void o(F.r rVar) {
            this.f47642h = rVar;
        }

        public void q(int i10) {
            this.f47641g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void s(boolean z10) {
            this.f47638d = z10;
        }

        public void t(int i10) {
            if (i10 != 0) {
                d(D.f47549G, Integer.valueOf(i10));
            }
        }

        public void u(int i10) {
            this.f47637c = i10;
        }

        public void v(boolean z10) {
            this.f47640f = z10;
        }

        public void w(int i10) {
            if (i10 != 0) {
                d(D.f47550H, Integer.valueOf(i10));
            }
        }

        public void a(Collection<AbstractC3273h> collection) {
            Iterator<AbstractC3273h> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void e(k kVar) {
            for (k.a<?> aVar : kVar.f()) {
                Object objH = this.f47636b.h(aVar, null);
                Object objA = kVar.a(aVar);
                if (objH instanceof Z) {
                    ((Z) objH).a(((Z) objA).c());
                } else {
                    if (objA instanceof Z) {
                        objA = ((Z) objA).clone();
                    }
                    this.f47636b.p(aVar, kVar.i(aVar), objA);
                }
            }
        }

        public void p(Range<Integer> range) {
            d(i.f47626k, range);
        }

        public void r(k kVar) {
            this.f47636b = s.c0(kVar);
        }

        private a(i iVar) {
            HashSet hashSet = new HashSet();
            this.f47635a = hashSet;
            this.f47636b = s.b0();
            this.f47637c = -1;
            this.f47638d = false;
            this.f47639e = new ArrayList();
            this.f47640f = false;
            this.f47641g = b0.g();
            hashSet.addAll(iVar.f47627a);
            this.f47636b = s.c0(iVar.f47628b);
            this.f47637c = iVar.f47629c;
            this.f47639e.addAll(iVar.c());
            this.f47640f = iVar.n();
            this.f47641g = b0.h(iVar.j());
            this.f47638d = iVar.f47630d;
        }
    }

    public interface b {
        void a(D<?> d10, a aVar);
    }

    public static i b() {
        return new a().h();
    }

    public List<AbstractC3273h> c() {
        return this.f47631e;
    }

    public F.r d() {
        return this.f47634h;
    }

    public Range<Integer> e() {
        Range<Integer> range = (Range) this.f47628b.h(f47626k, x.f47721a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f47633g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public k g() {
        return this.f47628b;
    }

    public int h() {
        Integer num = (Integer) this.f47628b.h(D.f47549G, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List<DeferrableSurface> i() {
        return Collections.unmodifiableList(this.f47627a);
    }

    public x0 j() {
        return this.f47633g;
    }

    public int k() {
        return this.f47629c;
    }

    public int l() {
        Integer num = (Integer) this.f47628b.h(D.f47550H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f47630d;
    }

    public boolean n() {
        return this.f47632f;
    }

    i(List<DeferrableSurface> list, k kVar, int i10, boolean z10, List<AbstractC3273h> list2, boolean z11, x0 x0Var, F.r rVar) {
        this.f47627a = list;
        this.f47628b = kVar;
        this.f47629c = i10;
        this.f47631e = Collections.unmodifiableList(list2);
        this.f47632f = z11;
        this.f47633g = x0Var;
        this.f47634h = rVar;
        this.f47630d = z10;
    }
}
