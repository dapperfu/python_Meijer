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

/* loaded from: classes11.dex */
public final class h implements S {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.source.camera.b f125047a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f125048b;

    /* renamed from: c, reason: collision with root package name */
    public final x f125049c;

    /* renamed from: d, reason: collision with root package name */
    public final Timer f125050d;

    /* renamed from: e, reason: collision with root package name */
    public e f125051e;

    /* renamed from: f, reason: collision with root package name */
    public final a f125052f;

    /* renamed from: g, reason: collision with root package name */
    public final d f125053g;

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void a(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "context");
        x xVar = this.f125049c;
        synchronized (xVar) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            if (xVar.f125073c) {
                return;
            }
            q qVar = q.f125066a;
            if (!Intrinsics.e(qVar, xVar.f125074d)) {
                xVar.f125074d = qVar;
                xVar.a();
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void b(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "context");
        x xVar = this.f125049c;
        synchronized (xVar) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            if (xVar.f125073c) {
                return;
            }
            p pVar = new p(dataCaptureContext);
            if (!Intrinsics.e(pVar, xVar.f125074d)) {
                xVar.f125074d = pVar;
                xVar.a();
            }
        }
    }

    public h(com.scandit.datacapture.core.internal.module.source.camera.b resolutionStore, com.scandit.datacapture.core.source.d requestResolution) {
        Intrinsics.j(resolutionStore, "resolutionStore");
        Intrinsics.j(requestResolution, "requestResolution");
        this.f125047a = resolutionStore;
        this.f125048b = requestResolution;
        f start = new f(this);
        g stop = new g(this);
        Intrinsics.j(start, "start");
        Intrinsics.j(stop, "stop");
        this.f125049c = new x(start, stop);
        this.f125050d = new Timer("dynamic-resolution-timer");
        c store = new c();
        Intrinsics.j(store, "store");
        this.f125052f = new a(store);
        this.f125053g = new d(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(frame, "frame");
        long int64ForKeyOr = frame.getF125342a().collectCameraCaptureParametersForAndroid().getInt64ForKeyOr(NativeCameraCaptureParameterKey.DELAY_BETWEEN_YUV_AND_PREVIEW, Long.MAX_VALUE);
        if (int64ForKeyOr != Long.MAX_VALUE) {
            b bVar = this.f125052f.f125035a;
            long jAbs = Math.abs(int64ForKeyOr);
            c cVar = (c) bVar;
            synchronized (cVar.f125041d) {
                cVar.f125042e += jAbs;
                cVar.f125043f++;
                Unit unit = Unit.f142422a;
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
            this.f125049c.a(frameSource);
            return;
        }
        if (frameSource.getDesiredState() == FrameSourceState.ON) {
            x xVar = this.f125049c;
            synchronized (xVar) {
                Intrinsics.j(frameSource, "frameSource");
                if (xVar.f125073c) {
                    return;
                }
                m mVar = new m(frameSource);
                if (!Intrinsics.e(mVar, xVar.f125076f)) {
                    xVar.f125076f = mVar;
                    xVar.a();
                }
            }
        }
    }

    public final void a(String currentResolution) {
        this.f125048b.invoke(currentResolution);
        x xVar = this.f125049c;
        synchronized (xVar) {
            try {
                Intrinsics.j(currentResolution, "newResolution");
                if (xVar.f125073c) {
                    return;
                }
                w uVar = xVar.f125075e;
                if (uVar instanceof u) {
                    k kVar = ((u) uVar).f125069a;
                    int i10 = kVar.f125058a;
                    int i11 = kVar.f125059b;
                    int i12 = kVar.f125060c;
                    Intrinsics.j(currentResolution, "currentResolution");
                    k settings = new k(i10, i11, i12, currentResolution);
                    Intrinsics.j(settings, "settings");
                    uVar = new u(settings);
                }
                xVar.f125075e = uVar;
                xVar.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str) {
        MainThreadHelper mainThreadHelper = j.f125056a;
        j.b("Found final resolution: " + str);
        ((com.scandit.datacapture.core.internal.module.source.camera.c) this.f125047a).a(str);
        this.f125049c.c();
    }
}
