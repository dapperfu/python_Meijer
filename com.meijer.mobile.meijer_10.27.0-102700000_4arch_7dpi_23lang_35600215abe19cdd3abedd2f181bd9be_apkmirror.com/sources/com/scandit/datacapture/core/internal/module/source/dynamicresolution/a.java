package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextFrameListener;
import com.scandit.datacapture.core.data.FrameData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements DataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    public final b f125035a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f125036b;

    /* renamed from: c, reason: collision with root package name */
    public long f125037c;

    public a(b store) {
        Intrinsics.j(store, "store");
        this.f125035a = store;
        this.f125036b = new AtomicBoolean(false);
        this.f125037c = -1L;
    }

    public final float a() {
        c cVar = (c) this.f125035a;
        synchronized (cVar.f125041d) {
            long j10 = cVar.f125043f;
            if (j10 == 0) {
                return 0.0f;
            }
            return cVar.f125042e / j10;
        }
    }

    public final void b() {
        this.f125037c = -1L;
        c cVar = (c) this.f125035a;
        synchronized (cVar.f125038a) {
            cVar.f125039b = 0L;
            cVar.f125040c = 0L;
            Unit unit = Unit.f142422a;
        }
        synchronized (cVar.f125041d) {
            cVar.f125042e = 0L;
            cVar.f125043f = 0L;
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingFinished(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(frameData, "frameData");
        DataCaptureContextFrameListener.DefaultImpls.onFrameProcessingFinished(this, dataCaptureContext, frameData);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingStarted(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(frameData, "frameData");
        DataCaptureContextFrameListener.DefaultImpls.onFrameProcessingStarted(this, dataCaptureContext, frameData);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onObservationStarted(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        DataCaptureContextFrameListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onObservationStopped(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        DataCaptureContextFrameListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
    }
}
