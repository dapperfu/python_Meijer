package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import android.os.SystemClock;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextFrameListener;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements DataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f125996a;

    public d(h hVar) {
        this.f125996a = hVar;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingFinished(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(frameData, "frameData");
        a aVar = this.f125996a.f126004f;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = aVar.f125989c;
        if (j10 == -1) {
            return;
        }
        long j11 = jUptimeMillis - j10;
        c cVar = (c) aVar.f125987a;
        synchronized (cVar.f125990a) {
            cVar.f125991b += j11;
            cVar.f125992c++;
            Unit unit = Unit.f143329a;
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingStarted(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(frameData, "frameData");
        this.f125996a.f126004f.f125989c = SystemClock.uptimeMillis();
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
