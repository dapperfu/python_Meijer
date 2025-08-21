package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import kotlin.Metadata;

@ProxyBaseClass(NativeDataCaptureMode.class)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH'J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_setDataCaptureContext", "", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DataCaptureMode {
    @NativeImpl
    NativeDataCaptureMode _dataCaptureModeImpl();

    void _setDataCaptureContext(DataCaptureContext dataCaptureContext);

    /* renamed from: getDataCaptureContext */
    DataCaptureContext getF121466c();

    boolean isEnabled();

    void setEnabled(boolean z10);
}
