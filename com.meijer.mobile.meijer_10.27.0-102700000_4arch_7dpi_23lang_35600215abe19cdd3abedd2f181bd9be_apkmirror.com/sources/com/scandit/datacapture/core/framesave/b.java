package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextFrameListener;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements DataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124184a;

    public b(CameraSequenceFrameSaveSession owner) {
        Intrinsics.j(owner, "owner");
        this.f124184a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingStarted(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(frameData, "frameData");
        CameraSequenceFrameSaveSession cameraSequenceFrameSaveSession = (CameraSequenceFrameSaveSession) this.f124184a.get();
        if (cameraSequenceFrameSaveSession != null) {
            if (cameraSequenceFrameSaveSession.f124166g) {
                cameraSequenceFrameSaveSession.f124166g = false;
                cameraSequenceFrameSaveSession.onFrameSaveFinished();
            } else if (cameraSequenceFrameSaveSession.f124164e) {
                SingleFrameRecorder singleFrameRecorder = cameraSequenceFrameSaveSession.f124161b;
                if (singleFrameRecorder != null) {
                    singleFrameRecorder.saveFrame(frameData, dataCaptureContext);
                }
                cameraSequenceFrameSaveSession.onFrameSaveSuccess();
            }
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingFinished(DataCaptureContext dataCaptureContext, FrameData frameData) {
        DataCaptureContextFrameListener.DefaultImpls.onFrameProcessingFinished(this, dataCaptureContext, frameData);
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
