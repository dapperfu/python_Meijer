package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes12.dex */
public final class a0 extends NativeFrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    public final S f125778a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f125779b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f125780c;

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onDataCaptureContextAttached(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        if (((FrameSource) this.f125780c.get()) != null) {
            this.f125778a.b((DataCaptureContext) this.f125779b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new T(context)));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onDataCaptureContextDetached(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        if (((FrameSource) this.f125780c.get()) != null) {
            this.f125778a.a((DataCaptureContext) this.f125779b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new U(context)));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onFrameOutputAndroid(NativeFrameSource source, NativeFrameData frame) {
        Intrinsics.j(source, "source");
        Intrinsics.j(frame, "frame");
        FrameSource frameSource = (FrameSource) this.f125780c.get();
        if (frameSource != null) {
            Object orPut = this.f125779b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new V(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameData frameData = (FrameData) this.f125779b.getOrPut(Reflection.b(NativeFrameData.class), null, frame, new W(frame));
            this.f125778a.onFrameOutput((FrameSource) orPut, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onObservationStarted(NativeFrameSource source) {
        Intrinsics.j(source, "source");
        FrameSource frameSource = (FrameSource) this.f125780c.get();
        if (frameSource != null) {
            Object orPut = this.f125779b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new X(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125778a.onObservationStarted((FrameSource) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onObservationStopped(NativeFrameSource source) {
        Intrinsics.j(source, "source");
        FrameSource frameSource = (FrameSource) this.f125780c.get();
        if (frameSource != null) {
            Object orPut = this.f125779b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new Y(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125778a.onObservationStopped((FrameSource) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onStateChanged(NativeFrameSource source, FrameSourceState newState) {
        Intrinsics.j(source, "source");
        Intrinsics.j(newState, "newState");
        FrameSource frameSource = (FrameSource) this.f125780c.get();
        if (frameSource != null) {
            Object orPut = this.f125779b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new Z(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125778a.onStateChanged((FrameSource) orPut, newState);
        }
    }

    public a0(S _FrameSourceListenerInternal, FrameSource _FrameSource) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_FrameSourceListenerInternal, "_FrameSourceListenerInternal");
        Intrinsics.j(_FrameSource, "_FrameSource");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125778a = _FrameSourceListenerInternal;
        this.f125779b = proxyCache;
        this.f125780c = new WeakReference(_FrameSource);
    }
}
