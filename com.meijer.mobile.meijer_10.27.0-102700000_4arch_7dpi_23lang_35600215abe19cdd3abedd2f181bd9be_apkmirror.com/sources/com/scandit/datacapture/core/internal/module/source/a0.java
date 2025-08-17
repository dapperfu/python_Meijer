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

/* loaded from: classes11.dex */
public final class a0 extends NativeFrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    public final S f124826a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f124827b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f124828c;

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onDataCaptureContextAttached(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        if (((FrameSource) this.f124828c.get()) != null) {
            this.f124826a.b((DataCaptureContext) this.f124827b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new T(context)));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onDataCaptureContextDetached(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        if (((FrameSource) this.f124828c.get()) != null) {
            this.f124826a.a((DataCaptureContext) this.f124827b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new U(context)));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onFrameOutputAndroid(NativeFrameSource source, NativeFrameData frame) {
        Intrinsics.j(source, "source");
        Intrinsics.j(frame, "frame");
        FrameSource frameSource = (FrameSource) this.f124828c.get();
        if (frameSource != null) {
            Object orPut = this.f124827b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new V(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameData frameData = (FrameData) this.f124827b.getOrPut(Reflection.b(NativeFrameData.class), null, frame, new W(frame));
            this.f124826a.onFrameOutput((FrameSource) orPut, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onObservationStarted(NativeFrameSource source) {
        Intrinsics.j(source, "source");
        FrameSource frameSource = (FrameSource) this.f124828c.get();
        if (frameSource != null) {
            Object orPut = this.f124827b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new X(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f124826a.onObservationStarted((FrameSource) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onObservationStopped(NativeFrameSource source) {
        Intrinsics.j(source, "source");
        FrameSource frameSource = (FrameSource) this.f124828c.get();
        if (frameSource != null) {
            Object orPut = this.f124827b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new Y(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f124826a.onObservationStopped((FrameSource) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public final void onStateChanged(NativeFrameSource source, FrameSourceState newState) {
        Intrinsics.j(source, "source");
        Intrinsics.j(newState, "newState");
        FrameSource frameSource = (FrameSource) this.f124828c.get();
        if (frameSource != null) {
            Object orPut = this.f124827b.getOrPut(Reflection.b(NativeFrameSource.class), null, source, new Z(frameSource));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f124826a.onStateChanged((FrameSource) orPut, newState);
        }
    }

    public a0(S _FrameSourceListenerInternal, FrameSource _FrameSource) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_FrameSourceListenerInternal, "_FrameSourceListenerInternal");
        Intrinsics.j(_FrameSource, "_FrameSource");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124826a = _FrameSourceListenerInternal;
        this.f124827b = proxyCache;
        this.f124828c = new WeakReference(_FrameSource);
    }
}
