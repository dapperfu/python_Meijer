package androidx.camera.core.impl;

import F.AbstractC3611h;
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
    public static final k.a<Integer> f47400i = k.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j, reason: collision with root package name */
    public static final k.a<Integer> f47401j = k.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: k, reason: collision with root package name */
    private static final k.a<Range<Integer>> f47402k = k.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* renamed from: a, reason: collision with root package name */
    final List<DeferrableSurface> f47403a;

    /* renamed from: b, reason: collision with root package name */
    final k f47404b;

    /* renamed from: c, reason: collision with root package name */
    final int f47405c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f47406d;

    /* renamed from: e, reason: collision with root package name */
    final List<AbstractC3611h> f47407e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f47408f;

    /* renamed from: g, reason: collision with root package name */
    private final x0 f47409g;

    /* renamed from: h, reason: collision with root package name */
    private final F.r f47410h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<DeferrableSurface> f47411a;

        /* renamed from: b, reason: collision with root package name */
        private r f47412b;

        /* renamed from: c, reason: collision with root package name */
        private int f47413c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f47414d;

        /* renamed from: e, reason: collision with root package name */
        private List<AbstractC3611h> f47415e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f47416f;

        /* renamed from: g, reason: collision with root package name */
        private b0 f47417g;

        /* renamed from: h, reason: collision with root package name */
        private F.r f47418h;

        public a() {
            this.f47411a = new HashSet();
            this.f47412b = s.b0();
            this.f47413c = -1;
            this.f47414d = false;
            this.f47415e = new ArrayList();
            this.f47416f = false;
            this.f47417g = b0.g();
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
            this.f47417g.f(x0Var);
        }

        public void c(AbstractC3611h abstractC3611h) {
            if (this.f47415e.contains(abstractC3611h)) {
                return;
            }
            this.f47415e.add(abstractC3611h);
        }

        public <T> void d(k.a<T> aVar, T t10) {
            this.f47412b.r(aVar, t10);
        }

        public void f(DeferrableSurface deferrableSurface) {
            this.f47411a.add(deferrableSurface);
        }

        public void g(String str, Object obj) {
            this.f47417g.i(str, obj);
        }

        public i h() {
            return new i(new ArrayList(this.f47411a), t.a0(this.f47412b), this.f47413c, this.f47414d, new ArrayList(this.f47415e), this.f47416f, x0.c(this.f47417g), this.f47418h);
        }

        public void i() {
            this.f47411a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.f47412b.h(i.f47402k, x.f47497a);
        }

        public Set<DeferrableSurface> m() {
            return this.f47411a;
        }

        public int n() {
            return this.f47413c;
        }

        public void o(F.r rVar) {
            this.f47418h = rVar;
        }

        public void q(int i10) {
            this.f47417g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void s(boolean z10) {
            this.f47414d = z10;
        }

        public void t(int i10) {
            if (i10 != 0) {
                d(D.f47325G, Integer.valueOf(i10));
            }
        }

        public void u(int i10) {
            this.f47413c = i10;
        }

        public void v(boolean z10) {
            this.f47416f = z10;
        }

        public void w(int i10) {
            if (i10 != 0) {
                d(D.f47326H, Integer.valueOf(i10));
            }
        }

        public void a(Collection<AbstractC3611h> collection) {
            Iterator<AbstractC3611h> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void e(k kVar) {
            for (k.a<?> aVar : kVar.f()) {
                Object objH = this.f47412b.h(aVar, null);
                Object objA = kVar.a(aVar);
                if (objH instanceof Z) {
                    ((Z) objH).a(((Z) objA).c());
                } else {
                    if (objA instanceof Z) {
                        objA = ((Z) objA).clone();
                    }
                    this.f47412b.p(aVar, kVar.i(aVar), objA);
                }
            }
        }

        public void p(Range<Integer> range) {
            d(i.f47402k, range);
        }

        public void r(k kVar) {
            this.f47412b = s.c0(kVar);
        }

        private a(i iVar) {
            HashSet hashSet = new HashSet();
            this.f47411a = hashSet;
            this.f47412b = s.b0();
            this.f47413c = -1;
            this.f47414d = false;
            this.f47415e = new ArrayList();
            this.f47416f = false;
            this.f47417g = b0.g();
            hashSet.addAll(iVar.f47403a);
            this.f47412b = s.c0(iVar.f47404b);
            this.f47413c = iVar.f47405c;
            this.f47415e.addAll(iVar.c());
            this.f47416f = iVar.n();
            this.f47417g = b0.h(iVar.j());
            this.f47414d = iVar.f47406d;
        }
    }

    public interface b {
        void a(D<?> d10, a aVar);
    }

    public static i b() {
        return new a().h();
    }

    public List<AbstractC3611h> c() {
        return this.f47407e;
    }

    public F.r d() {
        return this.f47410h;
    }

    public Range<Integer> e() {
        Range<Integer> range = (Range) this.f47404b.h(f47402k, x.f47497a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f47409g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public k g() {
        return this.f47404b;
    }

    public int h() {
        Integer num = (Integer) this.f47404b.h(D.f47325G, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List<DeferrableSurface> i() {
        return Collections.unmodifiableList(this.f47403a);
    }

    public x0 j() {
        return this.f47409g;
    }

    public int k() {
        return this.f47405c;
    }

    public int l() {
        Integer num = (Integer) this.f47404b.h(D.f47326H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f47406d;
    }

    public boolean n() {
        return this.f47408f;
    }

    i(List<DeferrableSurface> list, k kVar, int i10, boolean z10, List<AbstractC3611h> list2, boolean z11, x0 x0Var, F.r rVar) {
        this.f47403a = list;
        this.f47404b = kVar;
        this.f47405c = i10;
        this.f47407e = Collections.unmodifiableList(list2);
        this.f47408f = z11;
        this.f47409g = x0Var;
        this.f47410h = rVar;
        this.f47406d = z10;
    }
}
