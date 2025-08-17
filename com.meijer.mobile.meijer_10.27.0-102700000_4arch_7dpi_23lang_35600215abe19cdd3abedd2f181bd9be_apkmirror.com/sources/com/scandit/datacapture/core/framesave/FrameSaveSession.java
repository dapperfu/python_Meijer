package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import kotlin.Metadata;

@ProxyBaseClass(NativeFrameSaveSession.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "", "_frameSaveSessionImpl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "addToContext", "", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "removeFromContext", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FrameSaveSession {
    @NativeImpl
    NativeFrameSaveSession _frameSaveSessionImpl();

    void addToContext(DataCaptureContext dataCaptureContext);

    void removeFromContext(DataCaptureContext dataCaptureContext);
}
