package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "Lkotlin/Function0;", "", "lazyMessage", "", "checkAttachedToSameDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureMode;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lkotlin/jvm/functions/Function0;)V", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class OverlayPreconditionsKt {
    public static final void checkAttachedToSameDataCaptureContext(DataCaptureMode mode, DataCaptureView dataCaptureView, Function0<? extends Object> lazyMessage) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(lazyMessage, "lazyMessage");
        DataCaptureContext f121359c = mode.getF121553c();
        DataCaptureContext dataCaptureContext = dataCaptureView != null ? dataCaptureView.getDataCaptureContext() : null;
        if (f121359c != null && dataCaptureContext != null && !Intrinsics.e(f121359c.getF125005a(), dataCaptureContext.getF125005a())) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }
}
