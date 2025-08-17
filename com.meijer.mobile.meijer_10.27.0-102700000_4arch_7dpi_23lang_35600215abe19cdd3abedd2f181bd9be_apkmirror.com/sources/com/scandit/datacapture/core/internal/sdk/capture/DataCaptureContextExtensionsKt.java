package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\"\u001d\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00028F¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"_activeMode", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "get_activeMode$annotations", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "get_activeMode", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "_modes", "", "get_modes$annotations", "get_modes", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Ljava/util/List;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DataCaptureContextExtensionsKt {
    public static /* synthetic */ void get_activeMode$annotations(DataCaptureContext dataCaptureContext) {
    }

    public static /* synthetic */ void get_modes$annotations(DataCaptureContext dataCaptureContext) {
    }

    public static final /* synthetic */ DataCaptureMode get_activeMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "<this>");
        return dataCaptureContext.getF124034d();
    }

    public static final /* synthetic */ List get_modes(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "<this>");
        return dataCaptureContext.get_modes$scandit_capture_core();
    }
}
