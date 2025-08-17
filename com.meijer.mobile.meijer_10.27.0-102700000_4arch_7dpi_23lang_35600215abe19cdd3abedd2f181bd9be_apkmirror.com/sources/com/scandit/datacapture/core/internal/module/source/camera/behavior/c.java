package com.scandit.datacapture.core.internal.module.source.camera.behavior;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.module.source.dynamicresolution.j;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.source.AndroidCameraProxy;
import com.scandit.datacapture.core.source.AndroidCameraProxyAdapter;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.TorchListener;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.source.VideoResolutionDeserializer;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, CameraBehaviorDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidCameraProxy f125025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a f125026b;

    /* renamed from: c, reason: collision with root package name */
    public CameraSettings f125027c;

    /* renamed from: d, reason: collision with root package name */
    public TorchState f125028d;

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a
    public final Collection a() {
        return this.f125026b.a();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void b(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.f125026b.b(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void c(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.f125026b.c(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void d(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.f125026b.d(listener);
    }

    public c(AndroidCameraProxyAdapter nativeCameraProxy) {
        com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.b torchListenersHolder = new com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.b();
        Intrinsics.j(nativeCameraProxy, "nativeCameraProxy");
        Intrinsics.j(torchListenersHolder, "torchListenersHolder");
        this.f125025a = nativeCameraProxy;
        this.f125026b = torchListenersHolder;
        TorchState torchState = TorchState.OFF;
        this.f125028d = torchState;
        nativeCameraProxy._applyTorchStateAsync(torchState);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void a(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.f125026b.a(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final TorchState b() {
        return this.f125028d;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a
    public final Collection c() {
        return this.f125026b.c();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void a(CameraSettings settings, Runnable runnable) {
        Intrinsics.j(settings, "settings");
        this.f125027c = settings;
        NativeExtensionsKt.andThen(this.f125025a._applySettings(settings), runnable);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void a(TorchState state, Function0 whenDone) {
        Intrinsics.j(state, "state");
        Intrinsics.j(whenDone, "whenDone");
        if (this.f125028d != state) {
            NativeWrappedFuture nativeWrappedFuture_applyTorchStateAsync = this.f125025a._applyTorchStateAsync(state);
            if (nativeWrappedFuture_applyTorchStateAsync != null) {
                NativeExtensionsKt.andThen(nativeWrappedFuture_applyTorchStateAsync, (Callback<? super Boolean>) LambdaExtensionsKt.Callback(new b(this, state, whenDone)));
                return;
            }
            return;
        }
        whenDone.invoke();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void a(String resolution) {
        Intrinsics.j(resolution, "resolution");
        CameraSettings settings = this.f125027c;
        if (settings == null) {
            settings = new CameraSettings();
        }
        Intrinsics.j(settings, "settings");
        Intrinsics.j(resolution, "resolution");
        if (Intrinsics.e(resolution, "quadHd")) {
            settings.setProperty("quadHd", Boolean.TRUE);
        } else {
            try {
                settings.setPreferredResolution(VideoResolutionDeserializer.fromJson(resolution));
                settings.setProperty("quadHd", Boolean.FALSE);
            } catch (Throwable unused) {
                MainThreadHelper mainThreadHelper = j.f125056a;
                j.a(resolution + " is not a valid resolution");
            }
        }
        Intrinsics.j(settings, "settings");
        this.f125027c = settings;
        NativeExtensionsKt.andThen(this.f125025a._applySettings(settings), (Runnable) null);
    }
}
