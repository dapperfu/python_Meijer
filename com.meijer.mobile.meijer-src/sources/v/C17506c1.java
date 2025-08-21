package v;

import C.C3037w;
import F.AbstractC3273h;
import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.camera.core.impl.w;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import u.C17296a;
import v.J1;
import v.L0;
import v.U1;
import z.C18381A;
import z.C18403t;
import z.C18406w;
import z.C18409z;

/* renamed from: v.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17506c1 implements InterfaceC17509d1 {

    /* renamed from: a, reason: collision with root package name */
    final Object f165012a;

    /* renamed from: b, reason: collision with root package name */
    private final List<androidx.camera.core.impl.i> f165013b;

    /* renamed from: c, reason: collision with root package name */
    private final d f165014c;

    /* renamed from: d, reason: collision with root package name */
    J1.a f165015d;

    /* renamed from: e, reason: collision with root package name */
    J1 f165016e;

    /* renamed from: f, reason: collision with root package name */
    androidx.camera.core.impl.w f165017f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<DeferrableSurface, Surface> f165018g;

    /* renamed from: h, reason: collision with root package name */
    List<DeferrableSurface> f165019h;

    /* renamed from: i, reason: collision with root package name */
    c f165020i;

    /* renamed from: j, reason: collision with root package name */
    com.google.common.util.concurrent.q<Void> f165021j;

    /* renamed from: k, reason: collision with root package name */
    c.a<Void> f165022k;

    /* renamed from: l, reason: collision with root package name */
    private Map<DeferrableSurface, Long> f165023l;

    /* renamed from: m, reason: collision with root package name */
    private final C18406w f165024m;

    /* renamed from: n, reason: collision with root package name */
    private final C18381A f165025n;

    /* renamed from: o, reason: collision with root package name */
    private final C18403t f165026o;

    /* renamed from: p, reason: collision with root package name */
    private final x.g f165027p;

    /* renamed from: q, reason: collision with root package name */
    private final C18409z f165028q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f165029r;

    /* renamed from: v.c1$a */
    class a implements I.c<Void> {
        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        a() {
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            synchronized (C17506c1.this.f165012a) {
                try {
                    C17506c1.this.f165015d.stop();
                    int iOrdinal = C17506c1.this.f165020i.ordinal();
                    if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                        C.P.m("CaptureSession", "Opening session with fail " + C17506c1.this.f165020i, th2);
                        C17506c1.this.r();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: v.c1$b */
    class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C17506c1.this.f165012a) {
                try {
                    androidx.camera.core.impl.w wVar = C17506c1.this.f165017f;
                    if (wVar == null) {
                        return;
                    }
                    androidx.camera.core.impl.i iVarK = wVar.k();
                    C.P.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C17506c1 c17506c1 = C17506c1.this;
                    c17506c1.a(Collections.singletonList(c17506c1.f165025n.a(iVarK)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: v.c1$c */
    enum c {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: v.c1$d */
    final class d extends J1.c {
        d() {
        }

        @Override // v.J1.c
        public void r(J1 j12) {
            synchronized (C17506c1.this.f165012a) {
                try {
                    switch (C17506c1.this.f165020i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C17506c1.this.f165020i);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            C17506c1.this.r();
                            break;
                        case RELEASED:
                            C.P.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    C.P.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C17506c1.this.f165020i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.J1.c
        public void s(J1 j12) {
            synchronized (C17506c1.this.f165012a) {
                try {
                    switch (C17506c1.this.f165020i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C17506c1.this.f165020i);
                        case OPENING:
                            C17506c1 c17506c1 = C17506c1.this;
                            c17506c1.f165020i = c.OPENED;
                            c17506c1.f165016e = j12;
                            C.P.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C17506c1 c17506c12 = C17506c1.this;
                            c17506c12.x(c17506c12.f165017f);
                            C17506c1.this.w();
                            break;
                        case CLOSED:
                            C17506c1.this.f165016e = j12;
                            break;
                        case RELEASING:
                            j12.close();
                            break;
                    }
                    C.P.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C17506c1.this.f165020i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.J1.c
        public void t(J1 j12) {
            synchronized (C17506c1.this.f165012a) {
                try {
                    if (C17506c1.this.f165020i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C17506c1.this.f165020i);
                    }
                    C.P.a("CaptureSession", "CameraCaptureSession.onReady() " + C17506c1.this.f165020i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.J1.c
        public void u(J1 j12) {
            synchronized (C17506c1.this.f165012a) {
                try {
                    if (C17506c1.this.f165020i == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C17506c1.this.f165020i);
                    }
                    C.P.a("CaptureSession", "onSessionFinished()");
                    C17506c1.this.r();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    C17506c1(x.g gVar) {
        this(gVar, false);
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static List<OutputConfiguration> p(List<MultiResolutionStreamInfo> list, int i10) {
        try {
            return (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, list, Integer.valueOf(i10));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            C.P.c("CaptureSession", "Failed to create instances for multi-resolution output, " + e10.getMessage());
            return null;
        }
    }

    C17506c1(x.g gVar, boolean z10) {
        this(gVar, new F.l0(Collections.EMPTY_LIST), z10);
    }

    public static /* synthetic */ void j(C17506c1 c17506c1) {
        synchronized (c17506c1.f165012a) {
            if (c17506c1.f165013b.isEmpty()) {
                return;
            }
            try {
                c17506c1.v(c17506c1.f165013b);
            } finally {
                c17506c1.f165013b.clear();
            }
        }
    }

    public static /* synthetic */ Object k(C17506c1 c17506c1, c.a aVar) {
        String str;
        synchronized (c17506c1.f165012a) {
            o2.i.j(c17506c1.f165022k == null, "Release completer expected to be null");
            c17506c1.f165022k = aVar;
            str = "Release[session=" + c17506c1 + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(C17506c1 c17506c1, CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (c17506c1.f165012a) {
            try {
                if (c17506c1.f165020i == c.OPENED) {
                    c17506c1.x(c17506c1.f165017f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private CameraCaptureSession.CaptureCallback o(List<AbstractC3273h> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<AbstractC3273h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(U0.a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return U.a(arrayList);
    }

    private static Map<w.f, x.k> q(Map<Integer, List<w.f>> map, Map<DeferrableSurface, Surface> map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (w.f fVar : map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a(map2.get(fVar.f()));
                if (i10 == 0) {
                    i10 = aVarA.f47690a;
                }
                W0.a();
                int i11 = aVarA.f47691b;
                int i12 = aVarA.f47692c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(V0.a(i11, i12, strD));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                C.P.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List<OutputConfiguration> listP = p(arrayList, i10);
                if (listP != null) {
                    for (w.f fVar2 : map.get(num)) {
                        OutputConfiguration outputConfigurationRemove = listP.remove(0);
                        outputConfigurationRemove.addSurface(map2.get(fVar2.f()));
                        map3.put(fVar2, new x.k(outputConfigurationRemove));
                    }
                }
            }
        }
        return map3;
    }

    private List<x.k> t(List<x.k> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (x.k kVar : list) {
            if (!arrayList.contains(kVar.d())) {
                arrayList.add(kVar.d());
                arrayList2.add(kVar);
            }
        }
        return arrayList2;
    }

    private static Map<Integer, List<w.f>> u(Collection<w.f> collection) {
        HashMap map = new HashMap();
        for (w.f fVar : collection) {
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList);
                }
                arrayList.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.q<Void> y(List<Surface> list, androidx.camera.core.impl.w wVar, CameraDevice cameraDevice) {
        synchronized (this.f165012a) {
            try {
                int iOrdinal = this.f165020i.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        this.f165018g.clear();
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            this.f165018g.put(this.f165019h.get(i10), list.get(i10));
                        }
                        this.f165020i = c.OPENING;
                        C.P.a("CaptureSession", "Opening capture session.");
                        J1.c cVarW = U1.w(this.f165014c, new U1.a(wVar.l()));
                        C17296a c17296a = new C17296a(wVar.f());
                        i.a aVarK = i.a.k(wVar.k());
                        Map map = new HashMap();
                        if (this.f165029r && Build.VERSION.SDK_INT >= 35) {
                            map = q(u(wVar.h()), this.f165018g);
                        }
                        ArrayList arrayList = new ArrayList();
                        String strC0 = c17296a.c0(null);
                        for (w.f fVar : wVar.h()) {
                            x.k kVarS = (!this.f165029r || Build.VERSION.SDK_INT < 35) ? null : (x.k) map.get(fVar);
                            if (kVarS == null) {
                                kVarS = s(fVar, this.f165018g, strC0);
                                if (this.f165023l.containsKey(fVar.f())) {
                                    kVarS.h(this.f165023l.get(fVar.f()).longValue());
                                }
                            }
                            arrayList.add(kVarS);
                        }
                        x.q qVarM = this.f165015d.m(wVar.m(), t(arrayList), cVarW);
                        if (wVar.p() == 5 && wVar.g() != null) {
                            qVarM.f(x.j.b(wVar.g()));
                        }
                        try {
                            CaptureRequest captureRequestF = E0.f(aVarK.h(), cameraDevice, this.f165028q);
                            if (captureRequestF != null) {
                                qVarM.g(captureRequestF);
                            }
                            return this.f165015d.e(cameraDevice, qVarM, this.f165019h);
                        } catch (CameraAccessException e10) {
                            return I.n.n(e10);
                        }
                    }
                    if (iOrdinal != 4) {
                        return I.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f165020i));
                    }
                }
                return I.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f165020i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.InterfaceC17509d1
    public void a(List<androidx.camera.core.impl.i> list) {
        synchronized (this.f165012a) {
            try {
                switch (this.f165020i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f165020i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f165013b.addAll(list);
                        break;
                    case OPENED:
                        this.f165013b.addAll(list);
                        w();
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // v.InterfaceC17509d1
    public boolean b() {
        boolean z10;
        synchronized (this.f165012a) {
            try {
                c cVar = this.f165020i;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } finally {
            }
        }
        return z10;
    }

    @Override // v.InterfaceC17509d1
    public void c() {
        ArrayList<androidx.camera.core.impl.i> arrayList;
        synchronized (this.f165012a) {
            try {
                if (this.f165013b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f165013b);
                    this.f165013b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.i iVar : arrayList) {
                Iterator<AbstractC3273h> it = iVar.c().iterator();
                while (it.hasNext()) {
                    it.next().a(iVar.f());
                }
            }
        }
    }

    @Override // v.InterfaceC17509d1
    public void close() {
        synchronized (this.f165012a) {
            try {
                int iOrdinal = this.f165020i.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f165020i);
                }
                if (iOrdinal == 1) {
                    this.f165020i = c.RELEASED;
                } else if (iOrdinal == 2) {
                    o2.i.h(this.f165015d, "The Opener shouldn't null in state:" + this.f165020i);
                    this.f165015d.stop();
                    this.f165020i = c.RELEASED;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    o2.i.h(this.f165015d, "The Opener shouldn't null in state:" + this.f165020i);
                    this.f165015d.stop();
                    this.f165020i = c.CLOSED;
                    this.f165026o.g();
                    this.f165017f = null;
                }
            } finally {
            }
        }
    }

    @Override // v.InterfaceC17509d1
    public com.google.common.util.concurrent.q<Void> d(boolean z10) {
        synchronized (this.f165012a) {
            switch (this.f165020i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f165020i);
                case GET_SURFACE:
                    o2.i.h(this.f165015d, "The Opener shouldn't null in state:" + this.f165020i);
                    this.f165015d.stop();
                case INITIALIZED:
                    this.f165020i = c.RELEASED;
                    return I.n.p(null);
                case OPENED:
                case CLOSED:
                    J1 j12 = this.f165016e;
                    if (j12 != null) {
                        if (z10) {
                            try {
                                j12.g();
                            } catch (CameraAccessException e10) {
                                C.P.d("CaptureSession", "Unable to abort captures.", e10);
                            }
                        }
                        this.f165016e.close();
                    }
                case OPENING:
                    this.f165020i = c.RELEASING;
                    this.f165026o.g();
                    o2.i.h(this.f165015d, "The Opener shouldn't null in state:" + this.f165020i);
                    if (this.f165015d.stop()) {
                        r();
                        return I.n.p(null);
                    }
                case RELEASING:
                    if (this.f165021j == null) {
                        this.f165021j = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.Y0
                            @Override // androidx.concurrent.futures.c.InterfaceC1101c
                            public final Object a(c.a aVar) {
                                return C17506c1.k(this.f164938a, aVar);
                            }
                        });
                    }
                    return this.f165021j;
                default:
                    return I.n.p(null);
            }
        }
    }

    @Override // v.InterfaceC17509d1
    public List<androidx.camera.core.impl.i> e() {
        List<androidx.camera.core.impl.i> listUnmodifiableList;
        synchronized (this.f165012a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f165013b);
        }
        return listUnmodifiableList;
    }

    @Override // v.InterfaceC17509d1
    public androidx.camera.core.impl.w f() {
        androidx.camera.core.impl.w wVar;
        synchronized (this.f165012a) {
            wVar = this.f165017f;
        }
        return wVar;
    }

    @Override // v.InterfaceC17509d1
    public com.google.common.util.concurrent.q<Void> g(final androidx.camera.core.impl.w wVar, final CameraDevice cameraDevice, J1.a aVar) {
        synchronized (this.f165012a) {
            try {
                if (this.f165020i.ordinal() == 1) {
                    this.f165020i = c.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(wVar.o());
                    this.f165019h = arrayList;
                    this.f165015d = aVar;
                    I.d dVarE = I.d.a(aVar.j(arrayList, 5000L)).e(new I.a() { // from class: v.Z0
                        @Override // I.a
                        public final com.google.common.util.concurrent.q apply(Object obj) {
                            return this.f164939a.y((List) obj, wVar, cameraDevice);
                        }
                    }, this.f165015d.b());
                    I.n.j(dVarE, new a(), this.f165015d.b());
                    return I.n.s(dVarE);
                }
                C.P.c("CaptureSession", "Open not allowed in state: " + this.f165020i);
                return I.n.n(new IllegalStateException("open() should not allow the state: " + this.f165020i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.InterfaceC17509d1
    public void h(androidx.camera.core.impl.w wVar) {
        synchronized (this.f165012a) {
            try {
                switch (this.f165020i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f165020i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f165017f = wVar;
                        break;
                    case OPENED:
                        this.f165017f = wVar;
                        if (wVar != null) {
                            if (!this.f165018g.keySet().containsAll(wVar.o())) {
                                C.P.c("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                C.P.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                x(this.f165017f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // v.InterfaceC17509d1
    public void i(Map<DeferrableSurface, Long> map) {
        synchronized (this.f165012a) {
            this.f165023l = map;
        }
    }

    void r() {
        c cVar = this.f165020i;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            C.P.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f165020i = cVar2;
        this.f165016e = null;
        c.a<Void> aVar = this.f165022k;
        if (aVar != null) {
            aVar.c(null);
            this.f165022k = null;
        }
    }

    int v(List<androidx.camera.core.impl.i> list) {
        L0 l02;
        ArrayList arrayList;
        boolean z10;
        synchronized (this.f165012a) {
            try {
                if (this.f165020i != c.OPENED) {
                    C.P.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    l02 = new L0();
                    arrayList = new ArrayList();
                    C.P.a("CaptureSession", "Issuing capture request.");
                    z10 = false;
                    for (androidx.camera.core.impl.i iVar : list) {
                        if (iVar.i().isEmpty()) {
                            C.P.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator<DeferrableSurface> it = iVar.i().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    DeferrableSurface next = it.next();
                                    if (!this.f165018g.containsKey(next)) {
                                        C.P.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                        break;
                                    }
                                } else {
                                    if (iVar.k() == 2) {
                                        z10 = true;
                                    }
                                    i.a aVarK = i.a.k(iVar);
                                    if (iVar.k() == 5 && iVar.d() != null) {
                                        aVarK.o(iVar.d());
                                    }
                                    androidx.camera.core.impl.w wVar = this.f165017f;
                                    if (wVar != null) {
                                        aVarK.e(wVar.k().g());
                                    }
                                    aVarK.e(iVar.g());
                                    CaptureRequest captureRequestE = E0.e(aVarK.h(), this.f165016e.h(), this.f165018g, false, this.f165028q);
                                    if (captureRequestE == null) {
                                        C.P.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<AbstractC3273h> it2 = iVar.c().iterator();
                                    while (it2.hasNext()) {
                                        U0.b(it2.next(), arrayList2);
                                    }
                                    l02.a(captureRequestE, arrayList2);
                                    arrayList.add(captureRequestE);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e10) {
                    C.P.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    C.P.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f165024m.a(arrayList, z10)) {
                    this.f165016e.a();
                    l02.c(new L0.a() { // from class: v.b1
                        @Override // v.L0.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z11) {
                            C17506c1.m(this.f165001a, cameraCaptureSession, i10, z11);
                        }
                    });
                }
                if (this.f165025n.b(arrayList, z10)) {
                    l02.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                }
                return this.f165016e.k(arrayList, l02);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void w() {
        this.f165026o.e().addListener(new Runnable() { // from class: v.a1
            @Override // java.lang.Runnable
            public final void run() {
                C17506c1.j(this.f164991a);
            }
        }, H.a.a());
    }

    int x(androidx.camera.core.impl.w wVar) {
        synchronized (this.f165012a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (wVar == null) {
                C.P.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f165020i != c.OPENED) {
                C.P.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            androidx.camera.core.impl.i iVarK = wVar.k();
            if (iVarK.i().isEmpty()) {
                C.P.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f165016e.a();
                } catch (CameraAccessException e10) {
                    C.P.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C.P.a("CaptureSession", "Issuing request for session.");
                CaptureRequest captureRequestE = E0.e(iVarK, this.f165016e.h(), this.f165018g, true, this.f165028q);
                if (captureRequestE == null) {
                    C.P.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f165016e.i(captureRequestE, this.f165026o.d(o(iVarK.c(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e11) {
                C.P.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th2;
        }
    }

    C17506c1(x.g gVar, F.l0 l0Var) {
        this(gVar, l0Var, false);
    }

    private x.k s(w.f fVar, Map<DeferrableSurface, Surface> map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = map.get(fVar.f());
        o2.i.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        x.k kVar = new x.k(fVar.g(), surface);
        if (str != null) {
            kVar.g(str);
        } else {
            kVar.g(fVar.d());
        }
        if (fVar.c() == 0) {
            kVar.f(1);
        } else if (fVar.c() == 1) {
            kVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            kVar.b();
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                o2.i.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                kVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfilesD = this.f165027p.d()) != null) {
            C3037w c3037wB = fVar.b();
            Long lA = x.d.a(c3037wB, dynamicRangeProfilesD);
            if (lA == null) {
                C.P.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c3037wB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        } else {
            jLongValue = 1;
        }
        kVar.e(jLongValue);
        return kVar;
    }

    C17506c1(x.g gVar, F.l0 l0Var, boolean z10) {
        this.f165012a = new Object();
        this.f165013b = new ArrayList();
        this.f165018g = new HashMap();
        this.f165019h = Collections.EMPTY_LIST;
        this.f165020i = c.UNINITIALIZED;
        this.f165023l = new HashMap();
        this.f165024m = new C18406w();
        this.f165025n = new C18381A();
        this.f165020i = c.INITIALIZED;
        this.f165027p = gVar;
        this.f165014c = new d();
        this.f165026o = new C18403t(l0Var.a(CaptureNoResponseQuirk.class));
        this.f165028q = new C18409z(l0Var);
        this.f165029r = z10;
    }
}
