package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H'J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H'J\b\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0003H'J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001eH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/source/AndroidCameraProxy;", "", "currentState", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "getDesiredState", "isTorchAvailable", "", "()Z", "position", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "_applySettings", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "_applyTorchStateAsync", "torchState", "Lcom/scandit/datacapture/core/source/TorchState;", "_frameSourceImpl", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;", "_switchToDesiredState", "switchToDesiredState", "", "whenDone", "Lcom/scandit/datacapture/core/common/async/Callback;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeAndroidCamera.class)
/* loaded from: classes12.dex */
public interface AndroidCameraProxy {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void switchToDesiredState(AndroidCameraProxy androidCameraProxy, FrameSourceState desiredState, Callback<? super Boolean> callback) {
            Intrinsics.j(desiredState, "desiredState");
            NativeExtensionsKt.andThen(androidCameraProxy._switchToDesiredState(desiredState), callback);
        }
    }

    @ProxyFunction(nativeName = "applySettingsAsyncAndroid")
    NativeWrappedFuture _applySettings(CameraSettings settings);

    @ProxyFunction(nativeName = "applyTorchStateAsyncWrapped")
    NativeWrappedFuture _applyTorchStateAsync(TorchState torchState);

    @NativeImpl
    /* renamed from: _frameSourceImpl */
    NativeFrameSource getF126825c();

    @NativeImpl
    /* renamed from: _impl */
    NativeAndroidCamera getF126823a();

    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    NativeWrappedFuture _switchToDesiredState(FrameSourceState desiredState);

    @ProxyFunction(property = "currentState")
    FrameSourceState getCurrentState();

    @ProxyFunction(property = "desiredState")
    FrameSourceState getDesiredState();

    @ProxyFunction(nativeName = "getPosition", property = "position")
    CameraPosition getPosition();

    @ProxyFunction(nativeName = "isTorchAvailable", property = "isTorchAvailable")
    boolean isTorchAvailable();

    void switchToDesiredState(FrameSourceState desiredState, Callback<? super Boolean> whenDone);
}
