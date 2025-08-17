package v;

import C.C2979w;
import F.AbstractC3611h;
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
import u.C17169a;
import v.J1;
import v.L0;
import v.U1;
import z.C18318A;
import z.C18340t;
import z.C18343w;
import z.C18346z;

/* renamed from: v.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17367c1 implements InterfaceC17370d1 {

    /* renamed from: a, reason: collision with root package name */
    final Object f163978a;

    /* renamed from: b, reason: collision with root package name */
    private final List<androidx.camera.core.impl.i> f163979b;

    /* renamed from: c, reason: collision with root package name */
    private final d f163980c;

    /* renamed from: d, reason: collision with root package name */
    J1.a f163981d;

    /* renamed from: e, reason: collision with root package name */
    J1 f163982e;

    /* renamed from: f, reason: collision with root package name */
    androidx.camera.core.impl.w f163983f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<DeferrableSurface, Surface> f163984g;

    /* renamed from: h, reason: collision with root package name */
    List<DeferrableSurface> f163985h;

    /* renamed from: i, reason: collision with root package name */
    c f163986i;

    /* renamed from: j, reason: collision with root package name */
    com.google.common.util.concurrent.q<Void> f163987j;

    /* renamed from: k, reason: collision with root package name */
    c.a<Void> f163988k;

    /* renamed from: l, reason: collision with root package name */
    private Map<DeferrableSurface, Long> f163989l;

    /* renamed from: m, reason: collision with root package name */
    private final C18343w f163990m;

    /* renamed from: n, reason: collision with root package name */
    private final C18318A f163991n;

    /* renamed from: o, reason: collision with root package name */
    private final C18340t f163992o;

    /* renamed from: p, reason: collision with root package name */
    private final x.g f163993p;

    /* renamed from: q, reason: collision with root package name */
    private final C18346z f163994q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f163995r;

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
            synchronized (C17367c1.this.f163978a) {
                try {
                    C17367c1.this.f163981d.stop();
                    int iOrdinal = C17367c1.this.f163986i.ordinal();
                    if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                        C.P.m("CaptureSession", "Opening session with fail " + C17367c1.this.f163986i, th2);
                        C17367c1.this.r();
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
            synchronized (C17367c1.this.f163978a) {
                try {
                    androidx.camera.core.impl.w wVar = C17367c1.this.f163983f;
                    if (wVar == null) {
                        return;
                    }
                    androidx.camera.core.impl.i iVarK = wVar.k();
                    C.P.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C17367c1 c17367c1 = C17367c1.this;
                    c17367c1.a(Collections.singletonList(c17367c1.f163991n.a(iVarK)));
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
            synchronized (C17367c1.this.f163978a) {
                try {
                    switch (C17367c1.this.f163986i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C17367c1.this.f163986i);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            C17367c1.this.r();
                            break;
                        case RELEASED:
                            C.P.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    C.P.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C17367c1.this.f163986i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.J1.c
        public void s(J1 j12) {
            synchronized (C17367c1.this.f163978a) {
                try {
                    switch (C17367c1.this.f163986i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C17367c1.this.f163986i);
                        case OPENING:
                            C17367c1 c17367c1 = C17367c1.this;
                            c17367c1.f163986i = c.OPENED;
                            c17367c1.f163982e = j12;
                            C.P.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C17367c1 c17367c12 = C17367c1.this;
                            c17367c12.x(c17367c12.f163983f);
                            C17367c1.this.w();
                            break;
                        case CLOSED:
                            C17367c1.this.f163982e = j12;
                            break;
                        case RELEASING:
                            j12.close();
                            break;
                    }
                    C.P.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C17367c1.this.f163986i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.J1.c
        public void t(J1 j12) {
            synchronized (C17367c1.this.f163978a) {
                try {
                    if (C17367c1.this.f163986i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C17367c1.this.f163986i);
                    }
                    C.P.a("CaptureSession", "CameraCaptureSession.onReady() " + C17367c1.this.f163986i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.J1.c
        public void u(J1 j12) {
            synchronized (C17367c1.this.f163978a) {
                try {
                    if (C17367c1.this.f163986i == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C17367c1.this.f163986i);
                    }
                    C.P.a("CaptureSession", "onSessionFinished()");
                    C17367c1.this.r();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    C17367c1(x.g gVar) {
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

    C17367c1(x.g gVar, boolean z10) {
        this(gVar, new F.l0(Collections.EMPTY_LIST), z10);
    }

    public static /* synthetic */ void j(C17367c1 c17367c1) {
        synchronized (c17367c1.f163978a) {
            if (c17367c1.f163979b.isEmpty()) {
                return;
            }
            try {
                c17367c1.v(c17367c1.f163979b);
            } finally {
                c17367c1.f163979b.clear();
            }
        }
    }

    public static /* synthetic */ Object k(C17367c1 c17367c1, c.a aVar) {
        String str;
        synchronized (c17367c1.f163978a) {
            o2.i.j(c17367c1.f163988k == null, "Release completer expected to be null");
            c17367c1.f163988k = aVar;
            str = "Release[session=" + c17367c1 + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(C17367c1 c17367c1, CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (c17367c1.f163978a) {
            try {
                if (c17367c1.f163986i == c.OPENED) {
                    c17367c1.x(c17367c1.f163983f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private CameraCaptureSession.CaptureCallback o(List<AbstractC3611h> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<AbstractC3611h> it = list.iterator();
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
                    i10 = aVarA.f47466a;
                }
                W0.a();
                int i11 = aVarA.f47467b;
                int i12 = aVarA.f47468c;
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
        synchronized (this.f163978a) {
            try {
                int iOrdinal = this.f163986i.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        this.f163984g.clear();
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            this.f163984g.put(this.f163985h.get(i10), list.get(i10));
                        }
                        this.f163986i = c.OPENING;
                        C.P.a("CaptureSession", "Opening capture session.");
                        J1.c cVarW = U1.w(this.f163980c, new U1.a(wVar.l()));
                        C17169a c17169a = new C17169a(wVar.f());
                        i.a aVarK = i.a.k(wVar.k());
                        Map map = new HashMap();
                        if (this.f163995r && Build.VERSION.SDK_INT >= 35) {
                            map = q(u(wVar.h()), this.f163984g);
                        }
                        ArrayList arrayList = new ArrayList();
                        String strC0 = c17169a.c0(null);
                        for (w.f fVar : wVar.h()) {
                            x.k kVarS = (!this.f163995r || Build.VERSION.SDK_INT < 35) ? null : (x.k) map.get(fVar);
                            if (kVarS == null) {
                                kVarS = s(fVar, this.f163984g, strC0);
                                if (this.f163989l.containsKey(fVar.f())) {
                                    kVarS.h(this.f163989l.get(fVar.f()).longValue());
                                }
                            }
                            arrayList.add(kVarS);
                        }
                        x.q qVarM = this.f163981d.m(wVar.m(), t(arrayList), cVarW);
                        if (wVar.p() == 5 && wVar.g() != null) {
                            qVarM.f(x.j.b(wVar.g()));
                        }
                        try {
                            CaptureRequest captureRequestF = E0.f(aVarK.h(), cameraDevice, this.f163994q);
                            if (captureRequestF != null) {
                                qVarM.g(captureRequestF);
                            }
                            return this.f163981d.e(cameraDevice, qVarM, this.f163985h);
                        } catch (CameraAccessException e10) {
                            return I.n.n(e10);
                        }
                    }
                    if (iOrdinal != 4) {
                        return I.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f163986i));
                    }
                }
                return I.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f163986i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.InterfaceC17370d1
    public void a(List<androidx.camera.core.impl.i> list) {
        synchronized (this.f163978a) {
            try {
                switch (this.f163986i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f163986i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f163979b.addAll(list);
                        break;
                    case OPENED:
                        this.f163979b.addAll(list);
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

    @Override // v.InterfaceC17370d1
    public boolean b() {
        boolean z10;
        synchronized (this.f163978a) {
            try {
                c cVar = this.f163986i;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } finally {
            }
        }
        return z10;
    }

    @Override // v.InterfaceC17370d1
    public void c() {
        ArrayList<androidx.camera.core.impl.i> arrayList;
        synchronized (this.f163978a) {
            try {
                if (this.f163979b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f163979b);
                    this.f163979b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.i iVar : arrayList) {
                Iterator<AbstractC3611h> it = iVar.c().iterator();
                while (it.hasNext()) {
                    it.next().a(iVar.f());
                }
            }
        }
    }

    @Override // v.InterfaceC17370d1
    public void close() {
        synchronized (this.f163978a) {
            try {
                int iOrdinal = this.f163986i.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f163986i);
                }
                if (iOrdinal == 1) {
                    this.f163986i = c.RELEASED;
                } else if (iOrdinal == 2) {
                    o2.i.h(this.f163981d, "The Opener shouldn't null in state:" + this.f163986i);
                    this.f163981d.stop();
                    this.f163986i = c.RELEASED;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    o2.i.h(this.f163981d, "The Opener shouldn't null in state:" + this.f163986i);
                    this.f163981d.stop();
                    this.f163986i = c.CLOSED;
                    this.f163992o.g();
                    this.f163983f = null;
                }
            } finally {
            }
        }
    }

    @Override // v.InterfaceC17370d1
    public com.google.common.util.concurrent.q<Void> d(boolean z10) {
        synchronized (this.f163978a) {
            switch (this.f163986i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f163986i);
                case GET_SURFACE:
                    o2.i.h(this.f163981d, "The Opener shouldn't null in state:" + this.f163986i);
                    this.f163981d.stop();
                case INITIALIZED:
                    this.f163986i = c.RELEASED;
                    return I.n.p(null);
                case OPENED:
                case CLOSED:
                    J1 j12 = this.f163982e;
                    if (j12 != null) {
                        if (z10) {
                            try {
                                j12.g();
                            } catch (CameraAccessException e10) {
                                C.P.d("CaptureSession", "Unable to abort captures.", e10);
                            }
                        }
                        this.f163982e.close();
                    }
                case OPENING:
                    this.f163986i = c.RELEASING;
                    this.f163992o.g();
                    o2.i.h(this.f163981d, "The Opener shouldn't null in state:" + this.f163986i);
                    if (this.f163981d.stop()) {
                        r();
                        return I.n.p(null);
                    }
                case RELEASING:
                    if (this.f163987j == null) {
                        this.f163987j = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.Y0
                            @Override // androidx.concurrent.futures.c.InterfaceC1088c
                            public final Object a(c.a aVar) {
                                return C17367c1.k(this.f163904a, aVar);
                            }
                        });
                    }
                    return this.f163987j;
                default:
                    return I.n.p(null);
            }
        }
    }

    @Override // v.InterfaceC17370d1
    public List<androidx.camera.core.impl.i> e() {
        List<androidx.camera.core.impl.i> listUnmodifiableList;
        synchronized (this.f163978a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f163979b);
        }
        return listUnmodifiableList;
    }

    @Override // v.InterfaceC17370d1
    public androidx.camera.core.impl.w f() {
        androidx.camera.core.impl.w wVar;
        synchronized (this.f163978a) {
            wVar = this.f163983f;
        }
        return wVar;
    }

    @Override // v.InterfaceC17370d1
    public com.google.common.util.concurrent.q<Void> g(final androidx.camera.core.impl.w wVar, final CameraDevice cameraDevice, J1.a aVar) {
        synchronized (this.f163978a) {
            try {
                if (this.f163986i.ordinal() == 1) {
                    this.f163986i = c.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(wVar.o());
                    this.f163985h = arrayList;
                    this.f163981d = aVar;
                    I.d dVarE = I.d.a(aVar.j(arrayList, 5000L)).e(new I.a() { // from class: v.Z0
                        @Override // I.a
                        public final com.google.common.util.concurrent.q apply(Object obj) {
                            return this.f163905a.y((List) obj, wVar, cameraDevice);
                        }
                    }, this.f163981d.b());
                    I.n.j(dVarE, new a(), this.f163981d.b());
                    return I.n.s(dVarE);
                }
                C.P.c("CaptureSession", "Open not allowed in state: " + this.f163986i);
                return I.n.n(new IllegalStateException("open() should not allow the state: " + this.f163986i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.InterfaceC17370d1
    public void h(androidx.camera.core.impl.w wVar) {
        synchronized (this.f163978a) {
            try {
                switch (this.f163986i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f163986i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f163983f = wVar;
                        break;
                    case OPENED:
                        this.f163983f = wVar;
                        if (wVar != null) {
                            if (!this.f163984g.keySet().containsAll(wVar.o())) {
                                C.P.c("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                C.P.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                x(this.f163983f);
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

    @Override // v.InterfaceC17370d1
    public void i(Map<DeferrableSurface, Long> map) {
        synchronized (this.f163978a) {
            this.f163989l = map;
        }
    }

    void r() {
        c cVar = this.f163986i;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            C.P.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f163986i = cVar2;
        this.f163982e = null;
        c.a<Void> aVar = this.f163988k;
        if (aVar != null) {
            aVar.c(null);
            this.f163988k = null;
        }
    }

    int v(List<androidx.camera.core.impl.i> list) {
        L0 l02;
        ArrayList arrayList;
        boolean z10;
        synchronized (this.f163978a) {
            try {
                if (this.f163986i != c.OPENED) {
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
                                    if (!this.f163984g.containsKey(next)) {
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
                                    androidx.camera.core.impl.w wVar = this.f163983f;
                                    if (wVar != null) {
                                        aVarK.e(wVar.k().g());
                                    }
                                    aVarK.e(iVar.g());
                                    CaptureRequest captureRequestE = E0.e(aVarK.h(), this.f163982e.h(), this.f163984g, false, this.f163994q);
                                    if (captureRequestE == null) {
                                        C.P.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<AbstractC3611h> it2 = iVar.c().iterator();
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
                if (this.f163990m.a(arrayList, z10)) {
                    this.f163982e.a();
                    l02.c(new L0.a() { // from class: v.b1
                        @Override // v.L0.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z11) {
                            C17367c1.m(this.f163967a, cameraCaptureSession, i10, z11);
                        }
                    });
                }
                if (this.f163991n.b(arrayList, z10)) {
                    l02.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                }
                return this.f163982e.k(arrayList, l02);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void w() {
        this.f163992o.e().addListener(new Runnable() { // from class: v.a1
            @Override // java.lang.Runnable
            public final void run() {
                C17367c1.j(this.f163957a);
            }
        }, H.a.a());
    }

    int x(androidx.camera.core.impl.w wVar) {
        synchronized (this.f163978a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (wVar == null) {
                C.P.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f163986i != c.OPENED) {
                C.P.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            androidx.camera.core.impl.i iVarK = wVar.k();
            if (iVarK.i().isEmpty()) {
                C.P.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f163982e.a();
                } catch (CameraAccessException e10) {
                    C.P.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C.P.a("CaptureSession", "Issuing request for session.");
                CaptureRequest captureRequestE = E0.e(iVarK, this.f163982e.h(), this.f163984g, true, this.f163994q);
                if (captureRequestE == null) {
                    C.P.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f163982e.i(captureRequestE, this.f163992o.d(o(iVarK.c(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e11) {
                C.P.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th2;
        }
    }

    C17367c1(x.g gVar, F.l0 l0Var) {
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
        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfilesD = this.f163993p.d()) != null) {
            C2979w c2979wB = fVar.b();
            Long lA = x.d.a(c2979wB, dynamicRangeProfilesD);
            if (lA == null) {
                C.P.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c2979wB);
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

    C17367c1(x.g gVar, F.l0 l0Var, boolean z10) {
        this.f163978a = new Object();
        this.f163979b = new ArrayList();
        this.f163984g = new HashMap();
        this.f163985h = Collections.EMPTY_LIST;
        this.f163986i = c.UNINITIALIZED;
        this.f163989l = new HashMap();
        this.f163990m = new C18343w();
        this.f163991n = new C18318A();
        this.f163986i = c.INITIALIZED;
        this.f163993p = gVar;
        this.f163980c = new d();
        this.f163992o = new C18340t(l0Var.a(CaptureNoResponseQuirk.class));
        this.f163994q = new C18346z(l0Var);
        this.f163995r = z10;
    }
}
