package v;

import C.H;
import E.InterfaceC3170j;
import F.AbstractC3273h;
import F.C3275j;
import F.C3283s;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.i;
import androidx.concurrent.futures.c;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q.InterfaceC16578a;
import u.C17296a;
import v.C17499a0;
import v.C17557u;
import z.C18382B;
import z.C18383C;
import z.C18390g;
import z.C18398o;

/* renamed from: v.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17499a0 {

    /* renamed from: a, reason: collision with root package name */
    private final C17557u f164944a;

    /* renamed from: b, reason: collision with root package name */
    private final C18383C f164945b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f164946c;

    /* renamed from: d, reason: collision with root package name */
    private final F.l0 f164947d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f164948e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f164949f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f164950g;

    /* renamed from: h, reason: collision with root package name */
    private int f164951h = 1;

    /* renamed from: v.a0$a */
    static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C17557u f164952a;

        /* renamed from: b, reason: collision with root package name */
        private final C18398o f164953b;

        /* renamed from: c, reason: collision with root package name */
        private final int f164954c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f164955d = false;

        public static /* synthetic */ Object e(a aVar, c.a aVar2) {
            aVar.f164952a.y().y(aVar2);
            aVar.f164953b.b();
            return "AePreCapture";
        }

        @Override // v.C17499a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!C17499a0.e(this.f164954c, totalCaptureResult)) {
                return I.n.p(Boolean.FALSE);
            }
            C.P.a("Camera2CapturePipeline", "Trigger AE");
            this.f164955d = true;
            return I.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.Y
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return C17499a0.a.e(this.f164937a, aVar);
                }
            })).d(new InterfaceC16578a() { // from class: v.Z
                @Override // q.InterfaceC16578a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, H.a.a());
        }

        @Override // v.C17499a0.e
        public boolean b() {
            return this.f164954c == 0;
        }

        @Override // v.C17499a0.e
        public void c() {
            if (this.f164955d) {
                C.P.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f164952a.y().h(false, true);
                this.f164953b.a();
            }
        }

        a(C17557u c17557u, int i10, C18398o c18398o) {
            this.f164952a = c17557u;
            this.f164954c = i10;
            this.f164953b = c18398o;
        }
    }

    /* renamed from: v.a0$b */
    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C17557u f164956a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f164957b = false;

        @Override // v.C17499a0.e
        public boolean b() {
            return true;
        }

        @Override // v.C17499a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            com.google.common.util.concurrent.q<Boolean> qVarP = I.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                C.P.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C.P.a("Camera2CapturePipeline", "Trigger AF");
                    this.f164957b = true;
                    this.f164956a.y().z(null, false);
                }
            }
            return qVarP;
        }

        @Override // v.C17499a0.e
        public void c() {
            if (this.f164957b) {
                C.P.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f164956a.y().h(true, false);
            }
        }

        b(C17557u c17557u) {
            this.f164956a = c17557u;
        }
    }

    /* renamed from: v.a0$c */
    static class c implements InterfaceC3170j {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f164958a;

        /* renamed from: b, reason: collision with root package name */
        private final d f164959b;

        /* renamed from: c, reason: collision with root package name */
        private int f164960c;

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        public static /* synthetic */ Object c(c cVar, c.a aVar) {
            cVar.f164959b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        @Override // E.InterfaceC3170j
        public com.google.common.util.concurrent.q<Void> a() {
            C.P.a("Camera2CapturePipeline", "invokePreCapture");
            return I.d.a(this.f164959b.k(this.f164960c)).d(new InterfaceC16578a() { // from class: v.c0
                @Override // q.InterfaceC16578a
                public final Object apply(Object obj) {
                    return C17499a0.c.d((TotalCaptureResult) obj);
                }
            }, this.f164958a);
        }

        @Override // E.InterfaceC3170j
        public com.google.common.util.concurrent.q<Void> b() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.b0
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return C17499a0.c.c(this.f165000a, aVar);
                }
            });
        }

        c(d dVar, Executor executor, int i10) {
            this.f164959b = dVar;
            this.f164958a = executor;
            this.f164960c = i10;
        }
    }

    /* renamed from: v.a0$d */
    static class d {

        /* renamed from: j, reason: collision with root package name */
        private static final long f164961j;

        /* renamed from: k, reason: collision with root package name */
        private static final long f164962k;

        /* renamed from: a, reason: collision with root package name */
        private final int f164963a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f164964b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f164965c;

        /* renamed from: d, reason: collision with root package name */
        private final C17557u f164966d;

        /* renamed from: e, reason: collision with root package name */
        private final C18398o f164967e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f164968f;

        /* renamed from: g, reason: collision with root package name */
        private long f164969g = f164961j;

        /* renamed from: h, reason: collision with root package name */
        final List<e> f164970h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        private final e f164971i = new a();

        /* renamed from: v.a0$d$a */
        class a implements e {
            a() {
            }

            @Override // v.C17499a0.e
            public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<e> it = d.this.f164970h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return I.n.x(I.n.k(arrayList), new InterfaceC16578a() { // from class: v.j0
                    @Override // q.InterfaceC16578a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, H.a.a());
            }

            @Override // v.C17499a0.e
            public boolean b() {
                Iterator<e> it = d.this.f164970h.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // v.C17499a0.e
            public void c() {
                Iterator<e> it = d.this.f164970h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        /* renamed from: v.a0$d$b */
        class b extends AbstractC3273h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f164973a;

            b(c.a aVar) {
                this.f164973a = aVar;
            }

            @Override // F.AbstractC3273h
            public void a(int i10) {
                this.f164973a.f(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // F.AbstractC3273h
            public void b(int i10, F.r rVar) {
                this.f164973a.c(null);
            }

            @Override // F.AbstractC3273h
            public void c(int i10, C3275j c3275j) {
                this.f164973a.f(new ImageCaptureException(2, "Capture request failed with reason " + c3275j.a(), null));
            }
        }

        public com.google.common.util.concurrent.q<TotalCaptureResult> k(final int i10) {
            com.google.common.util.concurrent.q<TotalCaptureResult> qVarP = I.n.p(null);
            if (this.f164970h.isEmpty()) {
                return qVarP;
            }
            return I.d.a(this.f164971i.b() ? C17499a0.j(this.f164966d, null) : I.n.p(null)).e(new I.a() { // from class: v.e0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17499a0.d.a(this.f165055a, i10, (TotalCaptureResult) obj);
                }
            }, this.f164964b).e(new I.a() { // from class: v.f0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17499a0.d.d(this.f165059a, (Boolean) obj);
                }
            }, this.f164964b);
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f164961j = timeUnit.toNanos(1L);
            f164962k = timeUnit.toNanos(5L);
        }

        private void g(i.a aVar) {
            C17296a.C2582a c2582a = new C17296a.C2582a();
            c2582a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c2582a.c());
        }

        private void h(i.a aVar, androidx.camera.core.impl.i iVar) {
            int i10 = (this.f164963a != 3 || this.f164968f) ? (iVar.k() == -1 || iVar.k() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.u(i10);
            }
        }

        private void l(long j10) {
            this.f164969g = j10;
        }

        void f(e eVar) {
            this.f164970h.add(eVar);
        }

        public void j() {
            this.f164971i.c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public com.google.common.util.concurrent.q<List<Void>> m(List<androidx.camera.core.impl.i> list, int i10) {
            androidx.camera.core.n nVarE;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (androidx.camera.core.impl.i iVar : list) {
                final i.a aVarK = i.a.k(iVar);
                F.r rVarA = (iVar.k() != 5 || this.f164966d.J().g() || this.f164966d.J().b() || (nVarE = this.f164966d.J().e()) == null || !this.f164966d.J().f(nVarE)) ? null : C3283s.a(nVarE.S2());
                if (rVarA != null) {
                    aVarK.o(rVarA);
                } else {
                    h(aVarK, iVar);
                }
                if (this.f164967e.c(i10)) {
                    g(aVarK);
                }
                arrayList.add(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.d0
                    @Override // androidx.concurrent.futures.c.InterfaceC1101c
                    public final Object a(c.a aVar) {
                        return C17499a0.d.e(this.f165049a, aVarK, aVar);
                    }
                }));
                arrayList2.add(aVarK.h());
            }
            this.f164966d.X(arrayList2);
            return I.n.k(arrayList);
        }

        d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, C17557u c17557u, boolean z10, C18398o c18398o) {
            this.f164963a = i10;
            this.f164964b = executor;
            this.f164965c = scheduledExecutorService;
            this.f164966d = c17557u;
            this.f164968f = z10;
            this.f164967e = c18398o;
        }

        public static /* synthetic */ com.google.common.util.concurrent.q a(d dVar, int i10, TotalCaptureResult totalCaptureResult) {
            dVar.getClass();
            if (C17499a0.e(i10, totalCaptureResult)) {
                dVar.l(f164962k);
            }
            return dVar.f164971i.a(totalCaptureResult);
        }

        public static /* synthetic */ com.google.common.util.concurrent.q d(d dVar, Boolean bool) {
            dVar.getClass();
            if (Boolean.TRUE.equals(bool)) {
                return C17499a0.i(dVar.f164969g, dVar.f164965c, dVar.f164966d, new f.a() { // from class: v.g0
                    @Override // v.C17499a0.f.a
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        return C17499a0.d(totalCaptureResult, false);
                    }
                });
            }
            return I.n.p(null);
        }

        public static /* synthetic */ Object e(d dVar, i.a aVar, c.a aVar2) {
            dVar.getClass();
            aVar.c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        com.google.common.util.concurrent.q<List<Void>> i(final List<androidx.camera.core.impl.i> list, final int i10) {
            I.d dVarE = I.d.a(k(i10)).e(new I.a() { // from class: v.h0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return this.f165085a.m(list, i10);
                }
            }, this.f164964b);
            dVarE.addListener(new Runnable() { // from class: v.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165094a.j();
                }
            }, this.f164964b);
            return dVarE;
        }
    }

    /* renamed from: v.a0$e */
    interface e {
        com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* renamed from: v.a0$f */
    static class f implements C17557u.c {

        /* renamed from: a, reason: collision with root package name */
        private c.a<TotalCaptureResult> f164975a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.common.util.concurrent.q<TotalCaptureResult> f164976b = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.k0
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C17499a0.f.b(this.f165115a, aVar);
            }
        });

        /* renamed from: c, reason: collision with root package name */
        private final a f164977c;

        /* renamed from: v.a0$f$a */
        interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public static /* synthetic */ Object b(f fVar, c.a aVar) {
            fVar.f164975a = aVar;
            return "waitFor3AResult";
        }

        @Override // v.C17557u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f164977c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f164975a.c(totalCaptureResult);
            return true;
        }

        public com.google.common.util.concurrent.q<TotalCaptureResult> c() {
            return this.f164976b;
        }

        f(a aVar) {
            this.f164977c = aVar;
        }
    }

    /* renamed from: v.a0$g */
    static class g implements e {

        /* renamed from: f, reason: collision with root package name */
        private static final long f164978f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        private final C17557u f164979a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f164980b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f164981c;

        /* renamed from: d, reason: collision with root package name */
        private final H.i f164982d;

        /* renamed from: e, reason: collision with root package name */
        private final C18382B f164983e;

        @Override // v.C17499a0.e
        public boolean b() {
            return false;
        }

        public static /* synthetic */ void k(c.a aVar) {
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, c.a aVar) {
            if (!gVar.f164983e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f164979a.w(true);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final c.a aVar) {
            atomicReference.set(new H.j() { // from class: v.p0
                @Override // C.H.j
                public final void a() {
                    C17499a0.g.k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        @Override // v.C17499a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final com.google.common.util.concurrent.q qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.r0
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return C17499a0.g.n(atomicReference, aVar);
                }
            });
            return I.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.s0
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return C17499a0.g.j(this.f165161a, atomicReference, aVar);
                }
            })).e(new I.a() { // from class: v.t0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return this.f165193a.f164979a.y().n(true);
                }
            }, this.f164980b).e(new I.a() { // from class: v.u0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17499a0.g.h(this.f165223a, (Void) obj);
                }
            }, this.f164980b).e(new I.a() { // from class: v.v0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17499a0.g.p(this.f165228a, qVarA, obj);
                }
            }, this.f164980b).e(new I.a() { // from class: v.w0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return this.f165239a.f164979a.y().x();
                }
            }, this.f164980b).e(new I.a() { // from class: v.x0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    C17499a0.g gVar = this.f165242a;
                    return C17499a0.i(C17499a0.g.f164978f, gVar.f164981c, gVar.f164979a, new C17499a0.f.a() { // from class: v.o0
                        @Override // v.C17499a0.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            return C17499a0.d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.f164980b).d(new InterfaceC16578a() { // from class: v.y0
                @Override // q.InterfaceC16578a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, H.a.a());
        }

        @Override // v.C17499a0.e
        public void c() {
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f164983e.a()) {
                this.f164979a.w(false);
            }
            this.f164979a.y().n(false).addListener(new Runnable() { // from class: v.l0
                @Override // java.lang.Runnable
                public final void run() {
                    FS.log_d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.f164980b);
            this.f164979a.y().h(false, true);
            ScheduledExecutorService scheduledExecutorServiceD = H.a.d();
            final H.i iVar = this.f164982d;
            Objects.requireNonNull(iVar);
            scheduledExecutorServiceD.execute(new Runnable() { // from class: v.q0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.clear();
                }
            });
        }

        g(C17557u c17557u, Executor executor, ScheduledExecutorService scheduledExecutorService, C18382B c18382b) {
            this.f164979a = c17557u;
            this.f164980b = executor;
            this.f164981c = scheduledExecutorService;
            this.f164983e = c18382b;
            H.i iVarZ = c17557u.z();
            Objects.requireNonNull(iVarZ);
            this.f164982d = iVarZ;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, c.a aVar) {
            gVar.getClass();
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f164982d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (H.j) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ com.google.common.util.concurrent.q h(final g gVar, Void r12) {
            gVar.getClass();
            return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.m0
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return C17499a0.g.l(this.f165129a, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final c.a aVar) {
            gVar.getClass();
            H.a.d().execute(new Runnable() { // from class: v.n0
                @Override // java.lang.Runnable
                public final void run() {
                    C17499a0.g.d(this.f165134a, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ com.google.common.util.concurrent.q p(g gVar, com.google.common.util.concurrent.q qVar, Object obj) {
            gVar.getClass();
            return I.n.r(TimeUnit.SECONDS.toMillis(3L), gVar.f164981c, null, true, qVar);
        }
    }

    /* renamed from: v.a0$h */
    static class h implements e {

        /* renamed from: g, reason: collision with root package name */
        private static final long f164984g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        private final C17557u f164985a;

        /* renamed from: b, reason: collision with root package name */
        private final int f164986b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f164987c = false;

        /* renamed from: d, reason: collision with root package name */
        private final Executor f164988d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f164989e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f164990f;

        public static /* synthetic */ com.google.common.util.concurrent.q d(h hVar, Void r12) {
            return hVar.f164990f ? hVar.f164985a.y().x() : I.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, c.a aVar) {
            hVar.f164985a.G().b(aVar, true);
            return "TorchOn";
        }

        @Override // v.C17499a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C.P.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C17499a0.e(this.f164986b, totalCaptureResult));
            if (C17499a0.e(this.f164986b, totalCaptureResult)) {
                if (!this.f164985a.P()) {
                    C.P.a("Camera2CapturePipeline", "Turn on torch");
                    this.f164987c = true;
                    return I.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.z0
                        @Override // androidx.concurrent.futures.c.InterfaceC1101c
                        public final Object a(c.a aVar) {
                            return C17499a0.h.e(this.f165262a, aVar);
                        }
                    })).e(new I.a() { // from class: v.A0
                        @Override // I.a
                        public final com.google.common.util.concurrent.q apply(Object obj) {
                            return C17499a0.h.d(this.f164657a, (Void) obj);
                        }
                    }, this.f164988d).e(new I.a() { // from class: v.B0
                        @Override // I.a
                        public final com.google.common.util.concurrent.q apply(Object obj) {
                            C17499a0.h hVar = this.f164663a;
                            return C17499a0.i(C17499a0.h.f164984g, hVar.f164989e, hVar.f164985a, new C17499a0.f.a() { // from class: v.D0
                                @Override // v.C17499a0.f.a
                                public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                    return C17499a0.d(totalCaptureResult2, true);
                                }
                            });
                        }
                    }, this.f164988d).d(new InterfaceC16578a() { // from class: v.C0
                        @Override // q.InterfaceC16578a
                        public final Object apply(Object obj) {
                            return Boolean.FALSE;
                        }
                    }, H.a.a());
                }
                C.P.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return I.n.p(Boolean.FALSE);
        }

        @Override // v.C17499a0.e
        public boolean b() {
            return this.f164986b == 0;
        }

        @Override // v.C17499a0.e
        public void c() {
            if (this.f164987c) {
                this.f164985a.G().b(null, false);
                C.P.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f164990f) {
                    this.f164985a.y().h(false, true);
                }
            }
        }

        h(C17557u c17557u, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f164985a = c17557u;
            this.f164986b = i10;
            this.f164988d = executor;
            this.f164989e = scheduledExecutorService;
            this.f164990f = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return F.H.a(new C17516g(totalCaptureResult), z10);
    }

    static boolean e(int i10, TotalCaptureResult totalCaptureResult) {
        C.P.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                if (i10 != 3) {
                    throw new AssertionError(i10);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        C.P.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean f(int i10) {
        return this.f164945b.a() || this.f164951h == 3 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.common.util.concurrent.q<TotalCaptureResult> i(long j10, ScheduledExecutorService scheduledExecutorService, C17557u c17557u, f.a aVar) {
        return I.n.r(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, j(c17557u, aVar));
    }

    static com.google.common.util.concurrent.q<TotalCaptureResult> j(final C17557u c17557u, f.a aVar) {
        final f fVar = new f(aVar);
        c17557u.t(fVar);
        com.google.common.util.concurrent.q<TotalCaptureResult> qVarC = fVar.c();
        qVarC.addListener(new Runnable() { // from class: v.W
            @Override // java.lang.Runnable
            public final void run() {
                c17557u.Q(fVar);
            }
        }, c17557u.f165195c);
        return qVarC;
    }

    d b(int i10, int i11, int i12) {
        int i13;
        C18398o c18398o = new C18398o(this.f164947d);
        d dVar = new d(this.f164951h, this.f164948e, this.f164949f, this.f164944a, this.f164950g, c18398o);
        if (i10 == 0) {
            dVar.f(new b(this.f164944a));
        }
        if (i11 != 3) {
            if (this.f164946c) {
                if (f(i12)) {
                    i13 = i11;
                    dVar.f(new h(this.f164944a, i13, this.f164948e, this.f164949f, (this.f164945b.a() || this.f164944a.M()) ? false : true));
                } else {
                    i13 = i11;
                    dVar.f(new a(this.f164944a, i13, c18398o));
                }
            }
            C.P.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f164970h);
            return dVar;
        }
        dVar.f(new g(this.f164944a, this.f164948e, this.f164949f, new C18382B(this.f164947d)));
        i13 = i11;
        C.P.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f164970h);
        return dVar;
    }

    InterfaceC3170j c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f164948e, i11);
    }

    public void g(int i10) {
        this.f164951h = i10;
    }

    C17499a0(C17557u c17557u, w.B b10, F.l0 l0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f164944a = c17557u;
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f164950g = num != null && num.intValue() == 2;
        this.f164948e = executor;
        this.f164949f = scheduledExecutorService;
        this.f164947d = l0Var;
        this.f164945b = new C18383C(l0Var);
        this.f164946c = C18390g.a(new X(b10));
    }

    public com.google.common.util.concurrent.q<List<Void>> h(List<androidx.camera.core.impl.i> list, int i10, int i11, int i12) {
        return I.n.s(b(i10, i11, i12).i(list, i11));
    }
}
