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
import com.scandit.datacapture.core.internal.module.source.api2.C13343p;
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
/* loaded from: classes11.dex */
public final class C13343p extends NativeCameraDelegate {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f124951v = {Reflection.j(new PropertyReference1Impl(Reflection.b(C13343p.class), "backgroundHandler", "getBackgroundHandler()Landroid/os/Handler;"))};

    /* renamed from: a, reason: collision with root package name */
    public final N f124952a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f124953b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f124954c;

    /* renamed from: d, reason: collision with root package name */
    public final S f124955d;

    /* renamed from: e, reason: collision with root package name */
    public final w0 f124956e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC13350x f124957f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f124958g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f124959h;

    /* renamed from: i, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.utils.h f124960i;

    /* renamed from: j, reason: collision with root package name */
    public p0 f124961j;

    /* renamed from: k, reason: collision with root package name */
    public CameraDevice f124962k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC13328b0 f124963l;

    /* renamed from: m, reason: collision with root package name */
    public NativeCameraDelegateSettings f124964m;

    /* renamed from: n, reason: collision with root package name */
    public Size2 f124965n;

    /* renamed from: o, reason: collision with root package name */
    public int f124966o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f124967p;

    /* renamed from: q, reason: collision with root package name */
    public final m0 f124968q;

    /* renamed from: r, reason: collision with root package name */
    public float f124969r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f124970s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f124971t;

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f124972u;

    public final Handler a() {
        Object objInvoke;
        com.scandit.datacapture.core.internal.module.utils.h hVar = this.f124960i;
        KProperty property = f124951v[0];
        hVar.getClass();
        Intrinsics.j(this, "thisRef");
        Intrinsics.j(property, "property");
        synchronized (hVar) {
            objInvoke = hVar.f125333b;
            if (objInvoke == null) {
                Function0 function0 = hVar.f125332a;
                Intrinsics.g(function0);
                objInvoke = function0.invoke();
                if (objInvoke != null) {
                    hVar.f125333b = objInvoke;
                    hVar.f125332a = null;
                }
            }
        }
        return (Handler) objInvoke;
    }

    public final void b() throws CameraAccessException {
        InterfaceC13328b0 interfaceC13328b0 = this.f124963l;
        if (interfaceC13328b0 != null) {
            ((d0) interfaceC13328b0).b();
        }
        this.f124963l = null;
        CameraDevice cameraDevice = this.f124962k;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.f124962k = null;
        p0 p0Var = this.f124961j;
        if (p0Var != null) {
            u0 u0Var = (u0) p0Var;
            u0Var.f124997a.dispose();
            ((Surface) u0Var.f124999c.getValue()).release();
        }
        this.f124961j = null;
        this.f124970s = false;
        this.f124964m = null;
    }

    public C13343p(O cameraInfo, com.scandit.datacapture.core.internal.module.source.H frameDataCallback, com.scandit.datacapture.core.internal.module.source.I priorityCameraSwitchStateCallback, U cameraProvider, z0 surfaceProvider, D cameraCapture, n0 sceneChangeDetector, g0 frameDataConverter, Function0 handlerProvider) {
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(frameDataCallback, "frameDataCallback");
        Intrinsics.j(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        Intrinsics.j(cameraProvider, "cameraProvider");
        Intrinsics.j(surfaceProvider, "surfaceProvider");
        Intrinsics.j(cameraCapture, "cameraCapture");
        Intrinsics.j(sceneChangeDetector, "sceneChangeDetector");
        Intrinsics.j(frameDataConverter, "frameDataConverter");
        Intrinsics.j(handlerProvider, "handlerProvider");
        this.f124952a = cameraInfo;
        this.f124953b = frameDataCallback;
        this.f124954c = priorityCameraSwitchStateCallback;
        this.f124955d = cameraProvider;
        this.f124956e = surfaceProvider;
        this.f124957f = cameraCapture;
        this.f124958g = sceneChangeDetector;
        this.f124959h = frameDataConverter;
        this.f124960i = new com.scandit.datacapture.core.internal.module.utils.h(handlerProvider);
        this.f124965n = new Size2(0.0f, 0.0f);
        this.f124968q = new m0(cameraInfo);
        if (cameraInfo.f124853b.isTimestampRealtime()) {
            Intrinsics.j("CameraApi2 delegate. Timestamp source is realtime", "message");
            FS.log_i("sdc-core", "CameraApi2 delegate. Timestamp source is realtime");
        } else {
            Intrinsics.j("CameraApi2 delegate. Timestamp source is not realtime", "message");
            FS.log_i("sdc-core", "CameraApi2 delegate. Timestamp source is not realtime");
        }
        this.f124972u = new Runnable() { // from class: du.i
            @Override // java.lang.Runnable
            public final void run() throws CameraAccessException {
                C13343p.a(this.f127629a);
            }
        };
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void bootUpWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(whenDone, "whenDone");
        a(settings, new C13333f(whenDone));
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraApi getCameraApi() {
        return NativeCameraApi.CAMERA2;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final String getCameraId() {
        return ((O) this.f124952a).f124853b.getId();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraInfo getCameraInfo() {
        ClosedRange closedRangeB = ((O) this.f124952a).b();
        ArrayList arrayListC = ((O) this.f124952a).c();
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
        O o10 = (O) this.f124952a;
        int facing = o10.f124853b.getFacing();
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
        O o10 = (O) this.f124952a;
        return o10.d() == 1 ? o10.h() : -o10.h();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final ArrayList getFrameResolutions() {
        ArrayList arrayListC = ((O) this.f124952a).c();
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
        O o10 = (O) this.f124952a;
        o10.getClass();
        EnumSet enumSetNoneOf = EnumSet.noneOf(NativeFocusMode.class);
        boolean z10 = o10.f124852a.a().f124227b;
        for (int i10 : o10.a()) {
            if (i10 == 0) {
                enumSetNoneOf.add(NativeFocusMode.FIXED);
            } else if (i10 == 1) {
                enumSetNoneOf.add(NativeFocusMode.AUTO);
            } else if ((i10 == 3 || i10 == 4) && !z10) {
                enumSetNoneOf.add(NativeFocusMode.AUTO);
            }
        }
        if (o10.f124852a.h()) {
            enumSetNoneOf.add(NativeFocusMode.FIXED);
        }
        Intrinsics.g(enumSetNoneOf);
        return enumSetNoneOf;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean goToSleep() {
        if (this.f124969r <= 0.0f) {
            a(false);
            InterfaceC13328b0 interfaceC13328b0 = this.f124963l;
            boolean zA = interfaceC13328b0 != null ? ((d0) interfaceC13328b0).a() : true;
            this.f124970s = false;
            return zA;
        }
        a(false);
        long j10 = (long) (this.f124969r * 1000);
        Handler handlerA = a();
        if (handlerA != null) {
            handlerA.postDelayed(this.f124972u, j10);
        }
        this.f124968q.a(Boolean.FALSE);
        return b(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasManualLensPositionControl() {
        return ((O) this.f124952a).i();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasNoFocusSystem() {
        int[] iArrA = ((O) this.f124952a).a();
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
        return ((O) this.f124952a).f124853b.isTimestampRealtime();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTorchAvailable() {
        return ((O) this.f124952a).j();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void setBatterySavingMode(boolean z10) {
        if (this.f124971t == z10) {
            return;
        }
        this.f124971t = z10;
        try {
            m0 m0Var = this.f124968q;
            m0Var.f124940h = z10;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = m0Var.f124937e;
            if (nativeCameraDelegateSettings != null) {
                m0Var.a(nativeCameraDelegateSettings, (O) m0Var.f124933a, z10);
            }
            b(this);
        } catch (Exception e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean setFixedLensPosition(float f10) {
        if (((O) this.f124952a).i()) {
            this.f124968q.a(f10);
            return b(this);
        }
        Intrinsics.j("setFixedLensPosition() has no effect on a device without manual lens position control", "message");
        FS.log_i("sdc-core", "setFixedLensPosition() has no effect on a device without manual lens position control");
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldMirrorAroundYAxis() {
        return ((O) this.f124952a).d() == 0;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldUseContinuous(boolean z10) throws Exception {
        O o10 = (O) this.f124952a;
        o10.getClass();
        try {
            if (!o10.f124852a.a().f124227b) {
                return true;
            }
            if (z10) {
                return o10.f124852a.i();
            }
            return false;
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startContinuousFocusInArea(Rect rect) {
        this.f124968q.b(rect);
        this.f124967p = rect;
        return b(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startSingleShotFocusInArea(Rect rect) {
        InterfaceC13328b0 interfaceC13328b0 = this.f124963l;
        if (interfaceC13328b0 == null) {
            return false;
        }
        this.f124968q.a();
        d0 d0Var = (d0) interfaceC13328b0;
        if (!d0Var.a(this.f124968q)) {
            return false;
        }
        this.f124968q.c(rect);
        this.f124967p = rect;
        if (!d0Var.a(this.f124968q)) {
            return false;
        }
        this.f124968q.b();
        return b(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void startWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(whenDone, "whenDone");
        try {
            a(settings, new C13338k(whenDone, this));
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
            this.f124964m = settings;
            this.f124968q.a(settings);
            n0 n0Var = this.f124958g;
            boolean sceneChangeDetection = settings.getSceneChangeDetection();
            o0 o0Var = (o0) n0Var;
            o0Var.f124947a = sceneChangeDetection;
            if (sceneChangeDetection) {
                String modelName = Build.MODEL;
                Intrinsics.i(modelName, "MODEL");
                Intrinsics.j(modelName, "modelName");
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.i(ENGLISH, "ENGLISH");
                String lowerCase = modelName.toLowerCase(ENGLISH);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                String string = StringsKt.y1(StringsKt.Q(lowerCase, "samsung-", "", false, 4, null)).toString();
                o0Var.f124948b.getClass();
                Intrinsics.j("CAMCTRL Scene Change Detection enabled", "message");
                FS.log_i("sdc-core", "CAMCTRL Scene Change Detection enabled");
                com.scandit.datacapture.core.internal.module.utils.i.a("CAMCTRL device model: " + string + ", SCD version: 0.6.8");
            }
            this.f124969r = settings.getStageOneStandbyDuration();
            if (Intrinsics.e(settings.getFrameResolution(), this.f124965n)) {
                if (currentState == FrameSourceState.ON) {
                    b(this);
                    return;
                }
                return;
            }
            int i10 = AbstractC13332e.f124895a[currentState.ordinal()];
            if (i10 == 1) {
                this.f124954c.invoke(FrameSourceState.OFF);
                this.f124954c.invoke(FrameSourceState.ON);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f124954c.invoke(FrameSourceState.OFF);
                this.f124954c.invoke(FrameSourceState.STANDBY);
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
            a(new C13342o(whenDone));
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
        if (this.f124962k != null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        n0 n0Var = this.f124958g;
        boolean sceneChangeDetection = nativeCameraDelegateSettings.getSceneChangeDetection();
        o0 o0Var = (o0) n0Var;
        o0Var.f124947a = sceneChangeDetection;
        if (sceneChangeDetection) {
            String modelName = Build.MODEL;
            Intrinsics.i(modelName, "MODEL");
            Intrinsics.j(modelName, "modelName");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.i(ENGLISH, "ENGLISH");
            String lowerCase = modelName.toLowerCase(ENGLISH);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            String string = StringsKt.y1(StringsKt.Q(lowerCase, "samsung-", "", false, 4, null)).toString();
            o0Var.f124948b.getClass();
            Intrinsics.j("CAMCTRL Scene Change Detection enabled", "message");
            FS.log_i("sdc-core", "CAMCTRL Scene Change Detection enabled");
            com.scandit.datacapture.core.internal.module.utils.i.a("CAMCTRL device model: " + string + ", SCD version: 0.6.8");
        }
        this.f124968q.a(nativeCameraDelegateSettings);
        this.f124964m = nativeCameraDelegateSettings;
        Size2 frameResolution = nativeCameraDelegateSettings.getFrameResolution();
        Intrinsics.i(frameResolution, "getFrameResolution(...)");
        this.f124965n = frameResolution;
        this.f124969r = nativeCameraDelegateSettings.getStageOneStandbyDuration();
        Handler handler = a();
        if (handler == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        Intrinsics.j(nativeCameraDelegateSettings, "<this>");
        i0 frameSize = new i0((int) nativeCameraDelegateSettings.getFrameResolution().getWidth(), (int) nativeCameraDelegateSettings.getFrameResolution().getHeight(), nativeCameraDelegateSettings.getMinPreviewShortSide());
        w0 w0Var = this.f124956e;
        int iH = ((O) this.f124952a).h();
        C13334g callback = new C13334g(this, frameSize, function1);
        z0 z0Var = (z0) w0Var;
        z0Var.getClass();
        Intrinsics.j(handler, "handler");
        Intrinsics.j(frameSize, "frameSize");
        Intrinsics.j(callback, "callback");
        Subscription subscriptionStart = z0Var.f125012a.start();
        subscriptionStart.use(new y0(frameSize, iH, handler, callback, subscriptionStart));
        ((U) this.f124955d).a(handler, ((O) this.f124952a).f124853b.getId(), new C13335h(this, frameSize, function1));
    }

    public static boolean b(C13343p c13343p) {
        C13341n c13341n = C13341n.f124945a;
        if (c13343p.f124962k == null) {
            return false;
        }
        m0 m0Var = c13343p.f124968q;
        if (m0Var.f124944l.hashCode() == m0Var.f124943k) {
            return true;
        }
        InterfaceC13328b0 interfaceC13328b0 = c13343p.f124963l;
        if (interfaceC13328b0 == null) {
            return false;
        }
        return ((d0) interfaceC13328b0).a(c13343p.f124968q, new C13329c(c13343p, c13341n));
    }

    public static final void a(C13343p this$0) throws CameraAccessException {
        Intrinsics.j(this$0, "this$0");
        this$0.a(false);
        InterfaceC13328b0 interfaceC13328b0 = this$0.f124963l;
        if (interfaceC13328b0 != null) {
            ((d0) interfaceC13328b0).a();
        }
        this$0.f124970s = false;
    }

    public final void a(Function1 function1) {
        try {
            Handler handlerA = a();
            if (handlerA != null) {
                handlerA.removeCallbacks(this.f124972u);
            }
            a(true);
            boolean z10 = this.f124971t;
            m0 m0Var = this.f124968q;
            m0Var.f124940h = z10;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = m0Var.f124937e;
            if (nativeCameraDelegateSettings != null) {
                m0Var.a(nativeCameraDelegateSettings, (O) m0Var.f124933a, z10);
            }
            NativeCameraDelegateSettings nativeCameraDelegateSettings2 = this.f124964m;
            if (nativeCameraDelegateSettings2 != null) {
                this.f124968q.a(nativeCameraDelegateSettings2);
            }
            b(this);
            if (this.f124970s) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            InterfaceC13328b0 interfaceC13328b0 = this.f124963l;
            if (interfaceC13328b0 != null) {
                ((d0) interfaceC13328b0).a(this.f124968q, new C13329c(this, function1));
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
        p0 p0Var = this.f124961j;
        if (p0Var != null) {
            ((u0) p0Var).f124997a.use(new s0(z10));
        }
        InterfaceC13328b0 interfaceC13328b0 = this.f124963l;
        if (interfaceC13328b0 != null) {
            ((d0) interfaceC13328b0).f124892e.f124844c = z10;
        }
    }
}
