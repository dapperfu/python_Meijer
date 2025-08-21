package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.AndroidCameraProxy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/scandit/datacapture/core/source/AndroidCameraProxyAdapter;", "Lcom/scandit/datacapture/core/source/AndroidCameraProxy;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;", "_NativeAndroidCamera", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "()Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_switchToDesiredState", "(Lcom/scandit/datacapture/core/source/FrameSourceState;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "_applySettings", "(Lcom/scandit/datacapture/core/source/CameraSettings;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/source/TorchState;", "torchState", "_applyTorchStateAsync", "(Lcom/scandit/datacapture/core/source/TorchState;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "", "isTorchAvailable", "()Z", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class AndroidCameraProxyAdapter implements AndroidCameraProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAndroidCamera f126823a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeFrameSource f126825c;

    public AndroidCameraProxyAdapter(NativeAndroidCamera _NativeAndroidCamera, ProxyCache proxyCache) {
        Intrinsics.j(_NativeAndroidCamera, "_NativeAndroidCamera");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126823a = _NativeAndroidCamera;
        this.proxyCache = proxyCache;
        NativeFrameSource nativeFrameSourceAsFrameSource = _NativeAndroidCamera.asFrameSource();
        Intrinsics.i(nativeFrameSourceAsFrameSource, "asFrameSource(...)");
        this.f126825c = nativeFrameSourceAsFrameSource;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public NativeWrappedFuture _applySettings(CameraSettings settings) {
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsAsyncAndroid = this.f126823a.applySettingsAsyncAndroid(CoreNativeTypeFactory.INSTANCE.convert(settings));
        Intrinsics.g(nativeWrappedFutureApplySettingsAsyncAndroid);
        return nativeWrappedFutureApplySettingsAsyncAndroid;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public NativeWrappedFuture _applyTorchStateAsync(TorchState torchState) {
        Intrinsics.j(torchState, "torchState");
        NativeWrappedFuture nativeWrappedFutureApplyTorchStateAsyncWrapped = this.f126823a.applyTorchStateAsyncWrapped(torchState);
        Intrinsics.g(nativeWrappedFutureApplyTorchStateAsyncWrapped);
        return nativeWrappedFutureApplyTorchStateAsyncWrapped;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    /* renamed from: _frameSourceImpl, reason: from getter */
    public NativeFrameSource getF126825c() {
        return this.f126825c;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    /* renamed from: _impl, reason: from getter */
    public NativeAndroidCamera getF126823a() {
        return this.f126823a;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public NativeWrappedFuture _switchToDesiredState(FrameSourceState desiredState) {
        Intrinsics.j(desiredState, "desiredState");
        NativeWrappedFuture nativeWrappedFutureSwitchToDesiredStateAsyncAndroid = this.f126823a.switchToDesiredStateAsyncAndroid(desiredState);
        Intrinsics.g(nativeWrappedFutureSwitchToDesiredStateAsyncAndroid);
        return nativeWrappedFutureSwitchToDesiredStateAsyncAndroid;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public FrameSourceState getCurrentState() {
        FrameSourceState currentState = this.f126823a.getCurrentState();
        Intrinsics.g(currentState);
        return currentState;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public FrameSourceState getDesiredState() {
        FrameSourceState desiredState = this.f126823a.getDesiredState();
        Intrinsics.g(desiredState);
        return desiredState;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public CameraPosition getPosition() {
        CameraPosition position = this.f126823a.getPosition();
        Intrinsics.g(position);
        return position;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public boolean isTorchAvailable() {
        return this.f126823a.isTorchAvailable();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public void switchToDesiredState(FrameSourceState frameSourceState, Callback<? super Boolean> callback) {
        AndroidCameraProxy.DefaultImpls.switchToDesiredState(this, frameSourceState, callback);
    }

    public /* synthetic */ AndroidCameraProxyAdapter(NativeAndroidCamera nativeAndroidCamera, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAndroidCamera, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
