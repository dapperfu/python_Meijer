package androidx.camera.core.impl;

import C.C2979w;
import C.P;
import F.AbstractC3611h;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5653d;
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
    private static final List<Integer> f47469j = Arrays.asList(1, 5, 3);

    /* renamed from: a, reason: collision with root package name */
    private final List<f> f47470a;

    /* renamed from: b, reason: collision with root package name */
    private final f f47471b;

    /* renamed from: c, reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f47472c;

    /* renamed from: d, reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f47473d;

    /* renamed from: e, reason: collision with root package name */
    private final List<AbstractC3611h> f47474e;

    /* renamed from: f, reason: collision with root package name */
    private final d f47475f;

    /* renamed from: g, reason: collision with root package name */
    private final i f47476g;

    /* renamed from: h, reason: collision with root package name */
    private final int f47477h;

    /* renamed from: i, reason: collision with root package name */
    private InputConfiguration f47478i;

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

        public b c(Collection<AbstractC3611h> collection) {
            this.f47480b.a(collection);
            return this;
        }

        public b e(AbstractC3611h abstractC3611h) {
            this.f47480b.c(abstractC3611h);
            if (!this.f47483e.contains(abstractC3611h)) {
                this.f47483e.add(abstractC3611h);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f47481c.contains(stateCallback)) {
                return this;
            }
            this.f47481c.add(stateCallback);
            return this;
        }

        public b g(k kVar) {
            this.f47480b.e(kVar);
            return this;
        }

        public b h(DeferrableSurface deferrableSurface) {
            return i(deferrableSurface, C2979w.f3533d);
        }

        public b j(AbstractC3611h abstractC3611h) {
            this.f47480b.c(abstractC3611h);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f47482d.contains(stateCallback)) {
                return this;
            }
            this.f47482d.add(stateCallback);
            return this;
        }

        public b l(DeferrableSurface deferrableSurface) {
            return m(deferrableSurface, C2979w.f3533d, null, -1);
        }

        public b n(String str, Object obj) {
            this.f47480b.g(str, obj);
            return this;
        }

        public w o() {
            return new w(new ArrayList(this.f47479a), new ArrayList(this.f47481c), new ArrayList(this.f47482d), new ArrayList(this.f47483e), this.f47480b.h(), this.f47484f, this.f47485g, this.f47486h, this.f47487i);
        }

        public b q(d dVar) {
            this.f47484f = dVar;
            return this;
        }

        public b r(Range<Integer> range) {
            this.f47480b.p(range);
            return this;
        }

        public b s(k kVar) {
            this.f47480b.r(kVar);
            return this;
        }

        public b t(InputConfiguration inputConfiguration) {
            this.f47485g = inputConfiguration;
            return this;
        }

        public b v(int i10) {
            if (i10 != 0) {
                this.f47480b.t(i10);
            }
            return this;
        }

        public b w(int i10) {
            this.f47480b.u(i10);
            return this;
        }

        public b x(int i10) {
            if (i10 != 0) {
                this.f47480b.w(i10);
            }
            return this;
        }

        public b a(Collection<AbstractC3611h> collection) {
            for (AbstractC3611h abstractC3611h : collection) {
                this.f47480b.c(abstractC3611h);
                if (!this.f47483e.contains(abstractC3611h)) {
                    this.f47483e.add(abstractC3611h);
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

        public b i(DeferrableSurface deferrableSurface, C2979w c2979w) {
            this.f47479a.add(f.a(deferrableSurface).b(c2979w).a());
            return this;
        }

        public b m(DeferrableSurface deferrableSurface, C2979w c2979w, String str, int i10) {
            this.f47479a.add(f.a(deferrableSurface).d(str).b(c2979w).c(i10).a());
            this.f47480b.f(deferrableSurface);
            return this;
        }

        public b u(DeferrableSurface deferrableSurface) {
            this.f47487i = f.a(deferrableSurface).a();
            return this;
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f47488a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        private final d f47489b;

        @Override // androidx.camera.core.impl.w.d
        public void a(w wVar, g gVar) {
            if (this.f47488a.get()) {
                return;
            }
            this.f47489b.a(wVar, gVar);
        }

        public void b() {
            this.f47488a.set(true);
        }

        public c(d dVar) {
            this.f47489b = dVar;
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

            public abstract a b(C2979w c2979w);

            public abstract a c(int i10);

            public abstract a d(String str);

            public abstract a e(List<DeferrableSurface> list);

            public abstract a f(int i10);
        }

        public abstract C2979w b();

        public abstract int c();

        public abstract String d();

        public abstract List<DeferrableSurface> e();

        public abstract DeferrableSurface f();

        public abstract int g();

        public static a a(DeferrableSurface deferrableSurface) {
            return new C5653d.b().g(deferrableSurface).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(C2979w.f3533d);
        }
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* renamed from: j, reason: collision with root package name */
        private final M.f f47493j = new M.f();

        /* renamed from: k, reason: collision with root package name */
        private boolean f47494k = true;

        /* renamed from: l, reason: collision with root package name */
        private boolean f47495l = false;

        /* renamed from: m, reason: collision with root package name */
        private List<d> f47496m = new ArrayList();

        public static /* synthetic */ void a(h hVar, w wVar, g gVar) {
            Iterator<d> it = hVar.f47496m.iterator();
            while (it.hasNext()) {
                it.next().a(wVar, gVar);
            }
        }

        private List<DeferrableSurface> e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f47479a) {
                arrayList.add(fVar.f());
                Iterator<DeferrableSurface> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        private void g(Range<Integer> range) {
            Range<Integer> range2 = x.f47497a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f47480b.l().equals(range2)) {
                this.f47480b.p(range);
            } else {
                if (this.f47480b.l().equals(range)) {
                    return;
                }
                this.f47494k = false;
                P.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        private void h(int i10) {
            if (i10 != 0) {
                this.f47480b.t(i10);
            }
        }

        private void i(int i10) {
            if (i10 != 0) {
                this.f47480b.w(i10);
            }
        }

        public w c() {
            if (!this.f47494k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f47479a);
            this.f47493j.c(arrayList);
            return new w(arrayList, new ArrayList(this.f47481c), new ArrayList(this.f47482d), new ArrayList(this.f47483e), this.f47480b.h(), !this.f47496m.isEmpty() ? new d() { // from class: F.q0
                @Override // androidx.camera.core.impl.w.d
                public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                    w.h.a(this.f10026a, wVar, gVar);
                }
            } : null, this.f47485g, this.f47486h, this.f47487i);
        }

        public void d() {
            this.f47479a.clear();
            this.f47480b.i();
        }

        public boolean f() {
            return this.f47495l && this.f47494k;
        }

        public void b(w wVar) {
            i iVarK = wVar.k();
            if (iVarK.k() != -1) {
                this.f47495l = true;
                this.f47480b.u(w.e(iVarK.k(), this.f47480b.n()));
            }
            g(iVarK.e());
            h(iVarK.h());
            i(iVarK.l());
            this.f47480b.b(wVar.k().j());
            this.f47481c.addAll(wVar.c());
            this.f47482d.addAll(wVar.l());
            this.f47480b.a(wVar.j());
            this.f47483e.addAll(wVar.n());
            if (wVar.d() != null) {
                this.f47496m.add(wVar.d());
            }
            if (wVar.g() != null) {
                this.f47485g = wVar.g();
            }
            this.f47479a.addAll(wVar.h());
            this.f47480b.m().addAll(iVarK.i());
            if (!e().containsAll(this.f47480b.m())) {
                P.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f47494k = false;
            }
            if (wVar.m() != this.f47486h && wVar.m() != 0 && this.f47486h != 0) {
                P.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f47494k = false;
            } else if (wVar.m() != 0) {
                this.f47486h = wVar.m();
            }
            if (wVar.f47471b != null) {
                if (this.f47487i != wVar.f47471b && this.f47487i != null) {
                    P.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f47494k = false;
                } else {
                    this.f47487i = wVar.f47471b;
                }
            }
            this.f47480b.e(iVarK.g());
        }
    }

    static class a {

        /* renamed from: f, reason: collision with root package name */
        d f47484f;

        /* renamed from: g, reason: collision with root package name */
        InputConfiguration f47485g;

        /* renamed from: i, reason: collision with root package name */
        f f47487i;

        /* renamed from: a, reason: collision with root package name */
        final Set<f> f47479a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        final i.a f47480b = new i.a();

        /* renamed from: c, reason: collision with root package name */
        final List<CameraDevice.StateCallback> f47481c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final List<CameraCaptureSession.StateCallback> f47482d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        final List<AbstractC3611h> f47483e = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        int f47486h = 0;

        a() {
        }
    }

    public static w b() {
        return new w(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new i.a().h(), null, null, 0, null);
    }

    public static int e(int i10, int i11) {
        List<Integer> list = f47469j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    public List<CameraDevice.StateCallback> c() {
        return this.f47472c;
    }

    public d d() {
        return this.f47475f;
    }

    public k f() {
        return this.f47476g.g();
    }

    public InputConfiguration g() {
        return this.f47478i;
    }

    public List<f> h() {
        return this.f47470a;
    }

    public f i() {
        return this.f47471b;
    }

    public List<AbstractC3611h> j() {
        return this.f47476g.c();
    }

    public i k() {
        return this.f47476g;
    }

    public List<CameraCaptureSession.StateCallback> l() {
        return this.f47473d;
    }

    public int m() {
        return this.f47477h;
    }

    public List<AbstractC3611h> n() {
        return this.f47474e;
    }

    public List<DeferrableSurface> o() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f47470a) {
            arrayList.add(fVar.f());
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f47476g.k();
    }

    w(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC3611h> list4, i iVar, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f47470a = list;
        this.f47472c = Collections.unmodifiableList(list2);
        this.f47473d = Collections.unmodifiableList(list3);
        this.f47474e = Collections.unmodifiableList(list4);
        this.f47475f = dVar;
        this.f47476g = iVar;
        this.f47478i = inputConfiguration;
        this.f47477h = i10;
        this.f47471b = fVar;
    }
}
