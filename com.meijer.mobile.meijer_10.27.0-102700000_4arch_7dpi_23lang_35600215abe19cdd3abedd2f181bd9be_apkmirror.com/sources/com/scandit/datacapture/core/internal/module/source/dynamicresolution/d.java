package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import android.os.SystemClock;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextFrameListener;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d implements DataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f125044a;

    public d(h hVar) {
        this.f125044a = hVar;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingFinished(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(frameData, "frameData");
        a aVar = this.f125044a.f125052f;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = aVar.f125037c;
        if (j10 == -1) {
            return;
        }
        long j11 = jUptimeMillis - j10;
        c cVar = (c) aVar.f125035a;
        synchronized (cVar.f125038a) {
            cVar.f125039b += j11;
            cVar.f125040c++;
            Unit unit = Unit.f142422a;
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingStarted(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(frameData, "frameData");
        this.f125044a.f125052f.f125037c = SystemClock.uptimeMillis();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onObservationStarted(DataCaptureContext dataCaptureContext) {
        DataCaptureContextFrameListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onObservationStopped(DataCaptureContext dataCaptureContext) {
        DataCaptureContextFrameListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
    }
}
