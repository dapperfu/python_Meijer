package androidx.camera.core.impl;

import C.C3037w;
import C.P;
import F.AbstractC3273h;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5795d;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: j, reason: collision with root package name */
    private static final List<Integer> f47693j = Arrays.asList(1, 5, 3);

    /* renamed from: a, reason: collision with root package name */
    private final List<f> f47694a;

    /* renamed from: b, reason: collision with root package name */
    private final f f47695b;

    /* renamed from: c, reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f47696c;

    /* renamed from: d, reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f47697d;

    /* renamed from: e, reason: collision with root package name */
    private final List<AbstractC3273h> f47698e;

    /* renamed from: f, reason: collision with root package name */
    private final d f47699f;

    /* renamed from: g, reason: collision with root package name */
    private final i f47700g;

    /* renamed from: h, reason: collision with root package name */
    private final int f47701h;

    /* renamed from: i, reason: collision with root package name */
    private InputConfiguration f47702i;

    public static class b extends a {
        public static b p(D<?> d10, Size size) {
            e eVarW = d10.W(null);
            if (eVarW != null) {
                b bVar = new b();
                eVarW.a(size, d10, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + d10.u(d10.toString()));
        }

        public b c(Collection<AbstractC3273h> collection) {
            this.f47704b.a(collection);
            return this;
        }

        public b e(AbstractC3273h abstractC3273h) {
            this.f47704b.c(abstractC3273h);
            if (!this.f47707e.contains(abstractC3273h)) {
                this.f47707e.add(abstractC3273h);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f47705c.contains(stateCallback)) {
                return this;
            }
            this.f47705c.add(stateCallback);
            return this;
        }

        public b g(k kVar) {
            this.f47704b.e(kVar);
            return this;
        }

        public b h(DeferrableSurface deferrableSurface) {
            return i(deferrableSurface, C3037w.f3991d);
        }

        public b j(AbstractC3273h abstractC3273h) {
            this.f47704b.c(abstractC3273h);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f47706d.contains(stateCallback)) {
                return this;
            }
            this.f47706d.add(stateCallback);
            return this;
        }

        public b l(DeferrableSurface deferrableSurface) {
            return m(deferrableSurface, C3037w.f3991d, null, -1);
        }

        public b n(String str, Object obj) {
            this.f47704b.g(str, obj);
            return this;
        }

        public w o() {
            return new w(new ArrayList(this.f47703a), new ArrayList(this.f47705c), new ArrayList(this.f47706d), new ArrayList(this.f47707e), this.f47704b.h(), this.f47708f, this.f47709g, this.f47710h, this.f47711i);
        }

        public b q(d dVar) {
            this.f47708f = dVar;
            return this;
        }

        public b r(Range<Integer> range) {
            this.f47704b.p(range);
            return this;
        }

        public b s(k kVar) {
            this.f47704b.r(kVar);
            return this;
        }

        public b t(InputConfiguration inputConfiguration) {
            this.f47709g = inputConfiguration;
            return this;
        }

        public b v(int i10) {
            if (i10 != 0) {
                this.f47704b.t(i10);
            }
            return this;
        }

        public b w(int i10) {
            this.f47704b.u(i10);
            return this;
        }

        public b x(int i10) {
            if (i10 != 0) {
                this.f47704b.w(i10);
            }
            return this;
        }

        public b a(Collection<AbstractC3273h> collection) {
            for (AbstractC3273h abstractC3273h : collection) {
                this.f47704b.c(abstractC3273h);
                if (!this.f47707e.contains(abstractC3273h)) {
                    this.f47707e.add(abstractC3273h);
                }
            }
            return this;
        }

        public b b(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }

        public b d(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                k(it.next());
            }
            return this;
        }

        public b i(DeferrableSurface deferrableSurface, C3037w c3037w) {
            this.f47703a.add(f.a(deferrableSurface).b(c3037w).a());
            return this;
        }

        public b m(DeferrableSurface deferrableSurface, C3037w c3037w, String str, int i10) {
            this.f47703a.add(f.a(deferrableSurface).d(str).b(c3037w).c(i10).a());
            this.f47704b.f(deferrableSurface);
            return this;
        }

        public b u(DeferrableSurface deferrableSurface) {
            this.f47711i = f.a(deferrableSurface).a();
            return this;
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f47712a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        private final d f47713b;

        @Override // androidx.camera.core.impl.w.d
        public void a(w wVar, g gVar) {
            if (this.f47712a.get()) {
                return;
            }
            this.f47713b.a(wVar, gVar);
        }

        public void b() {
            this.f47712a.set(true);
        }

        public c(d dVar) {
            this.f47713b = dVar;
        }
    }

    public interface d {
        void a(w wVar, g gVar);
    }

    public interface e {
        void a(Size size, D<?> d10, b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            public abstract f a();

            public abstract a b(C3037w c3037w);

            public abstract a c(int i10);

            public abstract a d(String str);

            public abstract a e(List<DeferrableSurface> list);

            public abstract a f(int i10);
        }

        public abstract C3037w b();

        public abstract int c();

        public abstract String d();

        public abstract List<DeferrableSurface> e();

        public abstract DeferrableSurface f();

        public abstract int g();

        public static a a(DeferrableSurface deferrableSurface) {
            return new C5795d.b().g(deferrableSurface).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(C3037w.f3991d);
        }
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* renamed from: j, reason: collision with root package name */
        private final M.f f47717j = new M.f();

        /* renamed from: k, reason: collision with root package name */
        private boolean f47718k = true;

        /* renamed from: l, reason: collision with root package name */
        private boolean f47719l = false;

        /* renamed from: m, reason: collision with root package name */
        private List<d> f47720m = new ArrayList();

        public static /* synthetic */ void a(h hVar, w wVar, g gVar) {
            Iterator<d> it = hVar.f47720m.iterator();
            while (it.hasNext()) {
                it.next().a(wVar, gVar);
            }
        }

        private List<DeferrableSurface> e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f47703a) {
                arrayList.add(fVar.f());
                Iterator<DeferrableSurface> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        private void g(Range<Integer> range) {
            Range<Integer> range2 = x.f47721a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f47704b.l().equals(range2)) {
                this.f47704b.p(range);
            } else {
                if (this.f47704b.l().equals(range)) {
                    return;
                }
                this.f47718k = false;
                P.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        private void h(int i10) {
            if (i10 != 0) {
                this.f47704b.t(i10);
            }
        }

        private void i(int i10) {
            if (i10 != 0) {
                this.f47704b.w(i10);
            }
        }

        public w c() {
            if (!this.f47718k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f47703a);
            this.f47717j.c(arrayList);
            return new w(arrayList, new ArrayList(this.f47705c), new ArrayList(this.f47706d), new ArrayList(this.f47707e), this.f47704b.h(), !this.f47720m.isEmpty() ? new d() { // from class: F.q0
                @Override // androidx.camera.core.impl.w.d
                public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                    w.h.a(this.f8793a, wVar, gVar);
                }
            } : null, this.f47709g, this.f47710h, this.f47711i);
        }

        public void d() {
            this.f47703a.clear();
            this.f47704b.i();
        }

        public boolean f() {
            return this.f47719l && this.f47718k;
        }

        public void b(w wVar) {
            i iVarK = wVar.k();
            if (iVarK.k() != -1) {
                this.f47719l = true;
                this.f47704b.u(w.e(iVarK.k(), this.f47704b.n()));
            }
            g(iVarK.e());
            h(iVarK.h());
            i(iVarK.l());
            this.f47704b.b(wVar.k().j());
            this.f47705c.addAll(wVar.c());
            this.f47706d.addAll(wVar.l());
            this.f47704b.a(wVar.j());
            this.f47707e.addAll(wVar.n());
            if (wVar.d() != null) {
                this.f47720m.add(wVar.d());
            }
            if (wVar.g() != null) {
                this.f47709g = wVar.g();
            }
            this.f47703a.addAll(wVar.h());
            this.f47704b.m().addAll(iVarK.i());
            if (!e().containsAll(this.f47704b.m())) {
                P.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f47718k = false;
            }
            if (wVar.m() != this.f47710h && wVar.m() != 0 && this.f47710h != 0) {
                P.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f47718k = false;
            } else if (wVar.m() != 0) {
                this.f47710h = wVar.m();
            }
            if (wVar.f47695b != null) {
                if (this.f47711i != wVar.f47695b && this.f47711i != null) {
                    P.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f47718k = false;
                } else {
                    this.f47711i = wVar.f47695b;
                }
            }
            this.f47704b.e(iVarK.g());
        }
    }

    static class a {

        /* renamed from: f, reason: collision with root package name */
        d f47708f;

        /* renamed from: g, reason: collision with root package name */
        InputConfiguration f47709g;

        /* renamed from: i, reason: collision with root package name */
        f f47711i;

        /* renamed from: a, reason: collision with root package name */
        final Set<f> f47703a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        final i.a f47704b = new i.a();

        /* renamed from: c, reason: collision with root package name */
        final List<CameraDevice.StateCallback> f47705c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final List<CameraCaptureSession.StateCallback> f47706d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        final List<AbstractC3273h> f47707e = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        int f47710h = 0;

        a() {
        }
    }

    public static w b() {
        return new w(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new i.a().h(), null, null, 0, null);
    }

    public static int e(int i10, int i11) {
        List<Integer> list = f47693j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    public List<CameraDevice.StateCallback> c() {
        return this.f47696c;
    }

    public d d() {
        return this.f47699f;
    }

    public k f() {
        return this.f47700g.g();
    }

    public InputConfiguration g() {
        return this.f47702i;
    }

    public List<f> h() {
        return this.f47694a;
    }

    public f i() {
        return this.f47695b;
    }

    public List<AbstractC3273h> j() {
        return this.f47700g.c();
    }

    public i k() {
        return this.f47700g;
    }

    public List<CameraCaptureSession.StateCallback> l() {
        return this.f47697d;
    }

    public int m() {
        return this.f47701h;
    }

    public List<AbstractC3273h> n() {
        return this.f47698e;
    }

    public List<DeferrableSurface> o() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f47694a) {
            arrayList.add(fVar.f());
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f47700g.k();
    }

    w(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC3273h> list4, i iVar, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f47694a = list;
        this.f47696c = Collections.unmodifiableList(list2);
        this.f47697d = Collections.unmodifiableList(list3);
        this.f47698e = Collections.unmodifiableList(list4);
        this.f47699f = dVar;
        this.f47700g = iVar;
        this.f47702i = inputConfiguration;
        this.f47701h = i10;
        this.f47695b = fVar;
    }
}
