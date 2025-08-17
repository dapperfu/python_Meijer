package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextSettings;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;

@ProxyReversedAdapter(provided = true, value = NativeDataCaptureContextDeserializerHelper.class)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H'J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H'J\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H'J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH'¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "", "createContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "licenseKey", "", "deviceName", "externalId", "frameworkName", "frameworkVersion", "settings", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "deviceOS", "browser", "browserVersion", "removeModeFromContext", "", "dataCaptureContext", "mode", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "setFrameSourceOnContext", "context", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "updateContextFromJson", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DataCaptureContextDeserializerHelper {
    @ProxyCacheResult
    @ProxyFunction
    DataCaptureContext createContext(String licenseKey, String deviceName, String externalId, String frameworkName, String frameworkVersion, DataCaptureContextSettings settings, String deviceOS, String browser, String browserVersion);

    @ProxyFunction
    void removeModeFromContext(DataCaptureContext dataCaptureContext, DataCaptureMode mode);

    @ProxyFunction
    void setFrameSourceOnContext(DataCaptureContext context, FrameSource frameSource);

    @ProxyFunction
    void updateContextFromJson(DataCaptureContext dataCaptureContext, JsonValue json);
}
