package v;

import C.AbstractC3031p;
import F.C3286v;
import F.E;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AbstractC5792a;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.w;
import androidx.concurrent.futures.c;
import io.constructor.data.local.PreferencesHelper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import v.C17571y1;
import v.J1;
import v.M;
import w.C17740a;

/* loaded from: classes.dex */
final class M implements InterfaceC3290z {

    /* renamed from: A, reason: collision with root package name */
    private C17571y1 f164777A;

    /* renamed from: B, reason: collision with root package name */
    private final C17518g1 f164778B;

    /* renamed from: C, reason: collision with root package name */
    private final J1.b f164779C;

    /* renamed from: D, reason: collision with root package name */
    private final Set<String> f164780D;

    /* renamed from: E, reason: collision with root package name */
    private androidx.camera.core.impl.f f164781E;

    /* renamed from: F, reason: collision with root package name */
    final Object f164782F;

    /* renamed from: G, reason: collision with root package name */
    private F.r0 f164783G;

    /* renamed from: H, reason: collision with root package name */
    boolean f164784H;

    /* renamed from: I, reason: collision with root package name */
    private final C17524i1 f164785I;

    /* renamed from: J, reason: collision with root package name */
    private final w.B f164786J;

    /* renamed from: K, reason: collision with root package name */
    private final x.g f164787K;

    /* renamed from: L, reason: collision with root package name */
    private final I1 f164788L;

    /* renamed from: M, reason: collision with root package name */
    private final h f164789M;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.C f164790a;

    /* renamed from: b, reason: collision with root package name */
    private final w.O f164791b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f164792c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f164793d;

    /* renamed from: e, reason: collision with root package name */
    volatile i f164794e = i.INITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    private final F.Y<InterfaceC3290z.a> f164795f;

    /* renamed from: g, reason: collision with root package name */
    private final Q0 f164796g;

    /* renamed from: h, reason: collision with root package name */
    private final C17557u f164797h;

    /* renamed from: i, reason: collision with root package name */
    private final j f164798i;

    /* renamed from: j, reason: collision with root package name */
    final T f164799j;

    /* renamed from: k, reason: collision with root package name */
    CameraDevice f164800k;

    /* renamed from: l, reason: collision with root package name */
    int f164801l;

    /* renamed from: m, reason: collision with root package name */
    InterfaceC17509d1 f164802m;

    /* renamed from: n, reason: collision with root package name */
    final AtomicInteger f164803n;

    /* renamed from: o, reason: collision with root package name */
    c.a<Void> f164804o;

    /* renamed from: p, reason: collision with root package name */
    final Map<InterfaceC17509d1, com.google.common.util.concurrent.q<Void>> f164805p;

    /* renamed from: q, reason: collision with root package name */
    private int f164806q;

    /* renamed from: r, reason: collision with root package name */
    final e f164807r;

    /* renamed from: s, reason: collision with root package name */
    final f f164808s;

    /* renamed from: t, reason: collision with root package name */
    final D.a f164809t;

    /* renamed from: u, reason: collision with root package name */
    final F.E f164810u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f164811v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f164812w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f164813x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f164814y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f164815z;

    class a implements InterfaceC17513f {
        a() {
        }

        @Override // v.InterfaceC17513f
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // v.InterfaceC17513f
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f164817a;

        b(c.a aVar) {
            this.f164817a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            M.this.T("openCameraConfigAndClose camera closed");
            this.f164817a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            M.this.T("openCameraConfigAndClose camera disconnected");
            this.f164817a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            M.this.T("openCameraConfigAndClose camera error " + i10);
            this.f164817a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            M.this.T("openCameraConfigAndClose camera opened");
            com.google.common.util.concurrent.q qVarQ = M.this.Q(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            qVarQ.addListener(new Runnable() { // from class: v.N
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, M.this.f164792c);
        }
    }

    class c implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17509d1 f164819a;

        @Override // I.c
        public void onFailure(Throwable th2) {
        }

        c(InterfaceC17509d1 interfaceC17509d1) {
            this.f164819a = interfaceC17509d1;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            M.this.f164805p.remove(this.f164819a);
            int iOrdinal = M.this.f164794e.ordinal();
            if (iOrdinal != 1 && iOrdinal != 4) {
                if (iOrdinal != 5 && (iOrdinal != 6 || M.this.f164801l == 0)) {
                    return;
                } else {
                    M.this.T("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (M.this.d0()) {
                M m10 = M.this;
                if (m10.f164800k != null) {
                    m10.T("closing camera");
                    C17740a.a(M.this.f164800k);
                    M.this.f164800k = null;
                }
            }
        }
    }

    class d implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17509d1 f164821a;

        d(InterfaceC17509d1 interfaceC17509d1) {
            this.f164821a = interfaceC17509d1;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (M.this.f164809t.c() == 2 && M.this.f164794e == i.OPENED) {
                M.this.r0(i.CONFIGURED);
            }
        }

        @Override // I.c
        public void onFailure(Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                androidx.camera.core.impl.w wVarV = M.this.V(((DeferrableSurface.SurfaceClosedException) th2).a());
                if (wVarV != null) {
                    M.this.m0(wVarV);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                M.this.T("Unable to configure camera cancelled");
                return;
            }
            i iVar = M.this.f164794e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                M.this.s0(iVar2, AbstractC3031p.a.b(4, th2));
            }
            C.P.d("Camera2CameraImpl", "Unable to configure camera " + M.this, th2);
            M m10 = M.this;
            if (m10.f164802m == this.f164821a) {
                m10.p0(false);
            }
        }
    }

    final class e extends CameraManager.AvailabilityCallback implements E.c {

        /* renamed from: a, reason: collision with root package name */
        private final String f164823a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f164824b = true;

        e(String str) {
            this.f164823a = str;
        }

        @Override // F.E.c
        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (M.this.f164794e == i.PENDING_OPEN) {
                M.this.A0(false);
            }
        }

        boolean b() {
            return this.f164824b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f164823a.equals(str)) {
                this.f164824b = true;
                if (M.this.f164794e == i.PENDING_OPEN) {
                    M.this.A0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f164823a.equals(str)) {
                this.f164824b = false;
            }
        }
    }

    final class f implements E.b {
        f() {
        }

        @Override // F.E.b
        public void a() {
            if (M.this.f164794e == i.OPENED) {
                M.this.k0();
            }
        }
    }

    final class g implements CameraControlInternal.c {
        g() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.c
        public void a() {
            M.this.B0();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.c
        public void b(List<androidx.camera.core.impl.i> list) {
            M.this.u0((List) o2.i.g(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h {

        /* renamed from: a, reason: collision with root package name */
        private a f164828a;

        /* JADX INFO: Access modifiers changed from: private */
        class a {

            /* renamed from: a, reason: collision with root package name */
            private final ScheduledFuture<?> f164830a;

            /* renamed from: b, reason: collision with root package name */
            private final AtomicBoolean f164831b = new AtomicBoolean(false);

            a() {
                this.f164830a = M.this.f164793d.schedule(new Runnable() { // from class: v.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f164865a.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d() {
                if (this.f164831b.getAndSet(true)) {
                    return;
                }
                M.this.f164792c.execute(new Runnable() { // from class: v.P
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        this.f164868a.e();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                if (M.this.f164794e == i.OPENING) {
                    M.this.T("Camera onError timeout, reopen it.");
                    M.this.r0(i.REOPENING);
                    M.this.f164798i.e();
                } else {
                    M.this.T("Camera skip reopen at state: " + M.this.f164794e);
                }
            }

            public void c() {
                this.f164831b.set(true);
                this.f164830a.cancel(true);
            }

            public boolean f() {
                return this.f164831b.get();
            }
        }

        private h() {
            this.f164828a = null;
        }

        public void a() {
            a aVar = this.f164828a;
            if (aVar != null) {
                aVar.c();
            }
            this.f164828a = null;
        }

        public void b() {
            M.this.T("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f164828a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (M.this.f164794e != i.OPENING) {
                M.this.T("Don't need the onError timeout handler.");
                return;
            }
            M.this.T("Camera waiting for onError.");
            a();
            this.f164828a = new a();
        }

        /* synthetic */ h(M m10, a aVar) {
            this();
        }
    }

    enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    final class j extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f164844a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f164845b;

        /* renamed from: c, reason: collision with root package name */
        private b f164846c;

        /* renamed from: d, reason: collision with root package name */
        ScheduledFuture<?> f164847d;

        /* renamed from: e, reason: collision with root package name */
        private final a f164848e;

        class a {

            /* renamed from: a, reason: collision with root package name */
            private final long f164850a;

            /* renamed from: b, reason: collision with root package name */
            private long f164851b = -1;

            a(long j10) {
                this.f164850a = j10;
            }

            int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                return jB <= 300000 ? 2000 : 4000;
            }

            int d() {
                if (j.this.f()) {
                    long j10 = this.f164850a;
                    return j10 > 0 ? Math.min((int) j10, PreferencesHelper.SESSION_TIME_THRESHOLD) : PreferencesHelper.SESSION_TIME_THRESHOLD;
                }
                long j11 = this.f164850a;
                if (j11 > 0) {
                    return Math.min((int) j11, 10000);
                }
                return 10000;
            }

            void e() {
                this.f164851b = -1L;
            }

            boolean a() {
                if (b() >= d()) {
                    e();
                    return false;
                }
                return true;
            }

            long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f164851b == -1) {
                    this.f164851b = jUptimeMillis;
                }
                return jUptimeMillis - this.f164851b;
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private Executor f164853a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f164854b = false;

            void b() {
                this.f164854b = true;
            }

            b(Executor executor) {
                this.f164853a = executor;
            }

            public static /* synthetic */ void a(b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                if (bVar.f164854b) {
                    return;
                }
                o2.i.i(M.this.f164794e == i.REOPENING || M.this.f164794e == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    M.this.z0(true);
                } else {
                    M.this.A0(true);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f164853a.execute(new Runnable() { // from class: v.Q
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        M.j.b.a(this.f164885a);
                    }
                });
            }
        }

        j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f164844a = executor;
            this.f164845b = scheduledExecutorService;
            this.f164848e = new a(j10);
        }

        private void b(CameraDevice cameraDevice, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            o2.i.j(M.this.f164794e == i.OPENING || M.this.f164794e == i.OPENED || M.this.f164794e == i.CONFIGURED || M.this.f164794e == i.REOPENING || M.this.f164794e == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + M.this.f164794e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                C.P.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), M.Z(i10)));
                c(i10);
                return;
            }
            C.P.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + M.Z(i10) + " closing camera.");
            M.this.s0(i.CLOSING, AbstractC3031p.a.a(i10 == 3 ? 5 : 6));
            M.this.O(false);
        }

        private void c(int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int i11 = 1;
            o2.i.j(M.this.f164801l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            M.this.s0(i.REOPENING, AbstractC3031p.a.a(i11));
            M.this.O(false);
        }

        boolean a() {
            if (this.f164847d == null) {
                return false;
            }
            M.this.T("Cancelling scheduled re-open: " + this.f164846c);
            this.f164846c.b();
            this.f164846c = null;
            this.f164847d.cancel(false);
            this.f164847d = null;
            return true;
        }

        void d() {
            this.f164848e.e();
        }

        void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            o2.i.i(this.f164846c == null);
            o2.i.i(this.f164847d == null);
            if (!this.f164848e.a()) {
                C.P.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f164848e.d() + "ms without success.");
                M.this.t0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f164846c = new b(this.f164844a);
            M.this.T("Attempting camera re-open in " + this.f164848e.c() + "ms: " + this.f164846c + " activeResuming = " + M.this.f164784H);
            this.f164847d = this.f164845b.schedule(this.f164846c, (long) this.f164848e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            M m10 = M.this;
            if (!m10.f164784H) {
                return false;
            }
            int i10 = m10.f164801l;
            return i10 == 1 || i10 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            M.this.T("CameraDevice.onClosed()");
            o2.i.j(M.this.f164800k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = M.this.f164794e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                o2.i.i(M.this.d0());
                M.this.R();
                return;
            }
            if (iOrdinal != 5 && iOrdinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + M.this.f164794e);
            }
            M m10 = M.this;
            if (m10.f164801l == 0) {
                m10.A0(false);
                return;
            }
            m10.T("Camera closed due to error: " + M.Z(M.this.f164801l));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            M.this.T("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            M m10 = M.this;
            m10.f164800k = cameraDevice;
            m10.f164801l = i10;
            m10.f164789M.b();
            int iOrdinal = M.this.f164794e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        C.P.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), M.Z(i10), M.this.f164794e.name()));
                        b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + M.this.f164794e);
                }
            }
            C.P.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), M.Z(i10), M.this.f164794e.name()));
            M.this.O(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            M.this.T("CameraDevice.onOpened()");
            M m10 = M.this;
            m10.f164800k = cameraDevice;
            m10.f164801l = 0;
            d();
            int iOrdinal = M.this.f164794e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                o2.i.i(M.this.d0());
                M.this.f164800k.close();
                M.this.f164800k = null;
            } else {
                if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + M.this.f164794e);
                }
                M.this.r0(i.OPENED);
                F.E e10 = M.this.f164810u;
                String id2 = cameraDevice.getId();
                M m11 = M.this;
                if (e10.j(id2, m11.f164809t.a(m11.f164800k.getId()))) {
                    M.this.k0();
                }
            }
        }
    }

    static abstract class k {
        abstract List<E.b> c();

        abstract androidx.camera.core.impl.w d();

        abstract androidx.camera.core.impl.x e();

        abstract Size f();

        abstract androidx.camera.core.impl.D<?> g();

        abstract String h();

        abstract Class<?> i();

        static k a(String str, Class<?> cls, androidx.camera.core.impl.w wVar, androidx.camera.core.impl.D<?> d10, Size size, androidx.camera.core.impl.x xVar, List<E.b> list) {
            return new C17507d(str, cls, wVar, d10, size, xVar, list);
        }

        k() {
        }

        static k b(C.p0 p0Var, boolean z10) {
            androidx.camera.core.impl.w wVarU;
            String strB0 = M.b0(p0Var);
            Class<?> cls = p0Var.getClass();
            if (z10) {
                wVarU = p0Var.w();
            } else {
                wVarU = p0Var.u();
            }
            return a(strB0, cls, wVarU, p0Var.j(), p0Var.f(), p0Var.e(), M.Y(p0Var));
        }
    }

    public static /* synthetic */ void s(M m10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m10.f164814y = false;
        m10.f164813x = false;
        m10.T("OpenCameraConfigAndClose is done, state: " + m10.f164794e);
        int iOrdinal = m10.f164794e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 4) {
            o2.i.i(m10.d0());
            m10.W();
            return;
        }
        if (iOrdinal != 6) {
            m10.T("OpenCameraConfigAndClose finished while in state: " + m10.f164794e);
            return;
        }
        if (m10.f164801l == 0) {
            m10.A0(false);
            return;
        }
        m10.T("OpenCameraConfigAndClose in error: " + Z(m10.f164801l));
        m10.f164798i.e();
    }

    void T(String str) {
        U(str, null);
    }

    void r0(i iVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        s0(iVar, null);
    }

    void s0(i iVar, AbstractC3031p.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        t0(iVar, aVar, true);
    }

    M(Context context, w.O o10, String str, T t10, D.a aVar, F.E e10, Executor executor, Handler handler, C17524i1 c17524i1, long j10) throws CameraUnavailableException {
        F.Y<InterfaceC3290z.a> y10 = new F.Y<>();
        this.f164795f = y10;
        this.f164801l = 0;
        this.f164803n = new AtomicInteger(0);
        this.f164805p = new LinkedHashMap();
        this.f164806q = 0;
        this.f164813x = false;
        this.f164814y = false;
        this.f164815z = true;
        this.f164780D = new HashSet();
        this.f164781E = C3286v.a();
        this.f164782F = new Object();
        this.f164784H = false;
        this.f164789M = new h(this, null);
        this.f164791b = o10;
        this.f164809t = aVar;
        this.f164810u = e10;
        ScheduledExecutorService scheduledExecutorServiceE = H.a.e(handler);
        this.f164793d = scheduledExecutorServiceE;
        Executor executorF = H.a.f(executor);
        this.f164792c = executorF;
        this.f164798i = new j(executorF, scheduledExecutorServiceE, j10);
        this.f164790a = new androidx.camera.core.impl.C(str);
        y10.e(InterfaceC3290z.a.CLOSED);
        Q0 q02 = new Q0(e10);
        this.f164796g = q02;
        C17518g1 c17518g1 = new C17518g1(executorF);
        this.f164778B = c17518g1;
        this.f164785I = c17524i1;
        try {
            w.B bC = o10.c(str);
            this.f164786J = bC;
            C17557u c17557u = new C17557u(bC, scheduledExecutorServiceE, executorF, new g(), t10.d());
            this.f164797h = c17557u;
            this.f164799j = t10;
            t10.n(c17557u);
            t10.q(q02.a());
            this.f164787K = x.g.a(bC);
            this.f164802m = f0();
            this.f164779C = new J1.b(executorF, scheduledExecutorServiceE, handler, c17518g1, t10.d(), androidx.camera.camera2.internal.compat.quirk.b.c());
            this.f164811v = t10.d().a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f164812w = t10.d().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f164807r = eVar;
            f fVar = new f();
            this.f164808s = fVar;
            e10.g(this, executorF, fVar, eVar);
            o10.g(executorF, eVar);
            this.f164788L = new I1(context, str, o10, new a());
        } catch (CameraAccessExceptionCompat e11) {
            throw R0.a(e11);
        }
    }

    public static /* synthetic */ void B(M m10, c.a aVar) {
        C17571y1 c17571y1 = m10.f164777A;
        if (c17571y1 == null) {
            aVar.c(Boolean.FALSE);
        } else {
            aVar.c(Boolean.valueOf(m10.f164790a.o(a0(c17571y1))));
        }
    }

    private void C0() {
        Iterator<androidx.camera.core.impl.D<?>> it = this.f164790a.i().iterator();
        boolean zL = false;
        while (it.hasNext()) {
            zL |= it.next().L(false);
        }
        this.f164797h.W(zL);
    }

    private void L() {
        C17571y1 c17571y1 = this.f164777A;
        if (c17571y1 != null) {
            String strA0 = a0(c17571y1);
            androidx.camera.core.impl.C c10 = this.f164790a;
            androidx.camera.core.impl.w wVarH = this.f164777A.h();
            androidx.camera.core.impl.D<?> dI = this.f164777A.i();
            E.b bVar = E.b.METERING_REPEATING;
            c10.r(strA0, wVarH, dI, null, Collections.singletonList(bVar));
            this.f164790a.q(strA0, this.f164777A.h(), this.f164777A.i(), null, Collections.singletonList(bVar));
        }
    }

    private void M() {
        androidx.camera.core.impl.w wVarC = this.f164790a.g().c();
        androidx.camera.core.impl.i iVarK = wVarC.k();
        int size = iVarK.i().size();
        int size2 = wVarC.o().size();
        if (wVarC.o().isEmpty()) {
            return;
        }
        if (iVarK.i().isEmpty()) {
            if (this.f164777A == null) {
                this.f164777A = new C17571y1(this.f164799j.k(), this.f164785I, new C17571y1.c() { // from class: v.C
                    @Override // v.C17571y1.c
                    public final void a() {
                        M.A(this.f164665a);
                    }
                });
            }
            if (e0()) {
                L();
                return;
            } else {
                C.P.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            o0();
            return;
        }
        if (size >= 2) {
            o0();
            return;
        }
        if (this.f164777A != null && !e0()) {
            o0();
            return;
        }
        C.P.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    private void P() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        T("Closing camera.");
        switch (this.f164794e.ordinal()) {
            case 3:
                o2.i.i(this.f164800k == null);
                r0(i.INITIALIZED);
                break;
            case 4:
            default:
                T("close() ignored due to being in state: " + this.f164794e);
                break;
            case 5:
            case 6:
            case 7:
                if (!this.f164798i.a() && !this.f164789M.c()) {
                    z = false;
                }
                this.f164789M.a();
                r0(i.CLOSING);
                if (z) {
                    o2.i.i(d0());
                    R();
                    break;
                }
                break;
            case 8:
            case 9:
                r0(i.CLOSING);
                O(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.q<Void> Q(CameraDevice cameraDevice) {
        final C17506c1 c17506c1 = new C17506c1(this.f164787K);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final F.T t10 = new F.T(surface);
        t10.k().addListener(new Runnable() { // from class: v.D
            @Override // java.lang.Runnable
            public final void run() {
                M.t(surface, surfaceTexture);
            }
        }, H.a.a());
        w.b bVar = new w.b();
        bVar.h(t10);
        bVar.w(1);
        T("Start configAndClose.");
        return I.d.a(I.n.z(c17506c1.g(bVar.o(), cameraDevice, this.f164779C.a()))).e(new I.a() { // from class: v.E
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return M.y(c17506c1, t10, (Void) obj);
            }
        }, this.f164792c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o2.i.i(this.f164794e == i.RELEASING || this.f164794e == i.CLOSING);
        o2.i.i(this.f164805p.isEmpty());
        if (!this.f164813x) {
            W();
            return;
        }
        if (this.f164814y) {
            T("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f164807r.b()) {
            this.f164813x = false;
            W();
            T("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            T("Open camera to configAndClose");
            com.google.common.util.concurrent.q<Void> qVarI0 = i0();
            this.f164814y = true;
            qVarI0.addListener(new Runnable() { // from class: v.G
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    M.s(this.f164704a);
                }
            }, this.f164792c);
        }
    }

    private CameraDevice.StateCallback S() {
        ArrayList arrayList = new ArrayList(this.f164790a.g().c().c());
        arrayList.add(this.f164778B.c());
        arrayList.add(this.f164798i);
        return N0.a(arrayList);
    }

    private int X() {
        synchronized (this.f164782F) {
            try {
                return this.f164809t.c() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static String Z(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String a0(C17571y1 c17571y1) {
        return c17571y1.f() + c17571y1.hashCode();
    }

    static String b0(C.p0 p0Var) {
        return p0Var.o() + p0Var.hashCode();
    }

    private boolean e0() {
        ArrayList arrayList = new ArrayList();
        int iX = X();
        for (C.b bVar : this.f164790a.j()) {
            if (bVar.c() == null || bVar.c().get(0) != E.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    C.P.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                androidx.camera.core.impl.w wVarD = bVar.d();
                androidx.camera.core.impl.D<?> dF = bVar.f();
                for (DeferrableSurface deferrableSurface : wVarD.o()) {
                    arrayList.add(AbstractC5792a.a(this.f164788L.M(iX, dF.n(), deferrableSurface.h()), dF.n(), deferrableSurface.h(), bVar.e().b(), bVar.c(), bVar.e().d(), dF.y(null)));
                }
            }
        }
        o2.i.g(this.f164777A);
        HashMap map = new HashMap();
        map.put(this.f164777A.i(), Collections.singletonList(this.f164777A.e()));
        try {
            this.f164788L.A(iX, arrayList, map, false, false);
            T("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            U("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    private InterfaceC17509d1 f0() {
        synchronized (this.f164782F) {
            try {
                if (this.f164783G == null) {
                    return new C17506c1(this.f164787K, this.f164799j.d());
                }
                return new E1(this.f164783G, this.f164799j, this.f164787K, this.f164792c, this.f164793d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private com.google.common.util.concurrent.q<Void> i0() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.B
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return M.q(this.f164662a, aVar);
            }
        });
    }

    @SuppressLint({"MissingPermission"})
    private void j0(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!z10) {
            this.f164798i.d();
        }
        this.f164798i.a();
        this.f164789M.a();
        T("Opening camera.");
        r0(i.OPENING);
        try {
            this.f164791b.f(this.f164799j.b(), this.f164792c, S());
        } catch (CameraAccessExceptionCompat e10) {
            T("Unable to open camera due to " + e10.getMessage());
            if (e10.d() != 10001) {
                this.f164789M.d();
            } else {
                s0(i.INITIALIZED, AbstractC3031p.a.b(7, e10));
            }
        } catch (SecurityException e11) {
            T("Unable to open camera due to " + e11.getMessage());
            r0(i.REOPENING);
            this.f164798i.e();
        }
    }

    private void l0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iOrdinal = this.f164794e.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            z0(false);
            return;
        }
        if (iOrdinal != 4) {
            T("open() ignored due to being in state: " + this.f164794e);
            return;
        }
        r0(i.REOPENING);
        if (d0() || this.f164814y || this.f164801l != 0) {
            return;
        }
        o2.i.j(this.f164800k != null, "Camera Device should be open if session close is not complete");
        r0(i.OPENED);
        k0();
    }

    private void o0() {
        if (this.f164777A != null) {
            this.f164790a.s(this.f164777A.f() + this.f164777A.hashCode());
            this.f164790a.t(this.f164777A.f() + this.f164777A.hashCode());
            this.f164777A.c();
            this.f164777A = null;
        }
    }

    private void q0(final String str, final androidx.camera.core.impl.w wVar, final androidx.camera.core.impl.D<?> d10, final androidx.camera.core.impl.x xVar, final List<E.b> list) {
        this.f164792c.execute(new Runnable() { // from class: v.z
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                M.D(this.f165256a, str, wVar, d10, xVar, list);
            }
        });
    }

    public static /* synthetic */ void v(M m10, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m10.f164784H = z10;
        if (z10 && m10.f164794e == i.PENDING_OPEN) {
            m10.z0(false);
        }
    }

    private Collection<k> v0(Collection<C.p0> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<C.p0> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b(it.next(), this.f164815z));
        }
        return arrayList;
    }

    private void x0(Collection<k> collection) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Size sizeF;
        boolean zIsEmpty = this.f164790a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (k kVar : collection) {
            if (!this.f164790a.o(kVar.h())) {
                this.f164790a.r(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == C.Y.class && (sizeF = kVar.f()) != null) {
                    rational = new Rational(sizeF.getWidth(), sizeF.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        T("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f164797h.T(true);
            this.f164797h.K();
        }
        M();
        C0();
        B0();
        p0(false);
        if (this.f164794e == i.OPENED) {
            k0();
        } else {
            l0();
        }
        if (rational != null) {
            this.f164797h.U(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(Collection<k> collection) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (k kVar : collection) {
            if (this.f164790a.o(kVar.h())) {
                this.f164790a.p(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == C.Y.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        T("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f164797h.U(null);
        }
        M();
        if (this.f164790a.i().isEmpty()) {
            this.f164797h.W(false);
        } else {
            C0();
        }
        if (this.f164790a.h().isEmpty()) {
            this.f164797h.v();
            p0(false);
            this.f164797h.T(false);
            this.f164802m = f0();
            P();
            return;
        }
        B0();
        p0(false);
        if (this.f164794e == i.OPENED) {
            k0();
        }
    }

    void A0(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        T("Attempting to open the camera.");
        if (this.f164807r.b() && this.f164810u.i(this)) {
            j0(z10);
        } else {
            T("No cameras available. Waiting for available camera before opening camera.");
            r0(i.PENDING_OPEN);
        }
    }

    void B0() {
        w.h hVarE = this.f164790a.e();
        if (!hVarE.f()) {
            this.f164797h.S();
            this.f164802m.h(this.f164797h.A());
            return;
        }
        this.f164797h.V(hVarE.c().p());
        hVarE.b(this.f164797h.A());
        this.f164802m.h(hVarE.c());
    }

    void O(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o2.i.j(this.f164794e == i.CLOSING || this.f164794e == i.RELEASING || (this.f164794e == i.REOPENING && this.f164801l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f164794e + " (error: " + Z(this.f164801l) + ")");
        p0(z10);
        this.f164802m.c();
    }

    androidx.camera.core.impl.w V(DeferrableSurface deferrableSurface) {
        for (androidx.camera.core.impl.w wVar : this.f164790a.h()) {
            if (wVar.o().contains(deferrableSurface)) {
                return wVar;
            }
        }
        return null;
    }

    void W() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o2.i.i(this.f164794e == i.RELEASING || this.f164794e == i.CLOSING);
        o2.i.i(this.f164805p.isEmpty());
        this.f164800k = null;
        if (this.f164794e == i.CLOSING) {
            r0(i.INITIALIZED);
            return;
        }
        this.f164791b.h(this.f164807r);
        r0(i.RELEASED);
        c.a<Void> aVar = this.f164804o;
        if (aVar != null) {
            aVar.c(null);
            this.f164804o = null;
        }
    }

    @Override // F.InterfaceC3290z
    public CameraControlInternal c() {
        return this.f164797h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean c0() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.x
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return M.r(this.f165241a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    @Override // F.InterfaceC3290z
    public androidx.camera.core.impl.f d() {
        return this.f164781E;
    }

    boolean d0() {
        return this.f164805p.isEmpty();
    }

    @Override // F.InterfaceC3290z
    public void f(final boolean z10) {
        this.f164792c.execute(new Runnable() { // from class: v.A
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                M.v(this.f164655a, z10);
            }
        });
    }

    @Override // F.InterfaceC3290z
    public void g(Collection<C.p0> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f164797h.K();
        g0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(v0(arrayList));
        try {
            this.f164792c.execute(new Runnable() { // from class: v.H
                @Override // java.lang.Runnable
                public final void run() {
                    M.E(this.f164713a, arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            U("Unable to attach use cases.", e10);
            this.f164797h.v();
        }
    }

    @Override // F.InterfaceC3290z
    public void h(Collection<C.p0> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(v0(arrayList));
        h0(new ArrayList(arrayList));
        this.f164792c.execute(new Runnable() { // from class: v.y
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f165243a.y0(arrayList2);
            }
        });
    }

    @Override // F.InterfaceC3290z
    public InterfaceC3289y i() {
        return this.f164799j;
    }

    void k0() {
        o2.i.i(this.f164794e == i.OPENED);
        w.h hVarG = this.f164790a.g();
        if (!hVarG.f()) {
            T("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f164810u.j(this.f164800k.getId(), this.f164809t.a(this.f164800k.getId()))) {
            T("Unable to create capture session in camera operating mode = " + this.f164809t.c());
            return;
        }
        HashMap map = new HashMap();
        G1.m(this.f164790a.h(), this.f164790a.i(), map);
        this.f164802m.i(map);
        InterfaceC17509d1 interfaceC17509d1 = this.f164802m;
        I.n.j(interfaceC17509d1.g(hVarG.c(), (CameraDevice) o2.i.g(this.f164800k), this.f164779C.a()), new d(interfaceC17509d1), this.f164792c);
    }

    @Override // F.InterfaceC3290z
    public void m(androidx.camera.core.impl.f fVar) {
        if (fVar == null) {
            fVar = C3286v.a();
        }
        F.r0 r0VarR = fVar.R(null);
        this.f164781E = fVar;
        synchronized (this.f164782F) {
            this.f164783G = r0VarR;
        }
    }

    @Override // F.InterfaceC3290z
    public F.c0<InterfaceC3290z.a> n() {
        return this.f164795f;
    }

    @Override // F.InterfaceC3290z
    public void p(boolean z10) {
        this.f164815z = z10;
    }

    void p0(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o2.i.i(this.f164802m != null);
        T("Resetting Capture Session");
        InterfaceC17509d1 interfaceC17509d1 = this.f164802m;
        androidx.camera.core.impl.w wVarF = interfaceC17509d1.f();
        List<androidx.camera.core.impl.i> listE = interfaceC17509d1.e();
        InterfaceC17509d1 interfaceC17509d1F0 = f0();
        this.f164802m = interfaceC17509d1F0;
        interfaceC17509d1F0.h(wVarF);
        this.f164802m.a(listE);
        if (this.f164794e.ordinal() != 8) {
            T("Skipping Capture Session state check due to current camera state: " + this.f164794e + " and previous session status: " + interfaceC17509d1.b());
        } else if (this.f164811v && interfaceC17509d1.b()) {
            T("Close camera before creating new session");
            r0(i.REOPENING_QUIRK);
        }
        if (this.f164812w && interfaceC17509d1.b()) {
            T("ConfigAndClose is required when close the camera.");
            this.f164813x = true;
        }
        n0(interfaceC17509d1, z10);
    }

    void t0(i iVar, AbstractC3031p.a aVar, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC3290z.a aVar2;
        T("Transitioning camera internal state: " + this.f164794e + " --> " + iVar);
        w0(iVar, aVar);
        this.f164794e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = InterfaceC3290z.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = InterfaceC3290z.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = InterfaceC3290z.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = InterfaceC3290z.a.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = InterfaceC3290z.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = InterfaceC3290z.a.OPENING;
                break;
            case OPENED:
                aVar2 = InterfaceC3290z.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = InterfaceC3290z.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f164810u.e(this, aVar2, z10);
        this.f164795f.e(aVar2);
        this.f164796g.c(aVar2, aVar);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f164799j.b());
    }

    void u0(List<androidx.camera.core.impl.i> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.i iVar : list) {
            i.a aVarK = i.a.k(iVar);
            if (iVar.k() == 5 && iVar.d() != null) {
                aVarK.o(iVar.d());
            }
            if (!iVar.i().isEmpty() || !iVar.n() || N(aVarK)) {
                arrayList.add(aVarK.h());
            }
        }
        T("Issue capture request");
        this.f164802m.a(arrayList);
    }

    void z0(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        T("Attempting to force open the camera.");
        if (this.f164810u.i(this)) {
            j0(z10);
        } else {
            T("No cameras available. Waiting for available camera before opening camera.");
            r0(i.PENDING_OPEN);
        }
    }

    public static /* synthetic */ void A(M m10) {
        if (!m10.c0()) {
            return;
        }
        m10.q0(a0(m10.f164777A), m10.f164777A.h(), m10.f164777A.i(), null, Collections.singletonList(E.b.METERING_REPEATING));
    }

    public static /* synthetic */ void C(M m10, String str, androidx.camera.core.impl.w wVar, androidx.camera.core.impl.D d10, androidx.camera.core.impl.x xVar, List list) {
        m10.getClass();
        m10.T("Use case " + str + " ACTIVE");
        m10.f164790a.q(str, wVar, d10, xVar, list);
        m10.f164790a.u(str, wVar, d10, xVar, list);
        m10.B0();
    }

    public static /* synthetic */ void D(M m10, String str, androidx.camera.core.impl.w wVar, androidx.camera.core.impl.D d10, androidx.camera.core.impl.x xVar, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m10.getClass();
        m10.T("Use case " + str + " RESET");
        m10.f164790a.u(str, wVar, d10, xVar, list);
        m10.M();
        m10.p0(false);
        m10.B0();
        if (m10.f164794e == i.OPENED) {
            m10.k0();
        }
    }

    public static /* synthetic */ void E(M m10, List list) {
        m10.getClass();
        try {
            m10.x0(list);
        } finally {
            m10.f164797h.v();
        }
    }

    private boolean N(i.a aVar) {
        if (!aVar.m().isEmpty()) {
            C.P.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<androidx.camera.core.impl.w> it = this.f164790a.f().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.i iVarK = it.next().k();
            List<DeferrableSurface> listI = iVarK.i();
            if (!listI.isEmpty()) {
                if (iVarK.h() != 0) {
                    aVar.t(iVarK.h());
                }
                if (iVarK.l() != 0) {
                    aVar.w(iVarK.l());
                }
                Iterator<DeferrableSurface> it2 = listI.iterator();
                while (it2.hasNext()) {
                    aVar.f(it2.next());
                }
            }
        }
        if (aVar.m().isEmpty()) {
            C.P.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
            return false;
        }
        return true;
    }

    private void U(String str, Throwable th2) {
        C.P.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    static List<E.b> Y(C.p0 p0Var) {
        if (p0Var.g() == null) {
            return null;
        }
        return S.f.g0(p0Var);
    }

    private void g0(List<C.p0> list) {
        for (C.p0 p0Var : list) {
            String strB0 = b0(p0Var);
            if (!this.f164780D.contains(strB0)) {
                this.f164780D.add(strB0);
                p0Var.L();
                p0Var.J();
            }
        }
    }

    private void h0(List<C.p0> list) {
        for (C.p0 p0Var : list) {
            String strB0 = b0(p0Var);
            if (this.f164780D.contains(strB0)) {
                p0Var.M();
                this.f164780D.remove(strB0);
            }
        }
    }

    public static /* synthetic */ Object q(M m10, c.a aVar) {
        m10.getClass();
        try {
            ArrayList arrayList = new ArrayList(m10.f164790a.g().c().c());
            arrayList.add(m10.f164778B.c());
            arrayList.add(m10.new b(aVar));
            m10.f164791b.f(m10.f164799j.b(), m10.f164792c, N0.a(arrayList));
            return "configAndCloseTask";
        } catch (CameraAccessExceptionCompat | SecurityException e10) {
            m10.U("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.f(e10);
            return "configAndCloseTask";
        }
    }

    public static /* synthetic */ Object r(final M m10, final c.a aVar) {
        m10.getClass();
        try {
            m10.f164792c.execute(new Runnable() { // from class: v.F
                @Override // java.lang.Runnable
                public final void run() {
                    M.B(this.f164700a, aVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void t(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void u(M m10, String str) {
        m10.getClass();
        m10.T("Use case " + str + " INACTIVE");
        m10.f164790a.t(str);
        m10.B0();
    }

    public static /* synthetic */ void w(M m10, String str, androidx.camera.core.impl.w wVar, androidx.camera.core.impl.D d10, androidx.camera.core.impl.x xVar, List list) {
        m10.getClass();
        m10.T("Use case " + str + " UPDATED");
        m10.f164790a.u(str, wVar, d10, xVar, list);
        m10.B0();
    }

    public static /* synthetic */ com.google.common.util.concurrent.q y(C17506c1 c17506c1, DeferrableSurface deferrableSurface, Void r22) {
        c17506c1.close();
        deferrableSurface.d();
        return c17506c1.d(false);
    }

    @Override // C.p0.b
    public void b(C.p0 p0Var) {
        androidx.camera.core.impl.w wVarU;
        o2.i.g(p0Var);
        if (this.f164815z) {
            wVarU = p0Var.w();
        } else {
            wVarU = p0Var.u();
        }
        androidx.camera.core.impl.w wVar = wVarU;
        q0(b0(p0Var), wVar, p0Var.j(), p0Var.e(), Y(p0Var));
    }

    @Override // C.p0.b
    public void e(C.p0 p0Var) {
        o2.i.g(p0Var);
        final String strB0 = b0(p0Var);
        this.f164792c.execute(new Runnable() { // from class: v.J
            @Override // java.lang.Runnable
            public final void run() {
                M.u(this.f164754a, strB0);
            }
        });
    }

    @Override // C.p0.b
    public void j(C.p0 p0Var) {
        androidx.camera.core.impl.w wVarU;
        o2.i.g(p0Var);
        final String strB0 = b0(p0Var);
        if (this.f164815z) {
            wVarU = p0Var.w();
        } else {
            wVarU = p0Var.u();
        }
        final androidx.camera.core.impl.w wVar = wVarU;
        final androidx.camera.core.impl.D<?> dJ = p0Var.j();
        final androidx.camera.core.impl.x xVarE = p0Var.e();
        final List<E.b> listY = Y(p0Var);
        this.f164792c.execute(new Runnable() { // from class: v.K
            @Override // java.lang.Runnable
            public final void run() {
                M.C(this.f164763a, strB0, wVar, dJ, xVarE, listY);
            }
        });
    }

    @Override // C.p0.b
    public void l(C.p0 p0Var) {
        androidx.camera.core.impl.w wVarU;
        o2.i.g(p0Var);
        final String strB0 = b0(p0Var);
        if (this.f164815z) {
            wVarU = p0Var.w();
        } else {
            wVarU = p0Var.u();
        }
        final androidx.camera.core.impl.w wVar = wVarU;
        final androidx.camera.core.impl.D<?> dJ = p0Var.j();
        final androidx.camera.core.impl.x xVarE = p0Var.e();
        final List<E.b> listY = Y(p0Var);
        this.f164792c.execute(new Runnable() { // from class: v.I
            @Override // java.lang.Runnable
            public final void run() {
                M.w(this.f164718a, strB0, wVar, dJ, xVarE, listY);
            }
        });
    }

    void m0(final androidx.camera.core.impl.w wVar) {
        ScheduledExecutorService scheduledExecutorServiceD = H.a.d();
        final w.d dVarD = wVar.d();
        if (dVarD != null) {
            U("Posting surface closed", new Throwable());
            scheduledExecutorServiceD.execute(new Runnable() { // from class: v.L
                @Override // java.lang.Runnable
                public final void run() {
                    dVarD.a(wVar, w.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    com.google.common.util.concurrent.q<Void> n0(InterfaceC17509d1 interfaceC17509d1, boolean z10) {
        interfaceC17509d1.close();
        com.google.common.util.concurrent.q<Void> qVarD = interfaceC17509d1.d(z10);
        T("Releasing session in state " + this.f164794e.name());
        this.f164805p.put(interfaceC17509d1, qVarD);
        I.n.j(qVarD, new c(interfaceC17509d1), H.a.a());
        return qVarD;
    }

    void w0(i iVar, AbstractC3031p.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iD;
        if (H4.a.h()) {
            H4.a.j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f164806q++;
            }
            if (this.f164806q > 0) {
                String str = "CX:C2StateErrorCode[" + this + "]";
                if (aVar != null) {
                    iD = aVar.d();
                } else {
                    iD = 0;
                }
                H4.a.j(str, iD);
            }
        }
    }
}
