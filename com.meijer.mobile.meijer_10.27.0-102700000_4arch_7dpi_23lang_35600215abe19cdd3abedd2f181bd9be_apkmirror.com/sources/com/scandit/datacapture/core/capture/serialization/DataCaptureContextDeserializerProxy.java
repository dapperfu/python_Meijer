package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH'J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H'J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerProxy;", "", "<set-?>", "", "avoidThreadDependencies", "getAvoidThreadDependencies", "()Z", "setAvoidThreadDependencies", "(Z)V", "_deserializer", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "_setDeserializer", "", "deserializer", "_setHelper", "helper", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "_setListener", "listener", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeDataCaptureContextDeserializer.class)
/* loaded from: classes11.dex */
public interface DataCaptureContextDeserializerProxy {
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    DataCaptureContextDeserializer _deserializer();

    @NativeImpl
    /* renamed from: _impl */
    NativeDataCaptureContextDeserializer getF124088a();

    @ProxySetter
    void _setDeserializer(DataCaptureContextDeserializer deserializer);

    @ProxyFunction(nativeName = "setHelper")
    void _setHelper(DataCaptureContextDeserializerHelper helper);

    @ProxyFunction(nativeName = "setListener")
    void _setListener(DataCaptureContextDeserializerListener listener);

    @ProxyFunction(property = "avoidThreadDependencies")
    boolean getAvoidThreadDependencies();

    @ProxyFunction(property = "avoidThreadDependencies")
    void setAvoidThreadDependencies(boolean z10);
}
