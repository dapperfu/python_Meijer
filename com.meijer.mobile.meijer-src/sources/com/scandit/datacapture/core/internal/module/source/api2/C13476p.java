package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import com.fullstory.FS;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegateSettings;
import com.scandit.datacapture.core.internal.module.source.NativeCameraInfo;
import com.scandit.datacapture.core.internal.module.source.NativeFocusMode;
import com.scandit.datacapture.core.internal.module.source.api2.C13476p;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSourceState;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.ClosedRange;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13476p extends NativeCameraDelegate {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f125903v = {Reflection.j(new PropertyReference1Impl(Reflection.b(C13476p.class), "backgroundHandler", "getBackgroundHandler()Landroid/os/Handler;"))};

    /* renamed from: a, reason: collision with root package name */
    public final N f125904a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f125905b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f125906c;

    /* renamed from: d, reason: collision with root package name */
    public final S f125907d;

    /* renamed from: e, reason: collision with root package name */
    public final w0 f125908e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC13483x f125909f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f125910g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f125911h;

    /* renamed from: i, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.utils.h f125912i;

    /* renamed from: j, reason: collision with root package name */
    public p0 f125913j;

    /* renamed from: k, reason: collision with root package name */
    public CameraDevice f125914k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC13461b0 f125915l;

    /* renamed from: m, reason: collision with root package name */
    public NativeCameraDelegateSettings f125916m;

    /* renamed from: n, reason: collision with root package name */
    public Size2 f125917n;

    /* renamed from: o, reason: collision with root package name */
    public int f125918o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f125919p;

    /* renamed from: q, reason: collision with root package name */
    public final m0 f125920q;

    /* renamed from: r, reason: collision with root package name */
    public float f125921r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f125922s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f125923t;

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f125924u;

    public final Handler a() {
        Object objInvoke;
        com.scandit.datacapture.core.internal.module.utils.h hVar = this.f125912i;
        KProperty property = f125903v[0];
        hVar.getClass();
        Intrinsics.j(this, "thisRef");
        Intrinsics.j(property, "property");
        synchronized (hVar) {
            objInvoke = hVar.f126285b;
            if (objInvoke == null) {
                Function0 function0 = hVar.f126284a;
                Intrinsics.g(function0);
                objInvoke = function0.invoke();
                if (objInvoke != null) {
                    hVar.f126285b = objInvoke;
                    hVar.f126284a = null;
                }
            }
        }
        return (Handler) objInvoke;
    }

    public final void b() throws CameraAccessException {
        InterfaceC13461b0 interfaceC13461b0 = this.f125915l;
        if (interfaceC13461b0 != null) {
            ((d0) interfaceC13461b0).b();
        }
        this.f125915l = null;
        CameraDevice cameraDevice = this.f125914k;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.f125914k = null;
        p0 p0Var = this.f125913j;
        if (p0Var != null) {
            u0 u0Var = (u0) p0Var;
            u0Var.f125949a.dispose();
            ((Surface) u0Var.f125951c.getValue()).release();
        }
        this.f125913j = null;
        this.f125922s = false;
        this.f125916m = null;
    }

    public C13476p(O cameraInfo, com.scandit.datacapture.core.internal.module.source.H frameDataCallback, com.scandit.datacapture.core.internal.module.source.I priorityCameraSwitchStateCallback, U cameraProvider, z0 surfaceProvider, D cameraCapture, n0 sceneChangeDetector, g0 frameDataConverter, Function0 handlerProvider) {
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(frameDataCallback, "frameDataCallback");
        Intrinsics.j(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        Intrinsics.j(cameraProvider, "cameraProvider");
        Intrinsics.j(surfaceProvider, "surfaceProvider");
        Intrinsics.j(cameraCapture, "cameraCapture");
        Intrinsics.j(sceneChangeDetector, "sceneChangeDetector");
        Intrinsics.j(frameDataConverter, "frameDataConverter");
        Intrinsics.j(handlerProvider, "handlerProvider");
        this.f125904a = cameraInfo;
        this.f125905b = frameDataCallback;
        this.f125906c = priorityCameraSwitchStateCallback;
        this.f125907d = cameraProvider;
        this.f125908e = surfaceProvider;
        this.f125909f = cameraCapture;
        this.f125910g = sceneChangeDetector;
        this.f125911h = frameDataConverter;
        this.f125912i = new com.scandit.datacapture.core.internal.module.utils.h(handlerProvider);
        this.f125917n = new Size2(0.0f, 0.0f);
        this.f125920q = new m0(cameraInfo);
        if (cameraInfo.f125805b.isTimestampRealtime()) {
            Intrinsics.j("CameraApi2 delegate. Timestamp source is realtime", "message");
            FS.log_i("sdc-core", "CameraApi2 delegate. Timestamp source is realtime");
        } else {
            Intrinsics.j("CameraApi2 delegate. Timestamp source is not realtime", "message");
            FS.log_i("sdc-core", "CameraApi2 delegate. Timestamp source is not realtime");
        }
        this.f125924u = new Runnable() { // from class: du.i
            @Override // java.lang.Runnable
            public final void run() throws CameraAccessException {
                C13476p.a(this.f128876a);
            }
        };
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void bootUpWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(whenDone, "whenDone");
        a(settings, new C13466f(whenDone));
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraApi getCameraApi() {
        return NativeCameraApi.CAMERA2;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final String getCameraId() {
        return ((O) this.f125904a).f125805b.getId();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraInfo getCameraInfo() {
        ClosedRange closedRangeB = ((O) this.f125904a).b();
        ArrayList arrayListC = ((O) this.f125904a).c();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            arrayList.add(Size2UtilsKt.Size2(size.getWidth(), size.getHeight()));
        }
        return new NativeCameraInfo(new NativeFloatRange(((Number) closedRangeB.getStart()).floatValue(), ((Number) closedRangeB.getEndInclusive()).floatValue()), arrayList);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final CameraPosition getCameraPosition() {
        O o10 = (O) this.f125904a;
        int facing = o10.f125805b.getFacing();
        if (facing == 0) {
            return CameraPosition.USER_FACING;
        }
        if (facing == 1) {
            return CameraPosition.WORLD_FACING;
        }
        throw new AssertionError("Unsupported Camera API 2 facing " + o10.d());
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final int getCameraToNativeDeviceOrientation() {
        O o10 = (O) this.f125904a;
        return o10.d() == 1 ? o10.h() : -o10.h();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final ArrayList getFrameResolutions() {
        ArrayList arrayListC = ((O) this.f125904a).c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(arrayListC, 10));
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            arrayList.add(Size2UtilsKt.Size2(size.getWidth(), size.getHeight()));
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final EnumSet getSupportedFocusModesBits() {
        O o10 = (O) this.f125904a;
        o10.getClass();
        EnumSet enumSetNoneOf = EnumSet.noneOf(NativeFocusMode.class);
        boolean z10 = o10.f125804a.a().f125179b;
        for (int i10 : o10.a()) {
            if (i10 == 0) {
                enumSetNoneOf.add(NativeFocusMode.FIXED);
            } else if (i10 == 1) {
                enumSetNoneOf.add(NativeFocusMode.AUTO);
            } else if ((i10 == 3 || i10 == 4) && !z10) {
                enumSetNoneOf.add(NativeFocusMode.AUTO);
            }
        }
        if (o10.f125804a.h()) {
            enumSetNoneOf.add(NativeFocusMode.FIXED);
        }
        Intrinsics.g(enumSetNoneOf);
        return enumSetNoneOf;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean goToSleep() {
        if (this.f125921r <= 0.0f) {
            a(false);
            InterfaceC13461b0 interfaceC13461b0 = this.f125915l;
            boolean zA = interfaceC13461b0 != null ? ((d0) interfaceC13461b0).a() : true;
            this.f125922s = false;
            return zA;
        }
        a(false);
        long j10 = (long) (this.f125921r * 1000);
        Handler handlerA = a();
        if (handlerA != null) {
            handlerA.postDelayed(this.f125924u, j10);
        }
        this.f125920q.a(Boolean.FALSE);
        return b(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasManualLensPositionControl() {
        return ((O) this.f125904a).i();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasNoFocusSystem() {
        int[] iArrA = ((O) this.f125904a).a();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrA) {
            if (i10 != 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList.isEmpty();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTimestampRealtime() {
        return ((O) this.f125904a).f125805b.isTimestampRealtime();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTorchAvailable() {
        return ((O) this.f125904a).j();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void setBatterySavingMode(boolean z10) {
        if (this.f125923t == z10) {
            return;
        }
        this.f125923t = z10;
        try {
            m0 m0Var = this.f125920q;
            m0Var.f125892h = z10;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = m0Var.f125889e;
            if (nativeCameraDelegateSettings != null) {
                m0Var.a(nativeCameraDelegateSettings, (O) m0Var.f125885a, z10);
            }
            b(this);
        } catch (Exception e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean setFixedLensPosition(float f10) {
        if (((O) this.f125904a).i()) {
            this.f125920q.a(f10);
            return b(this);
        }
        Intrinsics.j("setFixedLensPosition() has no effect on a device without manual lens position control", "message");
        FS.log_i("sdc-core", "setFixedLensPosition() has no effect on a device without manual lens position control");
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldMirrorAroundYAxis() {
        return ((O) this.f125904a).d() == 0;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldUseContinuous(boolean z10) throws Exception {
        O o10 = (O) this.f125904a;
        o10.getClass();
        try {
            if (!o10.f125804a.a().f125179b) {
                return true;
            }
            if (z10) {
                return o10.f125804a.i();
            }
            return false;
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startContinuousFocusInArea(Rect rect) {
        this.f125920q.b(rect);
        this.f125919p = rect;
        return b(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startSingleShotFocusInArea(Rect rect) {
        InterfaceC13461b0 interfaceC13461b0 = this.f125915l;
        if (interfaceC13461b0 == null) {
            return false;
        }
        this.f125920q.a();
        d0 d0Var = (d0) interfaceC13461b0;
        if (!d0Var.a(this.f125920q)) {
            return false;
        }
        this.f125920q.c(rect);
        this.f125919p = rect;
        if (!d0Var.a(this.f125920q)) {
            return false;
        }
        this.f125920q.b();
        return b(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void startWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(whenDone, "whenDone");
        try {
            a(settings, new C13471k(whenDone, this));
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void updateSettings(NativeCameraDelegateSettings settings, FrameSourceState currentState) throws Exception {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(currentState, "currentState");
        try {
            this.f125916m = settings;
            this.f125920q.a(settings);
            n0 n0Var = this.f125910g;
            boolean sceneChangeDetection = settings.getSceneChangeDetection();
            o0 o0Var = (o0) n0Var;
            o0Var.f125899a = sceneChangeDetection;
            if (sceneChangeDetection) {
                String modelName = Build.MODEL;
                Intrinsics.i(modelName, "MODEL");
                Intrinsics.j(modelName, "modelName");
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.i(ENGLISH, "ENGLISH");
                String lowerCase = modelName.toLowerCase(ENGLISH);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                String string = StringsKt.C1(StringsKt.Q(lowerCase, "samsung-", "", false, 4, null)).toString();
                o0Var.f125900b.getClass();
                Intrinsics.j("CAMCTRL Scene Change Detection enabled", "message");
                FS.log_i("sdc-core", "CAMCTRL Scene Change Detection enabled");
                com.scandit.datacapture.core.internal.module.utils.i.a("CAMCTRL device model: " + string + ", SCD version: 0.6.8");
            }
            this.f125921r = settings.getStageOneStandbyDuration();
            if (Intrinsics.e(settings.getFrameResolution(), this.f125917n)) {
                if (currentState == FrameSourceState.ON) {
                    b(this);
                    return;
                }
                return;
            }
            int i10 = AbstractC13465e.f125847a[currentState.ordinal()];
            if (i10 == 1) {
                this.f125906c.invoke(FrameSourceState.OFF);
                this.f125906c.invoke(FrameSourceState.ON);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f125906c.invoke(FrameSourceState.OFF);
                this.f125906c.invoke(FrameSourceState.STANDBY);
            }
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void wakeUp(NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.j(whenDone, "whenDone");
        try {
            a(new C13475o(whenDone));
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void shutDown() throws Exception {
        try {
            b();
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    public final void a(NativeCameraDelegateSettings nativeCameraDelegateSettings, Function1 function1) {
        if (this.f125914k != null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        n0 n0Var = this.f125910g;
        boolean sceneChangeDetection = nativeCameraDelegateSettings.getSceneChangeDetection();
        o0 o0Var = (o0) n0Var;
        o0Var.f125899a = sceneChangeDetection;
        if (sceneChangeDetection) {
            String modelName = Build.MODEL;
            Intrinsics.i(modelName, "MODEL");
            Intrinsics.j(modelName, "modelName");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.i(ENGLISH, "ENGLISH");
            String lowerCase = modelName.toLowerCase(ENGLISH);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            String string = StringsKt.C1(StringsKt.Q(lowerCase, "samsung-", "", false, 4, null)).toString();
            o0Var.f125900b.getClass();
            Intrinsics.j("CAMCTRL Scene Change Detection enabled", "message");
            FS.log_i("sdc-core", "CAMCTRL Scene Change Detection enabled");
            com.scandit.datacapture.core.internal.module.utils.i.a("CAMCTRL device model: " + string + ", SCD version: 0.6.8");
        }
        this.f125920q.a(nativeCameraDelegateSettings);
        this.f125916m = nativeCameraDelegateSettings;
        Size2 frameResolution = nativeCameraDelegateSettings.getFrameResolution();
        Intrinsics.i(frameResolution, "getFrameResolution(...)");
        this.f125917n = frameResolution;
        this.f125921r = nativeCameraDelegateSettings.getStageOneStandbyDuration();
        Handler handler = a();
        if (handler == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        Intrinsics.j(nativeCameraDelegateSettings, "<this>");
        i0 frameSize = new i0((int) nativeCameraDelegateSettings.getFrameResolution().getWidth(), (int) nativeCameraDelegateSettings.getFrameResolution().getHeight(), nativeCameraDelegateSettings.getMinPreviewShortSide());
        w0 w0Var = this.f125908e;
        int iH = ((O) this.f125904a).h();
        C13467g callback = new C13467g(this, frameSize, function1);
        z0 z0Var = (z0) w0Var;
        z0Var.getClass();
        Intrinsics.j(handler, "handler");
        Intrinsics.j(frameSize, "frameSize");
        Intrinsics.j(callback, "callback");
        Subscription subscriptionStart = z0Var.f125964a.start();
        subscriptionStart.use(new y0(frameSize, iH, handler, callback, subscriptionStart));
        ((U) this.f125907d).a(handler, ((O) this.f125904a).f125805b.getId(), new C13468h(this, frameSize, function1));
    }

    public static boolean b(C13476p c13476p) {
        C13474n c13474n = C13474n.f125897a;
        if (c13476p.f125914k == null) {
            return false;
        }
        m0 m0Var = c13476p.f125920q;
        if (m0Var.f125896l.hashCode() == m0Var.f125895k) {
            return true;
        }
        InterfaceC13461b0 interfaceC13461b0 = c13476p.f125915l;
        if (interfaceC13461b0 == null) {
            return false;
        }
        return ((d0) interfaceC13461b0).a(c13476p.f125920q, new C13462c(c13476p, c13474n));
    }

    public static final void a(C13476p this$0) throws CameraAccessException {
        Intrinsics.j(this$0, "this$0");
        this$0.a(false);
        InterfaceC13461b0 interfaceC13461b0 = this$0.f125915l;
        if (interfaceC13461b0 != null) {
            ((d0) interfaceC13461b0).a();
        }
        this$0.f125922s = false;
    }

    public final void a(Function1 function1) {
        try {
            Handler handlerA = a();
            if (handlerA != null) {
                handlerA.removeCallbacks(this.f125924u);
            }
            a(true);
            boolean z10 = this.f125923t;
            m0 m0Var = this.f125920q;
            m0Var.f125892h = z10;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = m0Var.f125889e;
            if (nativeCameraDelegateSettings != null) {
                m0Var.a(nativeCameraDelegateSettings, (O) m0Var.f125885a, z10);
            }
            NativeCameraDelegateSettings nativeCameraDelegateSettings2 = this.f125916m;
            if (nativeCameraDelegateSettings2 != null) {
                this.f125920q.a(nativeCameraDelegateSettings2);
            }
            b(this);
            if (this.f125922s) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            InterfaceC13461b0 interfaceC13461b0 = this.f125915l;
            if (interfaceC13461b0 != null) {
                ((d0) interfaceC13461b0).a(this.f125920q, new C13462c(this, function1));
            } else {
                Intrinsics.j("No camera capture session to wake up", "message");
                FS.log_e("sdc-core", "No camera capture session to wake up");
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            function1.invoke(Boolean.FALSE);
        }
    }

    public final void a(boolean z10) {
        p0 p0Var = this.f125913j;
        if (p0Var != null) {
            ((u0) p0Var).f125949a.use(new s0(z10));
        }
        InterfaceC13461b0 interfaceC13461b0 = this.f125915l;
        if (interfaceC13461b0 != null) {
            ((d0) interfaceC13461b0).f125844e.f125796c = z10;
        }
    }
}
