package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.source.S;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h implements S {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.source.camera.b f125999a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f126000b;

    /* renamed from: c, reason: collision with root package name */
    public final x f126001c;

    /* renamed from: d, reason: collision with root package name */
    public final Timer f126002d;

    /* renamed from: e, reason: collision with root package name */
    public e f126003e;

    /* renamed from: f, reason: collision with root package name */
    public final a f126004f;

    /* renamed from: g, reason: collision with root package name */
    public final d f126005g;

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void a(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "context");
        x xVar = this.f126001c;
        synchronized (xVar) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            if (xVar.f126025c) {
                return;
            }
            q qVar = q.f126018a;
            if (!Intrinsics.e(qVar, xVar.f126026d)) {
                xVar.f126026d = qVar;
                xVar.a();
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void b(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "context");
        x xVar = this.f126001c;
        synchronized (xVar) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            if (xVar.f126025c) {
                return;
            }
            p pVar = new p(dataCaptureContext);
            if (!Intrinsics.e(pVar, xVar.f126026d)) {
                xVar.f126026d = pVar;
                xVar.a();
            }
        }
    }

    public h(com.scandit.datacapture.core.internal.module.source.camera.b resolutionStore, com.scandit.datacapture.core.source.d requestResolution) {
        Intrinsics.j(resolutionStore, "resolutionStore");
        Intrinsics.j(requestResolution, "requestResolution");
        this.f125999a = resolutionStore;
        this.f126000b = requestResolution;
        f start = new f(this);
        g stop = new g(this);
        Intrinsics.j(start, "start");
        Intrinsics.j(stop, "stop");
        this.f126001c = new x(start, stop);
        this.f126002d = new Timer("dynamic-resolution-timer");
        c store = new c();
        Intrinsics.j(store, "store");
        this.f126004f = new a(store);
        this.f126005g = new d(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(frame, "frame");
        long int64ForKeyOr = frame.getF126294a().collectCameraCaptureParametersForAndroid().getInt64ForKeyOr(NativeCameraCaptureParameterKey.DELAY_BETWEEN_YUV_AND_PREVIEW, Long.MAX_VALUE);
        if (int64ForKeyOr != Long.MAX_VALUE) {
            b bVar = this.f126004f.f125987a;
            long jAbs = Math.abs(int64ForKeyOr);
            c cVar = (c) bVar;
            synchronized (cVar.f125993d) {
                cVar.f125994e += jAbs;
                cVar.f125995f++;
                Unit unit = Unit.f143329a;
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onObservationStarted(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(frameSource, "frameSource");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onObservationStopped(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(frameSource, "frameSource");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onStateChanged(FrameSource frameSource, FrameSourceState newState) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(newState, "newState");
        if (frameSource.getDesiredState() == FrameSourceState.OFF || frameSource.getDesiredState() == FrameSourceState.STANDBY) {
            this.f126001c.a(frameSource);
            return;
        }
        if (frameSource.getDesiredState() == FrameSourceState.ON) {
            x xVar = this.f126001c;
            synchronized (xVar) {
                Intrinsics.j(frameSource, "frameSource");
                if (xVar.f126025c) {
                    return;
                }
                m mVar = new m(frameSource);
                if (!Intrinsics.e(mVar, xVar.f126028f)) {
                    xVar.f126028f = mVar;
                    xVar.a();
                }
            }
        }
    }

    public final void a(String currentResolution) {
        this.f126000b.invoke(currentResolution);
        x xVar = this.f126001c;
        synchronized (xVar) {
            try {
                Intrinsics.j(currentResolution, "newResolution");
                if (xVar.f126025c) {
                    return;
                }
                w uVar = xVar.f126027e;
                if (uVar instanceof u) {
                    k kVar = ((u) uVar).f126021a;
                    int i10 = kVar.f126010a;
                    int i11 = kVar.f126011b;
                    int i12 = kVar.f126012c;
                    Intrinsics.j(currentResolution, "currentResolution");
                    k settings = new k(i10, i11, i12, currentResolution);
                    Intrinsics.j(settings, "settings");
                    uVar = new u(settings);
                }
                xVar.f126027e = uVar;
                xVar.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str) {
        MainThreadHelper mainThreadHelper = j.f126008a;
        j.b("Found final resolution: " + str);
        ((com.scandit.datacapture.core.internal.module.source.camera.c) this.f125999a).a(str);
        this.f126001c.c();
    }
}
