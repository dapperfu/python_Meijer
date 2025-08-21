package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlayProxy;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;", "setGlobFilter", "", "globFilter", "", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeDlogOverlay.class)
/* loaded from: classes12.dex */
public interface DlogOverlayProxy extends DataCaptureOverlay {
    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    NativeDataCaptureOverlay _dataCaptureOverlayImpl();

    @NativeImpl
    NativeDlogOverlay _impl();

    @ProxyFunction
    void setGlobFilter(String globFilter);
}
