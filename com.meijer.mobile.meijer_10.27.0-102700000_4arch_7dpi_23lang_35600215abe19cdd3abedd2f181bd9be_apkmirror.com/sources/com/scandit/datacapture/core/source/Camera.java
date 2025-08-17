package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.CameraFactory;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettingsDefaults;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.module.source.a0;
import com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate;
import com.scandit.datacapture.core.internal.module.source.dynamicresolution.j;
import com.scandit.datacapture.core.internal.module.source.dynamicresolution.k;
import com.scandit.datacapture.core.internal.module.source.dynamicresolution.u;
import com.scandit.datacapture.core.internal.module.source.dynamicresolution.x;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0002OPJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010\"\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010$J\u0015\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020-¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020-H\u0000¢\u0006\u0004\b1\u0010/J\u0017\u00104\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020-H\u0000¢\u0006\u0004\b3\u0010/R\u001a\u0010:\u001a\u0002058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00128WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020\u00178WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR$\u0010N\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/scandit/datacapture/core/source/Camera;", "Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/source/AndroidCameraProxy;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_applySettings", "(Lcom/scandit/datacapture/core/source/CameraSettings;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/source/TorchState;", "torchState", "_applyTorchStateAsync", "(Lcom/scandit/datacapture/core/source/TorchState;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "()Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "_switchToDesiredState", "(Lcom/scandit/datacapture/core/source/FrameSourceState;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "whenDone", "", "switchToDesiredState", "(Lcom/scandit/datacapture/core/source/FrameSourceState;Lcom/scandit/datacapture/core/common/async/Callback;)V", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/source/FrameSourceListener;)V", "removeListener", "Ljava/lang/Runnable;", "applySettings", "(Lcom/scandit/datacapture/core/source/CameraSettings;Ljava/lang/Runnable;)V", "(Lcom/scandit/datacapture/core/source/FrameSourceState;)V", "", "jsonData", "updateFromJson", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "onDone", "_switchToDesiredTorchState", "(Lcom/scandit/datacapture/core/source/TorchState;Lkotlin/jvm/functions/Function0;)V", "Lcom/scandit/datacapture/core/source/TorchListener;", "addTorchListener", "(Lcom/scandit/datacapture/core/source/TorchListener;)V", "removeTorchListener", "_addWeakTorchListener$scandit_capture_core", "_addWeakTorchListener", "_removeWeakTorchListener$scandit_capture_core", "_removeWeakTorchListener", "Lcom/scandit/datacapture/core/internal/module/source/camera/behavior/CameraBehaviorDelegate;", "a", "Lcom/scandit/datacapture/core/internal/module/source/camera/behavior/CameraBehaviorDelegate;", "getBehaviorDelegate$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/source/camera/behavior/CameraBehaviorDelegate;", "behaviorDelegate", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "isTorchAvailable", "()Z", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraApi;", "getApi$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/source/NativeCameraApi;", "api", "value", "getDesiredTorchState", "()Lcom/scandit/datacapture/core/source/TorchState;", "setDesiredTorchState", "(Lcom/scandit/datacapture/core/source/TorchState;)V", "desiredTorchState", "Companion", "com/scandit/datacapture/core/source/b", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class Camera implements FrameSource, AndroidCameraProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final CameraFactory f125880e = new CameraFactory((CameraProfile) com.scandit.datacapture.core.internal.module.device.profiles.camera.d.f124223a.getValue());

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CameraBehaviorDelegate behaviorDelegate;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AndroidCameraProxy f125882b;

    /* renamed from: c, reason: collision with root package name */
    private final com.scandit.datacapture.core.internal.module.source.dynamicresolution.h f125883c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f125884d;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/source/Camera$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "Lcom/scandit/datacapture/core/source/Camera;", "getDefaultCamera", "(Lcom/scandit/datacapture/core/source/CameraSettings;)Lcom/scandit/datacapture/core/source/Camera;", "Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "getCamera", "(Lcom/scandit/datacapture/core/source/CameraPosition;Lcom/scandit/datacapture/core/source/CameraSettings;)Lcom/scandit/datacapture/core/source/Camera;", "", "jsonData", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/Camera;", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraDelegate;", "delegate", "create$scandit_capture_core", "(Lcom/scandit/datacapture/core/internal/module/source/NativeCameraDelegate;)Lcom/scandit/datacapture/core/source/Camera;", "create", "Lcom/scandit/datacapture/core/internal/module/source/CameraFactory;", "cameraFactory", "Lcom/scandit/datacapture/core/internal/module/source/CameraFactory;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        @JvmOverloads
        public final Camera getCamera(CameraPosition position) {
            Intrinsics.j(position, "position");
            return getCamera$default(this, position, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final Camera getDefaultCamera() {
            return getDefaultCamera$default(this, null, 1, null);
        }

        public static /* synthetic */ Camera getCamera$default(Companion companion, CameraPosition cameraPosition, CameraSettings cameraSettings, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cameraSettings = null;
            }
            return companion.getCamera(cameraPosition, cameraSettings);
        }

        public static /* synthetic */ Camera getDefaultCamera$default(Companion companion, CameraSettings cameraSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cameraSettings = null;
            }
            return companion.getDefaultCamera(cameraSettings);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final Camera create$scandit_capture_core(NativeCameraDelegate delegate) {
            Intrinsics.j(delegate, "delegate");
            NativeAndroidCamera nativeAndroidCameraCreate = NativeAndroidCamera.create(delegate, delegate.getCameraPosition(), delegate.getCameraId());
            Intrinsics.g(nativeAndroidCameraCreate);
            AndroidCameraProxyAdapter androidCameraProxyAdapter = new AndroidCameraProxyAdapter(nativeAndroidCameraCreate, null, 2, 0 == true ? 1 : 0);
            return new Camera(androidCameraProxyAdapter, new com.scandit.datacapture.core.internal.module.source.camera.behavior.c(androidCameraProxyAdapter), null);
        }

        @JvmStatic
        public final Camera fromJson(String jsonData) {
            Intrinsics.j(jsonData, "jsonData");
            FrameSource frameSourceFrameSourceFromJson = new FrameSourceDeserializer(CollectionsKt.m()).frameSourceFromJson(jsonData);
            if (frameSourceFrameSourceFromJson instanceof Camera) {
                return (Camera) frameSourceFrameSourceFromJson;
            }
            return null;
        }

        @JvmStatic
        @JvmOverloads
        public final Camera getCamera(CameraPosition position, CameraSettings settings) {
            Intrinsics.j(position, "position");
            return Camera.f125880e.a(position, settings);
        }

        @JvmStatic
        @JvmOverloads
        public final Camera getDefaultCamera(CameraSettings settings) {
            CameraFactory cameraFactory = Camera.f125880e;
            Camera cameraA = cameraFactory.a(CameraPosition.WORLD_FACING, settings);
            return cameraA == null ? cameraFactory.a(CameraPosition.USER_FACING, settings) : cameraA;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final Camera fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @JvmStatic
    @JvmOverloads
    public static final Camera getCamera(CameraPosition cameraPosition) {
        return INSTANCE.getCamera(cameraPosition);
    }

    @JvmStatic
    @JvmOverloads
    public static final Camera getDefaultCamera() {
        return INSTANCE.getDefaultCamera();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "applySettingsAsyncAndroid")
    public NativeWrappedFuture _applySettings(CameraSettings settings) {
        Intrinsics.j(settings, "settings");
        return this.f125882b._applySettings(settings);
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "applyTorchStateAsyncWrapped")
    public NativeWrappedFuture _applyTorchStateAsync(TorchState torchState) {
        Intrinsics.j(torchState, "torchState");
        return this.f125882b._applyTorchStateAsync(torchState);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    public NativeFrameSource _frameSourceImpl() {
        return this.f125882b.getF125873c();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeAndroidCamera getF125871a() {
        return this.f125882b.getF125871a();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    public NativeWrappedFuture _switchToDesiredState(FrameSourceState desiredState) {
        Intrinsics.j(desiredState, "desiredState");
        return this.f125882b._switchToDesiredState(desiredState);
    }

    @JvmOverloads
    public final void applySettings(CameraSettings settings) {
        Intrinsics.j(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "currentState")
    public FrameSourceState getCurrentState() {
        return this.f125882b.getCurrentState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "desiredState")
    public FrameSourceState getDesiredState() {
        return this.f125882b.getDesiredState();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "getPosition", property = "position")
    public CameraPosition getPosition() {
        return this.f125882b.getPosition();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "isTorchAvailable", property = "isTorchAvailable")
    public boolean isTorchAvailable() {
        return this.f125882b.isTorchAvailable();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    public void switchToDesiredState(FrameSourceState desiredState, Callback<? super Boolean> whenDone) {
        Intrinsics.j(desiredState, "desiredState");
        this.f125882b.switchToDesiredState(desiredState, whenDone);
    }

    public static /* synthetic */ void applySettings$default(Camera camera, CameraSettings cameraSettings, Runnable runnable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            runnable = null;
        }
        camera.applySettings(cameraSettings, runnable);
    }

    @JvmStatic
    @JvmOverloads
    public static final Camera getCamera(CameraPosition cameraPosition, CameraSettings cameraSettings) {
        return INSTANCE.getCamera(cameraPosition, cameraSettings);
    }

    @JvmStatic
    @JvmOverloads
    public static final Camera getDefaultCamera(CameraSettings cameraSettings) {
        return INSTANCE.getDefaultCamera(cameraSettings);
    }

    public final void _addWeakTorchListener$scandit_capture_core(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.behaviorDelegate.b(listener);
    }

    public final void _removeWeakTorchListener$scandit_capture_core(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.behaviorDelegate.a(listener);
    }

    public final void _switchToDesiredTorchState(TorchState torchState, Function0<Unit> onDone) {
        Intrinsics.j(torchState, "torchState");
        Intrinsics.j(onDone, "onDone");
        this.behaviorDelegate.a(torchState, onDone);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void addListener(FrameSourceListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f125884d.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void addTorchListener(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.behaviorDelegate.c(listener);
    }

    @JvmOverloads
    public final void applySettings(CameraSettings settings, Runnable whenDone) {
        k dynamicResolutionSettings;
        Intrinsics.j(settings, "settings");
        com.scandit.datacapture.core.internal.module.source.dynamicresolution.h hVar = this.f125883c;
        hVar.getClass();
        Intrinsics.j(this, "camera");
        Intrinsics.j(settings, "settings");
        Object property = settings.getProperty("dynamicResolution");
        Unit unitAndThen = null;
        Boolean bool = property instanceof Boolean ? (Boolean) property : null;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.e(bool, bool2)) {
            Object property2 = settings.getProperty("dynamicResolutionLowFps");
            Integer num = property2 instanceof Integer ? (Integer) property2 : null;
            Object property3 = settings.getProperty("dynamicResolutionHighPreviewOffset");
            Integer num2 = property3 instanceof Integer ? (Integer) property3 : null;
            Object property4 = settings.getProperty("dynamicResolutionMeasuringIntervalMillis");
            Integer num3 = property4 instanceof Integer ? (Integer) property4 : null;
            dynamicResolutionSettings = new k(num != null ? num.intValue() : NativeCameraSettingsDefaults.dynamicResolutionLowFps(), num2 != null ? num2.intValue() : NativeCameraSettingsDefaults.dynamicResolutionHighPreviewOffset(), num3 != null ? num3.intValue() : NativeCameraSettingsDefaults.dynamicResolutionMeasuringIntervalMillis(), VideoResolutionUtilsKt.toJson(VideoResolution.UHD4K));
        } else {
            dynamicResolutionSettings = null;
        }
        if (dynamicResolutionSettings != null) {
            MainThreadHelper mainThreadHelper = j.f125056a;
            j.a("Enabled\n\tlow fps         -> " + dynamicResolutionSettings.f125058a + "\n\thigh offset     -> " + dynamicResolutionSettings.f125059b + "\n\tmonitoring time -> " + dynamicResolutionSettings.f125060c);
            String resolution = ((com.scandit.datacapture.core.internal.module.source.camera.c) hVar.f125047a).a();
            if (resolution != null) {
                j.b("Restoring " + resolution + " resolution");
                Intrinsics.j(settings, "settings");
                Intrinsics.j(resolution, "resolution");
                if (Intrinsics.e(resolution, "quadHd")) {
                    settings.setProperty("quadHd", bool2);
                } else {
                    try {
                        settings.setPreferredResolution(VideoResolutionDeserializer.fromJson(resolution));
                        settings.setProperty("quadHd", Boolean.FALSE);
                    } catch (Throwable unused) {
                        MainThreadHelper mainThreadHelper2 = j.f125056a;
                        j.a(resolution.concat(" is not a valid resolution"));
                    }
                }
                hVar.f125049c.c();
            } else {
                Intrinsics.j(settings, "settings");
                settings.setPreferredResolution(VideoResolution.UHD4K);
                settings.setProperty("api", 2);
                x xVar = hVar.f125049c;
                synchronized (xVar) {
                    Intrinsics.j(dynamicResolutionSettings, "dynamicResolutionSettings");
                    if (!xVar.f125073c) {
                        u uVar = new u(dynamicResolutionSettings);
                        if (!Intrinsics.e(uVar, xVar.f125075e)) {
                            xVar.f125075e = uVar;
                            xVar.a();
                        }
                    }
                }
            }
        } else {
            hVar.f125049c.b();
        }
        final c cVar = new c(this, settings, whenDone);
        NativeCameraApi cameraApi = CameraApiUtilsKt.getCameraApi(settings);
        if (cameraApi != null) {
            if (cameraApi != getApi$scandit_capture_core()) {
                NativeCameraDelegate nativeCameraDelegateA = f125880e.a(getPosition(), cameraApi, settings);
                if (nativeCameraDelegateA != null) {
                    NativeWrappedFuture delegateAsync = getF125871a().setDelegateAsync(nativeCameraDelegateA);
                    Intrinsics.i(delegateAsync, "setDelegateAsync(...)");
                    unitAndThen = NativeExtensionsKt.andThen(delegateAsync, new Callback<Boolean>() { // from class: com.scandit.datacapture.core.source.Camera$updateDelegateIfNeeded$1$1$1
                        @Override // com.scandit.datacapture.core.common.async.Callback
                        public /* bridge */ /* synthetic */ void run(Boolean bool3) {
                            run(bool3.booleanValue());
                        }

                        public void run(boolean result) {
                            cVar.invoke();
                        }
                    });
                }
            } else {
                cVar.invoke();
                unitAndThen = Unit.f142422a;
            }
        }
        if (unitAndThen == null) {
            cVar.invoke();
        }
    }

    /* renamed from: getBehaviorDelegate$scandit_capture_core, reason: from getter */
    public final CameraBehaviorDelegate getBehaviorDelegate() {
        return this.behaviorDelegate;
    }

    public final TorchState getDesiredTorchState() {
        return this.behaviorDelegate.b();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void removeListener(FrameSourceListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f125884d.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeTorchListener(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.behaviorDelegate.d(listener);
    }

    public final void setDesiredTorchState(TorchState value) {
        Intrinsics.j(value, "value");
        this.behaviorDelegate.a(value, com.scandit.datacapture.core.internal.module.source.camera.behavior.a.f125021a);
    }

    public final void switchToDesiredState(FrameSourceState desiredState) {
        Intrinsics.j(desiredState, "desiredState");
        switchToDesiredState(desiredState, null);
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new FrameSourceDeserializer(CollectionsKt.m()).updateFrameSourceFromJson(this, jsonData);
    }

    public Camera(AndroidCameraProxy androidCameraProxy, CameraBehaviorDelegate cameraBehaviorDelegate, DefaultConstructorMarker defaultConstructorMarker) {
        this.behaviorDelegate = cameraBehaviorDelegate;
        this.f125882b = androidCameraProxy;
        d applyResolution = new d(this);
        com.scandit.datacapture.core.internal.module.source.camera.c dynamicResolutionStore = com.scandit.datacapture.core.internal.module.source.camera.a.f125020a;
        if (dynamicResolutionStore == null) {
            dynamicResolutionStore = new com.scandit.datacapture.core.internal.module.source.camera.c(AppAndroidEnvironment.INSTANCE.getApplicationContext());
            com.scandit.datacapture.core.internal.module.source.camera.a.f125020a = dynamicResolutionStore;
        }
        Intrinsics.j(dynamicResolutionStore, "dynamicResolutionStore");
        Intrinsics.j(applyResolution, "applyResolution");
        com.scandit.datacapture.core.internal.module.source.dynamicresolution.h hVar = new com.scandit.datacapture.core.internal.module.source.dynamicresolution.h(dynamicResolutionStore, applyResolution);
        this.f125883c = hVar;
        this.f125884d = new CopyOnWriteArraySet();
        getF125871a().addListenerAsync(new a0(new b(this), this));
        getF125871a().addListenerAsync(new a0(hVar, this));
    }

    public final NativeCameraApi getApi$scandit_capture_core() {
        NativeCameraApi api = getF125871a().getApi();
        Intrinsics.i(api, "getApi(...)");
        return api;
    }
}
