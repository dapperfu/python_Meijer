package v;

import C.H;
import E.InterfaceC3408j;
import F.AbstractC3611h;
import F.C3613j;
import F.C3621s;
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
import q.InterfaceC16423a;
import u.C17169a;
import v.C17360a0;
import v.C17418u;
import z.C18319B;
import z.C18320C;
import z.C18327g;
import z.C18335o;

/* renamed from: v.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17360a0 {

    /* renamed from: a, reason: collision with root package name */
    private final C17418u f163910a;

    /* renamed from: b, reason: collision with root package name */
    private final C18320C f163911b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f163912c;

    /* renamed from: d, reason: collision with root package name */
    private final F.l0 f163913d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f163914e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f163915f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f163916g;

    /* renamed from: h, reason: collision with root package name */
    private int f163917h = 1;

    /* renamed from: v.a0$a */
    static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C17418u f163918a;

        /* renamed from: b, reason: collision with root package name */
        private final C18335o f163919b;

        /* renamed from: c, reason: collision with root package name */
        private final int f163920c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f163921d = false;

        public static /* synthetic */ Object e(a aVar, c.a aVar2) {
            aVar.f163918a.y().y(aVar2);
            aVar.f163919b.b();
            return "AePreCapture";
        }

        @Override // v.C17360a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!C17360a0.e(this.f163920c, totalCaptureResult)) {
                return I.n.p(Boolean.FALSE);
            }
            C.P.a("Camera2CapturePipeline", "Trigger AE");
            this.f163921d = true;
            return I.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.Y
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar) {
                    return C17360a0.a.e(this.f163903a, aVar);
                }
            })).d(new InterfaceC16423a() { // from class: v.Z
                @Override // q.InterfaceC16423a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, H.a.a());
        }

        @Override // v.C17360a0.e
        public boolean b() {
            return this.f163920c == 0;
        }

        @Override // v.C17360a0.e
        public void c() {
            if (this.f163921d) {
                C.P.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f163918a.y().h(false, true);
                this.f163919b.a();
            }
        }

        a(C17418u c17418u, int i10, C18335o c18335o) {
            this.f163918a = c17418u;
            this.f163920c = i10;
            this.f163919b = c18335o;
        }
    }

    /* renamed from: v.a0$b */
    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C17418u f163922a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f163923b = false;

        @Override // v.C17360a0.e
        public boolean b() {
            return true;
        }

        @Override // v.C17360a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            com.google.common.util.concurrent.q<Boolean> qVarP = I.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                C.P.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C.P.a("Camera2CapturePipeline", "Trigger AF");
                    this.f163923b = true;
                    this.f163922a.y().z(null, false);
                }
            }
            return qVarP;
        }

        @Override // v.C17360a0.e
        public void c() {
            if (this.f163923b) {
                C.P.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f163922a.y().h(true, false);
            }
        }

        b(C17418u c17418u) {
            this.f163922a = c17418u;
        }
    }

    /* renamed from: v.a0$c */
    static class c implements InterfaceC3408j {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f163924a;

        /* renamed from: b, reason: collision with root package name */
        private final d f163925b;

        /* renamed from: c, reason: collision with root package name */
        private int f163926c;

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        public static /* synthetic */ Object c(c cVar, c.a aVar) {
            cVar.f163925b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        @Override // E.InterfaceC3408j
        public com.google.common.util.concurrent.q<Void> a() {
            C.P.a("Camera2CapturePipeline", "invokePreCapture");
            return I.d.a(this.f163925b.k(this.f163926c)).d(new InterfaceC16423a() { // from class: v.c0
                @Override // q.InterfaceC16423a
                public final Object apply(Object obj) {
                    return C17360a0.c.d((TotalCaptureResult) obj);
                }
            }, this.f163924a);
        }

        @Override // E.InterfaceC3408j
        public com.google.common.util.concurrent.q<Void> b() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.b0
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar) {
                    return C17360a0.c.c(this.f163966a, aVar);
                }
            });
        }

        c(d dVar, Executor executor, int i10) {
            this.f163925b = dVar;
            this.f163924a = executor;
            this.f163926c = i10;
        }
    }

    /* renamed from: v.a0$d */
    static class d {

        /* renamed from: j, reason: collision with root package name */
        private static final long f163927j;

        /* renamed from: k, reason: collision with root package name */
        private static final long f163928k;

        /* renamed from: a, reason: collision with root package name */
        private final int f163929a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f163930b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f163931c;

        /* renamed from: d, reason: collision with root package name */
        private final C17418u f163932d;

        /* renamed from: e, reason: collision with root package name */
        private final C18335o f163933e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f163934f;

        /* renamed from: g, reason: collision with root package name */
        private long f163935g = f163927j;

        /* renamed from: h, reason: collision with root package name */
        final List<e> f163936h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        private final e f163937i = new a();

        /* renamed from: v.a0$d$a */
        class a implements e {
            a() {
            }

            @Override // v.C17360a0.e
            public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<e> it = d.this.f163936h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return I.n.x(I.n.k(arrayList), new InterfaceC16423a() { // from class: v.j0
                    @Override // q.InterfaceC16423a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, H.a.a());
            }

            @Override // v.C17360a0.e
            public boolean b() {
                Iterator<e> it = d.this.f163936h.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // v.C17360a0.e
            public void c() {
                Iterator<e> it = d.this.f163936h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        /* renamed from: v.a0$d$b */
        class b extends AbstractC3611h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f163939a;

            b(c.a aVar) {
                this.f163939a = aVar;
            }

            @Override // F.AbstractC3611h
            public void a(int i10) {
                this.f163939a.f(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // F.AbstractC3611h
            public void b(int i10, F.r rVar) {
                this.f163939a.c(null);
            }

            @Override // F.AbstractC3611h
            public void c(int i10, C3613j c3613j) {
                this.f163939a.f(new ImageCaptureException(2, "Capture request failed with reason " + c3613j.a(), null));
            }
        }

        public com.google.common.util.concurrent.q<TotalCaptureResult> k(final int i10) {
            com.google.common.util.concurrent.q<TotalCaptureResult> qVarP = I.n.p(null);
            if (this.f163936h.isEmpty()) {
                return qVarP;
            }
            return I.d.a(this.f163937i.b() ? C17360a0.j(this.f163932d, null) : I.n.p(null)).e(new I.a() { // from class: v.e0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17360a0.d.a(this.f164021a, i10, (TotalCaptureResult) obj);
                }
            }, this.f163930b).e(new I.a() { // from class: v.f0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17360a0.d.d(this.f164025a, (Boolean) obj);
                }
            }, this.f163930b);
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f163927j = timeUnit.toNanos(1L);
            f163928k = timeUnit.toNanos(5L);
        }

        private void g(i.a aVar) {
            C17169a.C2558a c2558a = new C17169a.C2558a();
            c2558a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c2558a.c());
        }

        private void h(i.a aVar, androidx.camera.core.impl.i iVar) {
            int i10 = (this.f163929a != 3 || this.f163934f) ? (iVar.k() == -1 || iVar.k() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.u(i10);
            }
        }

        private void l(long j10) {
            this.f163935g = j10;
        }

        void f(e eVar) {
            this.f163936h.add(eVar);
        }

        public void j() {
            this.f163937i.c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public com.google.common.util.concurrent.q<List<Void>> m(List<androidx.camera.core.impl.i> list, int i10) {
            androidx.camera.core.n nVarE;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (androidx.camera.core.impl.i iVar : list) {
                final i.a aVarK = i.a.k(iVar);
                F.r rVarA = (iVar.k() != 5 || this.f163932d.J().g() || this.f163932d.J().b() || (nVarE = this.f163932d.J().e()) == null || !this.f163932d.J().f(nVarE)) ? null : C3621s.a(nVarE.S2());
                if (rVarA != null) {
                    aVarK.o(rVarA);
                } else {
                    h(aVarK, iVar);
                }
                if (this.f163933e.c(i10)) {
                    g(aVarK);
                }
                arrayList.add(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.d0
                    @Override // androidx.concurrent.futures.c.InterfaceC1088c
                    public final Object a(c.a aVar) {
                        return C17360a0.d.e(this.f164015a, aVarK, aVar);
                    }
                }));
                arrayList2.add(aVarK.h());
            }
            this.f163932d.X(arrayList2);
            return I.n.k(arrayList);
        }

        d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, C17418u c17418u, boolean z10, C18335o c18335o) {
            this.f163929a = i10;
            this.f163930b = executor;
            this.f163931c = scheduledExecutorService;
            this.f163932d = c17418u;
            this.f163934f = z10;
            this.f163933e = c18335o;
        }

        public static /* synthetic */ com.google.common.util.concurrent.q a(d dVar, int i10, TotalCaptureResult totalCaptureResult) {
            dVar.getClass();
            if (C17360a0.e(i10, totalCaptureResult)) {
                dVar.l(f163928k);
            }
            return dVar.f163937i.a(totalCaptureResult);
        }

        public static /* synthetic */ com.google.common.util.concurrent.q d(d dVar, Boolean bool) {
            dVar.getClass();
            if (Boolean.TRUE.equals(bool)) {
                return C17360a0.i(dVar.f163935g, dVar.f163931c, dVar.f163932d, new f.a() { // from class: v.g0
                    @Override // v.C17360a0.f.a
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        return C17360a0.d(totalCaptureResult, false);
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
                    return this.f164051a.m(list, i10);
                }
            }, this.f163930b);
            dVarE.addListener(new Runnable() { // from class: v.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164060a.j();
                }
            }, this.f163930b);
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
    static class f implements C17418u.c {

        /* renamed from: a, reason: collision with root package name */
        private c.a<TotalCaptureResult> f163941a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.common.util.concurrent.q<TotalCaptureResult> f163942b = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.k0
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C17360a0.f.b(this.f164081a, aVar);
            }
        });

        /* renamed from: c, reason: collision with root package name */
        private final a f163943c;

        /* renamed from: v.a0$f$a */
        interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public static /* synthetic */ Object b(f fVar, c.a aVar) {
            fVar.f163941a = aVar;
            return "waitFor3AResult";
        }

        @Override // v.C17418u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f163943c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f163941a.c(totalCaptureResult);
            return true;
        }

        public com.google.common.util.concurrent.q<TotalCaptureResult> c() {
            return this.f163942b;
        }

        f(a aVar) {
            this.f163943c = aVar;
        }
    }

    /* renamed from: v.a0$g */
    static class g implements e {

        /* renamed from: f, reason: collision with root package name */
        private static final long f163944f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        private final C17418u f163945a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f163946b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f163947c;

        /* renamed from: d, reason: collision with root package name */
        private final H.i f163948d;

        /* renamed from: e, reason: collision with root package name */
        private final C18319B f163949e;

        @Override // v.C17360a0.e
        public boolean b() {
            return false;
        }

        public static /* synthetic */ void k(c.a aVar) {
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, c.a aVar) {
            if (!gVar.f163949e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f163945a.w(true);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final c.a aVar) {
            atomicReference.set(new H.j() { // from class: v.p0
                @Override // C.H.j
                public final void a() {
                    C17360a0.g.k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        @Override // v.C17360a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final com.google.common.util.concurrent.q qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.r0
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar) {
                    return C17360a0.g.n(atomicReference, aVar);
                }
            });
            return I.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.s0
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar) {
                    return C17360a0.g.j(this.f164127a, atomicReference, aVar);
                }
            })).e(new I.a() { // from class: v.t0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return this.f164159a.f163945a.y().n(true);
                }
            }, this.f163946b).e(new I.a() { // from class: v.u0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17360a0.g.h(this.f164189a, (Void) obj);
                }
            }, this.f163946b).e(new I.a() { // from class: v.v0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return C17360a0.g.p(this.f164194a, qVarA, obj);
                }
            }, this.f163946b).e(new I.a() { // from class: v.w0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    return this.f164205a.f163945a.y().x();
                }
            }, this.f163946b).e(new I.a() { // from class: v.x0
                @Override // I.a
                public final com.google.common.util.concurrent.q apply(Object obj) {
                    C17360a0.g gVar = this.f164208a;
                    return C17360a0.i(C17360a0.g.f163944f, gVar.f163947c, gVar.f163945a, new C17360a0.f.a() { // from class: v.o0
                        @Override // v.C17360a0.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            return C17360a0.d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.f163946b).d(new InterfaceC16423a() { // from class: v.y0
                @Override // q.InterfaceC16423a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, H.a.a());
        }

        @Override // v.C17360a0.e
        public void c() {
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f163949e.a()) {
                this.f163945a.w(false);
            }
            this.f163945a.y().n(false).addListener(new Runnable() { // from class: v.l0
                @Override // java.lang.Runnable
                public final void run() {
                    FS.log_d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.f163946b);
            this.f163945a.y().h(false, true);
            ScheduledExecutorService scheduledExecutorServiceD = H.a.d();
            final H.i iVar = this.f163948d;
            Objects.requireNonNull(iVar);
            scheduledExecutorServiceD.execute(new Runnable() { // from class: v.q0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.clear();
                }
            });
        }

        g(C17418u c17418u, Executor executor, ScheduledExecutorService scheduledExecutorService, C18319B c18319b) {
            this.f163945a = c17418u;
            this.f163946b = executor;
            this.f163947c = scheduledExecutorService;
            this.f163949e = c18319b;
            H.i iVarZ = c17418u.z();
            Objects.requireNonNull(iVarZ);
            this.f163948d = iVarZ;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, c.a aVar) {
            gVar.getClass();
            C.P.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f163948d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (H.j) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ com.google.common.util.concurrent.q h(final g gVar, Void r12) {
            gVar.getClass();
            return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.m0
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar) {
                    return C17360a0.g.l(this.f164095a, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final c.a aVar) {
            gVar.getClass();
            H.a.d().execute(new Runnable() { // from class: v.n0
                @Override // java.lang.Runnable
                public final void run() {
                    C17360a0.g.d(this.f164100a, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ com.google.common.util.concurrent.q p(g gVar, com.google.common.util.concurrent.q qVar, Object obj) {
            gVar.getClass();
            return I.n.r(TimeUnit.SECONDS.toMillis(3L), gVar.f163947c, null, true, qVar);
        }
    }

    /* renamed from: v.a0$h */
    static class h implements e {

        /* renamed from: g, reason: collision with root package name */
        private static final long f163950g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        private final C17418u f163951a;

        /* renamed from: b, reason: collision with root package name */
        private final int f163952b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f163953c = false;

        /* renamed from: d, reason: collision with root package name */
        private final Executor f163954d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f163955e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f163956f;

        public static /* synthetic */ com.google.common.util.concurrent.q d(h hVar, Void r12) {
            return hVar.f163956f ? hVar.f163951a.y().x() : I.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, c.a aVar) {
            hVar.f163951a.G().b(aVar, true);
            return "TorchOn";
        }

        @Override // v.C17360a0.e
        public com.google.common.util.concurrent.q<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C.P.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C17360a0.e(this.f163952b, totalCaptureResult));
            if (C17360a0.e(this.f163952b, totalCaptureResult)) {
                if (!this.f163951a.P()) {
                    C.P.a("Camera2CapturePipeline", "Turn on torch");
                    this.f163953c = true;
                    return I.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.z0
                        @Override // androidx.concurrent.futures.c.InterfaceC1088c
                        public final Object a(c.a aVar) {
                            return C17360a0.h.e(this.f164228a, aVar);
                        }
                    })).e(new I.a() { // from class: v.A0
                        @Override // I.a
                        public final com.google.common.util.concurrent.q apply(Object obj) {
                            return C17360a0.h.d(this.f163623a, (Void) obj);
                        }
                    }, this.f163954d).e(new I.a() { // from class: v.B0
                        @Override // I.a
                        public final com.google.common.util.concurrent.q apply(Object obj) {
                            C17360a0.h hVar = this.f163629a;
                            return C17360a0.i(C17360a0.h.f163950g, hVar.f163955e, hVar.f163951a, new C17360a0.f.a() { // from class: v.D0
                                @Override // v.C17360a0.f.a
                                public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                    return C17360a0.d(totalCaptureResult2, true);
                                }
                            });
                        }
                    }, this.f163954d).d(new InterfaceC16423a() { // from class: v.C0
                        @Override // q.InterfaceC16423a
                        public final Object apply(Object obj) {
                            return Boolean.FALSE;
                        }
                    }, H.a.a());
                }
                C.P.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return I.n.p(Boolean.FALSE);
        }

        @Override // v.C17360a0.e
        public boolean b() {
            return this.f163952b == 0;
        }

        @Override // v.C17360a0.e
        public void c() {
            if (this.f163953c) {
                this.f163951a.G().b(null, false);
                C.P.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f163956f) {
                    this.f163951a.y().h(false, true);
                }
            }
        }

        h(C17418u c17418u, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f163951a = c17418u;
            this.f163952b = i10;
            this.f163954d = executor;
            this.f163955e = scheduledExecutorService;
            this.f163956f = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return F.H.a(new C17377g(totalCaptureResult), z10);
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
        return this.f163911b.a() || this.f163917h == 3 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.common.util.concurrent.q<TotalCaptureResult> i(long j10, ScheduledExecutorService scheduledExecutorService, C17418u c17418u, f.a aVar) {
        return I.n.r(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, j(c17418u, aVar));
    }

    static com.google.common.util.concurrent.q<TotalCaptureResult> j(final C17418u c17418u, f.a aVar) {
        final f fVar = new f(aVar);
        c17418u.t(fVar);
        com.google.common.util.concurrent.q<TotalCaptureResult> qVarC = fVar.c();
        qVarC.addListener(new Runnable() { // from class: v.W
            @Override // java.lang.Runnable
            public final void run() {
                c17418u.Q(fVar);
            }
        }, c17418u.f164161c);
        return qVarC;
    }

    d b(int i10, int i11, int i12) {
        int i13;
        C18335o c18335o = new C18335o(this.f163913d);
        d dVar = new d(this.f163917h, this.f163914e, this.f163915f, this.f163910a, this.f163916g, c18335o);
        if (i10 == 0) {
            dVar.f(new b(this.f163910a));
        }
        if (i11 != 3) {
            if (this.f163912c) {
                if (f(i12)) {
                    i13 = i11;
                    dVar.f(new h(this.f163910a, i13, this.f163914e, this.f163915f, (this.f163911b.a() || this.f163910a.M()) ? false : true));
                } else {
                    i13 = i11;
                    dVar.f(new a(this.f163910a, i13, c18335o));
                }
            }
            C.P.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f163936h);
            return dVar;
        }
        dVar.f(new g(this.f163910a, this.f163914e, this.f163915f, new C18319B(this.f163913d)));
        i13 = i11;
        C.P.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f163936h);
        return dVar;
    }

    InterfaceC3408j c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f163914e, i11);
    }

    public void g(int i10) {
        this.f163917h = i10;
    }

    C17360a0(C17418u c17418u, w.B b10, F.l0 l0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f163910a = c17418u;
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f163916g = num != null && num.intValue() == 2;
        this.f163914e = executor;
        this.f163915f = scheduledExecutorService;
        this.f163913d = l0Var;
        this.f163911b = new C18320C(l0Var);
        this.f163912c = C18327g.a(new X(b10));
    }

    public com.google.common.util.concurrent.q<List<Void>> h(List<androidx.camera.core.impl.i> list, int i10, int i11, int i12) {
        return I.n.s(b(i10, i11, i12).i(list, i11));
    }
}
