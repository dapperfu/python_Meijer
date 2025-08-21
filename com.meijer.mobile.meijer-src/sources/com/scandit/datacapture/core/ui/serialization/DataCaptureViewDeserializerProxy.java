package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH'J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H'J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H'J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerProxy;", "", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_deserializer", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;", "_setDeserializer", "", "deserializer", "_setHelper", "helper", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "_setListener", "listener", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", "_updateViewFromJson", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "_viewFromJson", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeDataCaptureViewDeserializer.class)
/* loaded from: classes12.dex */
public interface DataCaptureViewDeserializerProxy {
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    DataCaptureViewDeserializer _deserializer();

    @NativeImpl
    /* renamed from: _impl */
    NativeDataCaptureViewDeserializer getF127102a();

    @ProxySetter
    void _setDeserializer(DataCaptureViewDeserializer deserializer);

    @ProxyFunction(nativeName = "setHelper")
    void _setHelper(DataCaptureViewDeserializerHelper helper);

    @ProxyFunction(nativeName = "setListener")
    void _setListener(DataCaptureViewDeserializerListener listener);

    @ProxyFunction(nativeName = "updateViewFromJson")
    DataCaptureView _updateViewFromJson(DataCaptureView view, JsonValue json);

    @ProxyFunction(nativeName = "viewFromJson")
    DataCaptureView _viewFromJson(DataCaptureContext dataCaptureContext, JsonValue json);

    @ProxyFunction(property = "warnings")
    List<String> getWarnings();
}
