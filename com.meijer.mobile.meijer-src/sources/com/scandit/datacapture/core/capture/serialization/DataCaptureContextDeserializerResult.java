package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResult;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResultProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;", "impl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;", "a", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "b", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "getView", "()Lcom/scandit/datacapture/core/ui/DataCaptureView;", "", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "getComponents", "()Ljava/util/List;", "components", "", "getWarnings", "warnings", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class DataCaptureContextDeserializerResult implements DataCaptureContextDeserializerResultProxy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DataCaptureContext dataCaptureContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DataCaptureView view;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ DataCaptureContextDeserializerResultProxyAdapter f125045c;

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeDataCaptureContextDeserializerResult getF125046a() {
        return this.f125045c.getF125046a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @ProxyFunction(property = "components")
    public List<DataCaptureComponent> getComponents() {
        return this.f125045c.getComponents();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f125045c.getWarnings();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataCaptureContextDeserializerResult(NativeDataCaptureContextDeserializerResult impl, DataCaptureContext dataCaptureContext, DataCaptureView dataCaptureView) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        this.dataCaptureContext = dataCaptureContext;
        this.view = dataCaptureView;
        this.f125045c = new DataCaptureContextDeserializerResultProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    public final DataCaptureContext getDataCaptureContext() {
        return this.dataCaptureContext;
    }

    public final DataCaptureView getView() {
        return this.view;
    }
}
