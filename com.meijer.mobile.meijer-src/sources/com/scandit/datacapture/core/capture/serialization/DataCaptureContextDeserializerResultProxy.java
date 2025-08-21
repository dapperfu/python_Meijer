package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResultProxy;", "", "components", "", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "getComponents", "()Ljava/util/List;", "warnings", "", "getWarnings", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeDataCaptureContextDeserializerResult.class)
/* loaded from: classes12.dex */
public interface DataCaptureContextDeserializerResultProxy {
    @NativeImpl
    NativeDataCaptureContextDeserializerResult _impl();

    @ProxyFunction(property = "components")
    List<DataCaptureComponent> getComponents();

    @ProxyFunction(property = "warnings")
    List<String> getWarnings();
}
